// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnchorPointData.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class AnchorPointDataOuterClass {
  private AnchorPointDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnchorPointDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnchorPointData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 end_time = 12;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 anchor_point_id = 1;</code>
     * @return The anchorPointId.
     */
    int getAnchorPointId();

    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 5;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>.Vector rot = 7;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 7;</code>
     * @return The rot.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 7;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * <pre>
   * Obf: EBCMEKLBHEL
   * </pre>
   *
   * Protobuf type {@code AnchorPointData}
   */
  public static final class AnchorPointData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnchorPointData)
      AnchorPointDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnchorPointData.newBuilder() to construct.
    private AnchorPointData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnchorPointData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnchorPointData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AnchorPointDataOuterClass.internal_static_AnchorPointData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnchorPointDataOuterClass.internal_static_AnchorPointData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.class, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder.class);
    }

    private int bitField0_;
    public static final int SCENE_ID_FIELD_NUMBER = 11;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 12;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 12;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int ANCHOR_POINT_ID_FIELD_NUMBER = 1;
    private int anchorPointId_ = 0;
    /**
     * <code>uint32 anchor_point_id = 1;</code>
     * @return The anchorPointId.
     */
    @java.lang.Override
    public int getAnchorPointId() {
      return anchorPointId_;
    }

    public static final int POS_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }

    public static final int ROT_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 7;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.Vector rot = 7;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
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
      if (anchorPointId_ != 0) {
        output.writeUInt32(1, anchorPointId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(5, getPos());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(7, getRot());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(11, sceneId_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(12, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (anchorPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, anchorPointId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getPos());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getRot());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sceneId_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData other = (emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getAnchorPointId()
          != other.getAnchorPointId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
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
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + ANCHOR_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData prototype) {
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
     * Obf: EBCMEKLBHEL
     * </pre>
     *
     * Protobuf type {@code AnchorPointData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnchorPointData)
        emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnchorPointDataOuterClass.internal_static_AnchorPointData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnchorPointDataOuterClass.internal_static_AnchorPointData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.class, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPosFieldBuilder();
          getRotFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        sceneId_ = 0;
        endTime_ = 0;
        anchorPointId_ = 0;
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnchorPointDataOuterClass.internal_static_AnchorPointData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData build() {
        emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData buildPartial() {
        emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData result = new emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.endTime_ = endTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.anchorPointId_ = anchorPointId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.rot_ = rotBuilder_ == null
              ? rot_
              : rotBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData) {
          return mergeFrom((emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData other) {
        if (other == emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getAnchorPointId() != 0) {
          setAnchorPointId(other.getAnchorPointId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
                anchorPointId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 42: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 42
              case 58: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
                break;
              } // case 58
              case 88: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 96: {
                endTime_ = input.readUInt32();
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

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 11;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 11;</code>
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
       * <code>uint32 scene_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 12;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 12;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {

        endTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointId_ ;
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @return The anchorPointId.
       */
      @java.lang.Override
      public int getAnchorPointId() {
        return anchorPointId_;
      }
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @param value The anchorPointId to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointId(int value) {

        anchorPointId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        anchorPointId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 5;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>.Vector pos = 5;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            pos_ != null &&
            pos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        if (pos_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 7;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>.Vector rot = 7;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public Builder setRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
        } else {
          rotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            rot_ != null &&
            rot_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getRotBuilder().mergeFrom(value);
          } else {
            rot_ = value;
          }
        } else {
          rotBuilder_.mergeFrom(value);
        }
        if (rot_ != null) {
          bitField0_ |= 0x00000010;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public Builder clearRot() {
        bitField0_ = (bitField0_ & ~0x00000010);
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AnchorPointData)
    }

    // @@protoc_insertion_point(class_scope:AnchorPointData)
    private static final emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData();
    }

    public static emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnchorPointData>
        PARSER = new com.google.protobuf.AbstractParser<AnchorPointData>() {
      @java.lang.Override
      public AnchorPointData parsePartialFrom(
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

    public static com.google.protobuf.Parser<AnchorPointData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnchorPointData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnchorPointData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnchorPointData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AnchorPointData.proto\032\014Vector.proto\"z\n" +
      "\017AnchorPointData\022\020\n\010scene_id\030\013 \001(\r\022\020\n\010en" +
      "d_time\030\014 \001(\r\022\027\n\017anchor_point_id\030\001 \001(\r\022\024\n" +
      "\003pos\030\005 \001(\0132\007.Vector\022\024\n\003rot\030\007 \001(\0132\007.Vecto" +
      "rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AnchorPointData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnchorPointData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnchorPointData_descriptor,
        new java.lang.String[] { "SceneId", "EndTime", "AnchorPointId", "Pos", "Rot", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
