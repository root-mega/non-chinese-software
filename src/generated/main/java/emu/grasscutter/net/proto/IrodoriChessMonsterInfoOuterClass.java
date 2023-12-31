// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessMonsterInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class IrodoriChessMonsterInfoOuterClass {
  private IrodoriChessMonsterInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessMonsterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessMonsterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 monster_id = 7;</code>
     * @return The monsterId.
     */
    int getMonsterId();

    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 level = 9;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 grant_points = 13;</code>
     * @return The grantPoints.
     */
    int getGrantPoints();
  }
  /**
   * <pre>
   * Obf: BNNFFFNKHLO
   * </pre>
   *
   * Protobuf type {@code IrodoriChessMonsterInfo}
   */
  public static final class IrodoriChessMonsterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessMonsterInfo)
      IrodoriChessMonsterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessMonsterInfo.newBuilder() to construct.
    private IrodoriChessMonsterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessMonsterInfo() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessMonsterInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.class, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder.class);
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 7;
    private int monsterId_ = 0;
    /**
     * <code>uint32 monster_id = 7;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList affixList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int LEVEL_FIELD_NUMBER = 9;
    private int level_ = 0;
    /**
     * <code>uint32 level = 9;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int GRANT_POINTS_FIELD_NUMBER = 13;
    private int grantPoints_ = 0;
    /**
     * <code>uint32 grant_points = 13;</code>
     * @return The grantPoints.
     */
    @java.lang.Override
    public int getGrantPoints() {
      return grantPoints_;
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
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (monsterId_ != 0) {
        output.writeUInt32(7, monsterId_);
      }
      if (level_ != 0) {
        output.writeUInt32(9, level_);
      }
      if (grantPoints_ != 0) {
        output.writeUInt32(13, grantPoints_);
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
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, monsterId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, level_);
      }
      if (grantPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, grantPoints_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo other = (emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo) obj;

      if (getMonsterId()
          != other.getMonsterId()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getGrantPoints()
          != other.getGrantPoints()) return false;
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
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + GRANT_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getGrantPoints();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo prototype) {
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
     * Obf: BNNFFFNKHLO
     * </pre>
     *
     * Protobuf type {@code IrodoriChessMonsterInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessMonsterInfo)
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.class, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.newBuilder()
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
        monsterId_ = 0;
        affixList_ = emptyIntList();
        level_ = 0;
        grantPoints_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.internal_static_IrodoriChessMonsterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo build() {
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result = new emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.monsterId_ = monsterId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          affixList_.makeImmutable();
          result.affixList_ = affixList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.grantPoints_ = grantPoints_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance()) return this;
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            affixList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getGrantPoints() != 0) {
          setGrantPoints(other.getGrantPoints());
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
              case 48: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 56: {
                monsterId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 72: {
                level_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 104: {
                grantPoints_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 104
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

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 7;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 7;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {

        monsterId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        monsterId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!affixList_.isModifiable()) {
          affixList_ = makeMutableCopy(affixList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        affixList_.makeImmutable();
        return affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {

        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {

        ensureAffixListIsMutable();
        affixList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 9;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 9;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {

        level_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }

      private int grantPoints_ ;
      /**
       * <code>uint32 grant_points = 13;</code>
       * @return The grantPoints.
       */
      @java.lang.Override
      public int getGrantPoints() {
        return grantPoints_;
      }
      /**
       * <code>uint32 grant_points = 13;</code>
       * @param value The grantPoints to set.
       * @return This builder for chaining.
       */
      public Builder setGrantPoints(int value) {

        grantPoints_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grant_points = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrantPoints() {
        bitField0_ = (bitField0_ & ~0x00000008);
        grantPoints_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessMonsterInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessMonsterInfo)
    private static final emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessMonsterInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessMonsterInfo>() {
      @java.lang.Override
      public IrodoriChessMonsterInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessMonsterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessMonsterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessMonsterInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessMonsterInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035IrodoriChessMonsterInfo.proto\"f\n\027Irodo" +
      "riChessMonsterInfo\022\022\n\nmonster_id\030\007 \001(\r\022\022" +
      "\n\naffix_list\030\006 \003(\r\022\r\n\005level\030\t \001(\r\022\024\n\014gra" +
      "nt_points\030\r \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessMonsterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessMonsterInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessMonsterInfo_descriptor,
        new java.lang.String[] { "MonsterId", "AffixList", "Level", "GrantPoints", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
