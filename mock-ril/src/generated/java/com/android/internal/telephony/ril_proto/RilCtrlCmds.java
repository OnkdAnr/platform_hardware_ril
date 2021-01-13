// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.android.internal.telephony.ril_proto;

public final class RilCtrlCmds {
  private RilCtrlCmds() {}
  // enum CtrlCmd
  public static final int CTRL_CMD_ECHO = 0;
  public static final int CTRL_CMD_GET_RADIO_STATE = 1;
  public static final int CTRL_CMD_SET_RADIO_STATE = 2;
  public static final int CTRL_CMD_SET_MT_CALL = 1001;
  public static final int CTRL_CMD_HANGUP_CONN_REMOTE = 1002;
  public static final int CTRL_CMD_SET_CALL_TRANSITION_FLAG = 1003;
  public static final int CTRL_CMD_SET_CALL_ALERT = 1004;
  public static final int CTRL_CMD_SET_CALL_ACTIVE = 1005;
  public static final int CTRL_CMD_ADD_DIALING_CALL = 1006;
  
  // enum CtrlStatus
  public static final int CTRL_STATUS_OK = 0;
  public static final int CTRL_STATUS_ERR = 1;
  
  public static final class CtrlReqRadioState extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlReqRadioState() {}
    
    // required .ril_proto.RadioState state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean hasState;
    private int state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
    public boolean hasState() { return hasState; }
    public int getState() { return state_; }
    public CtrlReqRadioState setState(int value) {
      hasState = true;
      state_ = value;
      return this;
    }
    public CtrlReqRadioState clearState() {
      hasState = false;
      state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
      return this;
    }
    
    public final CtrlReqRadioState clear() {
      clearState();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasState) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasState()) {
        output.writeInt32(1, getState());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasState()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getState());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlReqRadioState mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
              setState(input.readInt32());
            break;
          }
        }
      }
    }
    
    public static CtrlReqRadioState parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlReqRadioState) (new CtrlReqRadioState().mergeFrom(data));
    }
    
    public static CtrlReqRadioState parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlReqRadioState) (new CtrlReqRadioState().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlRspRadioState extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlRspRadioState() {}
    
    // required .ril_proto.RadioState state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean hasState;
    private int state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
    public boolean hasState() { return hasState; }
    public int getState() { return state_; }
    public CtrlRspRadioState setState(int value) {
      hasState = true;
      state_ = value;
      return this;
    }
    public CtrlRspRadioState clearState() {
      hasState = false;
      state_ = com.android.internal.telephony.ril_proto.RilCmds.RADIOSTATE_OFF;
      return this;
    }
    
    public final CtrlRspRadioState clear() {
      clearState();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasState) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasState()) {
        output.writeInt32(1, getState());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasState()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getState());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlRspRadioState mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
              setState(input.readInt32());
            break;
          }
        }
      }
    }
    
    public static CtrlRspRadioState parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlRspRadioState) (new CtrlRspRadioState().mergeFrom(data));
    }
    
    public static CtrlRspRadioState parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlRspRadioState) (new CtrlRspRadioState().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlReqSetMTCall extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlReqSetMTCall() {}
    
    // required string phone_number = 1;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
    private boolean hasPhoneNumber;
    private java.lang.String phoneNumber_ = "";
    public java.lang.String getPhoneNumber() { return phoneNumber_; }
    public boolean hasPhoneNumber() { return hasPhoneNumber; }
    public CtrlReqSetMTCall setPhoneNumber(java.lang.String value) {
      hasPhoneNumber = true;
      phoneNumber_ = value;
      return this;
    }
    public CtrlReqSetMTCall clearPhoneNumber() {
      hasPhoneNumber = false;
      phoneNumber_ = "";
      return this;
    }
    
    public final CtrlReqSetMTCall clear() {
      clearPhoneNumber();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasPhoneNumber) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasPhoneNumber()) {
        output.writeString(1, getPhoneNumber());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasPhoneNumber()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeStringSize(1, getPhoneNumber());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlReqSetMTCall mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            setPhoneNumber(input.readString());
            break;
          }
        }
      }
    }
    
    public static CtrlReqSetMTCall parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlReqSetMTCall) (new CtrlReqSetMTCall().mergeFrom(data));
    }
    
    public static CtrlReqSetMTCall parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlReqSetMTCall) (new CtrlReqSetMTCall().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlHangupConnRemote extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlHangupConnRemote() {}
    
    // required int32 connection_id = 1;
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    private boolean hasConnectionId;
    private int connectionId_ = 0;
    public int getConnectionId() { return connectionId_; }
    public boolean hasConnectionId() { return hasConnectionId; }
    public CtrlHangupConnRemote setConnectionId(int value) {
      hasConnectionId = true;
      connectionId_ = value;
      return this;
    }
    public CtrlHangupConnRemote clearConnectionId() {
      hasConnectionId = false;
      connectionId_ = 0;
      return this;
    }
    
    // required int32 call_fail_cause = 2;
    public static final int CALL_FAIL_CAUSE_FIELD_NUMBER = 2;
    private boolean hasCallFailCause;
    private int callFailCause_ = 0;
    public int getCallFailCause() { return callFailCause_; }
    public boolean hasCallFailCause() { return hasCallFailCause; }
    public CtrlHangupConnRemote setCallFailCause(int value) {
      hasCallFailCause = true;
      callFailCause_ = value;
      return this;
    }
    public CtrlHangupConnRemote clearCallFailCause() {
      hasCallFailCause = false;
      callFailCause_ = 0;
      return this;
    }
    
    public final CtrlHangupConnRemote clear() {
      clearConnectionId();
      clearCallFailCause();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasConnectionId) return false;
      if (!hasCallFailCause) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasConnectionId()) {
        output.writeInt32(1, getConnectionId());
      }
      if (hasCallFailCause()) {
        output.writeInt32(2, getCallFailCause());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasConnectionId()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getConnectionId());
      }
      if (hasCallFailCause()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(2, getCallFailCause());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlHangupConnRemote mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            setConnectionId(input.readInt32());
            break;
          }
          case 16: {
            setCallFailCause(input.readInt32());
            break;
          }
        }
      }
    }
    
    public static CtrlHangupConnRemote parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlHangupConnRemote) (new CtrlHangupConnRemote().mergeFrom(data));
    }
    
    public static CtrlHangupConnRemote parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlHangupConnRemote) (new CtrlHangupConnRemote().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlSetCallTransitionFlag extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlSetCallTransitionFlag() {}
    
    // required bool flag = 1;
    public static final int FLAG_FIELD_NUMBER = 1;
    private boolean hasFlag;
    private boolean flag_ = false;
    public boolean getFlag() { return flag_; }
    public boolean hasFlag() { return hasFlag; }
    public CtrlSetCallTransitionFlag setFlag(boolean value) {
      hasFlag = true;
      flag_ = value;
      return this;
    }
    public CtrlSetCallTransitionFlag clearFlag() {
      hasFlag = false;
      flag_ = false;
      return this;
    }
    
    public final CtrlSetCallTransitionFlag clear() {
      clearFlag();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasFlag) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasFlag()) {
        output.writeBool(1, getFlag());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasFlag()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeBoolSize(1, getFlag());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlSetCallTransitionFlag mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            setFlag(input.readBool());
            break;
          }
        }
      }
    }
    
    public static CtrlSetCallTransitionFlag parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlSetCallTransitionFlag) (new CtrlSetCallTransitionFlag().mergeFrom(data));
    }
    
    public static CtrlSetCallTransitionFlag parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlSetCallTransitionFlag) (new CtrlSetCallTransitionFlag().mergeFrom(input));
    }
    
  }
  
  public static final class CtrlReqAddDialingCall extends
      com.google.protobuf.micro.MessageMicro {
    public CtrlReqAddDialingCall() {}
    
    // required string phone_number = 1;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
    private boolean hasPhoneNumber;
    private java.lang.String phoneNumber_ = "";
    public java.lang.String getPhoneNumber() { return phoneNumber_; }
    public boolean hasPhoneNumber() { return hasPhoneNumber; }
    public CtrlReqAddDialingCall setPhoneNumber(java.lang.String value) {
      hasPhoneNumber = true;
      phoneNumber_ = value;
      return this;
    }
    public CtrlReqAddDialingCall clearPhoneNumber() {
      hasPhoneNumber = false;
      phoneNumber_ = "";
      return this;
    }
    
    public final CtrlReqAddDialingCall clear() {
      clearPhoneNumber();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      if (!hasPhoneNumber) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasPhoneNumber()) {
        output.writeString(1, getPhoneNumber());
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasPhoneNumber()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeStringSize(1, getPhoneNumber());
      }
      cachedSize = size;
      return size;
    }
    
    public CtrlReqAddDialingCall mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            setPhoneNumber(input.readString());
            break;
          }
        }
      }
    }
    
    public static CtrlReqAddDialingCall parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (CtrlReqAddDialingCall) (new CtrlReqAddDialingCall().mergeFrom(data));
    }
    
    public static CtrlReqAddDialingCall parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (CtrlReqAddDialingCall) (new CtrlReqAddDialingCall().mergeFrom(input));
    }
    
  }
  
}
