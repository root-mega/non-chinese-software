// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampAcceptAllGiveItemRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class WinterCampAcceptAllGiveItemRspOuterClass {
  private WinterCampAcceptAllGiveItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampAcceptAllGiveItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampAcceptAllGiveItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> 
        getAcceptItemResultInfoList();
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo(int index);
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    int getAcceptItemResultInfoCount();
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> 
        getAcceptItemResultInfoOrBuilderList();
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4655
   * Obf: LJFOBNJDABD
   * </pre>
   *
   * Protobuf type {@code WinterCampAcceptAllGiveItemRsp}
   */
  public static final class WinterCampAcceptAllGiveItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampAcceptAllGiveItemRsp)
      WinterCampAcceptAllGiveItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampAcceptAllGiveItemRsp.newBuilder() to construct.
    private WinterCampAcceptAllGiveItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampAcceptAllGiveItemRsp() {
      acceptItemResultInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampAcceptAllGiveItemRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.internal_static_WinterCampAcceptAllGiveItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.internal_static_WinterCampAcceptAllGiveItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.class, emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.Builder.class);
    }

    public static final int ACCEPT_ITEM_RESULT_INFO_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> acceptItemResultInfo_;
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> getAcceptItemResultInfoList() {
      return acceptItemResultInfo_;
    }
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> 
        getAcceptItemResultInfoOrBuilderList() {
      return acceptItemResultInfo_;
    }
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    @java.lang.Override
    public int getAcceptItemResultInfoCount() {
      return acceptItemResultInfo_.size();
    }
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo(int index) {
      return acceptItemResultInfo_.get(index);
    }
    /**
     * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder(
        int index) {
      return acceptItemResultInfo_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
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
        output.writeInt32(4, retcode_);
      }
      for (int i = 0; i < acceptItemResultInfo_.size(); i++) {
        output.writeMessage(8, acceptItemResultInfo_.get(i));
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
          .computeInt32Size(4, retcode_);
      }
      for (int i = 0; i < acceptItemResultInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, acceptItemResultInfo_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp other = (emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp) obj;

      if (!getAcceptItemResultInfoList()
          .equals(other.getAcceptItemResultInfoList())) return false;
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
      if (getAcceptItemResultInfoCount() > 0) {
        hash = (37 * hash) + ACCEPT_ITEM_RESULT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAcceptItemResultInfoList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp prototype) {
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
     * CmdId: 4655
     * Obf: LJFOBNJDABD
     * </pre>
     *
     * Protobuf type {@code WinterCampAcceptAllGiveItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampAcceptAllGiveItemRsp)
        emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.internal_static_WinterCampAcceptAllGiveItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.internal_static_WinterCampAcceptAllGiveItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.class, emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.newBuilder()
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
        if (acceptItemResultInfoBuilder_ == null) {
          acceptItemResultInfo_ = java.util.Collections.emptyList();
        } else {
          acceptItemResultInfo_ = null;
          acceptItemResultInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.internal_static_WinterCampAcceptAllGiveItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp build() {
        emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp buildPartial() {
        emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp result = new emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp result) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            acceptItemResultInfo_ = java.util.Collections.unmodifiableList(acceptItemResultInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.acceptItemResultInfo_ = acceptItemResultInfo_;
        } else {
          result.acceptItemResultInfo_ = acceptItemResultInfoBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp other) {
        if (other == emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp.getDefaultInstance()) return this;
        if (acceptItemResultInfoBuilder_ == null) {
          if (!other.acceptItemResultInfo_.isEmpty()) {
            if (acceptItemResultInfo_.isEmpty()) {
              acceptItemResultInfo_ = other.acceptItemResultInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAcceptItemResultInfoIsMutable();
              acceptItemResultInfo_.addAll(other.acceptItemResultInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.acceptItemResultInfo_.isEmpty()) {
            if (acceptItemResultInfoBuilder_.isEmpty()) {
              acceptItemResultInfoBuilder_.dispose();
              acceptItemResultInfoBuilder_ = null;
              acceptItemResultInfo_ = other.acceptItemResultInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              acceptItemResultInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAcceptItemResultInfoFieldBuilder() : null;
            } else {
              acceptItemResultInfoBuilder_.addAllMessages(other.acceptItemResultInfo_);
            }
          }
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
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 66: {
                emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.parser(),
                        extensionRegistry);
                if (acceptItemResultInfoBuilder_ == null) {
                  ensureAcceptItemResultInfoIsMutable();
                  acceptItemResultInfo_.add(m);
                } else {
                  acceptItemResultInfoBuilder_.addMessage(m);
                }
                break;
              } // case 66
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

      private java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> acceptItemResultInfo_ =
        java.util.Collections.emptyList();
      private void ensureAcceptItemResultInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          acceptItemResultInfo_ = new java.util.ArrayList<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo>(acceptItemResultInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> acceptItemResultInfoBuilder_;

      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> getAcceptItemResultInfoList() {
        if (acceptItemResultInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(acceptItemResultInfo_);
        } else {
          return acceptItemResultInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public int getAcceptItemResultInfoCount() {
        if (acceptItemResultInfoBuilder_ == null) {
          return acceptItemResultInfo_.size();
        } else {
          return acceptItemResultInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo(int index) {
        if (acceptItemResultInfoBuilder_ == null) {
          return acceptItemResultInfo_.get(index);
        } else {
          return acceptItemResultInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder setAcceptItemResultInfo(
          int index, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo value) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.set(index, value);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder setAcceptItemResultInfo(
          int index, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder builderForValue) {
        if (acceptItemResultInfoBuilder_ == null) {
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder addAcceptItemResultInfo(emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo value) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.add(value);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder addAcceptItemResultInfo(
          int index, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo value) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.add(index, value);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder addAcceptItemResultInfo(
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder builderForValue) {
        if (acceptItemResultInfoBuilder_ == null) {
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.add(builderForValue.build());
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder addAcceptItemResultInfo(
          int index, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder builderForValue) {
        if (acceptItemResultInfoBuilder_ == null) {
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder addAllAcceptItemResultInfo(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo> values) {
        if (acceptItemResultInfoBuilder_ == null) {
          ensureAcceptItemResultInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, acceptItemResultInfo_);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder clearAcceptItemResultInfo() {
        if (acceptItemResultInfoBuilder_ == null) {
          acceptItemResultInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public Builder removeAcceptItemResultInfo(int index) {
        if (acceptItemResultInfoBuilder_ == null) {
          ensureAcceptItemResultInfoIsMutable();
          acceptItemResultInfo_.remove(index);
          onChanged();
        } else {
          acceptItemResultInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder getAcceptItemResultInfoBuilder(
          int index) {
        return getAcceptItemResultInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder(
          int index) {
        if (acceptItemResultInfoBuilder_ == null) {
          return acceptItemResultInfo_.get(index);  } else {
          return acceptItemResultInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> 
           getAcceptItemResultInfoOrBuilderList() {
        if (acceptItemResultInfoBuilder_ != null) {
          return acceptItemResultInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(acceptItemResultInfo_);
        }
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder addAcceptItemResultInfoBuilder() {
        return getAcceptItemResultInfoFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder addAcceptItemResultInfoBuilder(
          int index) {
        return getAcceptItemResultInfoFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampAcceptItemResultInfo accept_item_result_info = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder> 
           getAcceptItemResultInfoBuilderList() {
        return getAcceptItemResultInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> 
          getAcceptItemResultInfoFieldBuilder() {
        if (acceptItemResultInfoBuilder_ == null) {
          acceptItemResultInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder>(
                  acceptItemResultInfo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          acceptItemResultInfo_ = null;
        }
        return acceptItemResultInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
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
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:WinterCampAcceptAllGiveItemRsp)
    }

    // @@protoc_insertion_point(class_scope:WinterCampAcceptAllGiveItemRsp)
    private static final emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp();
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampAcceptAllGiveItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampAcceptAllGiveItemRsp>() {
      @java.lang.Override
      public WinterCampAcceptAllGiveItemRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampAcceptAllGiveItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampAcceptAllGiveItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptAllGiveItemRspOuterClass.WinterCampAcceptAllGiveItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampAcceptAllGiveItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampAcceptAllGiveItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$WinterCampAcceptAllGiveItemRsp.proto\032$" +
      "WinterCampAcceptItemResultInfo.proto\"s\n\036" +
      "WinterCampAcceptAllGiveItemRsp\022@\n\027accept" +
      "_item_result_info\030\010 \003(\0132\037.WinterCampAcce" +
      "ptItemResultInfo\022\017\n\007retcode\030\004 \001(\005B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.getDescriptor(),
        });
    internal_static_WinterCampAcceptAllGiveItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampAcceptAllGiveItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampAcceptAllGiveItemRsp_descriptor,
        new java.lang.String[] { "AcceptItemResultInfo", "Retcode", });
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
