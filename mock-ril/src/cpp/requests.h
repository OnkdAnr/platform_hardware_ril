/**
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef MOCK_RIL_REQUESTS_H_
#define MOCK_RIL_REQUESTS_H_

#include <queue>
#include <pthread.h>

#include <v8.h>
#include "worker.h"


/**
 * A request
 */
struct Request {
    int request_;
    char *data_;
    size_t datalen_;
    size_t maxlen_;
    RIL_Token token_;

    Request(const int request, const void *data,
                const size_t datalen, const RIL_Token token) :
            request_(0),
            data_(NULL),
            datalen_(0),
            maxlen_(0),
            token_(0) {
        Set(request, data, datalen, token);
    }

    ~Request() {
        delete [] data_;
    }

    void Set(const int request,
        const void *data, const size_t datalen, const RIL_Token token) {
        request_ = request;
        token_ = token;
        if (datalen > maxlen_) {
            // TODO: MAKE A POOL ?
            delete [] data_;
            data_ = new char[datalen];
            maxlen_ = datalen;
        }
        datalen_ = datalen;
        memmove(data_, data, datalen);
    }
};

/**
 * Ril request worker queue.
 *
 * Pass requests to mock-ril.js for processing
 */
class RilRequestWorkerQueue : public WorkerQueue {
  private:
    v8::Handle<v8::Context> context_;
    // TODO: Need a thread-safe queue
    std::queue<Request *> free_list_;
    pthread_mutex_t free_list_mutex_;

  public:
    /**
     * Constructor
     */
    RilRequestWorkerQueue(v8::Handle<v8::Context> context);

    /**
     * Destructor
     */
    virtual ~RilRequestWorkerQueue();

    /**
     * Add a request to the Queue
     */
    void AddRequest(const int request,
                    const void *data, const size_t datalen, const RIL_Token t);

    /**
     * Processes a request sending it to mock-ril.js
     */
    virtual void Process(void *p);
};

/**
 * Initialize module
 *
 * @return 0 if no errors
 */
int requestsInit(v8::Handle<v8::Context> context, RilRequestWorkerQueue **rwq);

/**
 * Run tests
 */
void testRequests(v8::Handle<v8::Context> context);

#endif  // MOCK_RIL_REQUESTS_H_
