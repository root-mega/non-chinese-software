// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestDestroyEntityRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class QuestDestroyEntityRspOuterClass {
  private QuestDestroyEntityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestDestroyEntityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestDestroyEntityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 14;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 quest_id = 10;</code>
     * @return The questId.
     */
    int getQuestId();
  }
  /**
   * <pre>
   * CmdId: 9130
   * Obf: FGDKHKLDGLI
   * </pre>
   *
   * Protobuf type {@code QuestDestroyEntityRsp}
   */
  public static final class QuestDestroyEntityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestDestroyEntityRsp)
      QuestDestroyEntityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestDestroyEntityRsp.newBuilder() to construct.
    private QuestDestroyEntityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestDestroyEntityRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestDestroyEntityRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.internal_static_QuestDestroyEntityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.internal_static_QuestDestroyEntityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.class, emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 14;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 14;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 3;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 10;
    private int questId_ = 0;
    /**
     * <code>uint32 quest_id = 10;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(3, entityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (questId_ != 0) {
        output.writeUInt32(10, questId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(14, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, entityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, questId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp other = (emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp prototype) {
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
     * CmdId: 9130
     * Obf: FGDKHKLDGLI
     * </pre>
     *
     * Protobuf type {@code QuestDestroyEntityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestDestroyEntityRsp)
        emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.internal_static_QuestDestroyEntityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.internal_static_QuestDestroyEntityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.class, emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.newBuilder()
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
        sceneId_ = 0;
        retcode_ = 0;
        entityId_ = 0;
        questId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.internal_static_QuestDestroyEntityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp build() {
        emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp buildPartial() {
        emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp result = new emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.questId_ = questId_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp other) {
        if (other == emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
              case 24: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 56: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 80: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 112: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
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

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 14;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 14;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
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
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 10;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 10;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {

        questId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        questId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestDestroyEntityRsp)
    }

    // @@protoc_insertion_point(class_scope:QuestDestroyEntityRsp)
    private static final emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp();
    }

    public static emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestDestroyEntityRsp>
        PARSER = new com.google.protobuf.AbstractParser<QuestDestroyEntityRsp>() {
      @java.lang.Override
      public QuestDestroyEntityRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestDestroyEntityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestDestroyEntityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestDestroyEntityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestDestroyEntityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033QuestDestroyEntityRsp.proto\"_\n\025QuestDe" +
      "stroyEntityRsp\022\020\n\010scene_id\030\016 \001(\r\022\017\n\007retc" +
      "ode\030\007 \001(\005\022\021\n\tentity_id\030\003 \001(\r\022\020\n\010quest_id" +
      "\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestDestroyEntityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestDestroyEntityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestDestroyEntityRsp_descriptor,
        new java.lang.String[] { "SceneId", "Retcode", "EntityId", "QuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
