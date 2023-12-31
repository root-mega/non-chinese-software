// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChallengeBrief.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ChallengeBriefOuterClass {
  private ChallengeBriefOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChallengeBriefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChallengeBrief)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 cur_progress = 3;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>bool is_success = 9;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_index = 15;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();
  }
  /**
   * <pre>
   * Obf: LECFLFKFOOL
   * </pre>
   *
   * Protobuf type {@code ChallengeBrief}
   */
  public static final class ChallengeBrief extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChallengeBrief)
      ChallengeBriefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChallengeBrief.newBuilder() to construct.
    private ChallengeBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChallengeBrief() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChallengeBrief();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChallengeBriefOuterClass.internal_static_ChallengeBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChallengeBriefOuterClass.internal_static_ChallengeBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.class, emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 14;
    private int challengeId_ = 0;
    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 3;
    private int curProgress_ = 0;
    /**
     * <code>uint32 cur_progress = 3;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 9;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 9;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 15;
    private int challengeIndex_ = 0;
    /**
     * <code>uint32 challenge_index = 15;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
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
      if (curProgress_ != 0) {
        output.writeUInt32(3, curProgress_);
      }
      if (isSuccess_ != false) {
        output.writeBool(9, isSuccess_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(14, challengeId_);
      }
      if (challengeIndex_ != 0) {
        output.writeUInt32(15, challengeIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, curProgress_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isSuccess_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, challengeId_);
      }
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, challengeIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief other = (emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief prototype) {
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
     * Obf: LECFLFKFOOL
     * </pre>
     *
     * Protobuf type {@code ChallengeBrief}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChallengeBrief)
        emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBriefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChallengeBriefOuterClass.internal_static_ChallengeBrief_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChallengeBriefOuterClass.internal_static_ChallengeBrief_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.class, emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.newBuilder()
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
        challengeId_ = 0;
        curProgress_ = 0;
        isSuccess_ = false;
        challengeIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChallengeBriefOuterClass.internal_static_ChallengeBrief_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief build() {
        emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief buildPartial() {
        emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief result = new emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.challengeId_ = challengeId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.curProgress_ = curProgress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isSuccess_ = isSuccess_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.challengeIndex_ = challengeIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief) {
          return mergeFrom((emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief other) {
        if (other == emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
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
              case 24: {
                curProgress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 72: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 112: {
                challengeId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              case 120: {
                challengeIndex_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 120
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

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {

        challengeId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 3;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 3;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {

        curProgress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 9;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 9;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 15;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 15;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {

        challengeIndex_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {
        bitField0_ = (bitField0_ & ~0x00000008);
        challengeIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChallengeBrief)
    }

    // @@protoc_insertion_point(class_scope:ChallengeBrief)
    private static final emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief();
    }

    public static emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChallengeBrief>
        PARSER = new com.google.protobuf.AbstractParser<ChallengeBrief>() {
      @java.lang.Override
      public ChallengeBrief parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChallengeBrief> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChallengeBrief> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChallengeBriefOuterClass.ChallengeBrief getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChallengeBrief_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChallengeBrief_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ChallengeBrief.proto\"i\n\016ChallengeBrief" +
      "\022\024\n\014challenge_id\030\016 \001(\r\022\024\n\014cur_progress\030\003" +
      " \001(\r\022\022\n\nis_success\030\t \001(\010\022\027\n\017challenge_in" +
      "dex\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChallengeBrief_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChallengeBrief_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChallengeBrief_descriptor,
        new java.lang.String[] { "ChallengeId", "CurProgress", "IsSuccess", "ChallengeIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
