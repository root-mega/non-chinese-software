// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessData.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class IrodoriChessDataOuterClass {
  private IrodoriChessDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> 
        getLevelDataListList();
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getLevelDataList(int index);
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    int getLevelDataListCount();
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder> 
        getLevelDataListOrBuilderList();
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder getLevelDataListOrBuilder(
        int index);

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: OABAAFMENIN
   * </pre>
   *
   * Protobuf type {@code IrodoriChessData}
   */
  public static final class IrodoriChessData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessData)
      IrodoriChessDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessData.newBuilder() to construct.
    private IrodoriChessData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessData() {
      levelDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.internal_static_IrodoriChessData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.internal_static_IrodoriChessData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.class, emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.Builder.class);
    }

    public static final int LEVEL_DATA_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> levelDataList_;
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> getLevelDataListList() {
      return levelDataList_;
    }
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder> 
        getLevelDataListOrBuilderList() {
      return levelDataList_;
    }
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    @java.lang.Override
    public int getLevelDataListCount() {
      return levelDataList_.size();
    }
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getLevelDataList(int index) {
      return levelDataList_.get(index);
    }
    /**
     * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder getLevelDataListOrBuilder(
        int index) {
      return levelDataList_.get(index);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      for (int i = 0; i < levelDataList_.size(); i++) {
        output.writeMessage(5, levelDataList_.get(i));
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < levelDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, levelDataList_.get(i));
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData other = (emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData) obj;

      if (!getLevelDataListList()
          .equals(other.getLevelDataListList())) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      if (getLevelDataListCount() > 0) {
        hash = (37 * hash) + LEVEL_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelDataListList().hashCode();
      }
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData prototype) {
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
     * Obf: OABAAFMENIN
     * </pre>
     *
     * Protobuf type {@code IrodoriChessData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessData)
        emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.internal_static_IrodoriChessData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.internal_static_IrodoriChessData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.class, emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.newBuilder()
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
        if (levelDataListBuilder_ == null) {
          levelDataList_ = java.util.Collections.emptyList();
        } else {
          levelDataList_ = null;
          levelDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.internal_static_IrodoriChessData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData build() {
        emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData result = new emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData result) {
        if (levelDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            levelDataList_ = java.util.Collections.unmodifiableList(levelDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.levelDataList_ = levelDataList_;
        } else {
          result.levelDataList_ = levelDataListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData.getDefaultInstance()) return this;
        if (levelDataListBuilder_ == null) {
          if (!other.levelDataList_.isEmpty()) {
            if (levelDataList_.isEmpty()) {
              levelDataList_ = other.levelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLevelDataListIsMutable();
              levelDataList_.addAll(other.levelDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.levelDataList_.isEmpty()) {
            if (levelDataListBuilder_.isEmpty()) {
              levelDataListBuilder_.dispose();
              levelDataListBuilder_ = null;
              levelDataList_ = other.levelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              levelDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLevelDataListFieldBuilder() : null;
            } else {
              levelDataListBuilder_.addAllMessages(other.levelDataList_);
            }
          }
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
              case 42: {
                emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.parser(),
                        extensionRegistry);
                if (levelDataListBuilder_ == null) {
                  ensureLevelDataListIsMutable();
                  levelDataList_.add(m);
                } else {
                  levelDataListBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 96: {
                isOpen_ = input.readBool();
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

      private java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> levelDataList_ =
        java.util.Collections.emptyList();
      private void ensureLevelDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData>(levelDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder> levelDataListBuilder_;

      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> getLevelDataListList() {
        if (levelDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(levelDataList_);
        } else {
          return levelDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public int getLevelDataListCount() {
        if (levelDataListBuilder_ == null) {
          return levelDataList_.size();
        } else {
          return levelDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getLevelDataList(int index) {
        if (levelDataListBuilder_ == null) {
          return levelDataList_.get(index);
        } else {
          return levelDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder setLevelDataList(
          int index, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData value) {
        if (levelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelDataListIsMutable();
          levelDataList_.set(index, value);
          onChanged();
        } else {
          levelDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder setLevelDataList(
          int index, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder builderForValue) {
        if (levelDataListBuilder_ == null) {
          ensureLevelDataListIsMutable();
          levelDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          levelDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder addLevelDataList(emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData value) {
        if (levelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelDataListIsMutable();
          levelDataList_.add(value);
          onChanged();
        } else {
          levelDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder addLevelDataList(
          int index, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData value) {
        if (levelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelDataListIsMutable();
          levelDataList_.add(index, value);
          onChanged();
        } else {
          levelDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder addLevelDataList(
          emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder builderForValue) {
        if (levelDataListBuilder_ == null) {
          ensureLevelDataListIsMutable();
          levelDataList_.add(builderForValue.build());
          onChanged();
        } else {
          levelDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder addLevelDataList(
          int index, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder builderForValue) {
        if (levelDataListBuilder_ == null) {
          ensureLevelDataListIsMutable();
          levelDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          levelDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder addAllLevelDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData> values) {
        if (levelDataListBuilder_ == null) {
          ensureLevelDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, levelDataList_);
          onChanged();
        } else {
          levelDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder clearLevelDataList() {
        if (levelDataListBuilder_ == null) {
          levelDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          levelDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public Builder removeLevelDataList(int index) {
        if (levelDataListBuilder_ == null) {
          ensureLevelDataListIsMutable();
          levelDataList_.remove(index);
          onChanged();
        } else {
          levelDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder getLevelDataListBuilder(
          int index) {
        return getLevelDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder getLevelDataListOrBuilder(
          int index) {
        if (levelDataListBuilder_ == null) {
          return levelDataList_.get(index);  } else {
          return levelDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder> 
           getLevelDataListOrBuilderList() {
        if (levelDataListBuilder_ != null) {
          return levelDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(levelDataList_);
        }
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder addLevelDataListBuilder() {
        return getLevelDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder addLevelDataListBuilder(
          int index) {
        return getLevelDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriChessLevelData level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder> 
           getLevelDataListBuilderList() {
        return getLevelDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder> 
          getLevelDataListFieldBuilder() {
        if (levelDataListBuilder_ == null) {
          levelDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder, emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder>(
                  levelDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          levelDataList_ = null;
        }
        return levelDataListBuilder_;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessData)
    private static final emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData();
    }

    public static emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessData>() {
      @java.lang.Override
      public IrodoriChessData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessDataOuterClass.IrodoriChessData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026IrodoriChessData.proto\032\033IrodoriChessLe" +
      "velData.proto\"T\n\020IrodoriChessData\022/\n\017lev" +
      "el_data_list\030\005 \003(\0132\026.IrodoriChessLevelDa" +
      "ta\022\017\n\007is_open\030\014 \001(\010B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessData_descriptor,
        new java.lang.String[] { "LevelDataList", "IsOpen", });
    emu.grasscutter.net.proto.IrodoriChessLevelDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
