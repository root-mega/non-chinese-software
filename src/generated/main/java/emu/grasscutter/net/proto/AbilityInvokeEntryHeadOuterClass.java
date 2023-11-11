// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityInvokeEntryHead.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class AbilityInvokeEntryHeadOuterClass {
  private AbilityInvokeEntryHeadOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityInvokeEntryHeadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityInvokeEntryHead)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 instanced_ability_id = 5;</code>
     * @return The instancedAbilityId.
     */
    int getInstancedAbilityId();

    /**
     * <code>int32 modifier_config_local_id = 4;</code>
     * @return The modifierConfigLocalId.
     */
    int getModifierConfigLocalId();

    /**
     * <code>int32 local_id = 9;</code>
     * @return The localId.
     */
    int getLocalId();

    /**
     * <code>uint32 server_buff_uid = 7;</code>
     * @return The serverBuffUid.
     */
    int getServerBuffUid();

    /**
     * <code>uint32 instanced_modifier_id = 11;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>bool is_serverbuff_modifier = 12;</code>
     * @return The isServerbuffModifier.
     */
    boolean getIsServerbuffModifier();

    /**
     * <code>uint32 target_id = 8;</code>
     * @return The targetId.
     */
    int getTargetId();
  }
  /**
   * <pre>
   * Obf: JOJGDABCHAP
   * </pre>
   *
   * Protobuf type {@code AbilityInvokeEntryHead}
   */
  public static final class AbilityInvokeEntryHead extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityInvokeEntryHead)
      AbilityInvokeEntryHeadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityInvokeEntryHead.newBuilder() to construct.
    private AbilityInvokeEntryHead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityInvokeEntryHead() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityInvokeEntryHead();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.class, emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder.class);
    }

    public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 5;
    private int instancedAbilityId_ = 0;
    /**
     * <code>uint32 instanced_ability_id = 5;</code>
     * @return The instancedAbilityId.
     */
    @java.lang.Override
    public int getInstancedAbilityId() {
      return instancedAbilityId_;
    }

    public static final int MODIFIER_CONFIG_LOCAL_ID_FIELD_NUMBER = 4;
    private int modifierConfigLocalId_ = 0;
    /**
     * <code>int32 modifier_config_local_id = 4;</code>
     * @return The modifierConfigLocalId.
     */
    @java.lang.Override
    public int getModifierConfigLocalId() {
      return modifierConfigLocalId_;
    }

    public static final int LOCAL_ID_FIELD_NUMBER = 9;
    private int localId_ = 0;
    /**
     * <code>int32 local_id = 9;</code>
     * @return The localId.
     */
    @java.lang.Override
    public int getLocalId() {
      return localId_;
    }

    public static final int SERVER_BUFF_UID_FIELD_NUMBER = 7;
    private int serverBuffUid_ = 0;
    /**
     * <code>uint32 server_buff_uid = 7;</code>
     * @return The serverBuffUid.
     */
    @java.lang.Override
    public int getServerBuffUid() {
      return serverBuffUid_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 11;
    private int instancedModifierId_ = 0;
    /**
     * <code>uint32 instanced_modifier_id = 11;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 12;
    private boolean isServerbuffModifier_ = false;
    /**
     * <code>bool is_serverbuff_modifier = 12;</code>
     * @return The isServerbuffModifier.
     */
    @java.lang.Override
    public boolean getIsServerbuffModifier() {
      return isServerbuffModifier_;
    }

    public static final int TARGET_ID_FIELD_NUMBER = 8;
    private int targetId_ = 0;
    /**
     * <code>uint32 target_id = 8;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
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
      if (modifierConfigLocalId_ != 0) {
        output.writeInt32(4, modifierConfigLocalId_);
      }
      if (instancedAbilityId_ != 0) {
        output.writeUInt32(5, instancedAbilityId_);
      }
      if (serverBuffUid_ != 0) {
        output.writeUInt32(7, serverBuffUid_);
      }
      if (targetId_ != 0) {
        output.writeUInt32(8, targetId_);
      }
      if (localId_ != 0) {
        output.writeInt32(9, localId_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(11, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        output.writeBool(12, isServerbuffModifier_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (modifierConfigLocalId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, modifierConfigLocalId_);
      }
      if (instancedAbilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, instancedAbilityId_);
      }
      if (serverBuffUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, serverBuffUid_);
      }
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, targetId_);
      }
      if (localId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, localId_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isServerbuffModifier_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead other = (emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead) obj;

      if (getInstancedAbilityId()
          != other.getInstancedAbilityId()) return false;
      if (getModifierConfigLocalId()
          != other.getModifierConfigLocalId()) return false;
      if (getLocalId()
          != other.getLocalId()) return false;
      if (getServerBuffUid()
          != other.getServerBuffUid()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (getIsServerbuffModifier()
          != other.getIsServerbuffModifier()) return false;
      if (getTargetId()
          != other.getTargetId()) return false;
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
      hash = (37 * hash) + INSTANCED_ABILITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedAbilityId();
      hash = (37 * hash) + MODIFIER_CONFIG_LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModifierConfigLocalId();
      hash = (37 * hash) + LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLocalId();
      hash = (37 * hash) + SERVER_BUFF_UID_FIELD_NUMBER;
      hash = (53 * hash) + getServerBuffUid();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (37 * hash) + IS_SERVERBUFF_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerbuffModifier());
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead prototype) {
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
     * Obf: JOJGDABCHAP
     * </pre>
     *
     * Protobuf type {@code AbilityInvokeEntryHead}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityInvokeEntryHead)
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.class, emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.newBuilder()
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
        instancedAbilityId_ = 0;
        modifierConfigLocalId_ = 0;
        localId_ = 0;
        serverBuffUid_ = 0;
        instancedModifierId_ = 0;
        isServerbuffModifier_ = false;
        targetId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead build() {
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead buildPartial() {
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead result = new emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.instancedAbilityId_ = instancedAbilityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.modifierConfigLocalId_ = modifierConfigLocalId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.localId_ = localId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.serverBuffUid_ = serverBuffUid_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.instancedModifierId_ = instancedModifierId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isServerbuffModifier_ = isServerbuffModifier_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.targetId_ = targetId_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead other) {
        if (other == emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance()) return this;
        if (other.getInstancedAbilityId() != 0) {
          setInstancedAbilityId(other.getInstancedAbilityId());
        }
        if (other.getModifierConfigLocalId() != 0) {
          setModifierConfigLocalId(other.getModifierConfigLocalId());
        }
        if (other.getLocalId() != 0) {
          setLocalId(other.getLocalId());
        }
        if (other.getServerBuffUid() != 0) {
          setServerBuffUid(other.getServerBuffUid());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.getIsServerbuffModifier() != false) {
          setIsServerbuffModifier(other.getIsServerbuffModifier());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
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
              case 32: {
                modifierConfigLocalId_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                instancedAbilityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 56: {
                serverBuffUid_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 56
              case 64: {
                targetId_ = input.readUInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 64
              case 72: {
                localId_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 88: {
                instancedModifierId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 88
              case 96: {
                isServerbuffModifier_ = input.readBool();
                bitField0_ |= 0x00000020;
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

      private int instancedAbilityId_ ;
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @return The instancedAbilityId.
       */
      @java.lang.Override
      public int getInstancedAbilityId() {
        return instancedAbilityId_;
      }
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @param value The instancedAbilityId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedAbilityId(int value) {

        instancedAbilityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedAbilityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        instancedAbilityId_ = 0;
        onChanged();
        return this;
      }

      private int modifierConfigLocalId_ ;
      /**
       * <code>int32 modifier_config_local_id = 4;</code>
       * @return The modifierConfigLocalId.
       */
      @java.lang.Override
      public int getModifierConfigLocalId() {
        return modifierConfigLocalId_;
      }
      /**
       * <code>int32 modifier_config_local_id = 4;</code>
       * @param value The modifierConfigLocalId to set.
       * @return This builder for chaining.
       */
      public Builder setModifierConfigLocalId(int value) {

        modifierConfigLocalId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 modifier_config_local_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearModifierConfigLocalId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        modifierConfigLocalId_ = 0;
        onChanged();
        return this;
      }

      private int localId_ ;
      /**
       * <code>int32 local_id = 9;</code>
       * @return The localId.
       */
      @java.lang.Override
      public int getLocalId() {
        return localId_;
      }
      /**
       * <code>int32 local_id = 9;</code>
       * @param value The localId to set.
       * @return This builder for chaining.
       */
      public Builder setLocalId(int value) {

        localId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 local_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocalId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        localId_ = 0;
        onChanged();
        return this;
      }

      private int serverBuffUid_ ;
      /**
       * <code>uint32 server_buff_uid = 7;</code>
       * @return The serverBuffUid.
       */
      @java.lang.Override
      public int getServerBuffUid() {
        return serverBuffUid_;
      }
      /**
       * <code>uint32 server_buff_uid = 7;</code>
       * @param value The serverBuffUid to set.
       * @return This builder for chaining.
       */
      public Builder setServerBuffUid(int value) {

        serverBuffUid_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_buff_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerBuffUid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        serverBuffUid_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 11;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 11;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {

        instancedModifierId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private boolean isServerbuffModifier_ ;
      /**
       * <code>bool is_serverbuff_modifier = 12;</code>
       * @return The isServerbuffModifier.
       */
      @java.lang.Override
      public boolean getIsServerbuffModifier() {
        return isServerbuffModifier_;
      }
      /**
       * <code>bool is_serverbuff_modifier = 12;</code>
       * @param value The isServerbuffModifier to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerbuffModifier(boolean value) {

        isServerbuffModifier_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_serverbuff_modifier = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerbuffModifier() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isServerbuffModifier_ = false;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 8;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 8;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {

        targetId_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        targetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityInvokeEntryHead)
    }

    // @@protoc_insertion_point(class_scope:AbilityInvokeEntryHead)
    private static final emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead();
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityInvokeEntryHead>
        PARSER = new com.google.protobuf.AbstractParser<AbilityInvokeEntryHead>() {
      @java.lang.Override
      public AbilityInvokeEntryHead parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityInvokeEntryHead> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityInvokeEntryHead> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvokeEntryHead_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvokeEntryHead_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AbilityInvokeEntryHead.proto\"\325\001\n\026Abili" +
      "tyInvokeEntryHead\022\034\n\024instanced_ability_i" +
      "d\030\005 \001(\r\022 \n\030modifier_config_local_id\030\004 \001(" +
      "\005\022\020\n\010local_id\030\t \001(\005\022\027\n\017server_buff_uid\030\007" +
      " \001(\r\022\035\n\025instanced_modifier_id\030\013 \001(\r\022\036\n\026i" +
      "s_serverbuff_modifier\030\014 \001(\010\022\021\n\ttarget_id" +
      "\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityInvokeEntryHead_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityInvokeEntryHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvokeEntryHead_descriptor,
        new java.lang.String[] { "InstancedAbilityId", "ModifierConfigLocalId", "LocalId", "ServerBuffUid", "InstancedModifierId", "IsServerbuffModifier", "TargetId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
