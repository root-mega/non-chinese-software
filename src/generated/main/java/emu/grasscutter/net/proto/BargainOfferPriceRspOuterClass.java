// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainOfferPriceRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class BargainOfferPriceRspOuterClass {
  private BargainOfferPriceRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainOfferPriceRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainOfferPriceRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 cur_mood = 10;</code>
     * @return The curMood.
     */
    int getCurMood();

    /**
     * <code>uint32 result_param = 8;</code>
     * @return The resultParam.
     */
    int getResultParam();

    /**
     * <code>.BargainResultType bargain_result = 12;</code>
     * @return The enum numeric value on the wire for bargainResult.
     */
    int getBargainResultValue();
    /**
     * <code>.BargainResultType bargain_result = 12;</code>
     * @return The bargainResult.
     */
    emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 28942
   * Obf: IKJLNCGMPFH
   * </pre>
   *
   * Protobuf type {@code BargainOfferPriceRsp}
   */
  public static final class BargainOfferPriceRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainOfferPriceRsp)
      BargainOfferPriceRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainOfferPriceRsp.newBuilder() to construct.
    private BargainOfferPriceRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainOfferPriceRsp() {
      bargainResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainOfferPriceRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.class, emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.Builder.class);
    }

    public static final int CUR_MOOD_FIELD_NUMBER = 10;
    private int curMood_ = 0;
    /**
     * <code>int32 cur_mood = 10;</code>
     * @return The curMood.
     */
    @java.lang.Override
    public int getCurMood() {
      return curMood_;
    }

    public static final int RESULT_PARAM_FIELD_NUMBER = 8;
    private int resultParam_ = 0;
    /**
     * <code>uint32 result_param = 8;</code>
     * @return The resultParam.
     */
    @java.lang.Override
    public int getResultParam() {
      return resultParam_;
    }

    public static final int BARGAIN_RESULT_FIELD_NUMBER = 12;
    private int bargainResult_ = 0;
    /**
     * <code>.BargainResultType bargain_result = 12;</code>
     * @return The enum numeric value on the wire for bargainResult.
     */
    @java.lang.Override public int getBargainResultValue() {
      return bargainResult_;
    }
    /**
     * <code>.BargainResultType bargain_result = 12;</code>
     * @return The bargainResult.
     */
    @java.lang.Override public emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult() {
      emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType result = emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.forNumber(bargainResult_);
      return result == null ? emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (resultParam_ != 0) {
        output.writeUInt32(8, resultParam_);
      }
      if (curMood_ != 0) {
        output.writeInt32(10, curMood_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (bargainResult_ != emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.BARGAIN_COMPLETE_SUCC.getNumber()) {
        output.writeEnum(12, bargainResult_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resultParam_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, resultParam_);
      }
      if (curMood_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, curMood_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (bargainResult_ != emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.BARGAIN_COMPLETE_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, bargainResult_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp other = (emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp) obj;

      if (getCurMood()
          != other.getCurMood()) return false;
      if (getResultParam()
          != other.getResultParam()) return false;
      if (bargainResult_ != other.bargainResult_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CUR_MOOD_FIELD_NUMBER;
      hash = (53 * hash) + getCurMood();
      hash = (37 * hash) + RESULT_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getResultParam();
      hash = (37 * hash) + BARGAIN_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + bargainResult_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp prototype) {
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
     * CmdId: 28942
     * Obf: IKJLNCGMPFH
     * </pre>
     *
     * Protobuf type {@code BargainOfferPriceRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainOfferPriceRsp)
        emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.class, emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.newBuilder()
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
        curMood_ = 0;
        resultParam_ = 0;
        bargainResult_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp build() {
        emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp buildPartial() {
        emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp result = new emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curMood_ = curMood_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.resultParam_ = resultParam_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bargainResult_ = bargainResult_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp) {
          return mergeFrom((emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp other) {
        if (other == emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.getDefaultInstance()) return this;
        if (other.getCurMood() != 0) {
          setCurMood(other.getCurMood());
        }
        if (other.getResultParam() != 0) {
          setResultParam(other.getResultParam());
        }
        if (other.bargainResult_ != 0) {
          setBargainResultValue(other.getBargainResultValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 64: {
                resultParam_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 80: {
                curMood_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
              case 96: {
                bargainResult_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
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

      private int curMood_ ;
      /**
       * <code>int32 cur_mood = 10;</code>
       * @return The curMood.
       */
      @java.lang.Override
      public int getCurMood() {
        return curMood_;
      }
      /**
       * <code>int32 cur_mood = 10;</code>
       * @param value The curMood to set.
       * @return This builder for chaining.
       */
      public Builder setCurMood(int value) {

        curMood_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cur_mood = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurMood() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curMood_ = 0;
        onChanged();
        return this;
      }

      private int resultParam_ ;
      /**
       * <code>uint32 result_param = 8;</code>
       * @return The resultParam.
       */
      @java.lang.Override
      public int getResultParam() {
        return resultParam_;
      }
      /**
       * <code>uint32 result_param = 8;</code>
       * @param value The resultParam to set.
       * @return This builder for chaining.
       */
      public Builder setResultParam(int value) {

        resultParam_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 result_param = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearResultParam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        resultParam_ = 0;
        onChanged();
        return this;
      }

      private int bargainResult_ = 0;
      /**
       * <code>.BargainResultType bargain_result = 12;</code>
       * @return The enum numeric value on the wire for bargainResult.
       */
      @java.lang.Override public int getBargainResultValue() {
        return bargainResult_;
      }
      /**
       * <code>.BargainResultType bargain_result = 12;</code>
       * @param value The enum numeric value on the wire for bargainResult to set.
       * @return This builder for chaining.
       */
      public Builder setBargainResultValue(int value) {
        bargainResult_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.BargainResultType bargain_result = 12;</code>
       * @return The bargainResult.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult() {
        emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType result = emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.forNumber(bargainResult_);
        return result == null ? emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType.UNRECOGNIZED : result;
      }
      /**
       * <code>.BargainResultType bargain_result = 12;</code>
       * @param value The bargainResult to set.
       * @return This builder for chaining.
       */
      public Builder setBargainResult(emu.grasscutter.net.proto.BargainResultTypeOuterClass.BargainResultType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        bargainResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.BargainResultType bargain_result = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainResult() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bargainResult_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainOfferPriceRsp)
    }

    // @@protoc_insertion_point(class_scope:BargainOfferPriceRsp)
    private static final emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp();
    }

    public static emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainOfferPriceRsp>
        PARSER = new com.google.protobuf.AbstractParser<BargainOfferPriceRsp>() {
      @java.lang.Override
      public BargainOfferPriceRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BargainOfferPriceRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainOfferPriceRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainOfferPriceRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainOfferPriceRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BargainOfferPriceRsp.proto\032\027BargainRes" +
      "ultType.proto\"{\n\024BargainOfferPriceRsp\022\020\n" +
      "\010cur_mood\030\n \001(\005\022\024\n\014result_param\030\010 \001(\r\022*\n" +
      "\016bargain_result\030\014 \001(\0162\022.BargainResultTyp" +
      "e\022\017\n\007retcode\030\013 \001(\005B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BargainResultTypeOuterClass.getDescriptor(),
        });
    internal_static_BargainOfferPriceRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainOfferPriceRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainOfferPriceRsp_descriptor,
        new java.lang.String[] { "CurMood", "ResultParam", "BargainResult", "Retcode", });
    emu.grasscutter.net.proto.BargainResultTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
