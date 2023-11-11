// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSPlayerApplyEnterMpRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class PSPlayerApplyEnterMpRspOuterClass {
  private PSPlayerApplyEnterMpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PSPlayerApplyEnterMpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PSPlayerApplyEnterMpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>string target_psn_id = 7;</code>
     * @return The targetPsnId.
     */
    java.lang.String getTargetPsnId();
    /**
     * <code>string target_psn_id = 7;</code>
     * @return The bytes for targetPsnId.
     */
    com.google.protobuf.ByteString
        getTargetPsnIdBytes();

    /**
     * <code>uint32 param = 13;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * CmdId: 21696
   * Obf: IPBKEIBFBCN
   * </pre>
   *
   * Protobuf type {@code PSPlayerApplyEnterMpRsp}
   */
  public static final class PSPlayerApplyEnterMpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PSPlayerApplyEnterMpRsp)
      PSPlayerApplyEnterMpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PSPlayerApplyEnterMpRsp.newBuilder() to construct.
    private PSPlayerApplyEnterMpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PSPlayerApplyEnterMpRsp() {
      targetPsnId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PSPlayerApplyEnterMpRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TARGET_PSN_ID_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private volatile java.lang.Object targetPsnId_ = "";
    /**
     * <code>string target_psn_id = 7;</code>
     * @return The targetPsnId.
     */
    @java.lang.Override
    public java.lang.String getTargetPsnId() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPsnId_ = s;
        return s;
      }
    }
    /**
     * <code>string target_psn_id = 7;</code>
     * @return The bytes for targetPsnId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetPsnIdBytes() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPsnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAM_FIELD_NUMBER = 13;
    private int param_ = 0;
    /**
     * <code>uint32 param = 13;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, targetPsnId_);
      }
      if (param_ != 0) {
        output.writeUInt32(13, param_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, targetPsnId_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, param_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp other = (emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getTargetPsnId()
          .equals(other.getTargetPsnId())) return false;
      if (getParam()
          != other.getParam()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TARGET_PSN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPsnId().hashCode();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 21696
     * Obf: IPBKEIBFBCN
     * </pre>
     *
     * Protobuf type {@code PSPlayerApplyEnterMpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PSPlayerApplyEnterMpRsp)
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        retcode_ = 0;
        targetPsnId_ = "";
        param_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp build() {
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp buildPartial() {
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp result = new emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetPsnId_ = targetPsnId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.param_ = param_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp other) {
        if (other == emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.getTargetPsnId().isEmpty()) {
          targetPsnId_ = other.targetPsnId_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 58: {
                targetPsnId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 58
              case 104: {
                param_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object targetPsnId_ = "";
      /**
       * <code>string target_psn_id = 7;</code>
       * @return The targetPsnId.
       */
      public java.lang.String getTargetPsnId() {
        java.lang.Object ref = targetPsnId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetPsnId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_psn_id = 7;</code>
       * @return The bytes for targetPsnId.
       */
      public com.google.protobuf.ByteString
          getTargetPsnIdBytes() {
        java.lang.Object ref = targetPsnId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetPsnId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_psn_id = 7;</code>
       * @param value The targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        targetPsnId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPsnId() {
        targetPsnId_ = getDefaultInstance().getTargetPsnId();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 7;</code>
       * @param value The bytes for targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        targetPsnId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 13;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 13;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {

        param_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PSPlayerApplyEnterMpRsp)
    }

    // @@protoc_insertion_point(class_scope:PSPlayerApplyEnterMpRsp)
    private static final emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp();
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp>
        PARSER = new com.google.protobuf.AbstractParser<PSPlayerApplyEnterMpRsp>() {
      @java.lang.Override
      public PSPlayerApplyEnterMpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PSPlayerApplyEnterMpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PSPlayerApplyEnterMpRsp.proto\"P\n\027PSPla" +
      "yerApplyEnterMpRsp\022\017\n\007retcode\030\016 \001(\005\022\025\n\rt" +
      "arget_psn_id\030\007 \001(\t\022\r\n\005param\030\r \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PSPlayerApplyEnterMpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PSPlayerApplyEnterMpRsp_descriptor,
        new java.lang.String[] { "Retcode", "TargetPsnId", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
