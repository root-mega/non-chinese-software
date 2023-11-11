// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcMusicRecord.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class UgcMusicRecordOuterClass {
  private UgcMusicRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcMusicRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcMusicRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> 
        getMusicTrackListList();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index);
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    int getMusicTrackListCount();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
        getMusicTrackListOrBuilderList();
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
        int index);

    /**
     * <code>uint32 music_id = 12;</code>
     * @return The musicId.
     */
    int getMusicId();
  }
  /**
   * <pre>
   * Obf: HILPBDEAEAP
   * </pre>
   *
   * Protobuf type {@code UgcMusicRecord}
   */
  public static final class UgcMusicRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcMusicRecord)
      UgcMusicRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcMusicRecord.newBuilder() to construct.
    private UgcMusicRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcMusicRecord() {
      musicTrackList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcMusicRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.class, emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.Builder.class);
    }

    public static final int MUSIC_TRACK_LIST_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> musicTrackList_;
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> getMusicTrackListList() {
      return musicTrackList_;
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
        getMusicTrackListOrBuilderList() {
      return musicTrackList_;
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    @java.lang.Override
    public int getMusicTrackListCount() {
      return musicTrackList_.size();
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index) {
      return musicTrackList_.get(index);
    }
    /**
     * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
        int index) {
      return musicTrackList_.get(index);
    }

    public static final int MUSIC_ID_FIELD_NUMBER = 12;
    private int musicId_ = 0;
    /**
     * <code>uint32 music_id = 12;</code>
     * @return The musicId.
     */
    @java.lang.Override
    public int getMusicId() {
      return musicId_;
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
      if (musicId_ != 0) {
        output.writeUInt32(12, musicId_);
      }
      for (int i = 0; i < musicTrackList_.size(); i++) {
        output.writeMessage(14, musicTrackList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, musicId_);
      }
      for (int i = 0; i < musicTrackList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, musicTrackList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord other = (emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord) obj;

      if (!getMusicTrackListList()
          .equals(other.getMusicTrackListList())) return false;
      if (getMusicId()
          != other.getMusicId()) return false;
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
      if (getMusicTrackListCount() > 0) {
        hash = (37 * hash) + MUSIC_TRACK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMusicTrackListList().hashCode();
      }
      hash = (37 * hash) + MUSIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord prototype) {
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
     * Obf: HILPBDEAEAP
     * </pre>
     *
     * Protobuf type {@code UgcMusicRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcMusicRecord)
        emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.class, emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.newBuilder()
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
        if (musicTrackListBuilder_ == null) {
          musicTrackList_ = java.util.Collections.emptyList();
        } else {
          musicTrackList_ = null;
          musicTrackListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        musicId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.internal_static_UgcMusicRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord build() {
        emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord buildPartial() {
        emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result = new emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result) {
        if (musicTrackListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            musicTrackList_ = java.util.Collections.unmodifiableList(musicTrackList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.musicTrackList_ = musicTrackList_;
        } else {
          result.musicTrackList_ = musicTrackListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.musicId_ = musicId_;
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
        if (other instanceof emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord) {
          return mergeFrom((emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord other) {
        if (other == emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord.getDefaultInstance()) return this;
        if (musicTrackListBuilder_ == null) {
          if (!other.musicTrackList_.isEmpty()) {
            if (musicTrackList_.isEmpty()) {
              musicTrackList_ = other.musicTrackList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMusicTrackListIsMutable();
              musicTrackList_.addAll(other.musicTrackList_);
            }
            onChanged();
          }
        } else {
          if (!other.musicTrackList_.isEmpty()) {
            if (musicTrackListBuilder_.isEmpty()) {
              musicTrackListBuilder_.dispose();
              musicTrackListBuilder_ = null;
              musicTrackList_ = other.musicTrackList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              musicTrackListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMusicTrackListFieldBuilder() : null;
            } else {
              musicTrackListBuilder_.addAllMessages(other.musicTrackList_);
            }
          }
        }
        if (other.getMusicId() != 0) {
          setMusicId(other.getMusicId());
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
              case 96: {
                musicId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
              case 114: {
                emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack m =
                    input.readMessage(
                        emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.parser(),
                        extensionRegistry);
                if (musicTrackListBuilder_ == null) {
                  ensureMusicTrackListIsMutable();
                  musicTrackList_.add(m);
                } else {
                  musicTrackListBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> musicTrackList_ =
        java.util.Collections.emptyList();
      private void ensureMusicTrackListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          musicTrackList_ = new java.util.ArrayList<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack>(musicTrackList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> musicTrackListBuilder_;

      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> getMusicTrackListList() {
        if (musicTrackListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(musicTrackList_);
        } else {
          return musicTrackListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public int getMusicTrackListCount() {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.size();
        } else {
          return musicTrackListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack getMusicTrackList(int index) {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.get(index);
        } else {
          return musicTrackListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder setMusicTrackList(
          int index, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.set(index, value);
          onChanged();
        } else {
          musicTrackListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder setMusicTrackList(
          int index, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.set(index, builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder addMusicTrackList(emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(value);
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder addMusicTrackList(
          int index, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack value) {
        if (musicTrackListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(index, value);
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder addMusicTrackList(
          emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder addMusicTrackList(
          int index, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder builderForValue) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.add(index, builderForValue.build());
          onChanged();
        } else {
          musicTrackListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder addAllMusicTrackList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack> values) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, musicTrackList_);
          onChanged();
        } else {
          musicTrackListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder clearMusicTrackList() {
        if (musicTrackListBuilder_ == null) {
          musicTrackList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          musicTrackListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public Builder removeMusicTrackList(int index) {
        if (musicTrackListBuilder_ == null) {
          ensureMusicTrackListIsMutable();
          musicTrackList_.remove(index);
          onChanged();
        } else {
          musicTrackListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder getMusicTrackListBuilder(
          int index) {
        return getMusicTrackListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder getMusicTrackListOrBuilder(
          int index) {
        if (musicTrackListBuilder_ == null) {
          return musicTrackList_.get(index);  } else {
          return musicTrackListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
           getMusicTrackListOrBuilderList() {
        if (musicTrackListBuilder_ != null) {
          return musicTrackListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(musicTrackList_);
        }
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder addMusicTrackListBuilder() {
        return getMusicTrackListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder addMusicTrackListBuilder(
          int index) {
        return getMusicTrackListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.getDefaultInstance());
      }
      /**
       * <code>repeated .UgcMusicTrack music_track_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder> 
           getMusicTrackListBuilderList() {
        return getMusicTrackListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder> 
          getMusicTrackListFieldBuilder() {
        if (musicTrackListBuilder_ == null) {
          musicTrackListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrack.Builder, emu.grasscutter.net.proto.UgcMusicTrackOuterClass.UgcMusicTrackOrBuilder>(
                  musicTrackList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          musicTrackList_ = null;
        }
        return musicTrackListBuilder_;
      }

      private int musicId_ ;
      /**
       * <code>uint32 music_id = 12;</code>
       * @return The musicId.
       */
      @java.lang.Override
      public int getMusicId() {
        return musicId_;
      }
      /**
       * <code>uint32 music_id = 12;</code>
       * @param value The musicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicId(int value) {

        musicId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        musicId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UgcMusicRecord)
    }

    // @@protoc_insertion_point(class_scope:UgcMusicRecord)
    private static final emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord();
    }

    public static emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcMusicRecord>
        PARSER = new com.google.protobuf.AbstractParser<UgcMusicRecord>() {
      @java.lang.Override
      public UgcMusicRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<UgcMusicRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcMusicRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicRecordOuterClass.UgcMusicRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcMusicRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcMusicRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024UgcMusicRecord.proto\032\023UgcMusicTrack.pr" +
      "oto\"L\n\016UgcMusicRecord\022(\n\020music_track_lis" +
      "t\030\016 \003(\0132\016.UgcMusicTrack\022\020\n\010music_id\030\014 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.UgcMusicTrackOuterClass.getDescriptor(),
        });
    internal_static_UgcMusicRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcMusicRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcMusicRecord_descriptor,
        new java.lang.String[] { "MusicTrackList", "MusicId", });
    emu.grasscutter.net.proto.UgcMusicTrackOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
