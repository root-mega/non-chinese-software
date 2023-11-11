// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerFloorRecordChangeNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class TowerFloorRecordChangeNotifyOuterClass {
  private TowerFloorRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerFloorRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerFloorRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> 
        getTowerFloorRecordListList();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index);
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    int getTowerFloorRecordListCount();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
        getTowerFloorRecordListOrBuilderList();
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
        int index);

    /**
     * <code>bool is_finished_entrance_floor = 1;</code>
     * @return The isFinishedEntranceFloor.
     */
    boolean getIsFinishedEntranceFloor();
  }
  /**
   * <pre>
   * CmdId: 23989
   * Obf: EEHMCGKNNPI
   * </pre>
   *
   * Protobuf type {@code TowerFloorRecordChangeNotify}
   */
  public static final class TowerFloorRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerFloorRecordChangeNotify)
      TowerFloorRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerFloorRecordChangeNotify.newBuilder() to construct.
    private TowerFloorRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerFloorRecordChangeNotify() {
      towerFloorRecordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerFloorRecordChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.class, emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.Builder.class);
    }

    public static final int TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
      return towerFloorRecordList_;
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
        getTowerFloorRecordListOrBuilderList() {
      return towerFloorRecordList_;
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    @java.lang.Override
    public int getTowerFloorRecordListCount() {
      return towerFloorRecordList_.size();
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index) {
      return towerFloorRecordList_.get(index);
    }
    /**
     * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
        int index) {
      return towerFloorRecordList_.get(index);
    }

    public static final int IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER = 1;
    private boolean isFinishedEntranceFloor_ = false;
    /**
     * <code>bool is_finished_entrance_floor = 1;</code>
     * @return The isFinishedEntranceFloor.
     */
    @java.lang.Override
    public boolean getIsFinishedEntranceFloor() {
      return isFinishedEntranceFloor_;
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
      if (isFinishedEntranceFloor_ != false) {
        output.writeBool(1, isFinishedEntranceFloor_);
      }
      for (int i = 0; i < towerFloorRecordList_.size(); i++) {
        output.writeMessage(9, towerFloorRecordList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinishedEntranceFloor_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isFinishedEntranceFloor_);
      }
      for (int i = 0; i < towerFloorRecordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, towerFloorRecordList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify other = (emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify) obj;

      if (!getTowerFloorRecordListList()
          .equals(other.getTowerFloorRecordListList())) return false;
      if (getIsFinishedEntranceFloor()
          != other.getIsFinishedEntranceFloor()) return false;
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
      if (getTowerFloorRecordListCount() > 0) {
        hash = (37 * hash) + TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTowerFloorRecordListList().hashCode();
      }
      hash = (37 * hash) + IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinishedEntranceFloor());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify prototype) {
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
     * CmdId: 23989
     * Obf: EEHMCGKNNPI
     * </pre>
     *
     * Protobuf type {@code TowerFloorRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerFloorRecordChangeNotify)
        emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.class, emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.newBuilder()
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
        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordList_ = java.util.Collections.emptyList();
        } else {
          towerFloorRecordList_ = null;
          towerFloorRecordListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinishedEntranceFloor_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify build() {
        emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify buildPartial() {
        emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result = new emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result) {
        if (towerFloorRecordListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            towerFloorRecordList_ = java.util.Collections.unmodifiableList(towerFloorRecordList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.towerFloorRecordList_ = towerFloorRecordList_;
        } else {
          result.towerFloorRecordList_ = towerFloorRecordListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinishedEntranceFloor_ = isFinishedEntranceFloor_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify other) {
        if (other == emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify.getDefaultInstance()) return this;
        if (towerFloorRecordListBuilder_ == null) {
          if (!other.towerFloorRecordList_.isEmpty()) {
            if (towerFloorRecordList_.isEmpty()) {
              towerFloorRecordList_ = other.towerFloorRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTowerFloorRecordListIsMutable();
              towerFloorRecordList_.addAll(other.towerFloorRecordList_);
            }
            onChanged();
          }
        } else {
          if (!other.towerFloorRecordList_.isEmpty()) {
            if (towerFloorRecordListBuilder_.isEmpty()) {
              towerFloorRecordListBuilder_.dispose();
              towerFloorRecordListBuilder_ = null;
              towerFloorRecordList_ = other.towerFloorRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              towerFloorRecordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTowerFloorRecordListFieldBuilder() : null;
            } else {
              towerFloorRecordListBuilder_.addAllMessages(other.towerFloorRecordList_);
            }
          }
        }
        if (other.getIsFinishedEntranceFloor() != false) {
          setIsFinishedEntranceFloor(other.getIsFinishedEntranceFloor());
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
                isFinishedEntranceFloor_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 74: {
                emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord m =
                    input.readMessage(
                        emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.parser(),
                        extensionRegistry);
                if (towerFloorRecordListBuilder_ == null) {
                  ensureTowerFloorRecordListIsMutable();
                  towerFloorRecordList_.add(m);
                } else {
                  towerFloorRecordListBuilder_.addMessage(m);
                }
                break;
              } // case 74
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

      private java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_ =
        java.util.Collections.emptyList();
      private void ensureTowerFloorRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          towerFloorRecordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord>(towerFloorRecordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> towerFloorRecordListBuilder_;

      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
        if (towerFloorRecordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(towerFloorRecordList_);
        } else {
          return towerFloorRecordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public int getTowerFloorRecordListCount() {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.size();
        } else {
          return towerFloorRecordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(int index) {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.get(index);
        } else {
          return towerFloorRecordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder setTowerFloorRecordList(
          int index, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.set(index, value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder setTowerFloorRecordList(
          int index, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder addTowerFloorRecordList(emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder addTowerFloorRecordList(
          int index, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord value) {
        if (towerFloorRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(index, value);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder addTowerFloorRecordList(
          emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder addTowerFloorRecordList(
          int index, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder addAllTowerFloorRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord> values) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, towerFloorRecordList_);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder clearTowerFloorRecordList() {
        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public Builder removeTowerFloorRecordList(int index) {
        if (towerFloorRecordListBuilder_ == null) {
          ensureTowerFloorRecordListIsMutable();
          towerFloorRecordList_.remove(index);
          onChanged();
        } else {
          towerFloorRecordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder getTowerFloorRecordListBuilder(
          int index) {
        return getTowerFloorRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(
          int index) {
        if (towerFloorRecordListBuilder_ == null) {
          return towerFloorRecordList_.get(index);  } else {
          return towerFloorRecordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
           getTowerFloorRecordListOrBuilderList() {
        if (towerFloorRecordListBuilder_ != null) {
          return towerFloorRecordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(towerFloorRecordList_);
        }
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder() {
        return getTowerFloorRecordListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder(
          int index) {
        return getTowerFloorRecordListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerFloorRecord tower_floor_record_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder> 
           getTowerFloorRecordListBuilderList() {
        return getTowerFloorRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> 
          getTowerFloorRecordListFieldBuilder() {
        if (towerFloorRecordListBuilder_ == null) {
          towerFloorRecordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord.Builder, emu.grasscutter.net.proto.TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>(
                  towerFloorRecordList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          towerFloorRecordList_ = null;
        }
        return towerFloorRecordListBuilder_;
      }

      private boolean isFinishedEntranceFloor_ ;
      /**
       * <code>bool is_finished_entrance_floor = 1;</code>
       * @return The isFinishedEntranceFloor.
       */
      @java.lang.Override
      public boolean getIsFinishedEntranceFloor() {
        return isFinishedEntranceFloor_;
      }
      /**
       * <code>bool is_finished_entrance_floor = 1;</code>
       * @param value The isFinishedEntranceFloor to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinishedEntranceFloor(boolean value) {

        isFinishedEntranceFloor_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished_entrance_floor = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinishedEntranceFloor() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinishedEntranceFloor_ = false;
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


      // @@protoc_insertion_point(builder_scope:TowerFloorRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerFloorRecordChangeNotify)
    private static final emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify();
    }

    public static emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerFloorRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerFloorRecordChangeNotify>() {
      @java.lang.Override
      public TowerFloorRecordChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerFloorRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerFloorRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerFloorRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"TowerFloorRecordChangeNotify.proto\032\026To" +
      "werFloorRecord.proto\"v\n\034TowerFloorRecord" +
      "ChangeNotify\0222\n\027tower_floor_record_list\030" +
      "\t \003(\0132\021.TowerFloorRecord\022\"\n\032is_finished_" +
      "entrance_floor\030\001 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerFloorRecordOuterClass.getDescriptor(),
        });
    internal_static_TowerFloorRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerFloorRecordChangeNotify_descriptor,
        new java.lang.String[] { "TowerFloorRecordList", "IsFinishedEntranceFloor", });
    emu.grasscutter.net.proto.TowerFloorRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
