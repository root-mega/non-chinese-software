// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalcWeaponUpgradeReturnItemsRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class CalcWeaponUpgradeReturnItemsRspOuterClass {
  private CalcWeaponUpgradeReturnItemsRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CalcWeaponUpgradeReturnItemsRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CalcWeaponUpgradeReturnItemsRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getItemParamListList();
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemParamList(int index);
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    int getItemParamListCount();
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemParamListOrBuilderList();
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(
        int index);

    /**
     * <code>uint64 target_weapon_guid = 15;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 24299
   * Obf: EFEMOPJBOBD
   * </pre>
   *
   * Protobuf type {@code CalcWeaponUpgradeReturnItemsRsp}
   */
  public static final class CalcWeaponUpgradeReturnItemsRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CalcWeaponUpgradeReturnItemsRsp)
      CalcWeaponUpgradeReturnItemsRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CalcWeaponUpgradeReturnItemsRsp.newBuilder() to construct.
    private CalcWeaponUpgradeReturnItemsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CalcWeaponUpgradeReturnItemsRsp() {
      itemParamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CalcWeaponUpgradeReturnItemsRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.internal_static_CalcWeaponUpgradeReturnItemsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.class, emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.Builder.class);
    }

    public static final int ITEM_PARAM_LIST_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemParamList_;
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemParamListList() {
      return itemParamList_;
    }
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemParamListOrBuilderList() {
      return itemParamList_;
    }
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    @java.lang.Override
    public int getItemParamListCount() {
      return itemParamList_.size();
    }
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemParamList(int index) {
      return itemParamList_.get(index);
    }
    /**
     * <code>repeated .ItemParam item_param_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(
        int index) {
      return itemParamList_.get(index);
    }

    public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 15;
    private long targetWeaponGuid_ = 0L;
    /**
     * <code>uint64 target_weapon_guid = 15;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 14;</code>
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
      for (int i = 0; i < itemParamList_.size(); i++) {
        output.writeMessage(10, itemParamList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      if (targetWeaponGuid_ != 0L) {
        output.writeUInt64(15, targetWeaponGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < itemParamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, itemParamList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      if (targetWeaponGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, targetWeaponGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp other = (emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp) obj;

      if (!getItemParamListList()
          .equals(other.getItemParamListList())) return false;
      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
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
      if (getItemParamListCount() > 0) {
        hash = (37 * hash) + ITEM_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemParamListList().hashCode();
      }
      hash = (37 * hash) + TARGET_WEAPON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetWeaponGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp prototype) {
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
     * CmdId: 24299
     * Obf: EFEMOPJBOBD
     * </pre>
     *
     * Protobuf type {@code CalcWeaponUpgradeReturnItemsRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CalcWeaponUpgradeReturnItemsRsp)
        emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.internal_static_CalcWeaponUpgradeReturnItemsRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.class, emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.newBuilder()
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
        if (itemParamListBuilder_ == null) {
          itemParamList_ = java.util.Collections.emptyList();
        } else {
          itemParamList_ = null;
          itemParamListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        targetWeaponGuid_ = 0L;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp build() {
        emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp buildPartial() {
        emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp result = new emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp result) {
        if (itemParamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemParamList_ = java.util.Collections.unmodifiableList(itemParamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemParamList_ = itemParamList_;
        } else {
          result.itemParamList_ = itemParamListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetWeaponGuid_ = targetWeaponGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp) {
          return mergeFrom((emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp other) {
        if (other == emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp.getDefaultInstance()) return this;
        if (itemParamListBuilder_ == null) {
          if (!other.itemParamList_.isEmpty()) {
            if (itemParamList_.isEmpty()) {
              itemParamList_ = other.itemParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemParamListIsMutable();
              itemParamList_.addAll(other.itemParamList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemParamList_.isEmpty()) {
            if (itemParamListBuilder_.isEmpty()) {
              itemParamListBuilder_.dispose();
              itemParamListBuilder_ = null;
              itemParamList_ = other.itemParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemParamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemParamListFieldBuilder() : null;
            } else {
              itemParamListBuilder_.addAllMessages(other.itemParamList_);
            }
          }
        }
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
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
              case 82: {
                emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(),
                        extensionRegistry);
                if (itemParamListBuilder_ == null) {
                  ensureItemParamListIsMutable();
                  itemParamList_.add(m);
                } else {
                  itemParamListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
              case 120: {
                targetWeaponGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemParamList_ =
        java.util.Collections.emptyList();
      private void ensureItemParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemParamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(itemParamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemParamListBuilder_;

      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemParamListList() {
        if (itemParamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemParamList_);
        } else {
          return itemParamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public int getItemParamListCount() {
        if (itemParamListBuilder_ == null) {
          return itemParamList_.size();
        } else {
          return itemParamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemParamList(int index) {
        if (itemParamListBuilder_ == null) {
          return itemParamList_.get(index);
        } else {
          return itemParamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder setItemParamList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemParamListIsMutable();
          itemParamList_.set(index, value);
          onChanged();
        } else {
          itemParamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder setItemParamList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemParamListBuilder_ == null) {
          ensureItemParamListIsMutable();
          itemParamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemParamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder addItemParamList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemParamListIsMutable();
          itemParamList_.add(value);
          onChanged();
        } else {
          itemParamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder addItemParamList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemParamListIsMutable();
          itemParamList_.add(index, value);
          onChanged();
        } else {
          itemParamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder addItemParamList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemParamListBuilder_ == null) {
          ensureItemParamListIsMutable();
          itemParamList_.add(builderForValue.build());
          onChanged();
        } else {
          itemParamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder addItemParamList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemParamListBuilder_ == null) {
          ensureItemParamListIsMutable();
          itemParamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemParamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder addAllItemParamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemParamListBuilder_ == null) {
          ensureItemParamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemParamList_);
          onChanged();
        } else {
          itemParamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder clearItemParamList() {
        if (itemParamListBuilder_ == null) {
          itemParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemParamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public Builder removeItemParamList(int index) {
        if (itemParamListBuilder_ == null) {
          ensureItemParamListIsMutable();
          itemParamList_.remove(index);
          onChanged();
        } else {
          itemParamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemParamListBuilder(
          int index) {
        return getItemParamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(
          int index) {
        if (itemParamListBuilder_ == null) {
          return itemParamList_.get(index);  } else {
          return itemParamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemParamListOrBuilderList() {
        if (itemParamListBuilder_ != null) {
          return itemParamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemParamList_);
        }
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder() {
        return getItemParamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder(
          int index) {
        return getItemParamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_param_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemParamListBuilderList() {
        return getItemParamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemParamListFieldBuilder() {
        if (itemParamListBuilder_ == null) {
          itemParamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemParamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemParamList_ = null;
        }
        return itemParamListBuilder_;
      }

      private long targetWeaponGuid_ ;
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {

        targetWeaponGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_weapon_guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetWeaponGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:CalcWeaponUpgradeReturnItemsRsp)
    }

    // @@protoc_insertion_point(class_scope:CalcWeaponUpgradeReturnItemsRsp)
    private static final emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp();
    }

    public static emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CalcWeaponUpgradeReturnItemsRsp>
        PARSER = new com.google.protobuf.AbstractParser<CalcWeaponUpgradeReturnItemsRsp>() {
      @java.lang.Override
      public CalcWeaponUpgradeReturnItemsRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<CalcWeaponUpgradeReturnItemsRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CalcWeaponUpgradeReturnItemsRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CalcWeaponUpgradeReturnItemsRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%CalcWeaponUpgradeReturnItemsRsp.proto\032" +
      "\017ItemParam.proto\"s\n\037CalcWeaponUpgradeRet" +
      "urnItemsRsp\022#\n\017item_param_list\030\n \003(\0132\n.I" +
      "temParam\022\032\n\022target_weapon_guid\030\017 \001(\004\022\017\n\007" +
      "retcode\030\016 \001(\005B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CalcWeaponUpgradeReturnItemsRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CalcWeaponUpgradeReturnItemsRsp_descriptor,
        new java.lang.String[] { "ItemParamList", "TargetWeaponGuid", "Retcode", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
