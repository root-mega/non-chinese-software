// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PFJAGHMKJJM.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class PFJAGHMKJJMOuterClass {
  private PFJAGHMKJJMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PFJAGHMKJJMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PFJAGHMKJJM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 camp_id = 4;</code>
     * @return The campId.
     */
    int getCampId();

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();
  }
  /**
   * Protobuf type {@code PFJAGHMKJJM}
   */
  public static final class PFJAGHMKJJM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PFJAGHMKJJM)
      PFJAGHMKJJMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PFJAGHMKJJM.newBuilder() to construct.
    private PFJAGHMKJJM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PFJAGHMKJJM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PFJAGHMKJJM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.class, emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.Builder.class);
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

    public static final int CAMP_ID_FIELD_NUMBER = 4;
    private int campId_ = 0;
    /**
     * <code>uint32 camp_id = 4;</code>
     * @return The campId.
     */
    @java.lang.Override
    public int getCampId() {
      return campId_;
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

    public static final int IS_FINISH_FIELD_NUMBER = 8;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
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
      if (campId_ != 0) {
        output.writeUInt32(4, campId_);
      }
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (isFinish_ != false) {
        output.writeBool(8, isFinish_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, campId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isFinish_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM other = (emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getCampId()
          != other.getCampId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
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
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM prototype) {
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
     * Protobuf type {@code PFJAGHMKJJM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PFJAGHMKJJM)
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.class, emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.newBuilder()
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
        campId_ = 0;
        levelId_ = 0;
        isFinish_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM build() {
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM buildPartial() {
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM result = new emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.campId_ = campId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isFinish_ = isFinish_;
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
        if (other instanceof emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM) {
          return mergeFrom((emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM other) {
        if (other == emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
                campId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 64: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 88: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
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

      private int campId_ ;
      /**
       * <code>uint32 camp_id = 4;</code>
       * @return The campId.
       */
      @java.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 4;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {

        campId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        campId_ = 0;
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
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 8;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 8;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:PFJAGHMKJJM)
    }

    // @@protoc_insertion_point(class_scope:PFJAGHMKJJM)
    private static final emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM();
    }

    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PFJAGHMKJJM>
        PARSER = new com.google.protobuf.AbstractParser<PFJAGHMKJJM>() {
      @java.lang.Override
      public PFJAGHMKJJM parsePartialFrom(
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

    public static com.google.protobuf.Parser<PFJAGHMKJJM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PFJAGHMKJJM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PFJAGHMKJJM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PFJAGHMKJJM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PFJAGHMKJJM.proto\"T\n\013PFJAGHMKJJM\022\017\n\007is" +
      "_open\030\005 \001(\010\022\017\n\007camp_id\030\004 \001(\r\022\020\n\010level_id" +
      "\030\013 \001(\r\022\021\n\tis_finish\030\010 \001(\010B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PFJAGHMKJJM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PFJAGHMKJJM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PFJAGHMKJJM_descriptor,
        new java.lang.String[] { "IsOpen", "CampId", "LevelId", "IsFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
