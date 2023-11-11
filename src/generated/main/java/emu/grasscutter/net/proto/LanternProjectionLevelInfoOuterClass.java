// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternProjectionLevelInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class LanternProjectionLevelInfoOuterClass {
  private LanternProjectionLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternProjectionLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternProjectionLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 2;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>bool is_finished = 14;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>bool JNFKFCEMOFM = 7;</code>
     * @return The jNFKFCEMOFM.
     */
    boolean getJNFKFCEMOFM();

    /**
     * <code>bool FBKKFKGPLPP = 5;</code>
     * @return The fBKKFKGPLPP.
     */
    boolean getFBKKFKGPLPP();

    /**
     * <code>uint32 min_finish_time = 6;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();
  }
  /**
   * <pre>
   * Obf: DGDLGMGFEHM
   * </pre>
   *
   * Protobuf type {@code LanternProjectionLevelInfo}
   */
  public static final class LanternProjectionLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternProjectionLevelInfo)
      LanternProjectionLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternProjectionLevelInfo.newBuilder() to construct.
    private LanternProjectionLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternProjectionLevelInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternProjectionLevelInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.internal_static_LanternProjectionLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.internal_static_LanternProjectionLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.class, emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_ = 0;
    /**
     * <code>uint32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 14;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 14;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int JNFKFCEMOFM_FIELD_NUMBER = 7;
    private boolean jNFKFCEMOFM_ = false;
    /**
     * <code>bool JNFKFCEMOFM = 7;</code>
     * @return The jNFKFCEMOFM.
     */
    @java.lang.Override
    public boolean getJNFKFCEMOFM() {
      return jNFKFCEMOFM_;
    }

    public static final int FBKKFKGPLPP_FIELD_NUMBER = 5;
    private boolean fBKKFKGPLPP_ = false;
    /**
     * <code>bool FBKKFKGPLPP = 5;</code>
     * @return The fBKKFKGPLPP.
     */
    @java.lang.Override
    public boolean getFBKKFKGPLPP() {
      return fBKKFKGPLPP_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 6;
    private int minFinishTime_ = 0;
    /**
     * <code>uint32 min_finish_time = 6;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
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
      if (id_ != 0) {
        output.writeUInt32(2, id_);
      }
      if (fBKKFKGPLPP_ != false) {
        output.writeBool(5, fBKKFKGPLPP_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(6, minFinishTime_);
      }
      if (jNFKFCEMOFM_ != false) {
        output.writeBool(7, jNFKFCEMOFM_);
      }
      if (isFinished_ != false) {
        output.writeBool(14, isFinished_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, id_);
      }
      if (fBKKFKGPLPP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, fBKKFKGPLPP_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, minFinishTime_);
      }
      if (jNFKFCEMOFM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, jNFKFCEMOFM_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo other = (emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo) obj;

      if (getId()
          != other.getId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getJNFKFCEMOFM()
          != other.getJNFKFCEMOFM()) return false;
      if (getFBKKFKGPLPP()
          != other.getFBKKFKGPLPP()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + JNFKFCEMOFM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getJNFKFCEMOFM());
      hash = (37 * hash) + FBKKFKGPLPP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFBKKFKGPLPP());
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo prototype) {
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
     * Obf: DGDLGMGFEHM
     * </pre>
     *
     * Protobuf type {@code LanternProjectionLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternProjectionLevelInfo)
        emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.internal_static_LanternProjectionLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.internal_static_LanternProjectionLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.class, emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.newBuilder()
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
        id_ = 0;
        isFinished_ = false;
        jNFKFCEMOFM_ = false;
        fBKKFKGPLPP_ = false;
        minFinishTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.internal_static_LanternProjectionLevelInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo build() {
        emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo buildPartial() {
        emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo result = new emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.jNFKFCEMOFM_ = jNFKFCEMOFM_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.fBKKFKGPLPP_ = fBKKFKGPLPP_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.minFinishTime_ = minFinishTime_;
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
        if (other instanceof emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo other) {
        if (other == emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getJNFKFCEMOFM() != false) {
          setJNFKFCEMOFM(other.getJNFKFCEMOFM());
        }
        if (other.getFBKKFKGPLPP() != false) {
          setFBKKFKGPLPP(other.getFBKKFKGPLPP());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
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
              case 16: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 40: {
                fBKKFKGPLPP_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 48: {
                minFinishTime_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 48
              case 56: {
                jNFKFCEMOFM_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 112: {
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000002;
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

      private int id_ ;
      /**
       * <code>uint32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 14;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 14;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private boolean jNFKFCEMOFM_ ;
      /**
       * <code>bool JNFKFCEMOFM = 7;</code>
       * @return The jNFKFCEMOFM.
       */
      @java.lang.Override
      public boolean getJNFKFCEMOFM() {
        return jNFKFCEMOFM_;
      }
      /**
       * <code>bool JNFKFCEMOFM = 7;</code>
       * @param value The jNFKFCEMOFM to set.
       * @return This builder for chaining.
       */
      public Builder setJNFKFCEMOFM(boolean value) {

        jNFKFCEMOFM_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool JNFKFCEMOFM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearJNFKFCEMOFM() {
        bitField0_ = (bitField0_ & ~0x00000004);
        jNFKFCEMOFM_ = false;
        onChanged();
        return this;
      }

      private boolean fBKKFKGPLPP_ ;
      /**
       * <code>bool FBKKFKGPLPP = 5;</code>
       * @return The fBKKFKGPLPP.
       */
      @java.lang.Override
      public boolean getFBKKFKGPLPP() {
        return fBKKFKGPLPP_;
      }
      /**
       * <code>bool FBKKFKGPLPP = 5;</code>
       * @param value The fBKKFKGPLPP to set.
       * @return This builder for chaining.
       */
      public Builder setFBKKFKGPLPP(boolean value) {

        fBKKFKGPLPP_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool FBKKFKGPLPP = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFBKKFKGPLPP() {
        bitField0_ = (bitField0_ & ~0x00000008);
        fBKKFKGPLPP_ = false;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 6;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 6;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {

        minFinishTime_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        minFinishTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternProjectionLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternProjectionLevelInfo)
    private static final emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo();
    }

    public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternProjectionLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternProjectionLevelInfo>() {
      @java.lang.Override
      public LanternProjectionLevelInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternProjectionLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternProjectionLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternProjectionLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternProjectionLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n LanternProjectionLevelInfo.proto\"\200\001\n\032L" +
      "anternProjectionLevelInfo\022\n\n\002id\030\002 \001(\r\022\023\n" +
      "\013is_finished\030\016 \001(\010\022\023\n\013JNFKFCEMOFM\030\007 \001(\010\022" +
      "\023\n\013FBKKFKGPLPP\030\005 \001(\010\022\027\n\017min_finish_time\030" +
      "\006 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternProjectionLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternProjectionLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternProjectionLevelInfo_descriptor,
        new java.lang.String[] { "Id", "IsFinished", "JNFKFCEMOFM", "FBKKFKGPLPP", "MinFinishTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
