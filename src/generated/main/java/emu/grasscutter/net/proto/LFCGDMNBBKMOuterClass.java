// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LFCGDMNBBKM.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class LFCGDMNBBKMOuterClass {
  private LFCGDMNBBKMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LFCGDMNBBKMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LFCGDMNBBKM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 best_score = 9;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * Protobuf type {@code LFCGDMNBBKM}
   */
  public static final class LFCGDMNBBKM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LFCGDMNBBKM)
      LFCGDMNBBKMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LFCGDMNBBKM.newBuilder() to construct.
    private LFCGDMNBBKM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LFCGDMNBBKM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LFCGDMNBBKM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.internal_static_LFCGDMNBBKM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.internal_static_LFCGDMNBBKM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.class, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 14;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 9;
    private int bestScore_ = 0;
    /**
     * <code>uint32 best_score = 9;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
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
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(9, bestScore_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      if (isFinish_ != false) {
        output.writeBool(14, isFinish_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, bestScore_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM other = (emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM prototype) {
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
     * Protobuf type {@code LFCGDMNBBKM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LFCGDMNBBKM)
        emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.internal_static_LFCGDMNBBKM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.internal_static_LFCGDMNBBKM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.class, emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.newBuilder()
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
        isOpen_ = false;
        levelId_ = 0;
        isFinish_ = false;
        bestScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.internal_static_LFCGDMNBBKM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM build() {
        emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM buildPartial() {
        emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM result = new emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.bestScore_ = bestScore_;
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
        if (other instanceof emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM) {
          return mergeFrom((emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM other) {
        if (other == emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
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
              case 40: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 72: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
              case 88: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 112: {
                isFinish_ = input.readBool();
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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</code>
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
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 14;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 9;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 9;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {

        bestScore_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        bestScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LFCGDMNBBKM)
    }

    // @@protoc_insertion_point(class_scope:LFCGDMNBBKM)
    private static final emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM();
    }

    public static emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LFCGDMNBBKM>
        PARSER = new com.google.protobuf.AbstractParser<LFCGDMNBBKM>() {
      @java.lang.Override
      public LFCGDMNBBKM parsePartialFrom(
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

    public static com.google.protobuf.Parser<LFCGDMNBBKM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LFCGDMNBBKM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LFCGDMNBBKMOuterClass.LFCGDMNBBKM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LFCGDMNBBKM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LFCGDMNBBKM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LFCGDMNBBKM.proto\"W\n\013LFCGDMNBBKM\022\017\n\007is" +
      "_open\030\005 \001(\010\022\020\n\010level_id\030\013 \001(\r\022\021\n\tis_fini" +
      "sh\030\016 \001(\010\022\022\n\nbest_score\030\t \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LFCGDMNBBKM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LFCGDMNBBKM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LFCGDMNBBKM_descriptor,
        new java.lang.String[] { "IsOpen", "LevelId", "IsFinish", "BestScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
