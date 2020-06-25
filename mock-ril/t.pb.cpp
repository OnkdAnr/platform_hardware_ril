// Generated by the protocol buffer compiler.  DO NOT EDIT!

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "t.pb.h"
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
// @@protoc_insertion_point(includes)

void protobuf_ShutdownFile_t_2eproto() {
  delete T::default_instance_;
}

void protobuf_AddDesc_t_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  T::default_instance_ = new T();
  T::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_t_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_t_2eproto {
  StaticDescriptorInitializer_t_2eproto() {
    protobuf_AddDesc_t_2eproto();
  }
} static_descriptor_initializer_t_2eproto_;


// ===================================================================

const ::std::string T::_default_os_;
#ifndef _MSC_VER
const int T::kIdFieldNumber;
const int T::kOsFieldNumber;
#endif  // !_MSC_VER

T::T()
  : ::google::protobuf::MessageLite() {
  SharedCtor();
}

void T::InitAsDefaultInstance() {
}

T::T(const T& from)
  : ::google::protobuf::MessageLite() {
  SharedCtor();
  MergeFrom(from);
}

void T::SharedCtor() {
  _cached_size_ = 0;
  id_ = 0;
  os_ = const_cast< ::std::string*>(&_default_os_);
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

T::~T() {
  SharedDtor();
}

void T::SharedDtor() {
  if (os_ != &_default_os_) {
    delete os_;
  }
  if (this != default_instance_) {
  }
}

void T::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const T& T::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_t_2eproto();  return *default_instance_;
}

T* T::default_instance_ = NULL;

T* T::New() const {
  return new T;
}

void T::Clear() {
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    id_ = 0;
    if (_has_bit(1)) {
      if (os_ != &_default_os_) {
        os_->clear();
      }
    }
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

bool T::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) return false
  ::google::protobuf::uint32 tag;
  while ((tag = input->ReadTag()) != 0) {
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // required int32 id = 1;
      case 1: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &id_)));
          _set_bit(0);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(18)) goto parse_os;
        break;
      }
      
      // optional string os = 2;
      case 2: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_LENGTH_DELIMITED) {
         parse_os:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_os()));
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectAtEnd()) return true;
        break;
      }
      
      default: {
      handle_uninterpreted:
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          return true;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
  return true;
#undef DO_
}

void T::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // required int32 id = 1;
  if (_has_bit(0)) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(1, this->id(), output);
  }
  
  // optional string os = 2;
  if (_has_bit(1)) {
    ::google::protobuf::internal::WireFormatLite::WriteString(
      2, this->os(), output);
  }
  
}

int T::ByteSize() const {
  int total_size = 0;
  
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    // required int32 id = 1;
    if (has_id()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->id());
    }
    
    // optional string os = 2;
    if (has_os()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::StringSize(
          this->os());
    }
    
  }
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void T::CheckTypeAndMergeFrom(
    const ::google::protobuf::MessageLite& from) {
  MergeFrom(*::google::protobuf::down_cast<const T*>(&from));
}

void T::MergeFrom(const T& from) {
  GOOGLE_CHECK_NE(&from, this);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from._has_bit(0)) {
      set_id(from.id());
    }
    if (from._has_bit(1)) {
      set_os(from.os());
    }
  }
}

void T::CopyFrom(const T& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool T::IsInitialized() const {
  if ((_has_bits_[0] & 0x00000001) != 0x00000001) return false;
  
  return true;
}

void T::Swap(T* other) {
  if (other != this) {
    std::swap(id_, other->id_);
    std::swap(os_, other->os_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::std::string T::GetTypeName() const {
  return "T";
}


// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)
