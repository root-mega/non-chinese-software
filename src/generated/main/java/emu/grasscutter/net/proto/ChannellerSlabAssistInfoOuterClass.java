// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabAssistInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ChannellerSlabAssistInfoOuterClass {
  private ChannellerSlabAssistInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabAssistInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabAssistInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 9;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 avatar_level = 5;</code>
     * @return The avatarLevel.
     */
    int getAvatarLevel();

    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Obf: EKJCNEMMJDA
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabAssistInfo}
   */
  public static final class ChannellerSlabAssistInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannellerSlabAssistInfo)
      ChannellerSlabAssistInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabAssistInfo.newBuilder() to construct.
    private ChannellerSlabAssistInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabAssistInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabAssistInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.internal_static_ChannellerSlabAssistInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.internal_static_ChannellerSlabAssistInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.class, emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 9;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatar_id = 9;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int AVATAR_LEVEL_FIELD_NUMBER = 5;
    private int avatarLevel_ = 0;
    /**
     * <code>uint32 avatar_level = 5;</code>
     * @return The avatarLevel.
     */
    @java.lang.Override
    public int getAvatarLevel() {
      return avatarLevel_;
    }

    public static final int UID_FIELD_NUMBER = 6;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (avatarLevel_ != 0) {
        output.writeUInt32(5, avatarLevel_);
      }
      if (uid_ != 0) {
        output.writeUInt32(6, uid_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(9, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarLevel_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, uid_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo other = (emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getAvatarLevel()
          != other.getAvatarLevel()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + AVATAR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarLevel();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo prototype) {
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
     * Obf: EKJCNEMMJDA
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabAssistInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabAssistInfo)
        emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.internal_static_ChannellerSlabAssistInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.internal_static_ChannellerSlabAssistInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.class, emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.newBuilder()
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
        avatarId_ = 0;
        avatarLevel_ = 0;
        uid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.internal_static_ChannellerSlabAssistInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo build() {
        emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo result = new emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarId_ = avatarId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarLevel_ = avatarLevel_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getAvatarLevel() != 0) {
          setAvatarLevel(other.getAvatarLevel());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
                avatarLevel_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 48: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 72: {
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {

        avatarId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int avatarLevel_ ;
      /**
       * <code>uint32 avatar_level = 5;</code>
       * @return The avatarLevel.
       */
      @java.lang.Override
      public int getAvatarLevel() {
        return avatarLevel_;
      }
      /**
       * <code>uint32 avatar_level = 5;</code>
       * @param value The avatarLevel to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarLevel(int value) {

        avatarLevel_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_level = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarLevel_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 6;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannellerSlabAssistInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabAssistInfo)
    private static final emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabAssistInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabAssistInfo>() {
      @java.lang.Override
      public ChannellerSlabAssistInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannellerSlabAssistInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabAssistInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannellerSlabAssistInfoOuterClass.ChannellerSlabAssistInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabAssistInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabAssistInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ChannellerSlabAssistInfo.proto\"P\n\030Chan" +
      "nellerSlabAssistInfo\022\021\n\tavatar_id\030\t \001(\r\022" +
      "\024\n\014avatar_level\030\005 \001(\r\022\013\n\003uid\030\006 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannellerSlabAssistInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabAssistInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabAssistInfo_descriptor,
        new java.lang.String[] { "AvatarId", "AvatarLevel", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
