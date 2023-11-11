// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GivingRecordChangeNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class GivingRecordChangeNotifyOuterClass {
  private GivingRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GivingRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GivingRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return Whether the givingRecord field is set.
     */
    boolean hasGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return The givingRecord.
     */
    emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     */
    emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder();

    /**
     * <code>bool is_deactive = 6;</code>
     * @return The isDeactive.
     */
    boolean getIsDeactive();
  }
  /**
   * <pre>
   * CmdId: 20863
   * Obf: EFABNIELGHL
   * </pre>
   *
   * Protobuf type {@code GivingRecordChangeNotify}
   */
  public static final class GivingRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GivingRecordChangeNotify)
      GivingRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GivingRecordChangeNotify.newBuilder() to construct.
    private GivingRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GivingRecordChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GivingRecordChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
    }

    private int bitField0_;
    public static final int GIVING_RECORD_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord givingRecord_;
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return Whether the givingRecord field is set.
     */
    @java.lang.Override
    public boolean hasGivingRecord() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return The givingRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
      return givingRecord_ == null ? emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
    }
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
      return givingRecord_ == null ? emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
    }

    public static final int IS_DEACTIVE_FIELD_NUMBER = 6;
    private boolean isDeactive_ = false;
    /**
     * <code>bool is_deactive = 6;</code>
     * @return The isDeactive.
     */
    @java.lang.Override
    public boolean getIsDeactive() {
      return isDeactive_;
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
      if (isDeactive_ != false) {
        output.writeBool(6, isDeactive_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(9, getGivingRecord());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDeactive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isDeactive_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGivingRecord());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other = (emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) obj;

      if (hasGivingRecord() != other.hasGivingRecord()) return false;
      if (hasGivingRecord()) {
        if (!getGivingRecord()
            .equals(other.getGivingRecord())) return false;
      }
      if (getIsDeactive()
          != other.getIsDeactive()) return false;
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
      if (hasGivingRecord()) {
        hash = (37 * hash) + GIVING_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getGivingRecord().hashCode();
      }
      hash = (37 * hash) + IS_DEACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDeactive());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify prototype) {
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
     * CmdId: 20863
     * Obf: EFABNIELGHL
     * </pre>
     *
     * Protobuf type {@code GivingRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GivingRecordChangeNotify)
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getGivingRecordFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        givingRecord_ = null;
        if (givingRecordBuilder_ != null) {
          givingRecordBuilder_.dispose();
          givingRecordBuilder_ = null;
        }
        isDeactive_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify build() {
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify buildPartial() {
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = new emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.givingRecord_ = givingRecordBuilder_ == null
              ? givingRecord_
              : givingRecordBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isDeactive_ = isDeactive_;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other) {
        if (other == emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance()) return this;
        if (other.hasGivingRecord()) {
          mergeGivingRecord(other.getGivingRecord());
        }
        if (other.getIsDeactive() != false) {
          setIsDeactive(other.getIsDeactive());
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
              case 48: {
                isDeactive_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 74: {
                input.readMessage(
                    getGivingRecordFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 74
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

      private emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord givingRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder> givingRecordBuilder_;
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       * @return Whether the givingRecord field is set.
       */
      public boolean hasGivingRecord() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       * @return The givingRecord.
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
        if (givingRecordBuilder_ == null) {
          return givingRecord_ == null ? emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        } else {
          return givingRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder setGivingRecord(emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          givingRecord_ = value;
        } else {
          givingRecordBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder setGivingRecord(
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder builderForValue) {
        if (givingRecordBuilder_ == null) {
          givingRecord_ = builderForValue.build();
        } else {
          givingRecordBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder mergeGivingRecord(emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            givingRecord_ != null &&
            givingRecord_ != emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance()) {
            getGivingRecordBuilder().mergeFrom(value);
          } else {
            givingRecord_ = value;
          }
        } else {
          givingRecordBuilder_.mergeFrom(value);
        }
        if (givingRecord_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder clearGivingRecord() {
        bitField0_ = (bitField0_ & ~0x00000001);
        givingRecord_ = null;
        if (givingRecordBuilder_ != null) {
          givingRecordBuilder_.dispose();
          givingRecordBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder getGivingRecordBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getGivingRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
        if (givingRecordBuilder_ != null) {
          return givingRecordBuilder_.getMessageOrBuilder();
        } else {
          return givingRecord_ == null ?
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        }
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder> 
          getGivingRecordFieldBuilder() {
        if (givingRecordBuilder_ == null) {
          givingRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder>(
                  getGivingRecord(),
                  getParentForChildren(),
                  isClean());
          givingRecord_ = null;
        }
        return givingRecordBuilder_;
      }

      private boolean isDeactive_ ;
      /**
       * <code>bool is_deactive = 6;</code>
       * @return The isDeactive.
       */
      @java.lang.Override
      public boolean getIsDeactive() {
        return isDeactive_;
      }
      /**
       * <code>bool is_deactive = 6;</code>
       * @param value The isDeactive to set.
       * @return This builder for chaining.
       */
      public Builder setIsDeactive(boolean value) {

        isDeactive_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_deactive = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDeactive() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isDeactive_ = false;
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


      // @@protoc_insertion_point(builder_scope:GivingRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:GivingRecordChangeNotify)
    private static final emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify();
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GivingRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<GivingRecordChangeNotify>() {
      @java.lang.Override
      public GivingRecordChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GivingRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GivingRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GivingRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GivingRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GivingRecordChangeNotify.proto\032\022Giving" +
      "Record.proto\"U\n\030GivingRecordChangeNotify" +
      "\022$\n\rgiving_record\030\t \001(\0132\r.GivingRecord\022\023" +
      "\n\013is_deactive\030\006 \001(\010B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GivingRecordOuterClass.getDescriptor(),
        });
    internal_static_GivingRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GivingRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GivingRecordChangeNotify_descriptor,
        new java.lang.String[] { "GivingRecord", "IsDeactive", });
    emu.grasscutter.net.proto.GivingRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
