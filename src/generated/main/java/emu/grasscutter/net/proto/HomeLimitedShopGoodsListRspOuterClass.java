// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopGoodsListRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class HomeLimitedShopGoodsListRspOuterClass {
  private HomeLimitedShopGoodsListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeLimitedShopGoodsListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeLimitedShopGoodsListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     * @return Whether the shop field is set.
     */
    boolean hasShop();
    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     * @return The shop.
     */
    emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop getShop();
    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     */
    emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 21781
   * Obf: FNAMPDDEIFI
   * </pre>
   *
   * Protobuf type {@code HomeLimitedShopGoodsListRsp}
   */
  public static final class HomeLimitedShopGoodsListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeLimitedShopGoodsListRsp)
      HomeLimitedShopGoodsListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeLimitedShopGoodsListRsp.newBuilder() to construct.
    private HomeLimitedShopGoodsListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeLimitedShopGoodsListRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeLimitedShopGoodsListRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.class, emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.Builder.class);
    }

    private int bitField0_;
    public static final int SHOP_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop shop_;
    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     * @return Whether the shop field is set.
     */
    @java.lang.Override
    public boolean hasShop() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     * @return The shop.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop getShop() {
      return shop_ == null ? emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
    }
    /**
     * <code>.HomeLimitedShop shop = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder() {
      return shop_ == null ? emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 10;</code>
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(3, getShop());
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getShop());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp other = (emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp) obj;

      if (hasShop() != other.hasShop()) return false;
      if (hasShop()) {
        if (!getShop()
            .equals(other.getShop())) return false;
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
      if (hasShop()) {
        hash = (37 * hash) + SHOP_FIELD_NUMBER;
        hash = (53 * hash) + getShop().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp prototype) {
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
     * CmdId: 21781
     * Obf: FNAMPDDEIFI
     * </pre>
     *
     * Protobuf type {@code HomeLimitedShopGoodsListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeLimitedShopGoodsListRsp)
        emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.class, emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.newBuilder()
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
          getShopFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        shop_ = null;
        if (shopBuilder_ != null) {
          shopBuilder_.dispose();
          shopBuilder_ = null;
        }
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp build() {
        emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp buildPartial() {
        emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp result = new emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.shop_ = shopBuilder_ == null
              ? shop_
              : shopBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp other) {
        if (other == emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.getDefaultInstance()) return this;
        if (other.hasShop()) {
          mergeShop(other.getShop());
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
              case 26: {
                input.readMessage(
                    getShopFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 26
              case 80: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop shop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder> shopBuilder_;
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       * @return Whether the shop field is set.
       */
      public boolean hasShop() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       * @return The shop.
       */
      public emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop getShop() {
        if (shopBuilder_ == null) {
          return shop_ == null ? emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
        } else {
          return shopBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public Builder setShop(emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop value) {
        if (shopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          shop_ = value;
        } else {
          shopBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public Builder setShop(
          emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder builderForValue) {
        if (shopBuilder_ == null) {
          shop_ = builderForValue.build();
        } else {
          shopBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public Builder mergeShop(emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop value) {
        if (shopBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            shop_ != null &&
            shop_ != emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance()) {
            getShopBuilder().mergeFrom(value);
          } else {
            shop_ = value;
          }
        } else {
          shopBuilder_.mergeFrom(value);
        }
        if (shop_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public Builder clearShop() {
        bitField0_ = (bitField0_ & ~0x00000001);
        shop_ = null;
        if (shopBuilder_ != null) {
          shopBuilder_.dispose();
          shopBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder getShopBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getShopFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder() {
        if (shopBuilder_ != null) {
          return shopBuilder_.getMessageOrBuilder();
        } else {
          return shop_ == null ?
              emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
        }
      }
      /**
       * <code>.HomeLimitedShop shop = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder> 
          getShopFieldBuilder() {
        if (shopBuilder_ == null) {
          shopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.proto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder>(
                  getShop(),
                  getParentForChildren(),
                  isClean());
          shop_ = null;
        }
        return shopBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
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
       * <code>int32 retcode = 10;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeLimitedShopGoodsListRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeLimitedShopGoodsListRsp)
    private static final emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp();
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeLimitedShopGoodsListRsp>() {
      @java.lang.Override
      public HomeLimitedShopGoodsListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeLimitedShopGoodsListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HomeLimitedShopGoodsListRsp.proto\032\025Hom" +
      "eLimitedShop.proto\"N\n\033HomeLimitedShopGoo" +
      "dsListRsp\022\036\n\004shop\030\003 \001(\0132\020.HomeLimitedSho" +
      "p\022\017\n\007retcode\030\n \001(\005B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeLimitedShopOuterClass.getDescriptor(),
        });
    internal_static_HomeLimitedShopGoodsListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeLimitedShopGoodsListRsp_descriptor,
        new java.lang.String[] { "Shop", "Retcode", });
    emu.grasscutter.net.proto.HomeLimitedShopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
