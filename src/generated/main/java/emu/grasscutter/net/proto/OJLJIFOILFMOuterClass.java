// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OJLJIFOILFM.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class OJLJIFOILFMOuterClass {
  private OJLJIFOILFMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OJLJIFOILFMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OJLJIFOILFM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @return A list containing the mGKAGAOPJGL.
     */
    java.util.List<java.lang.Long> getMGKAGAOPJGLList();
    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @return The count of mGKAGAOPJGL.
     */
    int getMGKAGAOPJGLCount();
    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @param index The index of the element to return.
     * @return The mGKAGAOPJGL at the given index.
     */
    long getMGKAGAOPJGL(int index);

    /**
     * <code>uint32 level_id = 4;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 INPCKNLDLLJ = 14;</code>
     * @return The iNPCKNLDLLJ.
     */
    int getINPCKNLDLLJ();

    /**
     * <code>uint32 max_score = 11;</code>
     * @return The maxScore.
     */
    int getMaxScore();
  }
  /**
   * Protobuf type {@code OJLJIFOILFM}
   */
  public static final class OJLJIFOILFM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OJLJIFOILFM)
      OJLJIFOILFMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OJLJIFOILFM.newBuilder() to construct.
    private OJLJIFOILFM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OJLJIFOILFM() {
      mGKAGAOPJGL_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OJLJIFOILFM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.internal_static_OJLJIFOILFM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.internal_static_OJLJIFOILFM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.class, emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.Builder.class);
    }

    public static final int MGKAGAOPJGL_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList mGKAGAOPJGL_ =
        emptyLongList();
    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @return A list containing the mGKAGAOPJGL.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getMGKAGAOPJGLList() {
      return mGKAGAOPJGL_;
    }
    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @return The count of mGKAGAOPJGL.
     */
    public int getMGKAGAOPJGLCount() {
      return mGKAGAOPJGL_.size();
    }
    /**
     * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
     * @param index The index of the element to return.
     * @return The mGKAGAOPJGL at the given index.
     */
    public long getMGKAGAOPJGL(int index) {
      return mGKAGAOPJGL_.getLong(index);
    }
    private int mGKAGAOPJGLMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 4;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 4;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int INPCKNLDLLJ_FIELD_NUMBER = 14;
    private int iNPCKNLDLLJ_ = 0;
    /**
     * <code>uint32 INPCKNLDLLJ = 14;</code>
     * @return The iNPCKNLDLLJ.
     */
    @java.lang.Override
    public int getINPCKNLDLLJ() {
      return iNPCKNLDLLJ_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 11;
    private int maxScore_ = 0;
    /**
     * <code>uint32 max_score = 11;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
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
      getSerializedSize();
      if (levelId_ != 0) {
        output.writeUInt32(4, levelId_);
      }
      if (getMGKAGAOPJGLList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(mGKAGAOPJGLMemoizedSerializedSize);
      }
      for (int i = 0; i < mGKAGAOPJGL_.size(); i++) {
        output.writeUInt64NoTag(mGKAGAOPJGL_.getLong(i));
      }
      if (maxScore_ != 0) {
        output.writeUInt32(11, maxScore_);
      }
      if (iNPCKNLDLLJ_ != 0) {
        output.writeUInt32(14, iNPCKNLDLLJ_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mGKAGAOPJGL_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(mGKAGAOPJGL_.getLong(i));
        }
        size += dataSize;
        if (!getMGKAGAOPJGLList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mGKAGAOPJGLMemoizedSerializedSize = dataSize;
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, maxScore_);
      }
      if (iNPCKNLDLLJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, iNPCKNLDLLJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM other = (emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM) obj;

      if (!getMGKAGAOPJGLList()
          .equals(other.getMGKAGAOPJGLList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getINPCKNLDLLJ()
          != other.getINPCKNLDLLJ()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
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
      if (getMGKAGAOPJGLCount() > 0) {
        hash = (37 * hash) + MGKAGAOPJGL_FIELD_NUMBER;
        hash = (53 * hash) + getMGKAGAOPJGLList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + INPCKNLDLLJ_FIELD_NUMBER;
      hash = (53 * hash) + getINPCKNLDLLJ();
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM prototype) {
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
     * Protobuf type {@code OJLJIFOILFM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OJLJIFOILFM)
        emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.internal_static_OJLJIFOILFM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.internal_static_OJLJIFOILFM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.class, emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.newBuilder()
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
        mGKAGAOPJGL_ = emptyLongList();
        levelId_ = 0;
        iNPCKNLDLLJ_ = 0;
        maxScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.internal_static_OJLJIFOILFM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM build() {
        emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM buildPartial() {
        emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM result = new emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          mGKAGAOPJGL_.makeImmutable();
          result.mGKAGAOPJGL_ = mGKAGAOPJGL_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.iNPCKNLDLLJ_ = iNPCKNLDLLJ_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.maxScore_ = maxScore_;
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
        if (other instanceof emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM) {
          return mergeFrom((emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM other) {
        if (other == emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM.getDefaultInstance()) return this;
        if (!other.mGKAGAOPJGL_.isEmpty()) {
          if (mGKAGAOPJGL_.isEmpty()) {
            mGKAGAOPJGL_ = other.mGKAGAOPJGL_;
            mGKAGAOPJGL_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureMGKAGAOPJGLIsMutable();
            mGKAGAOPJGL_.addAll(other.mGKAGAOPJGL_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getINPCKNLDLLJ() != 0) {
          setINPCKNLDLLJ(other.getINPCKNLDLLJ());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
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
              case 32: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                long v = input.readUInt64();
                ensureMGKAGAOPJGLIsMutable();
                mGKAGAOPJGL_.addLong(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureMGKAGAOPJGLIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  mGKAGAOPJGL_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 88: {
                maxScore_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
              case 112: {
                iNPCKNLDLLJ_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private com.google.protobuf.Internal.LongList mGKAGAOPJGL_ = emptyLongList();
      private void ensureMGKAGAOPJGLIsMutable() {
        if (!mGKAGAOPJGL_.isModifiable()) {
          mGKAGAOPJGL_ = makeMutableCopy(mGKAGAOPJGL_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @return A list containing the mGKAGAOPJGL.
       */
      public java.util.List<java.lang.Long>
          getMGKAGAOPJGLList() {
        mGKAGAOPJGL_.makeImmutable();
        return mGKAGAOPJGL_;
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @return The count of mGKAGAOPJGL.
       */
      public int getMGKAGAOPJGLCount() {
        return mGKAGAOPJGL_.size();
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @param index The index of the element to return.
       * @return The mGKAGAOPJGL at the given index.
       */
      public long getMGKAGAOPJGL(int index) {
        return mGKAGAOPJGL_.getLong(index);
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @param index The index to set the value at.
       * @param value The mGKAGAOPJGL to set.
       * @return This builder for chaining.
       */
      public Builder setMGKAGAOPJGL(
          int index, long value) {

        ensureMGKAGAOPJGLIsMutable();
        mGKAGAOPJGL_.setLong(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @param value The mGKAGAOPJGL to add.
       * @return This builder for chaining.
       */
      public Builder addMGKAGAOPJGL(long value) {

        ensureMGKAGAOPJGLIsMutable();
        mGKAGAOPJGL_.addLong(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @param values The mGKAGAOPJGL to add.
       * @return This builder for chaining.
       */
      public Builder addAllMGKAGAOPJGL(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureMGKAGAOPJGLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mGKAGAOPJGL_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 MGKAGAOPJGL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMGKAGAOPJGL() {
        mGKAGAOPJGL_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 4;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 4;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int iNPCKNLDLLJ_ ;
      /**
       * <code>uint32 INPCKNLDLLJ = 14;</code>
       * @return The iNPCKNLDLLJ.
       */
      @java.lang.Override
      public int getINPCKNLDLLJ() {
        return iNPCKNLDLLJ_;
      }
      /**
       * <code>uint32 INPCKNLDLLJ = 14;</code>
       * @param value The iNPCKNLDLLJ to set.
       * @return This builder for chaining.
       */
      public Builder setINPCKNLDLLJ(int value) {

        iNPCKNLDLLJ_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 INPCKNLDLLJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearINPCKNLDLLJ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        iNPCKNLDLLJ_ = 0;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 11;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 11;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {

        maxScore_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        maxScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OJLJIFOILFM)
    }

    // @@protoc_insertion_point(class_scope:OJLJIFOILFM)
    private static final emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM();
    }

    public static emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OJLJIFOILFM>
        PARSER = new com.google.protobuf.AbstractParser<OJLJIFOILFM>() {
      @java.lang.Override
      public OJLJIFOILFM parsePartialFrom(
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

    public static com.google.protobuf.Parser<OJLJIFOILFM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OJLJIFOILFM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OJLJIFOILFMOuterClass.OJLJIFOILFM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OJLJIFOILFM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OJLJIFOILFM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OJLJIFOILFM.proto\"\\\n\013OJLJIFOILFM\022\023\n\013MG" +
      "KAGAOPJGL\030\005 \003(\004\022\020\n\010level_id\030\004 \001(\r\022\023\n\013INP" +
      "CKNLDLLJ\030\016 \001(\r\022\021\n\tmax_score\030\013 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OJLJIFOILFM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OJLJIFOILFM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OJLJIFOILFM_descriptor,
        new java.lang.String[] { "MGKAGAOPJGL", "LevelId", "INPCKNLDLLJ", "MaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
