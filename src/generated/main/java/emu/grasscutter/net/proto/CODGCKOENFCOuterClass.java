// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CODGCKOENFC.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class CODGCKOENFCOuterClass {
  private CODGCKOENFCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CODGCKOENFCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CODGCKOENFC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 3;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 MMGJJBELBHF = 8;</code>
     * @return The mMGJJBELBHF.
     */
    int getMMGJJBELBHF();

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code CODGCKOENFC}
   */
  public static final class CODGCKOENFC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CODGCKOENFC)
      CODGCKOENFCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CODGCKOENFC.newBuilder() to construct.
    private CODGCKOENFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CODGCKOENFC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CODGCKOENFC();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.internal_static_CODGCKOENFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.internal_static_CODGCKOENFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.class, emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 3;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 3;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int MMGJJBELBHF_FIELD_NUMBER = 8;
    private int mMGJJBELBHF_ = 0;
    /**
     * <code>uint32 MMGJJBELBHF = 8;</code>
     * @return The mMGJJBELBHF.
     */
    @java.lang.Override
    public int getMMGJJBELBHF() {
      return mMGJJBELBHF_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 9;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isFinish_ != false) {
        output.writeBool(3, isFinish_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (mMGJJBELBHF_ != 0) {
        output.writeUInt32(8, mMGJJBELBHF_);
      }
      if (isOpen_ != false) {
        output.writeBool(9, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isFinish_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      if (mMGJJBELBHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, mMGJJBELBHF_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC other = (emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getMMGJJBELBHF()
          != other.getMMGJJBELBHF()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + MMGJJBELBHF_FIELD_NUMBER;
      hash = (53 * hash) + getMMGJJBELBHF();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC prototype) {
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
     * Protobuf type {@code CODGCKOENFC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CODGCKOENFC)
        emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.internal_static_CODGCKOENFC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.internal_static_CODGCKOENFC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.class, emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.newBuilder()
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
        isFinish_ = false;
        mMGJJBELBHF_ = 0;
        levelId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.internal_static_CODGCKOENFC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC build() {
        emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC buildPartial() {
        emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC result = new emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mMGJJBELBHF_ = mMGJJBELBHF_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC) {
          return mergeFrom((emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC other) {
        if (other == emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getMMGJJBELBHF() != 0) {
          setMMGJJBELBHF(other.getMMGJJBELBHF());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 48: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 64: {
                mMGJJBELBHF_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 72: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
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

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 3;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 3;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int mMGJJBELBHF_ ;
      /**
       * <code>uint32 MMGJJBELBHF = 8;</code>
       * @return The mMGJJBELBHF.
       */
      @java.lang.Override
      public int getMMGJJBELBHF() {
        return mMGJJBELBHF_;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 8;</code>
       * @param value The mMGJJBELBHF to set.
       * @return This builder for chaining.
       */
      public Builder setMMGJJBELBHF(int value) {

        mMGJJBELBHF_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMMGJJBELBHF() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mMGJJBELBHF_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 9;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:CODGCKOENFC)
    }

    // @@protoc_insertion_point(class_scope:CODGCKOENFC)
    private static final emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC();
    }

    public static emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CODGCKOENFC>
        PARSER = new com.google.protobuf.AbstractParser<CODGCKOENFC>() {
      @java.lang.Override
      public CODGCKOENFC parsePartialFrom(
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

    public static com.google.protobuf.Parser<CODGCKOENFC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CODGCKOENFC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CODGCKOENFCOuterClass.CODGCKOENFC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CODGCKOENFC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CODGCKOENFC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CODGCKOENFC.proto\"X\n\013CODGCKOENFC\022\021\n\tis" +
      "_finish\030\003 \001(\010\022\023\n\013MMGJJBELBHF\030\010 \001(\r\022\020\n\010le" +
      "vel_id\030\006 \001(\r\022\017\n\007is_open\030\t \001(\010B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CODGCKOENFC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CODGCKOENFC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CODGCKOENFC_descriptor,
        new java.lang.String[] { "IsFinish", "MMGJJBELBHF", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
