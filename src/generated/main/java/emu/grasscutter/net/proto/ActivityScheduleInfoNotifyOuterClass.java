// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityScheduleInfoNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ActivityScheduleInfoNotifyOuterClass {
  private ActivityScheduleInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityScheduleInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityScheduleInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> 
        getActivityScheduleListList();
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(int index);
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    int getActivityScheduleListCount();
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> 
        getActivityScheduleListOrBuilderList();
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(
        int index);

    /**
     * <code>uint32 remain_fly_sea_lamp_num = 10;</code>
     * @return The remainFlySeaLampNum.
     */
    int getRemainFlySeaLampNum();
  }
  /**
   * <pre>
   * CmdId: 23970
   * Obf: HGICHODDHDN
   * </pre>
   *
   * Protobuf type {@code ActivityScheduleInfoNotify}
   */
  public static final class ActivityScheduleInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityScheduleInfoNotify)
      ActivityScheduleInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityScheduleInfoNotify.newBuilder() to construct.
    private ActivityScheduleInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityScheduleInfoNotify() {
      activityScheduleList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityScheduleInfoNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.class, emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.Builder.class);
    }

    public static final int ACTIVITY_SCHEDULE_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> activityScheduleList_;
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleListList() {
      return activityScheduleList_;
    }
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> 
        getActivityScheduleListOrBuilderList() {
      return activityScheduleList_;
    }
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    @java.lang.Override
    public int getActivityScheduleListCount() {
      return activityScheduleList_.size();
    }
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(int index) {
      return activityScheduleList_.get(index);
    }
    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(
        int index) {
      return activityScheduleList_.get(index);
    }

    public static final int REMAIN_FLY_SEA_LAMP_NUM_FIELD_NUMBER = 10;
    private int remainFlySeaLampNum_ = 0;
    /**
     * <code>uint32 remain_fly_sea_lamp_num = 10;</code>
     * @return The remainFlySeaLampNum.
     */
    @java.lang.Override
    public int getRemainFlySeaLampNum() {
      return remainFlySeaLampNum_;
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
      if (remainFlySeaLampNum_ != 0) {
        output.writeUInt32(10, remainFlySeaLampNum_);
      }
      for (int i = 0; i < activityScheduleList_.size(); i++) {
        output.writeMessage(11, activityScheduleList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (remainFlySeaLampNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, remainFlySeaLampNum_);
      }
      for (int i = 0; i < activityScheduleList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, activityScheduleList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify other = (emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify) obj;

      if (!getActivityScheduleListList()
          .equals(other.getActivityScheduleListList())) return false;
      if (getRemainFlySeaLampNum()
          != other.getRemainFlySeaLampNum()) return false;
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
      if (getActivityScheduleListCount() > 0) {
        hash = (37 * hash) + ACTIVITY_SCHEDULE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getActivityScheduleListList().hashCode();
      }
      hash = (37 * hash) + REMAIN_FLY_SEA_LAMP_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getRemainFlySeaLampNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify prototype) {
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
     * CmdId: 23970
     * Obf: HGICHODDHDN
     * </pre>
     *
     * Protobuf type {@code ActivityScheduleInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityScheduleInfoNotify)
        emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.class, emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.newBuilder()
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
        if (activityScheduleListBuilder_ == null) {
          activityScheduleList_ = java.util.Collections.emptyList();
        } else {
          activityScheduleList_ = null;
          activityScheduleListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        remainFlySeaLampNum_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify build() {
        emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify buildPartial() {
        emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify result = new emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify result) {
        if (activityScheduleListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            activityScheduleList_ = java.util.Collections.unmodifiableList(activityScheduleList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.activityScheduleList_ = activityScheduleList_;
        } else {
          result.activityScheduleList_ = activityScheduleListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.remainFlySeaLampNum_ = remainFlySeaLampNum_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify other) {
        if (other == emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify.getDefaultInstance()) return this;
        if (activityScheduleListBuilder_ == null) {
          if (!other.activityScheduleList_.isEmpty()) {
            if (activityScheduleList_.isEmpty()) {
              activityScheduleList_ = other.activityScheduleList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureActivityScheduleListIsMutable();
              activityScheduleList_.addAll(other.activityScheduleList_);
            }
            onChanged();
          }
        } else {
          if (!other.activityScheduleList_.isEmpty()) {
            if (activityScheduleListBuilder_.isEmpty()) {
              activityScheduleListBuilder_.dispose();
              activityScheduleListBuilder_ = null;
              activityScheduleList_ = other.activityScheduleList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              activityScheduleListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getActivityScheduleListFieldBuilder() : null;
            } else {
              activityScheduleListBuilder_.addAllMessages(other.activityScheduleList_);
            }
          }
        }
        if (other.getRemainFlySeaLampNum() != 0) {
          setRemainFlySeaLampNum(other.getRemainFlySeaLampNum());
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
              case 80: {
                remainFlySeaLampNum_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 90: {
                emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.parser(),
                        extensionRegistry);
                if (activityScheduleListBuilder_ == null) {
                  ensureActivityScheduleListIsMutable();
                  activityScheduleList_.add(m);
                } else {
                  activityScheduleListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> activityScheduleList_ =
        java.util.Collections.emptyList();
      private void ensureActivityScheduleListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          activityScheduleList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo>(activityScheduleList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> activityScheduleListBuilder_;

      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleListList() {
        if (activityScheduleListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(activityScheduleList_);
        } else {
          return activityScheduleListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public int getActivityScheduleListCount() {
        if (activityScheduleListBuilder_ == null) {
          return activityScheduleList_.size();
        } else {
          return activityScheduleListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(int index) {
        if (activityScheduleListBuilder_ == null) {
          return activityScheduleList_.get(index);
        } else {
          return activityScheduleListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder setActivityScheduleList(
          int index, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
        if (activityScheduleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.set(index, value);
          onChanged();
        } else {
          activityScheduleListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder setActivityScheduleList(
          int index, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
        if (activityScheduleListBuilder_ == null) {
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.set(index, builderForValue.build());
          onChanged();
        } else {
          activityScheduleListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder addActivityScheduleList(emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
        if (activityScheduleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.add(value);
          onChanged();
        } else {
          activityScheduleListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder addActivityScheduleList(
          int index, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
        if (activityScheduleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.add(index, value);
          onChanged();
        } else {
          activityScheduleListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder addActivityScheduleList(
          emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
        if (activityScheduleListBuilder_ == null) {
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.add(builderForValue.build());
          onChanged();
        } else {
          activityScheduleListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder addActivityScheduleList(
          int index, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
        if (activityScheduleListBuilder_ == null) {
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.add(index, builderForValue.build());
          onChanged();
        } else {
          activityScheduleListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder addAllActivityScheduleList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo> values) {
        if (activityScheduleListBuilder_ == null) {
          ensureActivityScheduleListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, activityScheduleList_);
          onChanged();
        } else {
          activityScheduleListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder clearActivityScheduleList() {
        if (activityScheduleListBuilder_ == null) {
          activityScheduleList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          activityScheduleListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public Builder removeActivityScheduleList(int index) {
        if (activityScheduleListBuilder_ == null) {
          ensureActivityScheduleListIsMutable();
          activityScheduleList_.remove(index);
          onChanged();
        } else {
          activityScheduleListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder getActivityScheduleListBuilder(
          int index) {
        return getActivityScheduleListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(
          int index) {
        if (activityScheduleListBuilder_ == null) {
          return activityScheduleList_.get(index);  } else {
          return activityScheduleListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> 
           getActivityScheduleListOrBuilderList() {
        if (activityScheduleListBuilder_ != null) {
          return activityScheduleListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(activityScheduleList_);
        }
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder addActivityScheduleListBuilder() {
        return getActivityScheduleListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder addActivityScheduleListBuilder(
          int index) {
        return getActivityScheduleListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityScheduleInfo activity_schedule_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder> 
           getActivityScheduleListBuilderList() {
        return getActivityScheduleListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> 
          getActivityScheduleListFieldBuilder() {
        if (activityScheduleListBuilder_ == null) {
          activityScheduleListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder>(
                  activityScheduleList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          activityScheduleList_ = null;
        }
        return activityScheduleListBuilder_;
      }

      private int remainFlySeaLampNum_ ;
      /**
       * <code>uint32 remain_fly_sea_lamp_num = 10;</code>
       * @return The remainFlySeaLampNum.
       */
      @java.lang.Override
      public int getRemainFlySeaLampNum() {
        return remainFlySeaLampNum_;
      }
      /**
       * <code>uint32 remain_fly_sea_lamp_num = 10;</code>
       * @param value The remainFlySeaLampNum to set.
       * @return This builder for chaining.
       */
      public Builder setRemainFlySeaLampNum(int value) {

        remainFlySeaLampNum_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 remain_fly_sea_lamp_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainFlySeaLampNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        remainFlySeaLampNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityScheduleInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityScheduleInfoNotify)
    private static final emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify();
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityScheduleInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityScheduleInfoNotify>() {
      @java.lang.Override
      public ActivityScheduleInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityScheduleInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityScheduleInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityScheduleInfoNotifyOuterClass.ActivityScheduleInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityScheduleInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityScheduleInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ActivityScheduleInfoNotify.proto\032\032Acti" +
      "vityScheduleInfo.proto\"t\n\032ActivitySchedu" +
      "leInfoNotify\0225\n\026activity_schedule_list\030\013" +
      " \003(\0132\025.ActivityScheduleInfo\022\037\n\027remain_fl" +
      "y_sea_lamp_num\030\n \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.getDescriptor(),
        });
    internal_static_ActivityScheduleInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityScheduleInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityScheduleInfoNotify_descriptor,
        new java.lang.String[] { "ActivityScheduleList", "RemainFlySeaLampNum", });
    emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
