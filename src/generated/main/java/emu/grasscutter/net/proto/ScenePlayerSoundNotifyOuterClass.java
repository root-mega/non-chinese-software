// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerSoundNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ScenePlayerSoundNotifyOuterClass {
  private ScenePlayerSoundNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerSoundNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerSoundNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector play_pos = 15;</code>
     * @return Whether the playPos field is set.
     */
    boolean hasPlayPos();
    /**
     * <code>.Vector play_pos = 15;</code>
     * @return The playPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPlayPos();
    /**
     * <code>.Vector play_pos = 15;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder();

    /**
     * <code>string sound_name = 1;</code>
     * @return The soundName.
     */
    java.lang.String getSoundName();
    /**
     * <code>string sound_name = 1;</code>
     * @return The bytes for soundName.
     */
    com.google.protobuf.ByteString
        getSoundNameBytes();

    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
     * @return The enum numeric value on the wire for playType.
     */
    int getPlayTypeValue();
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
     * @return The playType.
     */
    emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType();
  }
  /**
   * <pre>
   * CmdId: 20293
   * Obf: JBEGDKFLHPL
   * </pre>
   *
   * Protobuf type {@code ScenePlayerSoundNotify}
   */
  public static final class ScenePlayerSoundNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerSoundNotify)
      ScenePlayerSoundNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerSoundNotify.newBuilder() to construct.
    private ScenePlayerSoundNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerSoundNotify() {
      soundName_ = "";
      playType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerSoundNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.class, emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.Builder.class);
    }

    /**
     * <pre>
     * Obf: NDMKCNLGDFN
     * </pre>
     *
     * Protobuf enum {@code ScenePlayerSoundNotify.PlaySoundType}
     */
    public enum PlaySoundType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PLAY_SOUND_NONE = 0;</code>
       */
      PLAY_SOUND_NONE(0),
      /**
       * <code>PLAY_SOUND_START = 1;</code>
       */
      PLAY_SOUND_START(1),
      /**
       * <code>PLAY_SOUND_STOP = 2;</code>
       */
      PLAY_SOUND_STOP(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>PLAY_SOUND_NONE = 0;</code>
       */
      public static final int PLAY_SOUND_NONE_VALUE = 0;
      /**
       * <code>PLAY_SOUND_START = 1;</code>
       */
      public static final int PLAY_SOUND_START_VALUE = 1;
      /**
       * <code>PLAY_SOUND_STOP = 2;</code>
       */
      public static final int PLAY_SOUND_STOP_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static PlaySoundType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PlaySoundType forNumber(int value) {
        switch (value) {
          case 0: return PLAY_SOUND_NONE;
          case 1: return PLAY_SOUND_START;
          case 2: return PLAY_SOUND_STOP;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PlaySoundType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PlaySoundType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PlaySoundType>() {
              public PlaySoundType findValueByNumber(int number) {
                return PlaySoundType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final PlaySoundType[] VALUES = values();

      public static PlaySoundType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private PlaySoundType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ScenePlayerSoundNotify.PlaySoundType)
    }

    private int bitField0_;
    public static final int PLAY_POS_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector playPos_;
    /**
     * <code>.Vector play_pos = 15;</code>
     * @return Whether the playPos field is set.
     */
    @java.lang.Override
    public boolean hasPlayPos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Vector play_pos = 15;</code>
     * @return The playPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPlayPos() {
      return playPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
    }
    /**
     * <code>.Vector play_pos = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder() {
      return playPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
    }

    public static final int SOUND_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object soundName_ = "";
    /**
     * <code>string sound_name = 1;</code>
     * @return The soundName.
     */
    @java.lang.Override
    public java.lang.String getSoundName() {
      java.lang.Object ref = soundName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        soundName_ = s;
        return s;
      }
    }
    /**
     * <code>string sound_name = 1;</code>
     * @return The bytes for soundName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSoundNameBytes() {
      java.lang.Object ref = soundName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        soundName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PLAY_TYPE_FIELD_NUMBER = 11;
    private int playType_ = 0;
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
     * @return The enum numeric value on the wire for playType.
     */
    @java.lang.Override public int getPlayTypeValue() {
      return playType_;
    }
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
     * @return The playType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType() {
      emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType result = emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.forNumber(playType_);
      return result == null ? emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.UNRECOGNIZED : result;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(soundName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, soundName_);
      }
      if (playType_ != emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.PLAY_SOUND_NONE.getNumber()) {
        output.writeEnum(11, playType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(15, getPlayPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(soundName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, soundName_);
      }
      if (playType_ != emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.PLAY_SOUND_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, playType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getPlayPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify other = (emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify) obj;

      if (hasPlayPos() != other.hasPlayPos()) return false;
      if (hasPlayPos()) {
        if (!getPlayPos()
            .equals(other.getPlayPos())) return false;
      }
      if (!getSoundName()
          .equals(other.getSoundName())) return false;
      if (playType_ != other.playType_) return false;
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
      if (hasPlayPos()) {
        hash = (37 * hash) + PLAY_POS_FIELD_NUMBER;
        hash = (53 * hash) + getPlayPos().hashCode();
      }
      hash = (37 * hash) + SOUND_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getSoundName().hashCode();
      hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + playType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify prototype) {
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
     * CmdId: 20293
     * Obf: JBEGDKFLHPL
     * </pre>
     *
     * Protobuf type {@code ScenePlayerSoundNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerSoundNotify)
        emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.class, emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.newBuilder()
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
          getPlayPosFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        playPos_ = null;
        if (playPosBuilder_ != null) {
          playPosBuilder_.dispose();
          playPosBuilder_ = null;
        }
        soundName_ = "";
        playType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify build() {
        emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify buildPartial() {
        emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify result = new emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.playPos_ = playPosBuilder_ == null
              ? playPos_
              : playPosBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.soundName_ = soundName_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.playType_ = playType_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify other) {
        if (other == emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDefaultInstance()) return this;
        if (other.hasPlayPos()) {
          mergePlayPos(other.getPlayPos());
        }
        if (!other.getSoundName().isEmpty()) {
          soundName_ = other.soundName_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.playType_ != 0) {
          setPlayTypeValue(other.getPlayTypeValue());
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
              case 10: {
                soundName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
              case 88: {
                playType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 122: {
                input.readMessage(
                    getPlayPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 122
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector playPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> playPosBuilder_;
      /**
       * <code>.Vector play_pos = 15;</code>
       * @return Whether the playPos field is set.
       */
      public boolean hasPlayPos() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       * @return The playPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPlayPos() {
        if (playPosBuilder_ == null) {
          return playPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
        } else {
          return playPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public Builder setPlayPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (playPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playPos_ = value;
        } else {
          playPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public Builder setPlayPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (playPosBuilder_ == null) {
          playPos_ = builderForValue.build();
        } else {
          playPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public Builder mergePlayPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (playPosBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            playPos_ != null &&
            playPos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPlayPosBuilder().mergeFrom(value);
          } else {
            playPos_ = value;
          }
        } else {
          playPosBuilder_.mergeFrom(value);
        }
        if (playPos_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public Builder clearPlayPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playPos_ = null;
        if (playPosBuilder_ != null) {
          playPosBuilder_.dispose();
          playPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPlayPosBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPlayPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder() {
        if (playPosBuilder_ != null) {
          return playPosBuilder_.getMessageOrBuilder();
        } else {
          return playPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
        }
      }
      /**
       * <code>.Vector play_pos = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPlayPosFieldBuilder() {
        if (playPosBuilder_ == null) {
          playPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPlayPos(),
                  getParentForChildren(),
                  isClean());
          playPos_ = null;
        }
        return playPosBuilder_;
      }

      private java.lang.Object soundName_ = "";
      /**
       * <code>string sound_name = 1;</code>
       * @return The soundName.
       */
      public java.lang.String getSoundName() {
        java.lang.Object ref = soundName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          soundName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sound_name = 1;</code>
       * @return The bytes for soundName.
       */
      public com.google.protobuf.ByteString
          getSoundNameBytes() {
        java.lang.Object ref = soundName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          soundName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sound_name = 1;</code>
       * @param value The soundName to set.
       * @return This builder for chaining.
       */
      public Builder setSoundName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        soundName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string sound_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSoundName() {
        soundName_ = getDefaultInstance().getSoundName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string sound_name = 1;</code>
       * @param value The bytes for soundName to set.
       * @return This builder for chaining.
       */
      public Builder setSoundNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        soundName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int playType_ = 0;
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
       * @return The enum numeric value on the wire for playType.
       */
      @java.lang.Override public int getPlayTypeValue() {
        return playType_;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
       * @param value The enum numeric value on the wire for playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayTypeValue(int value) {
        playType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
       * @return The playType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType() {
        emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType result = emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.forNumber(playType_);
        return result == null ? emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
       * @param value The playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        playType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        playType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerSoundNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerSoundNotify)
    private static final emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify();
    }

    public static emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerSoundNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerSoundNotify>() {
      @java.lang.Override
      public ScenePlayerSoundNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScenePlayerSoundNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerSoundNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerSoundNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerSoundNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ScenePlayerSoundNotify.proto\032\014Vector.p" +
      "roto\"\322\001\n\026ScenePlayerSoundNotify\022\031\n\010play_" +
      "pos\030\017 \001(\0132\007.Vector\022\022\n\nsound_name\030\001 \001(\t\0228" +
      "\n\tplay_type\030\013 \001(\0162%.ScenePlayerSoundNoti" +
      "fy.PlaySoundType\"O\n\rPlaySoundType\022\023\n\017PLA" +
      "Y_SOUND_NONE\020\000\022\024\n\020PLAY_SOUND_START\020\001\022\023\n\017" +
      "PLAY_SOUND_STOP\020\002B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerSoundNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerSoundNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerSoundNotify_descriptor,
        new java.lang.String[] { "PlayPos", "SoundName", "PlayType", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
