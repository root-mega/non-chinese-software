// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearLevelData.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class GearLevelDataOuterClass {
  private GearLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 4;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 EEMGKJOCHHK = 3;</code>
     * @return The eEMGKJOCHHK.
     */
    int getEEMGKJOCHHK();

    /**
     * <code>uint32 open_time = 14;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>bool is_finished = 8;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 MMGJJBELBHF = 9;</code>
     * @return The mMGJJBELBHF.
     */
    int getMMGJJBELBHF();
  }
  /**
   * <pre>
   * Obf: DFJGCCIKGLP
   * </pre>
   *
   * Protobuf type {@code GearLevelData}
   */
  public static final class GearLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearLevelData)
      GearLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearLevelData.newBuilder() to construct.
    private GearLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearLevelData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
    }

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

    public static final int EEMGKJOCHHK_FIELD_NUMBER = 3;
    private int eEMGKJOCHHK_ = 0;
    /**
     * <code>uint32 EEMGKJOCHHK = 3;</code>
     * @return The eEMGKJOCHHK.
     */
    @java.lang.Override
    public int getEEMGKJOCHHK() {
      return eEMGKJOCHHK_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 14;
    private int openTime_ = 0;
    /**
     * <code>uint32 open_time = 14;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 8;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 8;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int MMGJJBELBHF_FIELD_NUMBER = 9;
    private int mMGJJBELBHF_ = 0;
    /**
     * <code>uint32 MMGJJBELBHF = 9;</code>
     * @return The mMGJJBELBHF.
     */
    @java.lang.Override
    public int getMMGJJBELBHF() {
      return mMGJJBELBHF_;
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
      if (eEMGKJOCHHK_ != 0) {
        output.writeUInt32(3, eEMGKJOCHHK_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(4, levelId_);
      }
      if (isFinished_ != false) {
        output.writeBool(8, isFinished_);
      }
      if (mMGJJBELBHF_ != 0) {
        output.writeUInt32(9, mMGJJBELBHF_);
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(14, openTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eEMGKJOCHHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, eEMGKJOCHHK_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, levelId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isFinished_);
      }
      if (mMGJJBELBHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, mMGJJBELBHF_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, openTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData other = (emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getEEMGKJOCHHK()
          != other.getEEMGKJOCHHK()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getMMGJJBELBHF()
          != other.getMMGJJBELBHF()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + EEMGKJOCHHK_FIELD_NUMBER;
      hash = (53 * hash) + getEEMGKJOCHHK();
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + MMGJJBELBHF_FIELD_NUMBER;
      hash = (53 * hash) + getMMGJJBELBHF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData prototype) {
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
     * Obf: DFJGCCIKGLP
     * </pre>
     *
     * Protobuf type {@code GearLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearLevelData)
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.newBuilder()
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
        levelId_ = 0;
        eEMGKJOCHHK_ = 0;
        openTime_ = 0;
        isOpen_ = false;
        isFinished_ = false;
        mMGJJBELBHF_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData build() {
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData buildPartial() {
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData result = new emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.eEMGKJOCHHK_ = eEMGKJOCHHK_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.openTime_ = openTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.mMGJJBELBHF_ = mMGJJBELBHF_;
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
        if (other instanceof emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData) {
          return mergeFrom((emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData other) {
        if (other == emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getEEMGKJOCHHK() != 0) {
          setEEMGKJOCHHK(other.getEEMGKJOCHHK());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getMMGJJBELBHF() != 0) {
          setMMGJJBELBHF(other.getMMGJJBELBHF());
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
                eEMGKJOCHHK_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 32: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 64: {
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 64
              case 72: {
                mMGJJBELBHF_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 72
              case 96: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
              case 112: {
                openTime_ = input.readUInt32();
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
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int eEMGKJOCHHK_ ;
      /**
       * <code>uint32 EEMGKJOCHHK = 3;</code>
       * @return The eEMGKJOCHHK.
       */
      @java.lang.Override
      public int getEEMGKJOCHHK() {
        return eEMGKJOCHHK_;
      }
      /**
       * <code>uint32 EEMGKJOCHHK = 3;</code>
       * @param value The eEMGKJOCHHK to set.
       * @return This builder for chaining.
       */
      public Builder setEEMGKJOCHHK(int value) {

        eEMGKJOCHHK_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EEMGKJOCHHK = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEEMGKJOCHHK() {
        bitField0_ = (bitField0_ & ~0x00000002);
        eEMGKJOCHHK_ = 0;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 14;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 14;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {

        openTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
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
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 8;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 8;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int mMGJJBELBHF_ ;
      /**
       * <code>uint32 MMGJJBELBHF = 9;</code>
       * @return The mMGJJBELBHF.
       */
      @java.lang.Override
      public int getMMGJJBELBHF() {
        return mMGJJBELBHF_;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 9;</code>
       * @param value The mMGJJBELBHF to set.
       * @return This builder for chaining.
       */
      public Builder setMMGJJBELBHF(int value) {

        mMGJJBELBHF_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MMGJJBELBHF = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMMGJJBELBHF() {
        bitField0_ = (bitField0_ & ~0x00000020);
        mMGJJBELBHF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GearLevelData)
    }

    // @@protoc_insertion_point(class_scope:GearLevelData)
    private static final emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData();
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearLevelData>
        PARSER = new com.google.protobuf.AbstractParser<GearLevelData>() {
      @java.lang.Override
      public GearLevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<GearLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GearLevelData.proto\"\204\001\n\rGearLevelData\022" +
      "\020\n\010level_id\030\004 \001(\r\022\023\n\013EEMGKJOCHHK\030\003 \001(\r\022\021" +
      "\n\topen_time\030\016 \001(\r\022\017\n\007is_open\030\014 \001(\010\022\023\n\013is" +
      "_finished\030\010 \001(\010\022\023\n\013MMGJJBELBHF\030\t \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GearLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearLevelData_descriptor,
        new java.lang.String[] { "LevelId", "EEMGKJOCHHK", "OpenTime", "IsOpen", "IsFinished", "MMGJJBELBHF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
