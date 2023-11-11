// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterTransPointRegionNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class EnterTransPointRegionNotifyOuterClass {
  private EnterTransPointRegionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterTransPointRegionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterTransPointRegionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 5;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 22064
   * Obf: ECDCICGGBDA
   * </pre>
   *
   * Protobuf type {@code EnterTransPointRegionNotify}
   */
  public static final class EnterTransPointRegionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterTransPointRegionNotify)
      EnterTransPointRegionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterTransPointRegionNotify.newBuilder() to construct.
    private EnterTransPointRegionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterTransPointRegionNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterTransPointRegionNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.class, emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 5;
    private int pointId_ = 0;
    /**
     * <code>uint32 point_id = 5;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 12;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 12;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(5, pointId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(12, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pointId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify other = (emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify prototype) {
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
     * CmdId: 22064
     * Obf: ECDCICGGBDA
     * </pre>
     *
     * Protobuf type {@code EnterTransPointRegionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterTransPointRegionNotify)
        emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.class, emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.newBuilder()
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
        pointId_ = 0;
        sceneId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.internal_static_EnterTransPointRegionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify build() {
        emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify buildPartial() {
        emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify result = new emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pointId_ = pointId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify other) {
        if (other == emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 96: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 5;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 5;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {

        pointId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterTransPointRegionNotify)
    }

    // @@protoc_insertion_point(class_scope:EnterTransPointRegionNotify)
    private static final emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify();
    }

    public static emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterTransPointRegionNotify>
        PARSER = new com.google.protobuf.AbstractParser<EnterTransPointRegionNotify>() {
      @java.lang.Override
      public EnterTransPointRegionNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterTransPointRegionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterTransPointRegionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterTransPointRegionNotifyOuterClass.EnterTransPointRegionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterTransPointRegionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterTransPointRegionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EnterTransPointRegionNotify.proto\"A\n\033E" +
      "nterTransPointRegionNotify\022\020\n\010point_id\030\005" +
      " \001(\r\022\020\n\010scene_id\030\014 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterTransPointRegionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterTransPointRegionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterTransPointRegionNotify_descriptor,
        new java.lang.String[] { "PointId", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
