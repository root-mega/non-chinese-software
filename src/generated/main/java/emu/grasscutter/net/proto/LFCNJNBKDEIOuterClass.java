// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LFCNJNBKDEI.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class LFCNJNBKDEIOuterClass {
  private LFCNJNBKDEIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LFCNJNBKDEIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LFCNJNBKDEI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @return A list containing the lMKDJIGEODB.
     */
    java.util.List<java.lang.Integer> getLMKDJIGEODBList();
    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @return The count of lMKDJIGEODB.
     */
    int getLMKDJIGEODBCount();
    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @param index The index of the element to return.
     * @return The lMKDJIGEODB at the given index.
     */
    int getLMKDJIGEODB(int index);

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 KLAACLMDCMF = 9;</code>
     * @return The kLAACLMDCMF.
     */
    int getKLAACLMDCMF();

    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @return A list containing the hGBIELJOOCC.
     */
    java.util.List<java.lang.Integer> getHGBIELJOOCCList();
    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @return The count of hGBIELJOOCC.
     */
    int getHGBIELJOOCCCount();
    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @param index The index of the element to return.
     * @return The hGBIELJOOCC at the given index.
     */
    int getHGBIELJOOCC(int index);
  }
  /**
   * Protobuf type {@code LFCNJNBKDEI}
   */
  public static final class LFCNJNBKDEI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LFCNJNBKDEI)
      LFCNJNBKDEIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LFCNJNBKDEI.newBuilder() to construct.
    private LFCNJNBKDEI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LFCNJNBKDEI() {
      lMKDJIGEODB_ = emptyIntList();
      hGBIELJOOCC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LFCNJNBKDEI();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.internal_static_LFCNJNBKDEI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.internal_static_LFCNJNBKDEI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.class, emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.Builder.class);
    }

    public static final int LMKDJIGEODB_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList lMKDJIGEODB_ =
        emptyIntList();
    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @return A list containing the lMKDJIGEODB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLMKDJIGEODBList() {
      return lMKDJIGEODB_;
    }
    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @return The count of lMKDJIGEODB.
     */
    public int getLMKDJIGEODBCount() {
      return lMKDJIGEODB_.size();
    }
    /**
     * <code>repeated uint32 LMKDJIGEODB = 4;</code>
     * @param index The index of the element to return.
     * @return The lMKDJIGEODB at the given index.
     */
    public int getLMKDJIGEODB(int index) {
      return lMKDJIGEODB_.getInt(index);
    }
    private int lMKDJIGEODBMemoizedSerializedSize = -1;

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

    public static final int KLAACLMDCMF_FIELD_NUMBER = 9;
    private int kLAACLMDCMF_ = 0;
    /**
     * <code>uint32 KLAACLMDCMF = 9;</code>
     * @return The kLAACLMDCMF.
     */
    @java.lang.Override
    public int getKLAACLMDCMF() {
      return kLAACLMDCMF_;
    }

    public static final int HGBIELJOOCC_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList hGBIELJOOCC_ =
        emptyIntList();
    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @return A list containing the hGBIELJOOCC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getHGBIELJOOCCList() {
      return hGBIELJOOCC_;
    }
    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @return The count of hGBIELJOOCC.
     */
    public int getHGBIELJOOCCCount() {
      return hGBIELJOOCC_.size();
    }
    /**
     * <code>repeated uint32 HGBIELJOOCC = 8;</code>
     * @param index The index of the element to return.
     * @return The hGBIELJOOCC at the given index.
     */
    public int getHGBIELJOOCC(int index) {
      return hGBIELJOOCC_.getInt(index);
    }
    private int hGBIELJOOCCMemoizedSerializedSize = -1;

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
      if (getLMKDJIGEODBList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(lMKDJIGEODBMemoizedSerializedSize);
      }
      for (int i = 0; i < lMKDJIGEODB_.size(); i++) {
        output.writeUInt32NoTag(lMKDJIGEODB_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (getHGBIELJOOCCList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(hGBIELJOOCCMemoizedSerializedSize);
      }
      for (int i = 0; i < hGBIELJOOCC_.size(); i++) {
        output.writeUInt32NoTag(hGBIELJOOCC_.getInt(i));
      }
      if (kLAACLMDCMF_ != 0) {
        output.writeUInt32(9, kLAACLMDCMF_);
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
        for (int i = 0; i < lMKDJIGEODB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lMKDJIGEODB_.getInt(i));
        }
        size += dataSize;
        if (!getLMKDJIGEODBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lMKDJIGEODBMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < hGBIELJOOCC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(hGBIELJOOCC_.getInt(i));
        }
        size += dataSize;
        if (!getHGBIELJOOCCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        hGBIELJOOCCMemoizedSerializedSize = dataSize;
      }
      if (kLAACLMDCMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, kLAACLMDCMF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI other = (emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI) obj;

      if (!getLMKDJIGEODBList()
          .equals(other.getLMKDJIGEODBList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getKLAACLMDCMF()
          != other.getKLAACLMDCMF()) return false;
      if (!getHGBIELJOOCCList()
          .equals(other.getHGBIELJOOCCList())) return false;
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
      if (getLMKDJIGEODBCount() > 0) {
        hash = (37 * hash) + LMKDJIGEODB_FIELD_NUMBER;
        hash = (53 * hash) + getLMKDJIGEODBList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + KLAACLMDCMF_FIELD_NUMBER;
      hash = (53 * hash) + getKLAACLMDCMF();
      if (getHGBIELJOOCCCount() > 0) {
        hash = (37 * hash) + HGBIELJOOCC_FIELD_NUMBER;
        hash = (53 * hash) + getHGBIELJOOCCList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI prototype) {
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
     * Protobuf type {@code LFCNJNBKDEI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LFCNJNBKDEI)
        emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.internal_static_LFCNJNBKDEI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.internal_static_LFCNJNBKDEI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.class, emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.newBuilder()
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
        lMKDJIGEODB_ = emptyIntList();
        levelId_ = 0;
        kLAACLMDCMF_ = 0;
        hGBIELJOOCC_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.internal_static_LFCNJNBKDEI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI build() {
        emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI buildPartial() {
        emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI result = new emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          lMKDJIGEODB_.makeImmutable();
          result.lMKDJIGEODB_ = lMKDJIGEODB_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.kLAACLMDCMF_ = kLAACLMDCMF_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          hGBIELJOOCC_.makeImmutable();
          result.hGBIELJOOCC_ = hGBIELJOOCC_;
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
        if (other instanceof emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI) {
          return mergeFrom((emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI other) {
        if (other == emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI.getDefaultInstance()) return this;
        if (!other.lMKDJIGEODB_.isEmpty()) {
          if (lMKDJIGEODB_.isEmpty()) {
            lMKDJIGEODB_ = other.lMKDJIGEODB_;
            lMKDJIGEODB_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureLMKDJIGEODBIsMutable();
            lMKDJIGEODB_.addAll(other.lMKDJIGEODB_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getKLAACLMDCMF() != 0) {
          setKLAACLMDCMF(other.getKLAACLMDCMF());
        }
        if (!other.hGBIELJOOCC_.isEmpty()) {
          if (hGBIELJOOCC_.isEmpty()) {
            hGBIELJOOCC_ = other.hGBIELJOOCC_;
            hGBIELJOOCC_.makeImmutable();
            bitField0_ |= 0x00000008;
          } else {
            ensureHGBIELJOOCCIsMutable();
            hGBIELJOOCC_.addAll(other.hGBIELJOOCC_);
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
              case 32: {
                int v = input.readUInt32();
                ensureLMKDJIGEODBIsMutable();
                lMKDJIGEODB_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureLMKDJIGEODBIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  lMKDJIGEODB_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 48: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 64: {
                int v = input.readUInt32();
                ensureHGBIELJOOCCIsMutable();
                hGBIELJOOCC_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureHGBIELJOOCCIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  hGBIELJOOCC_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 72: {
                kLAACLMDCMF_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private com.google.protobuf.Internal.IntList lMKDJIGEODB_ = emptyIntList();
      private void ensureLMKDJIGEODBIsMutable() {
        if (!lMKDJIGEODB_.isModifiable()) {
          lMKDJIGEODB_ = makeMutableCopy(lMKDJIGEODB_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @return A list containing the lMKDJIGEODB.
       */
      public java.util.List<java.lang.Integer>
          getLMKDJIGEODBList() {
        lMKDJIGEODB_.makeImmutable();
        return lMKDJIGEODB_;
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @return The count of lMKDJIGEODB.
       */
      public int getLMKDJIGEODBCount() {
        return lMKDJIGEODB_.size();
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @param index The index of the element to return.
       * @return The lMKDJIGEODB at the given index.
       */
      public int getLMKDJIGEODB(int index) {
        return lMKDJIGEODB_.getInt(index);
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @param index The index to set the value at.
       * @param value The lMKDJIGEODB to set.
       * @return This builder for chaining.
       */
      public Builder setLMKDJIGEODB(
          int index, int value) {

        ensureLMKDJIGEODBIsMutable();
        lMKDJIGEODB_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @param value The lMKDJIGEODB to add.
       * @return This builder for chaining.
       */
      public Builder addLMKDJIGEODB(int value) {

        ensureLMKDJIGEODBIsMutable();
        lMKDJIGEODB_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @param values The lMKDJIGEODB to add.
       * @return This builder for chaining.
       */
      public Builder addAllLMKDJIGEODB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLMKDJIGEODBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lMKDJIGEODB_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LMKDJIGEODB = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLMKDJIGEODB() {
        lMKDJIGEODB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int kLAACLMDCMF_ ;
      /**
       * <code>uint32 KLAACLMDCMF = 9;</code>
       * @return The kLAACLMDCMF.
       */
      @java.lang.Override
      public int getKLAACLMDCMF() {
        return kLAACLMDCMF_;
      }
      /**
       * <code>uint32 KLAACLMDCMF = 9;</code>
       * @param value The kLAACLMDCMF to set.
       * @return This builder for chaining.
       */
      public Builder setKLAACLMDCMF(int value) {

        kLAACLMDCMF_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KLAACLMDCMF = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearKLAACLMDCMF() {
        bitField0_ = (bitField0_ & ~0x00000004);
        kLAACLMDCMF_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList hGBIELJOOCC_ = emptyIntList();
      private void ensureHGBIELJOOCCIsMutable() {
        if (!hGBIELJOOCC_.isModifiable()) {
          hGBIELJOOCC_ = makeMutableCopy(hGBIELJOOCC_);
        }
        bitField0_ |= 0x00000008;
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @return A list containing the hGBIELJOOCC.
       */
      public java.util.List<java.lang.Integer>
          getHGBIELJOOCCList() {
        hGBIELJOOCC_.makeImmutable();
        return hGBIELJOOCC_;
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @return The count of hGBIELJOOCC.
       */
      public int getHGBIELJOOCCCount() {
        return hGBIELJOOCC_.size();
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @param index The index of the element to return.
       * @return The hGBIELJOOCC at the given index.
       */
      public int getHGBIELJOOCC(int index) {
        return hGBIELJOOCC_.getInt(index);
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @param index The index to set the value at.
       * @param value The hGBIELJOOCC to set.
       * @return This builder for chaining.
       */
      public Builder setHGBIELJOOCC(
          int index, int value) {

        ensureHGBIELJOOCCIsMutable();
        hGBIELJOOCC_.setInt(index, value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @param value The hGBIELJOOCC to add.
       * @return This builder for chaining.
       */
      public Builder addHGBIELJOOCC(int value) {

        ensureHGBIELJOOCCIsMutable();
        hGBIELJOOCC_.addInt(value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @param values The hGBIELJOOCC to add.
       * @return This builder for chaining.
       */
      public Builder addAllHGBIELJOOCC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureHGBIELJOOCCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hGBIELJOOCC_);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 HGBIELJOOCC = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHGBIELJOOCC() {
        hGBIELJOOCC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000008);
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


      // @@protoc_insertion_point(builder_scope:LFCNJNBKDEI)
    }

    // @@protoc_insertion_point(class_scope:LFCNJNBKDEI)
    private static final emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI();
    }

    public static emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LFCNJNBKDEI>
        PARSER = new com.google.protobuf.AbstractParser<LFCNJNBKDEI>() {
      @java.lang.Override
      public LFCNJNBKDEI parsePartialFrom(
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

    public static com.google.protobuf.Parser<LFCNJNBKDEI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LFCNJNBKDEI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LFCNJNBKDEIOuterClass.LFCNJNBKDEI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LFCNJNBKDEI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LFCNJNBKDEI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LFCNJNBKDEI.proto\"^\n\013LFCNJNBKDEI\022\023\n\013LM" +
      "KDJIGEODB\030\004 \003(\r\022\020\n\010level_id\030\006 \001(\r\022\023\n\013KLA" +
      "ACLMDCMF\030\t \001(\r\022\023\n\013HGBIELJOOCC\030\010 \003(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LFCNJNBKDEI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LFCNJNBKDEI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LFCNJNBKDEI_descriptor,
        new java.lang.String[] { "LMKDJIGEODB", "LevelId", "KLAACLMDCMF", "HGBIELJOOCC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
