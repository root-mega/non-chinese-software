// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeEditCustomFurnitureRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class HomeEditCustomFurnitureRspOuterClass {
  private HomeEditCustomFurnitureRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeEditCustomFurnitureRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeEditCustomFurnitureRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     * @return Whether the customFurnitureInfo field is set.
     */
    boolean hasCustomFurnitureInfo();
    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     * @return The customFurnitureInfo.
     */
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo();
    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     */
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 23160
   * Obf: OBEPJPMGCAE
   * </pre>
   *
   * Protobuf type {@code HomeEditCustomFurnitureRsp}
   */
  public static final class HomeEditCustomFurnitureRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeEditCustomFurnitureRsp)
      HomeEditCustomFurnitureRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeEditCustomFurnitureRsp.newBuilder() to construct.
    private HomeEditCustomFurnitureRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeEditCustomFurnitureRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeEditCustomFurnitureRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.internal_static_HomeEditCustomFurnitureRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.internal_static_HomeEditCustomFurnitureRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.class, emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.Builder.class);
    }

    private int bitField0_;
    public static final int CUSTOM_FURNITURE_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo customFurnitureInfo_;
    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     * @return Whether the customFurnitureInfo field is set.
     */
    @java.lang.Override
    public boolean hasCustomFurnitureInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     * @return The customFurnitureInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo() {
      return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
    }
    /**
     * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder() {
      return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(7, getCustomFurnitureInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getCustomFurnitureInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp other = (emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp) obj;

      if (hasCustomFurnitureInfo() != other.hasCustomFurnitureInfo()) return false;
      if (hasCustomFurnitureInfo()) {
        if (!getCustomFurnitureInfo()
            .equals(other.getCustomFurnitureInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasCustomFurnitureInfo()) {
        hash = (37 * hash) + CUSTOM_FURNITURE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCustomFurnitureInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp prototype) {
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
     * CmdId: 23160
     * Obf: OBEPJPMGCAE
     * </pre>
     *
     * Protobuf type {@code HomeEditCustomFurnitureRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeEditCustomFurnitureRsp)
        emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.internal_static_HomeEditCustomFurnitureRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.internal_static_HomeEditCustomFurnitureRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.class, emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.newBuilder()
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
          getCustomFurnitureInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        customFurnitureInfo_ = null;
        if (customFurnitureInfoBuilder_ != null) {
          customFurnitureInfoBuilder_.dispose();
          customFurnitureInfoBuilder_ = null;
        }
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.internal_static_HomeEditCustomFurnitureRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp build() {
        emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp buildPartial() {
        emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp result = new emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.customFurnitureInfo_ = customFurnitureInfoBuilder_ == null
              ? customFurnitureInfo_
              : customFurnitureInfoBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp other) {
        if (other == emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp.getDefaultInstance()) return this;
        if (other.hasCustomFurnitureInfo()) {
          mergeCustomFurnitureInfo(other.getCustomFurnitureInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 58: {
                input.readMessage(
                    getCustomFurnitureInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 58
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

      private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo customFurnitureInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder> customFurnitureInfoBuilder_;
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       * @return Whether the customFurnitureInfo field is set.
       */
      public boolean hasCustomFurnitureInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       * @return The customFurnitureInfo.
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo() {
        if (customFurnitureInfoBuilder_ == null) {
          return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
        } else {
          return customFurnitureInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public Builder setCustomFurnitureInfo(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo value) {
        if (customFurnitureInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customFurnitureInfo_ = value;
        } else {
          customFurnitureInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public Builder setCustomFurnitureInfo(
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder builderForValue) {
        if (customFurnitureInfoBuilder_ == null) {
          customFurnitureInfo_ = builderForValue.build();
        } else {
          customFurnitureInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public Builder mergeCustomFurnitureInfo(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo value) {
        if (customFurnitureInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            customFurnitureInfo_ != null &&
            customFurnitureInfo_ != emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance()) {
            getCustomFurnitureInfoBuilder().mergeFrom(value);
          } else {
            customFurnitureInfo_ = value;
          }
        } else {
          customFurnitureInfoBuilder_.mergeFrom(value);
        }
        if (customFurnitureInfo_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public Builder clearCustomFurnitureInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        customFurnitureInfo_ = null;
        if (customFurnitureInfoBuilder_ != null) {
          customFurnitureInfoBuilder_.dispose();
          customFurnitureInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder getCustomFurnitureInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCustomFurnitureInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder() {
        if (customFurnitureInfoBuilder_ != null) {
          return customFurnitureInfoBuilder_.getMessageOrBuilder();
        } else {
          return customFurnitureInfo_ == null ?
              emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
        }
      }
      /**
       * <code>.HomeCustomFurnitureInfo custom_furniture_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder> 
          getCustomFurnitureInfoFieldBuilder() {
        if (customFurnitureInfoBuilder_ == null) {
          customFurnitureInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder>(
                  getCustomFurnitureInfo(),
                  getParentForChildren(),
                  isClean());
          customFurnitureInfo_ = null;
        }
        return customFurnitureInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeEditCustomFurnitureRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeEditCustomFurnitureRsp)
    private static final emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp();
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeEditCustomFurnitureRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeEditCustomFurnitureRsp>() {
      @java.lang.Override
      public HomeEditCustomFurnitureRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeEditCustomFurnitureRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeEditCustomFurnitureRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeEditCustomFurnitureRspOuterClass.HomeEditCustomFurnitureRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeEditCustomFurnitureRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeEditCustomFurnitureRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HomeEditCustomFurnitureRsp.proto\032\035Home" +
      "CustomFurnitureInfo.proto\"f\n\032HomeEditCus" +
      "tomFurnitureRsp\0227\n\025custom_furniture_info" +
      "\030\007 \001(\0132\030.HomeCustomFurnitureInfo\022\017\n\007retc" +
      "ode\030\006 \001(\005B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeEditCustomFurnitureRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeEditCustomFurnitureRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeEditCustomFurnitureRsp_descriptor,
        new java.lang.String[] { "CustomFurnitureInfo", "Retcode", });
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
