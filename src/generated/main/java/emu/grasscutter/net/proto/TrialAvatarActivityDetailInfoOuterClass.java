// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrialAvatarActivityDetailInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class TrialAvatarActivityDetailInfoOuterClass {
  private TrialAvatarActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> 
        getRewardInfoListList();
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getRewardInfoList(int index);
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    int getRewardInfoListCount();
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder> 
        getRewardInfoListOrBuilderList();
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder getRewardInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: ALGLMCJHKGN
   * </pre>
   *
   * Protobuf type {@code TrialAvatarActivityDetailInfo}
   */
  public static final class TrialAvatarActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrialAvatarActivityDetailInfo)
      TrialAvatarActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrialAvatarActivityDetailInfo.newBuilder() to construct.
    private TrialAvatarActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarActivityDetailInfo() {
      rewardInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrialAvatarActivityDetailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.internal_static_TrialAvatarActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.internal_static_TrialAvatarActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.class, emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.Builder.class);
    }

    public static final int REWARD_INFO_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> rewardInfoList_;
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> getRewardInfoListList() {
      return rewardInfoList_;
    }
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder> 
        getRewardInfoListOrBuilderList() {
      return rewardInfoList_;
    }
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    @java.lang.Override
    public int getRewardInfoListCount() {
      return rewardInfoList_.size();
    }
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getRewardInfoList(int index) {
      return rewardInfoList_.get(index);
    }
    /**
     * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder getRewardInfoListOrBuilder(
        int index) {
      return rewardInfoList_.get(index);
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
      for (int i = 0; i < rewardInfoList_.size(); i++) {
        output.writeMessage(11, rewardInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < rewardInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, rewardInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo other = (emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo) obj;

      if (!getRewardInfoListList()
          .equals(other.getRewardInfoListList())) return false;
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
      if (getRewardInfoListCount() > 0) {
        hash = (37 * hash) + REWARD_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo prototype) {
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
     * Obf: ALGLMCJHKGN
     * </pre>
     *
     * Protobuf type {@code TrialAvatarActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarActivityDetailInfo)
        emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.internal_static_TrialAvatarActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.internal_static_TrialAvatarActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.class, emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.newBuilder()
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
        if (rewardInfoListBuilder_ == null) {
          rewardInfoList_ = java.util.Collections.emptyList();
        } else {
          rewardInfoList_ = null;
          rewardInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.internal_static_TrialAvatarActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo build() {
        emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo result = new emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo result) {
        if (rewardInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            rewardInfoList_ = java.util.Collections.unmodifiableList(rewardInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rewardInfoList_ = rewardInfoList_;
        } else {
          result.rewardInfoList_ = rewardInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo.getDefaultInstance()) return this;
        if (rewardInfoListBuilder_ == null) {
          if (!other.rewardInfoList_.isEmpty()) {
            if (rewardInfoList_.isEmpty()) {
              rewardInfoList_ = other.rewardInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRewardInfoListIsMutable();
              rewardInfoList_.addAll(other.rewardInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.rewardInfoList_.isEmpty()) {
            if (rewardInfoListBuilder_.isEmpty()) {
              rewardInfoListBuilder_.dispose();
              rewardInfoListBuilder_ = null;
              rewardInfoList_ = other.rewardInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rewardInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRewardInfoListFieldBuilder() : null;
            } else {
              rewardInfoListBuilder_.addAllMessages(other.rewardInfoList_);
            }
          }
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
              case 90: {
                emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.parser(),
                        extensionRegistry);
                if (rewardInfoListBuilder_ == null) {
                  ensureRewardInfoListIsMutable();
                  rewardInfoList_.add(m);
                } else {
                  rewardInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 90
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

      private java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> rewardInfoList_ =
        java.util.Collections.emptyList();
      private void ensureRewardInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo>(rewardInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder> rewardInfoListBuilder_;

      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> getRewardInfoListList() {
        if (rewardInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rewardInfoList_);
        } else {
          return rewardInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public int getRewardInfoListCount() {
        if (rewardInfoListBuilder_ == null) {
          return rewardInfoList_.size();
        } else {
          return rewardInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getRewardInfoList(int index) {
        if (rewardInfoListBuilder_ == null) {
          return rewardInfoList_.get(index);
        } else {
          return rewardInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder setRewardInfoList(
          int index, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo value) {
        if (rewardInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardInfoListIsMutable();
          rewardInfoList_.set(index, value);
          onChanged();
        } else {
          rewardInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder setRewardInfoList(
          int index, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder builderForValue) {
        if (rewardInfoListBuilder_ == null) {
          ensureRewardInfoListIsMutable();
          rewardInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          rewardInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder addRewardInfoList(emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo value) {
        if (rewardInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardInfoListIsMutable();
          rewardInfoList_.add(value);
          onChanged();
        } else {
          rewardInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder addRewardInfoList(
          int index, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo value) {
        if (rewardInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardInfoListIsMutable();
          rewardInfoList_.add(index, value);
          onChanged();
        } else {
          rewardInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder addRewardInfoList(
          emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder builderForValue) {
        if (rewardInfoListBuilder_ == null) {
          ensureRewardInfoListIsMutable();
          rewardInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          rewardInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder addRewardInfoList(
          int index, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder builderForValue) {
        if (rewardInfoListBuilder_ == null) {
          ensureRewardInfoListIsMutable();
          rewardInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          rewardInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder addAllRewardInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo> values) {
        if (rewardInfoListBuilder_ == null) {
          ensureRewardInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, rewardInfoList_);
          onChanged();
        } else {
          rewardInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder clearRewardInfoList() {
        if (rewardInfoListBuilder_ == null) {
          rewardInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rewardInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public Builder removeRewardInfoList(int index) {
        if (rewardInfoListBuilder_ == null) {
          ensureRewardInfoListIsMutable();
          rewardInfoList_.remove(index);
          onChanged();
        } else {
          rewardInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder getRewardInfoListBuilder(
          int index) {
        return getRewardInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder getRewardInfoListOrBuilder(
          int index) {
        if (rewardInfoListBuilder_ == null) {
          return rewardInfoList_.get(index);  } else {
          return rewardInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder> 
           getRewardInfoListOrBuilderList() {
        if (rewardInfoListBuilder_ != null) {
          return rewardInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rewardInfoList_);
        }
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder addRewardInfoListBuilder() {
        return getRewardInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder addRewardInfoListBuilder(
          int index) {
        return getRewardInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TrialAvatarActivityRewardDetailInfo reward_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder> 
           getRewardInfoListBuilderList() {
        return getRewardInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder> 
          getRewardInfoListFieldBuilder() {
        if (rewardInfoListBuilder_ == null) {
          rewardInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder>(
                  rewardInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          rewardInfoList_ = null;
        }
        return rewardInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TrialAvatarActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarActivityDetailInfo)
    private static final emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarActivityDetailInfo>() {
      @java.lang.Override
      public TrialAvatarActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<TrialAvatarActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrialAvatarActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrialAvatarActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#TrialAvatarActivityDetailInfo.proto\032)T" +
      "rialAvatarActivityRewardDetailInfo.proto" +
      "\"_\n\035TrialAvatarActivityDetailInfo\022>\n\020rew" +
      "ard_info_list\030\013 \003(\0132$.TrialAvatarActivit" +
      "yRewardDetailInfoB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.getDescriptor(),
        });
    internal_static_TrialAvatarActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrialAvatarActivityDetailInfo_descriptor,
        new java.lang.String[] { "RewardInfoList", });
    emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
