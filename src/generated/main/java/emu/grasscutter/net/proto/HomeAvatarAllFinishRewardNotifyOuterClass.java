// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarAllFinishRewardNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class HomeAvatarAllFinishRewardNotifyOuterClass {
  private HomeAvatarAllFinishRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarAllFinishRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarAllFinishRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @return A list containing the eventIdList.
     */
    java.util.List<java.lang.Integer> getEventIdListList();
    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @return The count of eventIdList.
     */
    int getEventIdListCount();
    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    int getEventIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 9497
   * Obf: PLHINAALPPO
   * </pre>
   *
   * Protobuf type {@code HomeAvatarAllFinishRewardNotify}
   */
  public static final class HomeAvatarAllFinishRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarAllFinishRewardNotify)
      HomeAvatarAllFinishRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarAllFinishRewardNotify.newBuilder() to construct.
    private HomeAvatarAllFinishRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarAllFinishRewardNotify() {
      eventIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarAllFinishRewardNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.class, emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.Builder.class);
    }

    public static final int EVENT_ID_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList eventIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @return A list containing the eventIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEventIdListList() {
      return eventIdList_;
    }
    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @return The count of eventIdList.
     */
    public int getEventIdListCount() {
      return eventIdList_.size();
    }
    /**
     * <code>repeated uint32 event_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    public int getEventIdList(int index) {
      return eventIdList_.getInt(index);
    }
    private int eventIdListMemoizedSerializedSize = -1;

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
      if (getEventIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(eventIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < eventIdList_.size(); i++) {
        output.writeUInt32NoTag(eventIdList_.getInt(i));
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
        for (int i = 0; i < eventIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(eventIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEventIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        eventIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify other = (emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify) obj;

      if (!getEventIdListList()
          .equals(other.getEventIdListList())) return false;
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
      if (getEventIdListCount() > 0) {
        hash = (37 * hash) + EVENT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEventIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify prototype) {
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
     * CmdId: 9497
     * Obf: PLHINAALPPO
     * </pre>
     *
     * Protobuf type {@code HomeAvatarAllFinishRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarAllFinishRewardNotify)
        emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.class, emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.newBuilder()
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
        eventIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify build() {
        emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify buildPartial() {
        emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify result = new emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          eventIdList_.makeImmutable();
          result.eventIdList_ = eventIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify other) {
        if (other == emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.getDefaultInstance()) return this;
        if (!other.eventIdList_.isEmpty()) {
          if (eventIdList_.isEmpty()) {
            eventIdList_ = other.eventIdList_;
            eventIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureEventIdListIsMutable();
            eventIdList_.addAll(other.eventIdList_);
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
              case 96: {
                int v = input.readUInt32();
                ensureEventIdListIsMutable();
                eventIdList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureEventIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  eventIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private com.google.protobuf.Internal.IntList eventIdList_ = emptyIntList();
      private void ensureEventIdListIsMutable() {
        if (!eventIdList_.isModifiable()) {
          eventIdList_ = makeMutableCopy(eventIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @return A list containing the eventIdList.
       */
      public java.util.List<java.lang.Integer>
          getEventIdListList() {
        eventIdList_.makeImmutable();
        return eventIdList_;
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @return The count of eventIdList.
       */
      public int getEventIdListCount() {
        return eventIdList_.size();
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The eventIdList at the given index.
       */
      public int getEventIdList(int index) {
        return eventIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The eventIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEventIdList(
          int index, int value) {

        ensureEventIdListIsMutable();
        eventIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @param value The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEventIdList(int value) {

        ensureEventIdListIsMutable();
        eventIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @param values The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEventIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEventIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 event_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventIdList() {
        eventIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarAllFinishRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarAllFinishRewardNotify)
    private static final emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify();
    }

    public static emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarAllFinishRewardNotify>() {
      @java.lang.Override
      public HomeAvatarAllFinishRewardNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HomeAvatarAllFinishRewardNotify.proto\"" +
      "8\n\037HomeAvatarAllFinishRewardNotify\022\025\n\rev" +
      "ent_id_list\030\014 \003(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarAllFinishRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarAllFinishRewardNotify_descriptor,
        new java.lang.String[] { "EventIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
