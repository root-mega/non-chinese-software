// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonWayPointNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class DungeonWayPointNotifyOuterClass {
  private DungeonWayPointNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonWayPointNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonWayPointNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @return A list containing the activeWayPointList.
     */
    java.util.List<java.lang.Integer> getActiveWayPointListList();
    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @return The count of activeWayPointList.
     */
    int getActiveWayPointListCount();
    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @param index The index of the element to return.
     * @return The activeWayPointList at the given index.
     */
    int getActiveWayPointList(int index);

    /**
     * <code>bool is_add = 5;</code>
     * @return The isAdd.
     */
    boolean getIsAdd();
  }
  /**
   * <pre>
   * CmdId: 27817
   * Obf: MKJAMAKFLLI
   * </pre>
   *
   * Protobuf type {@code DungeonWayPointNotify}
   */
  public static final class DungeonWayPointNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonWayPointNotify)
      DungeonWayPointNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonWayPointNotify.newBuilder() to construct.
    private DungeonWayPointNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonWayPointNotify() {
      activeWayPointList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonWayPointNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.internal_static_DungeonWayPointNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.internal_static_DungeonWayPointNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.class, emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.Builder.class);
    }

    public static final int ACTIVE_WAY_POINT_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList activeWayPointList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @return A list containing the activeWayPointList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getActiveWayPointListList() {
      return activeWayPointList_;
    }
    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @return The count of activeWayPointList.
     */
    public int getActiveWayPointListCount() {
      return activeWayPointList_.size();
    }
    /**
     * <code>repeated uint32 active_way_point_list = 6;</code>
     * @param index The index of the element to return.
     * @return The activeWayPointList at the given index.
     */
    public int getActiveWayPointList(int index) {
      return activeWayPointList_.getInt(index);
    }
    private int activeWayPointListMemoizedSerializedSize = -1;

    public static final int IS_ADD_FIELD_NUMBER = 5;
    private boolean isAdd_ = false;
    /**
     * <code>bool is_add = 5;</code>
     * @return The isAdd.
     */
    @java.lang.Override
    public boolean getIsAdd() {
      return isAdd_;
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
      getSerializedSize();
      if (isAdd_ != false) {
        output.writeBool(5, isAdd_);
      }
      if (getActiveWayPointListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(activeWayPointListMemoizedSerializedSize);
      }
      for (int i = 0; i < activeWayPointList_.size(); i++) {
        output.writeUInt32NoTag(activeWayPointList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAdd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isAdd_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < activeWayPointList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(activeWayPointList_.getInt(i));
        }
        size += dataSize;
        if (!getActiveWayPointListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        activeWayPointListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify other = (emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify) obj;

      if (!getActiveWayPointListList()
          .equals(other.getActiveWayPointListList())) return false;
      if (getIsAdd()
          != other.getIsAdd()) return false;
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
      if (getActiveWayPointListCount() > 0) {
        hash = (37 * hash) + ACTIVE_WAY_POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getActiveWayPointListList().hashCode();
      }
      hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAdd());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify prototype) {
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
     * CmdId: 27817
     * Obf: MKJAMAKFLLI
     * </pre>
     *
     * Protobuf type {@code DungeonWayPointNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonWayPointNotify)
        emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.internal_static_DungeonWayPointNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.internal_static_DungeonWayPointNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.class, emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.newBuilder()
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
        activeWayPointList_ = emptyIntList();
        isAdd_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.internal_static_DungeonWayPointNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify build() {
        emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify buildPartial() {
        emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify result = new emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          activeWayPointList_.makeImmutable();
          result.activeWayPointList_ = activeWayPointList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isAdd_ = isAdd_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify other) {
        if (other == emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify.getDefaultInstance()) return this;
        if (!other.activeWayPointList_.isEmpty()) {
          if (activeWayPointList_.isEmpty()) {
            activeWayPointList_ = other.activeWayPointList_;
            activeWayPointList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureActiveWayPointListIsMutable();
            activeWayPointList_.addAll(other.activeWayPointList_);
          }
          onChanged();
        }
        if (other.getIsAdd() != false) {
          setIsAdd(other.getIsAdd());
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
              case 40: {
                isAdd_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 48: {
                int v = input.readUInt32();
                ensureActiveWayPointListIsMutable();
                activeWayPointList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureActiveWayPointListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  activeWayPointList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
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

      private com.google.protobuf.Internal.IntList activeWayPointList_ = emptyIntList();
      private void ensureActiveWayPointListIsMutable() {
        if (!activeWayPointList_.isModifiable()) {
          activeWayPointList_ = makeMutableCopy(activeWayPointList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @return A list containing the activeWayPointList.
       */
      public java.util.List<java.lang.Integer>
          getActiveWayPointListList() {
        activeWayPointList_.makeImmutable();
        return activeWayPointList_;
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @return The count of activeWayPointList.
       */
      public int getActiveWayPointListCount() {
        return activeWayPointList_.size();
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @param index The index of the element to return.
       * @return The activeWayPointList at the given index.
       */
      public int getActiveWayPointList(int index) {
        return activeWayPointList_.getInt(index);
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The activeWayPointList to set.
       * @return This builder for chaining.
       */
      public Builder setActiveWayPointList(
          int index, int value) {

        ensureActiveWayPointListIsMutable();
        activeWayPointList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @param value The activeWayPointList to add.
       * @return This builder for chaining.
       */
      public Builder addActiveWayPointList(int value) {

        ensureActiveWayPointListIsMutable();
        activeWayPointList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @param values The activeWayPointList to add.
       * @return This builder for chaining.
       */
      public Builder addAllActiveWayPointList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureActiveWayPointListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, activeWayPointList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 active_way_point_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearActiveWayPointList() {
        activeWayPointList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isAdd_ ;
      /**
       * <code>bool is_add = 5;</code>
       * @return The isAdd.
       */
      @java.lang.Override
      public boolean getIsAdd() {
        return isAdd_;
      }
      /**
       * <code>bool is_add = 5;</code>
       * @param value The isAdd to set.
       * @return This builder for chaining.
       */
      public Builder setIsAdd(boolean value) {

        isAdd_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_add = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAdd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAdd_ = false;
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


      // @@protoc_insertion_point(builder_scope:DungeonWayPointNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonWayPointNotify)
    private static final emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify();
    }

    public static emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonWayPointNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonWayPointNotify>() {
      @java.lang.Override
      public DungeonWayPointNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonWayPointNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonWayPointNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonWayPointNotifyOuterClass.DungeonWayPointNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonWayPointNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonWayPointNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033DungeonWayPointNotify.proto\"F\n\025Dungeon" +
      "WayPointNotify\022\035\n\025active_way_point_list\030" +
      "\006 \003(\r\022\016\n\006is_add\030\005 \001(\010B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonWayPointNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonWayPointNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonWayPointNotify_descriptor,
        new java.lang.String[] { "ActiveWayPointList", "IsAdd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
