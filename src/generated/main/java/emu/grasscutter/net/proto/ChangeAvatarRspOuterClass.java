// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeAvatarRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ChangeAvatarRspOuterClass {
  private ChangeAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 cur_guid = 2;</code>
     * @return The curGuid.
     */
    long getCurGuid();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * <pre>
   * CmdId: 22163
   * Obf: DPMLHHKHGFF
   * </pre>
   *
   * Protobuf type {@code ChangeAvatarRsp}
   */
  public static final class ChangeAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeAvatarRsp)
      ChangeAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeAvatarRsp.newBuilder() to construct.
    private ChangeAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeAvatarRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeAvatarRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.internal_static_ChangeAvatarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.internal_static_ChangeAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.class, emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.Builder.class);
    }

    public static final int CUR_GUID_FIELD_NUMBER = 2;
    private long curGuid_ = 0L;
    /**
     * <code>uint64 cur_guid = 2;</code>
     * @return The curGuid.
     */
    @java.lang.Override
    public long getCurGuid() {
      return curGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 9;
    private int skillId_ = 0;
    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (curGuid_ != 0L) {
        output.writeUInt64(2, curGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(9, skillId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, curGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, skillId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp other = (emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp) obj;

      if (getCurGuid()
          != other.getCurGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + CUR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp prototype) {
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
     * CmdId: 22163
     * Obf: DPMLHHKHGFF
     * </pre>
     *
     * Protobuf type {@code ChangeAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeAvatarRsp)
        emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.internal_static_ChangeAvatarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.internal_static_ChangeAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.class, emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.newBuilder()
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
        curGuid_ = 0L;
        retcode_ = 0;
        skillId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.internal_static_ChangeAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp build() {
        emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp buildPartial() {
        emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp result = new emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curGuid_ = curGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.skillId_ = skillId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp other) {
        if (other == emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp.getDefaultInstance()) return this;
        if (other.getCurGuid() != 0L) {
          setCurGuid(other.getCurGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
              case 16: {
                curGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 72: {
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
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

      private long curGuid_ ;
      /**
       * <code>uint64 cur_guid = 2;</code>
       * @return The curGuid.
       */
      @java.lang.Override
      public long getCurGuid() {
        return curGuid_;
      }
      /**
       * <code>uint64 cur_guid = 2;</code>
       * @param value The curGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurGuid(long value) {

        curGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {

        skillId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:ChangeAvatarRsp)
    private static final emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp();
    }

    public static emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChangeAvatarRsp>() {
      @java.lang.Override
      public ChangeAvatarRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChangeAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeAvatarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ChangeAvatarRsp.proto\"F\n\017ChangeAvatarR" +
      "sp\022\020\n\010cur_guid\030\002 \001(\004\022\017\n\007retcode\030\004 \001(\005\022\020\n" +
      "\010skill_id\030\t \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeAvatarRsp_descriptor,
        new java.lang.String[] { "CurGuid", "Retcode", "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
