// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonSettleInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class WindFieldDungeonSettleInfoOuterClass {
  private WindFieldDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @return A list containing the kDIFMAEJGIO.
     */
    java.util.List<java.lang.Integer> getKDIFMAEJGIOList();
    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @return The count of kDIFMAEJGIO.
     */
    int getKDIFMAEJGIOCount();
    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @param index The index of the element to return.
     * @return The kDIFMAEJGIO at the given index.
     */
    int getKDIFMAEJGIO(int index);

    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    int getFailReasonValue();
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
     * @return The failReason.
     */
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason();

    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @return A list containing the aKDFKBJLGGI.
     */
    java.util.List<java.lang.Integer> getAKDFKBJLGGIList();
    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @return The count of aKDFKBJLGGI.
     */
    int getAKDFKBJLGGICount();
    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @param index The index of the element to return.
     * @return The aKDFKBJLGGI at the given index.
     */
    int getAKDFKBJLGGI(int index);
  }
  /**
   * <pre>
   * Obf: KGEBGAHEFLG
   * </pre>
   *
   * Protobuf type {@code WindFieldDungeonSettleInfo}
   */
  public static final class WindFieldDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDungeonSettleInfo)
      WindFieldDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDungeonSettleInfo.newBuilder() to construct.
    private WindFieldDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDungeonSettleInfo() {
      kDIFMAEJGIO_ = emptyIntList();
      failReason_ = 0;
      aKDFKBJLGGI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDungeonSettleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
    }

    public static final int KDIFMAEJGIO_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList kDIFMAEJGIO_ =
        emptyIntList();
    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @return A list containing the kDIFMAEJGIO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getKDIFMAEJGIOList() {
      return kDIFMAEJGIO_;
    }
    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @return The count of kDIFMAEJGIO.
     */
    public int getKDIFMAEJGIOCount() {
      return kDIFMAEJGIO_.size();
    }
    /**
     * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
     * @param index The index of the element to return.
     * @return The kDIFMAEJGIO at the given index.
     */
    public int getKDIFMAEJGIO(int index) {
      return kDIFMAEJGIO_.getInt(index);
    }
    private int kDIFMAEJGIOMemoizedSerializedSize = -1;

    public static final int FAIL_REASON_FIELD_NUMBER = 12;
    private int failReason_ = 0;
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    @java.lang.Override public int getFailReasonValue() {
      return failReason_;
    }
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
     * @return The failReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
      emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.forNumber(failReason_);
      return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
    }

    public static final int AKDFKBJLGGI_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList aKDFKBJLGGI_ =
        emptyIntList();
    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @return A list containing the aKDFKBJLGGI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAKDFKBJLGGIList() {
      return aKDFKBJLGGI_;
    }
    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @return The count of aKDFKBJLGGI.
     */
    public int getAKDFKBJLGGICount() {
      return aKDFKBJLGGI_.size();
    }
    /**
     * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
     * @param index The index of the element to return.
     * @return The aKDFKBJLGGI at the given index.
     */
    public int getAKDFKBJLGGI(int index) {
      return aKDFKBJLGGI_.getInt(index);
    }
    private int aKDFKBJLGGIMemoizedSerializedSize = -1;

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
      if (getKDIFMAEJGIOList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(kDIFMAEJGIOMemoizedSerializedSize);
      }
      for (int i = 0; i < kDIFMAEJGIO_.size(); i++) {
        output.writeUInt32NoTag(kDIFMAEJGIO_.getInt(i));
      }
      if (getAKDFKBJLGGIList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(aKDFKBJLGGIMemoizedSerializedSize);
      }
      for (int i = 0; i < aKDFKBJLGGI_.size(); i++) {
        output.writeUInt32NoTag(aKDFKBJLGGI_.getInt(i));
      }
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        output.writeEnum(12, failReason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < kDIFMAEJGIO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(kDIFMAEJGIO_.getInt(i));
        }
        size += dataSize;
        if (!getKDIFMAEJGIOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        kDIFMAEJGIOMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < aKDFKBJLGGI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aKDFKBJLGGI_.getInt(i));
        }
        size += dataSize;
        if (!getAKDFKBJLGGIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aKDFKBJLGGIMemoizedSerializedSize = dataSize;
      }
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, failReason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) obj;

      if (!getKDIFMAEJGIOList()
          .equals(other.getKDIFMAEJGIOList())) return false;
      if (failReason_ != other.failReason_) return false;
      if (!getAKDFKBJLGGIList()
          .equals(other.getAKDFKBJLGGIList())) return false;
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
      if (getKDIFMAEJGIOCount() > 0) {
        hash = (37 * hash) + KDIFMAEJGIO_FIELD_NUMBER;
        hash = (53 * hash) + getKDIFMAEJGIOList().hashCode();
      }
      hash = (37 * hash) + FAIL_REASON_FIELD_NUMBER;
      hash = (53 * hash) + failReason_;
      if (getAKDFKBJLGGICount() > 0) {
        hash = (37 * hash) + AKDFKBJLGGI_FIELD_NUMBER;
        hash = (53 * hash) + getAKDFKBJLGGIList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo prototype) {
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
     * Obf: KGEBGAHEFLG
     * </pre>
     *
     * Protobuf type {@code WindFieldDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDungeonSettleInfo)
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.newBuilder()
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
        kDIFMAEJGIO_ = emptyIntList();
        failReason_ = 0;
        aKDFKBJLGGI_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo build() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          kDIFMAEJGIO_.makeImmutable();
          result.kDIFMAEJGIO_ = kDIFMAEJGIO_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.failReason_ = failReason_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          aKDFKBJLGGI_.makeImmutable();
          result.aKDFKBJLGGI_ = aKDFKBJLGGI_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance()) return this;
        if (!other.kDIFMAEJGIO_.isEmpty()) {
          if (kDIFMAEJGIO_.isEmpty()) {
            kDIFMAEJGIO_ = other.kDIFMAEJGIO_;
            kDIFMAEJGIO_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureKDIFMAEJGIOIsMutable();
            kDIFMAEJGIO_.addAll(other.kDIFMAEJGIO_);
          }
          onChanged();
        }
        if (other.failReason_ != 0) {
          setFailReasonValue(other.getFailReasonValue());
        }
        if (!other.aKDFKBJLGGI_.isEmpty()) {
          if (aKDFKBJLGGI_.isEmpty()) {
            aKDFKBJLGGI_ = other.aKDFKBJLGGI_;
            aKDFKBJLGGI_.makeImmutable();
            bitField0_ |= 0x00000004;
          } else {
            ensureAKDFKBJLGGIIsMutable();
            aKDFKBJLGGI_.addAll(other.aKDFKBJLGGI_);
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
              case 24: {
                int v = input.readUInt32();
                ensureKDIFMAEJGIOIsMutable();
                kDIFMAEJGIO_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureKDIFMAEJGIOIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  kDIFMAEJGIO_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
              case 88: {
                int v = input.readUInt32();
                ensureAKDFKBJLGGIIsMutable();
                aKDFKBJLGGI_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAKDFKBJLGGIIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  aKDFKBJLGGI_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 96: {
                failReason_ = input.readEnum();
                bitField0_ |= 0x00000002;
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

      private com.google.protobuf.Internal.IntList kDIFMAEJGIO_ = emptyIntList();
      private void ensureKDIFMAEJGIOIsMutable() {
        if (!kDIFMAEJGIO_.isModifiable()) {
          kDIFMAEJGIO_ = makeMutableCopy(kDIFMAEJGIO_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @return A list containing the kDIFMAEJGIO.
       */
      public java.util.List<java.lang.Integer>
          getKDIFMAEJGIOList() {
        kDIFMAEJGIO_.makeImmutable();
        return kDIFMAEJGIO_;
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @return The count of kDIFMAEJGIO.
       */
      public int getKDIFMAEJGIOCount() {
        return kDIFMAEJGIO_.size();
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @param index The index of the element to return.
       * @return The kDIFMAEJGIO at the given index.
       */
      public int getKDIFMAEJGIO(int index) {
        return kDIFMAEJGIO_.getInt(index);
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @param index The index to set the value at.
       * @param value The kDIFMAEJGIO to set.
       * @return This builder for chaining.
       */
      public Builder setKDIFMAEJGIO(
          int index, int value) {

        ensureKDIFMAEJGIOIsMutable();
        kDIFMAEJGIO_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @param value The kDIFMAEJGIO to add.
       * @return This builder for chaining.
       */
      public Builder addKDIFMAEJGIO(int value) {

        ensureKDIFMAEJGIOIsMutable();
        kDIFMAEJGIO_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @param values The kDIFMAEJGIO to add.
       * @return This builder for chaining.
       */
      public Builder addAllKDIFMAEJGIO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureKDIFMAEJGIOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kDIFMAEJGIO_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KDIFMAEJGIO = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKDIFMAEJGIO() {
        kDIFMAEJGIO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int failReason_ = 0;
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
       * @return The enum numeric value on the wire for failReason.
       */
      @java.lang.Override public int getFailReasonValue() {
        return failReason_;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
       * @param value The enum numeric value on the wire for failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReasonValue(int value) {
        failReason_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
       * @return The failReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
        emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.forNumber(failReason_);
        return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
       * @param value The failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReason(emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        failReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        failReason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList aKDFKBJLGGI_ = emptyIntList();
      private void ensureAKDFKBJLGGIIsMutable() {
        if (!aKDFKBJLGGI_.isModifiable()) {
          aKDFKBJLGGI_ = makeMutableCopy(aKDFKBJLGGI_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @return A list containing the aKDFKBJLGGI.
       */
      public java.util.List<java.lang.Integer>
          getAKDFKBJLGGIList() {
        aKDFKBJLGGI_.makeImmutable();
        return aKDFKBJLGGI_;
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @return The count of aKDFKBJLGGI.
       */
      public int getAKDFKBJLGGICount() {
        return aKDFKBJLGGI_.size();
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @param index The index of the element to return.
       * @return The aKDFKBJLGGI at the given index.
       */
      public int getAKDFKBJLGGI(int index) {
        return aKDFKBJLGGI_.getInt(index);
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @param index The index to set the value at.
       * @param value The aKDFKBJLGGI to set.
       * @return This builder for chaining.
       */
      public Builder setAKDFKBJLGGI(
          int index, int value) {

        ensureAKDFKBJLGGIIsMutable();
        aKDFKBJLGGI_.setInt(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @param value The aKDFKBJLGGI to add.
       * @return This builder for chaining.
       */
      public Builder addAKDFKBJLGGI(int value) {

        ensureAKDFKBJLGGIIsMutable();
        aKDFKBJLGGI_.addInt(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @param values The aKDFKBJLGGI to add.
       * @return This builder for chaining.
       */
      public Builder addAllAKDFKBJLGGI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAKDFKBJLGGIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aKDFKBJLGGI_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AKDFKBJLGGI = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAKDFKBJLGGI() {
        aKDFKBJLGGI_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:WindFieldDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDungeonSettleInfo>() {
      @java.lang.Override
      public WindFieldDungeonSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<WindFieldDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldDungeonSettleInfo.proto\032 Wind" +
      "FieldDungeonFailReason.proto\"x\n\032WindFiel" +
      "dDungeonSettleInfo\022\023\n\013KDIFMAEJGIO\030\003 \003(\r\022" +
      "0\n\013fail_reason\030\014 \001(\0162\033.WindFieldDungeonF" +
      "ailReason\022\023\n\013AKDFKBJLGGI\030\013 \003(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDungeonSettleInfo_descriptor,
        new java.lang.String[] { "KDIFMAEJGIO", "FailReason", "AKDFKBJLGGI", });
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
