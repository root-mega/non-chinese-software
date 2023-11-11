// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneRouteChangeInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class SceneRouteChangeInfoOuterClass {
  private SceneRouteChangeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneRouteChangeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneRouteChangeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_forward = 3;</code>
     * @return The isForward.
     */
    boolean getIsForward();

    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> 
        getPointListList();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index);
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    int getPointListCount();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
        getPointListOrBuilderList();
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
        int index);

    /**
     * <code>uint32 type = 9;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>uint32 route_id = 10;</code>
     * @return The routeId.
     */
    int getRouteId();
  }
  /**
   * <pre>
   * Obf: CIAHMGGKINJ
   * </pre>
   *
   * Protobuf type {@code SceneRouteChangeInfo}
   */
  public static final class SceneRouteChangeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneRouteChangeInfo)
      SceneRouteChangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneRouteChangeInfo.newBuilder() to construct.
    private SceneRouteChangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneRouteChangeInfo() {
      pointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneRouteChangeInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.class, emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.Builder.class);
    }

    public static final int IS_FORWARD_FIELD_NUMBER = 3;
    private boolean isForward_ = false;
    /**
     * <code>bool is_forward = 3;</code>
     * @return The isForward.
     */
    @java.lang.Override
    public boolean getIsForward() {
      return isForward_;
    }

    public static final int POINT_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> pointList_;
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> getPointListList() {
      return pointList_;
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
        getPointListOrBuilderList() {
      return pointList_;
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    @java.lang.Override
    public int getPointListCount() {
      return pointList_.size();
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index) {
      return pointList_.get(index);
    }
    /**
     * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
        int index) {
      return pointList_.get(index);
    }

    public static final int TYPE_FIELD_NUMBER = 9;
    private int type_ = 0;
    /**
     * <code>uint32 type = 9;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int ROUTE_ID_FIELD_NUMBER = 10;
    private int routeId_ = 0;
    /**
     * <code>uint32 route_id = 10;</code>
     * @return The routeId.
     */
    @java.lang.Override
    public int getRouteId() {
      return routeId_;
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
      if (isForward_ != false) {
        output.writeBool(3, isForward_);
      }
      if (type_ != 0) {
        output.writeUInt32(9, type_);
      }
      if (routeId_ != 0) {
        output.writeUInt32(10, routeId_);
      }
      for (int i = 0; i < pointList_.size(); i++) {
        output.writeMessage(12, pointList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isForward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isForward_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, type_);
      }
      if (routeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, routeId_);
      }
      for (int i = 0; i < pointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, pointList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo other = (emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo) obj;

      if (getIsForward()
          != other.getIsForward()) return false;
      if (!getPointListList()
          .equals(other.getPointListList())) return false;
      if (getType()
          != other.getType()) return false;
      if (getRouteId()
          != other.getRouteId()) return false;
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
      hash = (37 * hash) + IS_FORWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForward());
      if (getPointListCount() > 0) {
        hash = (37 * hash) + POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPointListList().hashCode();
      }
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + ROUTE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRouteId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo prototype) {
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
     * Obf: CIAHMGGKINJ
     * </pre>
     *
     * Protobuf type {@code SceneRouteChangeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneRouteChangeInfo)
        emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.class, emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.newBuilder()
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
        isForward_ = false;
        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
        } else {
          pointList_ = null;
          pointListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        routeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.internal_static_SceneRouteChangeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo build() {
        emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo buildPartial() {
        emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result = new emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result) {
        if (pointListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            pointList_ = java.util.Collections.unmodifiableList(pointList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.pointList_ = pointList_;
        } else {
          result.pointList_ = pointListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isForward_ = isForward_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.routeId_ = routeId_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo other) {
        if (other == emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo.getDefaultInstance()) return this;
        if (other.getIsForward() != false) {
          setIsForward(other.getIsForward());
        }
        if (pointListBuilder_ == null) {
          if (!other.pointList_.isEmpty()) {
            if (pointList_.isEmpty()) {
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePointListIsMutable();
              pointList_.addAll(other.pointList_);
            }
            onChanged();
          }
        } else {
          if (!other.pointList_.isEmpty()) {
            if (pointListBuilder_.isEmpty()) {
              pointListBuilder_.dispose();
              pointListBuilder_ = null;
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              pointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPointListFieldBuilder() : null;
            } else {
              pointListBuilder_.addAllMessages(other.pointList_);
            }
          }
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getRouteId() != 0) {
          setRouteId(other.getRouteId());
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
                isForward_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 72: {
                type_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 80: {
                routeId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 98: {
                emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.parser(),
                        extensionRegistry);
                if (pointListBuilder_ == null) {
                  ensurePointListIsMutable();
                  pointList_.add(m);
                } else {
                  pointListBuilder_.addMessage(m);
                }
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

      private boolean isForward_ ;
      /**
       * <code>bool is_forward = 3;</code>
       * @return The isForward.
       */
      @java.lang.Override
      public boolean getIsForward() {
        return isForward_;
      }
      /**
       * <code>bool is_forward = 3;</code>
       * @param value The isForward to set.
       * @return This builder for chaining.
       */
      public Builder setIsForward(boolean value) {

        isForward_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forward = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForward() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isForward_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> pointList_ =
        java.util.Collections.emptyList();
      private void ensurePointListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          pointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo>(pointList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> pointListBuilder_;

      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> getPointListList() {
        if (pointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pointList_);
        } else {
          return pointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public int getPointListCount() {
        if (pointListBuilder_ == null) {
          return pointList_.size();
        } else {
          return pointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getPointList(int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);
        } else {
          return pointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder setPointList(
          int index, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.set(index, value);
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder setPointList(
          int index, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder addPointList(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder addPointList(
          int index, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(index, value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder addPointList(
          emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder addPointList(
          int index, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder addAllPointList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo> values) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pointList_);
          onChanged();
        } else {
          pointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder clearPointList() {
        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          pointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public Builder removePointList(int index) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.remove(index);
          onChanged();
        } else {
          pointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder getPointListBuilder(
          int index) {
        return getPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder getPointListOrBuilder(
          int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);  } else {
          return pointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
           getPointListOrBuilderList() {
        if (pointListBuilder_ != null) {
          return pointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pointList_);
        }
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder addPointListBuilder() {
        return getPointListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder addPointListBuilder(
          int index) {
        return getPointListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePointChangeInfo point_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder> 
           getPointListBuilderList() {
        return getPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder> 
          getPointListFieldBuilder() {
        if (pointListBuilder_ == null) {
          pointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder>(
                  pointList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          pointList_ = null;
        }
        return pointListBuilder_;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 9;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 9;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {

        type_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }

      private int routeId_ ;
      /**
       * <code>uint32 route_id = 10;</code>
       * @return The routeId.
       */
      @java.lang.Override
      public int getRouteId() {
        return routeId_;
      }
      /**
       * <code>uint32 route_id = 10;</code>
       * @param value The routeId to set.
       * @return This builder for chaining.
       */
      public Builder setRouteId(int value) {

        routeId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 route_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRouteId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        routeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneRouteChangeInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneRouteChangeInfo)
    private static final emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo();
    }

    public static emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneRouteChangeInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneRouteChangeInfo>() {
      @java.lang.Override
      public SceneRouteChangeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneRouteChangeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneRouteChangeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneRouteChangeInfoOuterClass.SceneRouteChangeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneRouteChangeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneRouteChangeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneRouteChangeInfo.proto\032\032RoutePoint" +
      "ChangeInfo.proto\"u\n\024SceneRouteChangeInfo" +
      "\022\022\n\nis_forward\030\003 \001(\010\022)\n\npoint_list\030\014 \003(\013" +
      "2\025.RoutePointChangeInfo\022\014\n\004type\030\t \001(\r\022\020\n" +
      "\010route_id\030\n \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneRouteChangeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneRouteChangeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneRouteChangeInfo_descriptor,
        new java.lang.String[] { "IsForward", "PointList", "Type", "RouteId", });
    emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
