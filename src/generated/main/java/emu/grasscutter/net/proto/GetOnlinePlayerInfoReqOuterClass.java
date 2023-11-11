// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetOnlinePlayerInfoReq.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class GetOnlinePlayerInfoReqOuterClass {
  private GetOnlinePlayerInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetOnlinePlayerInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetOnlinePlayerInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_online_id = 7;</code>
     * @return The isOnlineId.
     */
    boolean getIsOnlineId();

    /**
     * <code>uint32 target_uid = 3;</code>
     * @return Whether the targetUid field is set.
     */
    boolean hasTargetUid();
    /**
     * <code>uint32 target_uid = 3;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>string online_id = 11;</code>
     * @return Whether the onlineId field is set.
     */
    boolean hasOnlineId();
    /**
     * <code>string online_id = 11;</code>
     * @return The onlineId.
     */
    java.lang.String getOnlineId();
    /**
     * <code>string online_id = 11;</code>
     * @return The bytes for onlineId.
     */
    com.google.protobuf.ByteString
        getOnlineIdBytes();

    /**
     * <code>string psn_id = 4;</code>
     * @return Whether the psnId field is set.
     */
    boolean hasPsnId();
    /**
     * <code>string psn_id = 4;</code>
     * @return The psnId.
     */
    java.lang.String getPsnId();
    /**
     * <code>string psn_id = 4;</code>
     * @return The bytes for psnId.
     */
    com.google.protobuf.ByteString
        getPsnIdBytes();

    emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.PlayerIdCase getPlayerIdCase();
  }
  /**
   * <pre>
   * CmdId: 21665
   * Obf: DNNMIGPCKOH
   * </pre>
   *
   * Protobuf type {@code GetOnlinePlayerInfoReq}
   */
  public static final class GetOnlinePlayerInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetOnlinePlayerInfoReq)
      GetOnlinePlayerInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetOnlinePlayerInfoReq.newBuilder() to construct.
    private GetOnlinePlayerInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetOnlinePlayerInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetOnlinePlayerInfoReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.internal_static_GetOnlinePlayerInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.internal_static_GetOnlinePlayerInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.class, emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.Builder.class);
    }

    private int playerIdCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object playerId_;
    public enum PlayerIdCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      TARGET_UID(3),
      ONLINE_ID(11),
      PSN_ID(4),
      PLAYERID_NOT_SET(0);
      private final int value;
      private PlayerIdCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static PlayerIdCase valueOf(int value) {
        return forNumber(value);
      }

      public static PlayerIdCase forNumber(int value) {
        switch (value) {
          case 3: return TARGET_UID;
          case 11: return ONLINE_ID;
          case 4: return PSN_ID;
          case 0: return PLAYERID_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public PlayerIdCase
    getPlayerIdCase() {
      return PlayerIdCase.forNumber(
          playerIdCase_);
    }

    public static final int IS_ONLINE_ID_FIELD_NUMBER = 7;
    private boolean isOnlineId_ = false;
    /**
     * <code>bool is_online_id = 7;</code>
     * @return The isOnlineId.
     */
    @java.lang.Override
    public boolean getIsOnlineId() {
      return isOnlineId_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 3;
    /**
     * <code>uint32 target_uid = 3;</code>
     * @return Whether the targetUid field is set.
     */
    @java.lang.Override
    public boolean hasTargetUid() {
      return playerIdCase_ == 3;
    }
    /**
     * <code>uint32 target_uid = 3;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      if (playerIdCase_ == 3) {
        return (java.lang.Integer) playerId_;
      }
      return 0;
    }

    public static final int ONLINE_ID_FIELD_NUMBER = 11;
    /**
     * <code>string online_id = 11;</code>
     * @return Whether the onlineId field is set.
     */
    public boolean hasOnlineId() {
      return playerIdCase_ == 11;
    }
    /**
     * <code>string online_id = 11;</code>
     * @return The onlineId.
     */
    public java.lang.String getOnlineId() {
      java.lang.Object ref = "";
      if (playerIdCase_ == 11) {
        ref = playerId_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (playerIdCase_ == 11) {
          playerId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string online_id = 11;</code>
     * @return The bytes for onlineId.
     */
    public com.google.protobuf.ByteString
        getOnlineIdBytes() {
      java.lang.Object ref = "";
      if (playerIdCase_ == 11) {
        ref = playerId_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (playerIdCase_ == 11) {
          playerId_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PSN_ID_FIELD_NUMBER = 4;
    /**
     * <code>string psn_id = 4;</code>
     * @return Whether the psnId field is set.
     */
    public boolean hasPsnId() {
      return playerIdCase_ == 4;
    }
    /**
     * <code>string psn_id = 4;</code>
     * @return The psnId.
     */
    public java.lang.String getPsnId() {
      java.lang.Object ref = "";
      if (playerIdCase_ == 4) {
        ref = playerId_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (playerIdCase_ == 4) {
          playerId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string psn_id = 4;</code>
     * @return The bytes for psnId.
     */
    public com.google.protobuf.ByteString
        getPsnIdBytes() {
      java.lang.Object ref = "";
      if (playerIdCase_ == 4) {
        ref = playerId_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (playerIdCase_ == 4) {
          playerId_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (playerIdCase_ == 3) {
        output.writeUInt32(
            3, (int)((java.lang.Integer) playerId_));
      }
      if (playerIdCase_ == 4) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, playerId_);
      }
      if (isOnlineId_ != false) {
        output.writeBool(7, isOnlineId_);
      }
      if (playerIdCase_ == 11) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, playerId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerIdCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              3, (int)((java.lang.Integer) playerId_));
      }
      if (playerIdCase_ == 4) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, playerId_);
      }
      if (isOnlineId_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isOnlineId_);
      }
      if (playerIdCase_ == 11) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, playerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq other = (emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq) obj;

      if (getIsOnlineId()
          != other.getIsOnlineId()) return false;
      if (!getPlayerIdCase().equals(other.getPlayerIdCase())) return false;
      switch (playerIdCase_) {
        case 3:
          if (getTargetUid()
              != other.getTargetUid()) return false;
          break;
        case 11:
          if (!getOnlineId()
              .equals(other.getOnlineId())) return false;
          break;
        case 4:
          if (!getPsnId()
              .equals(other.getPsnId())) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + IS_ONLINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOnlineId());
      switch (playerIdCase_) {
        case 3:
          hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
          hash = (53 * hash) + getTargetUid();
          break;
        case 11:
          hash = (37 * hash) + ONLINE_ID_FIELD_NUMBER;
          hash = (53 * hash) + getOnlineId().hashCode();
          break;
        case 4:
          hash = (37 * hash) + PSN_ID_FIELD_NUMBER;
          hash = (53 * hash) + getPsnId().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq prototype) {
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
     * CmdId: 21665
     * Obf: DNNMIGPCKOH
     * </pre>
     *
     * Protobuf type {@code GetOnlinePlayerInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetOnlinePlayerInfoReq)
        emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.internal_static_GetOnlinePlayerInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.internal_static_GetOnlinePlayerInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.class, emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.newBuilder()
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
        isOnlineId_ = false;
        playerIdCase_ = 0;
        playerId_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.internal_static_GetOnlinePlayerInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq build() {
        emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq buildPartial() {
        emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq result = new emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOnlineId_ = isOnlineId_;
        }
      }

      private void buildPartialOneofs(emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq result) {
        result.playerIdCase_ = playerIdCase_;
        result.playerId_ = this.playerId_;
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
        if (other instanceof emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq other) {
        if (other == emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq.getDefaultInstance()) return this;
        if (other.getIsOnlineId() != false) {
          setIsOnlineId(other.getIsOnlineId());
        }
        switch (other.getPlayerIdCase()) {
          case TARGET_UID: {
            setTargetUid(other.getTargetUid());
            break;
          }
          case ONLINE_ID: {
            playerIdCase_ = 11;
            playerId_ = other.playerId_;
            onChanged();
            break;
          }
          case PSN_ID: {
            playerIdCase_ = 4;
            playerId_ = other.playerId_;
            onChanged();
            break;
          }
          case PLAYERID_NOT_SET: {
            break;
          }
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
                playerId_ = input.readUInt32();
                playerIdCase_ = 3;
                break;
              } // case 24
              case 34: {
                java.lang.String s = input.readStringRequireUtf8();
                playerIdCase_ = 4;
                playerId_ = s;
                break;
              } // case 34
              case 56: {
                isOnlineId_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 90: {
                java.lang.String s = input.readStringRequireUtf8();
                playerIdCase_ = 11;
                playerId_ = s;
                break;
              } // case 90
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
      private int playerIdCase_ = 0;
      private java.lang.Object playerId_;
      public PlayerIdCase
          getPlayerIdCase() {
        return PlayerIdCase.forNumber(
            playerIdCase_);
      }

      public Builder clearPlayerId() {
        playerIdCase_ = 0;
        playerId_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private boolean isOnlineId_ ;
      /**
       * <code>bool is_online_id = 7;</code>
       * @return The isOnlineId.
       */
      @java.lang.Override
      public boolean getIsOnlineId() {
        return isOnlineId_;
      }
      /**
       * <code>bool is_online_id = 7;</code>
       * @param value The isOnlineId to set.
       * @return This builder for chaining.
       */
      public Builder setIsOnlineId(boolean value) {

        isOnlineId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_online_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOnlineId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOnlineId_ = false;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 target_uid = 3;</code>
       * @return Whether the targetUid field is set.
       */
      public boolean hasTargetUid() {
        return playerIdCase_ == 3;
      }
      /**
       * <code>uint32 target_uid = 3;</code>
       * @return The targetUid.
       */
      public int getTargetUid() {
        if (playerIdCase_ == 3) {
          return (java.lang.Integer) playerId_;
        }
        return 0;
      }
      /**
       * <code>uint32 target_uid = 3;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {

        playerIdCase_ = 3;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        if (playerIdCase_ == 3) {
          playerIdCase_ = 0;
          playerId_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>string online_id = 11;</code>
       * @return Whether the onlineId field is set.
       */
      @java.lang.Override
      public boolean hasOnlineId() {
        return playerIdCase_ == 11;
      }
      /**
       * <code>string online_id = 11;</code>
       * @return The onlineId.
       */
      @java.lang.Override
      public java.lang.String getOnlineId() {
        java.lang.Object ref = "";
        if (playerIdCase_ == 11) {
          ref = playerId_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (playerIdCase_ == 11) {
            playerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string online_id = 11;</code>
       * @return The bytes for onlineId.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getOnlineIdBytes() {
        java.lang.Object ref = "";
        if (playerIdCase_ == 11) {
          ref = playerId_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (playerIdCase_ == 11) {
            playerId_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string online_id = 11;</code>
       * @param value The onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        playerIdCase_ = 11;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnlineId() {
        if (playerIdCase_ == 11) {
          playerIdCase_ = 0;
          playerId_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string online_id = 11;</code>
       * @param value The bytes for onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        playerIdCase_ = 11;
        playerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>string psn_id = 4;</code>
       * @return Whether the psnId field is set.
       */
      @java.lang.Override
      public boolean hasPsnId() {
        return playerIdCase_ == 4;
      }
      /**
       * <code>string psn_id = 4;</code>
       * @return The psnId.
       */
      @java.lang.Override
      public java.lang.String getPsnId() {
        java.lang.Object ref = "";
        if (playerIdCase_ == 4) {
          ref = playerId_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (playerIdCase_ == 4) {
            playerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string psn_id = 4;</code>
       * @return The bytes for psnId.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPsnIdBytes() {
        java.lang.Object ref = "";
        if (playerIdCase_ == 4) {
          ref = playerId_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (playerIdCase_ == 4) {
            playerId_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string psn_id = 4;</code>
       * @param value The psnId to set.
       * @return This builder for chaining.
       */
      public Builder setPsnId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        playerIdCase_ = 4;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string psn_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPsnId() {
        if (playerIdCase_ == 4) {
          playerIdCase_ = 0;
          playerId_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string psn_id = 4;</code>
       * @param value The bytes for psnId to set.
       * @return This builder for chaining.
       */
      public Builder setPsnIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        playerIdCase_ = 4;
        playerId_ = value;
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


      // @@protoc_insertion_point(builder_scope:GetOnlinePlayerInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetOnlinePlayerInfoReq)
    private static final emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq();
    }

    public static emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetOnlinePlayerInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetOnlinePlayerInfoReq>() {
      @java.lang.Override
      public GetOnlinePlayerInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetOnlinePlayerInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetOnlinePlayerInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetOnlinePlayerInfoReqOuterClass.GetOnlinePlayerInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetOnlinePlayerInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetOnlinePlayerInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetOnlinePlayerInfoReq.proto\"x\n\026GetOnl" +
      "inePlayerInfoReq\022\024\n\014is_online_id\030\007 \001(\010\022\024" +
      "\n\ntarget_uid\030\003 \001(\rH\000\022\023\n\tonline_id\030\013 \001(\tH" +
      "\000\022\020\n\006psn_id\030\004 \001(\tH\000B\013\n\tplayer_idB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetOnlinePlayerInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetOnlinePlayerInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetOnlinePlayerInfoReq_descriptor,
        new java.lang.String[] { "IsOnlineId", "TargetUid", "OnlineId", "PsnId", "PlayerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
