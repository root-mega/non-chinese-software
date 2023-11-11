// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationQuestInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class CityReputationQuestInfoOuterClass {
  private CityReputationQuestInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationQuestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationQuestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 1;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @return A list containing the hOOJELIFKIM.
     */
    java.util.List<java.lang.Integer> getHOOJELIFKIMList();
    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @return The count of hOOJELIFKIM.
     */
    int getHOOJELIFKIMCount();
    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @param index The index of the element to return.
     * @return The hOOJELIFKIM at the given index.
     */
    int getHOOJELIFKIM(int index);

    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @return A list containing the bFBDLFFGNOH.
     */
    java.util.List<java.lang.Integer> getBFBDLFFGNOHList();
    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @return The count of bFBDLFFGNOH.
     */
    int getBFBDLFFGNOHCount();
    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @param index The index of the element to return.
     * @return The bFBDLFFGNOH at the given index.
     */
    int getBFBDLFFGNOH(int index);
  }
  /**
   * <pre>
   * Obf: BPDJNOOMGFG
   * </pre>
   *
   * Protobuf type {@code CityReputationQuestInfo}
   */
  public static final class CityReputationQuestInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationQuestInfo)
      CityReputationQuestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationQuestInfo.newBuilder() to construct.
    private CityReputationQuestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationQuestInfo() {
      hOOJELIFKIM_ = emptyIntList();
      bFBDLFFGNOH_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationQuestInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 1;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int HOOJELIFKIM_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList hOOJELIFKIM_ =
        emptyIntList();
    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @return A list containing the hOOJELIFKIM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getHOOJELIFKIMList() {
      return hOOJELIFKIM_;
    }
    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @return The count of hOOJELIFKIM.
     */
    public int getHOOJELIFKIMCount() {
      return hOOJELIFKIM_.size();
    }
    /**
     * <code>repeated uint32 HOOJELIFKIM = 15;</code>
     * @param index The index of the element to return.
     * @return The hOOJELIFKIM at the given index.
     */
    public int getHOOJELIFKIM(int index) {
      return hOOJELIFKIM_.getInt(index);
    }
    private int hOOJELIFKIMMemoizedSerializedSize = -1;

    public static final int BFBDLFFGNOH_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList bFBDLFFGNOH_ =
        emptyIntList();
    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @return A list containing the bFBDLFFGNOH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBFBDLFFGNOHList() {
      return bFBDLFFGNOH_;
    }
    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @return The count of bFBDLFFGNOH.
     */
    public int getBFBDLFFGNOHCount() {
      return bFBDLFFGNOH_.size();
    }
    /**
     * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
     * @param index The index of the element to return.
     * @return The bFBDLFFGNOH at the given index.
     */
    public int getBFBDLFFGNOH(int index) {
      return bFBDLFFGNOH_.getInt(index);
    }
    private int bFBDLFFGNOHMemoizedSerializedSize = -1;

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
      if (isOpen_ != false) {
        output.writeBool(1, isOpen_);
      }
      if (getBFBDLFFGNOHList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(bFBDLFFGNOHMemoizedSerializedSize);
      }
      for (int i = 0; i < bFBDLFFGNOH_.size(); i++) {
        output.writeUInt32NoTag(bFBDLFFGNOH_.getInt(i));
      }
      if (getHOOJELIFKIMList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(hOOJELIFKIMMemoizedSerializedSize);
      }
      for (int i = 0; i < hOOJELIFKIM_.size(); i++) {
        output.writeUInt32NoTag(hOOJELIFKIM_.getInt(i));
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
          .computeBoolSize(1, isOpen_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < bFBDLFFGNOH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(bFBDLFFGNOH_.getInt(i));
        }
        size += dataSize;
        if (!getBFBDLFFGNOHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        bFBDLFFGNOHMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < hOOJELIFKIM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(hOOJELIFKIM_.getInt(i));
        }
        size += dataSize;
        if (!getHOOJELIFKIMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        hOOJELIFKIMMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other = (emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!getHOOJELIFKIMList()
          .equals(other.getHOOJELIFKIMList())) return false;
      if (!getBFBDLFFGNOHList()
          .equals(other.getBFBDLFFGNOHList())) return false;
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
      if (getHOOJELIFKIMCount() > 0) {
        hash = (37 * hash) + HOOJELIFKIM_FIELD_NUMBER;
        hash = (53 * hash) + getHOOJELIFKIMList().hashCode();
      }
      if (getBFBDLFFGNOHCount() > 0) {
        hash = (37 * hash) + BFBDLFFGNOH_FIELD_NUMBER;
        hash = (53 * hash) + getBFBDLFFGNOHList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo prototype) {
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
     * Obf: BPDJNOOMGFG
     * </pre>
     *
     * Protobuf type {@code CityReputationQuestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationQuestInfo)
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.newBuilder()
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
        hOOJELIFKIM_ = emptyIntList();
        bFBDLFFGNOH_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo build() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo buildPartial() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          hOOJELIFKIM_.makeImmutable();
          result.hOOJELIFKIM_ = hOOJELIFKIM_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          bFBDLFFGNOH_.makeImmutable();
          result.bFBDLFFGNOH_ = bFBDLFFGNOH_;
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
        if (other instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other) {
        if (other == emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (!other.hOOJELIFKIM_.isEmpty()) {
          if (hOOJELIFKIM_.isEmpty()) {
            hOOJELIFKIM_ = other.hOOJELIFKIM_;
            hOOJELIFKIM_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureHOOJELIFKIMIsMutable();
            hOOJELIFKIM_.addAll(other.hOOJELIFKIM_);
          }
          onChanged();
        }
        if (!other.bFBDLFFGNOH_.isEmpty()) {
          if (bFBDLFFGNOH_.isEmpty()) {
            bFBDLFFGNOH_ = other.bFBDLFFGNOH_;
            bFBDLFFGNOH_.makeImmutable();
            bitField0_ |= 0x00000004;
          } else {
            ensureBFBDLFFGNOHIsMutable();
            bFBDLFFGNOH_.addAll(other.bFBDLFFGNOH_);
          }
          onChanged();
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
              case 8: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 32: {
                int v = input.readUInt32();
                ensureBFBDLFFGNOHIsMutable();
                bFBDLFFGNOH_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureBFBDLFFGNOHIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  bFBDLFFGNOH_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 120: {
                int v = input.readUInt32();
                ensureHOOJELIFKIMIsMutable();
                hOOJELIFKIM_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureHOOJELIFKIMIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  hOOJELIFKIM_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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
       * <code>bool is_open = 1;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 1;</code>
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
       * <code>bool is_open = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList hOOJELIFKIM_ = emptyIntList();
      private void ensureHOOJELIFKIMIsMutable() {
        if (!hOOJELIFKIM_.isModifiable()) {
          hOOJELIFKIM_ = makeMutableCopy(hOOJELIFKIM_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @return A list containing the hOOJELIFKIM.
       */
      public java.util.List<java.lang.Integer>
          getHOOJELIFKIMList() {
        hOOJELIFKIM_.makeImmutable();
        return hOOJELIFKIM_;
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @return The count of hOOJELIFKIM.
       */
      public int getHOOJELIFKIMCount() {
        return hOOJELIFKIM_.size();
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @param index The index of the element to return.
       * @return The hOOJELIFKIM at the given index.
       */
      public int getHOOJELIFKIM(int index) {
        return hOOJELIFKIM_.getInt(index);
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @param index The index to set the value at.
       * @param value The hOOJELIFKIM to set.
       * @return This builder for chaining.
       */
      public Builder setHOOJELIFKIM(
          int index, int value) {

        ensureHOOJELIFKIMIsMutable();
        hOOJELIFKIM_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @param value The hOOJELIFKIM to add.
       * @return This builder for chaining.
       */
      public Builder addHOOJELIFKIM(int value) {

        ensureHOOJELIFKIMIsMutable();
        hOOJELIFKIM_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @param values The hOOJELIFKIM to add.
       * @return This builder for chaining.
       */
      public Builder addAllHOOJELIFKIM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureHOOJELIFKIMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hOOJELIFKIM_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HOOJELIFKIM = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearHOOJELIFKIM() {
        hOOJELIFKIM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList bFBDLFFGNOH_ = emptyIntList();
      private void ensureBFBDLFFGNOHIsMutable() {
        if (!bFBDLFFGNOH_.isModifiable()) {
          bFBDLFFGNOH_ = makeMutableCopy(bFBDLFFGNOH_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @return A list containing the bFBDLFFGNOH.
       */
      public java.util.List<java.lang.Integer>
          getBFBDLFFGNOHList() {
        bFBDLFFGNOH_.makeImmutable();
        return bFBDLFFGNOH_;
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @return The count of bFBDLFFGNOH.
       */
      public int getBFBDLFFGNOHCount() {
        return bFBDLFFGNOH_.size();
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @param index The index of the element to return.
       * @return The bFBDLFFGNOH at the given index.
       */
      public int getBFBDLFFGNOH(int index) {
        return bFBDLFFGNOH_.getInt(index);
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @param index The index to set the value at.
       * @param value The bFBDLFFGNOH to set.
       * @return This builder for chaining.
       */
      public Builder setBFBDLFFGNOH(
          int index, int value) {

        ensureBFBDLFFGNOHIsMutable();
        bFBDLFFGNOH_.setInt(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @param value The bFBDLFFGNOH to add.
       * @return This builder for chaining.
       */
      public Builder addBFBDLFFGNOH(int value) {

        ensureBFBDLFFGNOHIsMutable();
        bFBDLFFGNOH_.addInt(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @param values The bFBDLFFGNOH to add.
       * @return This builder for chaining.
       */
      public Builder addAllBFBDLFFGNOH(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBFBDLFFGNOHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bFBDLFFGNOH_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BFBDLFFGNOH = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBFBDLFFGNOH() {
        bFBDLFFGNOH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:CityReputationQuestInfo)
    }

    // @@protoc_insertion_point(class_scope:CityReputationQuestInfo)
    private static final emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo();
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationQuestInfo>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationQuestInfo>() {
      @java.lang.Override
      public CityReputationQuestInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CityReputationQuestInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationQuestInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationQuestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationQuestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CityReputationQuestInfo.proto\"T\n\027CityR" +
      "eputationQuestInfo\022\017\n\007is_open\030\001 \001(\010\022\023\n\013H" +
      "OOJELIFKIM\030\017 \003(\r\022\023\n\013BFBDLFFGNOH\030\004 \003(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CityReputationQuestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationQuestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationQuestInfo_descriptor,
        new java.lang.String[] { "IsOpen", "HOOJELIFKIM", "BFBDLFFGNOH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
