// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampV3ShadowInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class SeaLampV3ShadowInfoOuterClass {
  private SeaLampV3ShadowInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampV3ShadowInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampV3ShadowInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> 
        getStageInfoListList();
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo getStageInfoList(int index);
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    int getStageInfoListCount();
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder> 
        getStageInfoListOrBuilderList();
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder getStageInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: CDNDGGOEPCJ
   * </pre>
   *
   * Protobuf type {@code SeaLampV3ShadowInfo}
   */
  public static final class SeaLampV3ShadowInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampV3ShadowInfo)
      SeaLampV3ShadowInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampV3ShadowInfo.newBuilder() to construct.
    private SeaLampV3ShadowInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampV3ShadowInfo() {
      stageInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampV3ShadowInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.internal_static_SeaLampV3ShadowInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.internal_static_SeaLampV3ShadowInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.class, emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.Builder.class);
    }

    public static final int STAGE_INFO_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> stageInfoList_;
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> getStageInfoListList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder> 
        getStageInfoListOrBuilderList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    @java.lang.Override
    public int getStageInfoListCount() {
      return stageInfoList_.size();
    }
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo getStageInfoList(int index) {
      return stageInfoList_.get(index);
    }
    /**
     * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder getStageInfoListOrBuilder(
        int index) {
      return stageInfoList_.get(index);
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
      for (int i = 0; i < stageInfoList_.size(); i++) {
        output.writeMessage(8, stageInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, stageInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo other = (emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo) obj;

      if (!getStageInfoListList()
          .equals(other.getStageInfoListList())) return false;
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
      if (getStageInfoListCount() > 0) {
        hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo prototype) {
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
     * Obf: CDNDGGOEPCJ
     * </pre>
     *
     * Protobuf type {@code SeaLampV3ShadowInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampV3ShadowInfo)
        emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.internal_static_SeaLampV3ShadowInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.internal_static_SeaLampV3ShadowInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.class, emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.newBuilder()
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
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
        } else {
          stageInfoList_ = null;
          stageInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.internal_static_SeaLampV3ShadowInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo build() {
        emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo buildPartial() {
        emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo result = new emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo result) {
        if (stageInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageInfoList_ = stageInfoList_;
        } else {
          result.stageInfoList_ = stageInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo result) {
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo other) {
        if (other == emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo.getDefaultInstance()) return this;
        if (stageInfoListBuilder_ == null) {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoList_.isEmpty()) {
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageInfoListIsMutable();
              stageInfoList_.addAll(other.stageInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoListBuilder_.isEmpty()) {
              stageInfoListBuilder_.dispose();
              stageInfoListBuilder_ = null;
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageInfoListFieldBuilder() : null;
            } else {
              stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
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
              case 66: {
                emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.parser(),
                        extensionRegistry);
                if (stageInfoListBuilder_ == null) {
                  ensureStageInfoListIsMutable();
                  stageInfoList_.add(m);
                } else {
                  stageInfoListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> stageInfoList_ =
        java.util.Collections.emptyList();
      private void ensureStageInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo>(stageInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder> stageInfoListBuilder_;

      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> getStageInfoListList() {
        if (stageInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        } else {
          return stageInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public int getStageInfoListCount() {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.size();
        } else {
          return stageInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo getStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);
        } else {
          return stageInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder addStageInfoList(emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder addStageInfoList(
          emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder addAllStageInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo> values) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageInfoList_);
          onChanged();
        } else {
          stageInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder clearStageInfoList() {
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public Builder removeStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.remove(index);
          onChanged();
        } else {
          stageInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder getStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder getStageInfoListOrBuilder(
          int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);  } else {
          return stageInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder> 
           getStageInfoListOrBuilderList() {
        if (stageInfoListBuilder_ != null) {
          return stageInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        }
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder addStageInfoListBuilder() {
        return getStageInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder addStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SeaLampV3ShadowStageInfo stage_info_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder> 
           getStageInfoListBuilderList() {
        return getStageInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder> 
          getStageInfoListFieldBuilder() {
        if (stageInfoListBuilder_ == null) {
          stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfo.Builder, emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.SeaLampV3ShadowStageInfoOrBuilder>(
                  stageInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageInfoList_ = null;
        }
        return stageInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SeaLampV3ShadowInfo)
    }

    // @@protoc_insertion_point(class_scope:SeaLampV3ShadowInfo)
    private static final emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo();
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampV3ShadowInfo>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampV3ShadowInfo>() {
      @java.lang.Override
      public SeaLampV3ShadowInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampV3ShadowInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampV3ShadowInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3ShadowInfoOuterClass.SeaLampV3ShadowInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampV3ShadowInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampV3ShadowInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031SeaLampV3ShadowInfo.proto\032\036SeaLampV3Sh" +
      "adowStageInfo.proto\"I\n\023SeaLampV3ShadowIn" +
      "fo\0222\n\017stage_info_list\030\010 \003(\0132\031.SeaLampV3S" +
      "hadowStageInfoB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.getDescriptor(),
        });
    internal_static_SeaLampV3ShadowInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampV3ShadowInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampV3ShadowInfo_descriptor,
        new java.lang.String[] { "StageInfoList", });
    emu.grasscutter.net.proto.SeaLampV3ShadowStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
