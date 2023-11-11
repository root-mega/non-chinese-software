// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDelNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class AvatarDelNotifyOuterClass {
  private AvatarDelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @return A list containing the avatarGuidList.
     */
    java.util.List<java.lang.Long> getAvatarGuidListList();
    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @return The count of avatarGuidList.
     */
    int getAvatarGuidListCount();
    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    long getAvatarGuidList(int index);
  }
  /**
   * <pre>
   * CmdId: 8219
   * Obf: IOKBLLAGPJD
   * </pre>
   *
   * Protobuf type {@code AvatarDelNotify}
   */
  public static final class AvatarDelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDelNotify)
      AvatarDelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDelNotify.newBuilder() to construct.
    private AvatarDelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDelNotify() {
      avatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDelNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.internal_static_AvatarDelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.internal_static_AvatarDelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.class, emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.Builder.class);
    }

    public static final int AVATAR_GUID_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList avatarGuidList_ =
        emptyLongList();
    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @return A list containing the avatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarGuidListList() {
      return avatarGuidList_;
    }
    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @return The count of avatarGuidList.
     */
    public int getAvatarGuidListCount() {
      return avatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatar_guid_list = 7;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    public long getAvatarGuidList(int index) {
      return avatarGuidList_.getLong(index);
    }
    private int avatarGuidListMemoizedSerializedSize = -1;

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
      if (getAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(avatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarGuidList_.getLong(i));
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
        for (int i = 0; i < avatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify other = (emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify) obj;

      if (!getAvatarGuidListList()
          .equals(other.getAvatarGuidListList())) return false;
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
      if (getAvatarGuidListCount() > 0) {
        hash = (37 * hash) + AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify prototype) {
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
     * CmdId: 8219
     * Obf: IOKBLLAGPJD
     * </pre>
     *
     * Protobuf type {@code AvatarDelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDelNotify)
        emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.internal_static_AvatarDelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.internal_static_AvatarDelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.class, emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.newBuilder()
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
        avatarGuidList_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.internal_static_AvatarDelNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify build() {
        emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify result = new emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          avatarGuidList_.makeImmutable();
          result.avatarGuidList_ = avatarGuidList_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify.getDefaultInstance()) return this;
        if (!other.avatarGuidList_.isEmpty()) {
          if (avatarGuidList_.isEmpty()) {
            avatarGuidList_ = other.avatarGuidList_;
            avatarGuidList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureAvatarGuidListIsMutable();
            avatarGuidList_.addAll(other.avatarGuidList_);
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
              case 56: {
                long v = input.readUInt64();
                ensureAvatarGuidListIsMutable();
                avatarGuidList_.addLong(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
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

      private com.google.protobuf.Internal.LongList avatarGuidList_ = emptyLongList();
      private void ensureAvatarGuidListIsMutable() {
        if (!avatarGuidList_.isModifiable()) {
          avatarGuidList_ = makeMutableCopy(avatarGuidList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @return A list containing the avatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarGuidListList() {
        avatarGuidList_.makeImmutable();
        return avatarGuidList_;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @return The count of avatarGuidList.
       */
      public int getAvatarGuidListCount() {
        return avatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @param index The index of the element to return.
       * @return The avatarGuidList at the given index.
       */
      public long getAvatarGuidList(int index) {
        return avatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The avatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuidList(
          int index, long value) {

        ensureAvatarGuidListIsMutable();
        avatarGuidList_.setLong(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @param value The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarGuidList(long value) {

        ensureAvatarGuidListIsMutable();
        avatarGuidList_.addLong(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @param values The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarGuidList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuidList() {
        avatarGuidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:AvatarDelNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarDelNotify)
    private static final emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify();
    }

    public static emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDelNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDelNotify>() {
      @java.lang.Override
      public AvatarDelNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarDelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarDelNotifyOuterClass.AvatarDelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AvatarDelNotify.proto\"+\n\017AvatarDelNoti" +
      "fy\022\030\n\020avatar_guid_list\030\007 \003(\004B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarDelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDelNotify_descriptor,
        new java.lang.String[] { "AvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
