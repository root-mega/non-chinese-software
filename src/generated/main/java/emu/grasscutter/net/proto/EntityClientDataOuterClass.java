// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityClientData.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class EntityClientDataOuterClass {
  private EntityClientDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityClientDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityClientData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float windmill_sync_angle = 2;</code>
     * @return The windmillSyncAngle.
     */
    float getWindmillSyncAngle();

    /**
     * <code>uint32 wind_change_scene_time = 1;</code>
     * @return The windChangeSceneTime.
     */
    int getWindChangeSceneTime();

    /**
     * <code>int32 wind_change_target_level = 3;</code>
     * @return The windChangeTargetLevel.
     */
    int getWindChangeTargetLevel();
  }
  /**
   * Protobuf type {@code EntityClientData}
   */
  public static final class EntityClientData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityClientData)
      EntityClientDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityClientData.newBuilder() to construct.
    private EntityClientData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityClientData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityClientData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.class, emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.Builder.class);
    }

    public static final int WINDMILL_SYNC_ANGLE_FIELD_NUMBER = 2;
    private float windmillSyncAngle_ = 0F;
    /**
     * <code>float windmill_sync_angle = 2;</code>
     * @return The windmillSyncAngle.
     */
    @java.lang.Override
    public float getWindmillSyncAngle() {
      return windmillSyncAngle_;
    }

    public static final int WIND_CHANGE_SCENE_TIME_FIELD_NUMBER = 1;
    private int windChangeSceneTime_ = 0;
    /**
     * <code>uint32 wind_change_scene_time = 1;</code>
     * @return The windChangeSceneTime.
     */
    @java.lang.Override
    public int getWindChangeSceneTime() {
      return windChangeSceneTime_;
    }

    public static final int WIND_CHANGE_TARGET_LEVEL_FIELD_NUMBER = 3;
    private int windChangeTargetLevel_ = 0;
    /**
     * <code>int32 wind_change_target_level = 3;</code>
     * @return The windChangeTargetLevel.
     */
    @java.lang.Override
    public int getWindChangeTargetLevel() {
      return windChangeTargetLevel_;
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
      if (windChangeSceneTime_ != 0) {
        output.writeUInt32(1, windChangeSceneTime_);
      }
      if (java.lang.Float.floatToRawIntBits(windmillSyncAngle_) != 0) {
        output.writeFloat(2, windmillSyncAngle_);
      }
      if (windChangeTargetLevel_ != 0) {
        output.writeInt32(3, windChangeTargetLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (windChangeSceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, windChangeSceneTime_);
      }
      if (java.lang.Float.floatToRawIntBits(windmillSyncAngle_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, windmillSyncAngle_);
      }
      if (windChangeTargetLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, windChangeTargetLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData other = (emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData) obj;

      if (java.lang.Float.floatToIntBits(getWindmillSyncAngle())
          != java.lang.Float.floatToIntBits(
              other.getWindmillSyncAngle())) return false;
      if (getWindChangeSceneTime()
          != other.getWindChangeSceneTime()) return false;
      if (getWindChangeTargetLevel()
          != other.getWindChangeTargetLevel()) return false;
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
      hash = (37 * hash) + WINDMILL_SYNC_ANGLE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getWindmillSyncAngle());
      hash = (37 * hash) + WIND_CHANGE_SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getWindChangeSceneTime();
      hash = (37 * hash) + WIND_CHANGE_TARGET_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getWindChangeTargetLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData prototype) {
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
     * Protobuf type {@code EntityClientData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityClientData)
        emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.class, emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.newBuilder()
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
        windmillSyncAngle_ = 0F;
        windChangeSceneTime_ = 0;
        windChangeTargetLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData build() {
        emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData buildPartial() {
        emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData result = new emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.windmillSyncAngle_ = windmillSyncAngle_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.windChangeSceneTime_ = windChangeSceneTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.windChangeTargetLevel_ = windChangeTargetLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData) {
          return mergeFrom((emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData other) {
        if (other == emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData.getDefaultInstance()) return this;
        if (other.getWindmillSyncAngle() != 0F) {
          setWindmillSyncAngle(other.getWindmillSyncAngle());
        }
        if (other.getWindChangeSceneTime() != 0) {
          setWindChangeSceneTime(other.getWindChangeSceneTime());
        }
        if (other.getWindChangeTargetLevel() != 0) {
          setWindChangeTargetLevel(other.getWindChangeTargetLevel());
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
              case 8: {
                windChangeSceneTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 21: {
                windmillSyncAngle_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
              case 24: {
                windChangeTargetLevel_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private float windmillSyncAngle_ ;
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @return The windmillSyncAngle.
       */
      @java.lang.Override
      public float getWindmillSyncAngle() {
        return windmillSyncAngle_;
      }
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @param value The windmillSyncAngle to set.
       * @return This builder for chaining.
       */
      public Builder setWindmillSyncAngle(float value) {

        windmillSyncAngle_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindmillSyncAngle() {
        bitField0_ = (bitField0_ & ~0x00000001);
        windmillSyncAngle_ = 0F;
        onChanged();
        return this;
      }

      private int windChangeSceneTime_ ;
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @return The windChangeSceneTime.
       */
      @java.lang.Override
      public int getWindChangeSceneTime() {
        return windChangeSceneTime_;
      }
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @param value The windChangeSceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setWindChangeSceneTime(int value) {

        windChangeSceneTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindChangeSceneTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        windChangeSceneTime_ = 0;
        onChanged();
        return this;
      }

      private int windChangeTargetLevel_ ;
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @return The windChangeTargetLevel.
       */
      @java.lang.Override
      public int getWindChangeTargetLevel() {
        return windChangeTargetLevel_;
      }
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @param value The windChangeTargetLevel to set.
       * @return This builder for chaining.
       */
      public Builder setWindChangeTargetLevel(int value) {

        windChangeTargetLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindChangeTargetLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        windChangeTargetLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EntityClientData)
    }

    // @@protoc_insertion_point(class_scope:EntityClientData)
    private static final emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData();
    }

    public static emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityClientData>
        PARSER = new com.google.protobuf.AbstractParser<EntityClientData>() {
      @java.lang.Override
      public EntityClientData parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityClientData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityClientData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EntityClientDataOuterClass.EntityClientData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityClientData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityClientData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EntityClientData.proto\"q\n\020EntityClient" +
      "Data\022\033\n\023windmill_sync_angle\030\002 \001(\002\022\036\n\026win" +
      "d_change_scene_time\030\001 \001(\r\022 \n\030wind_change" +
      "_target_level\030\003 \001(\005B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityClientData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityClientData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityClientData_descriptor,
        new java.lang.String[] { "WindmillSyncAngle", "WindChangeSceneTime", "WindChangeTargetLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
