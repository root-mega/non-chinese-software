// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeTransferReq.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class HomeTransferReqOuterClass {
  private HomeTransferReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeTransferReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeTransferReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>bool is_transfer_to_main_house_point = 5;</code>
     * @return The isTransferToMainHousePoint.
     */
    boolean getIsTransferToMainHousePoint();

    /**
     * <code>bool is_transfer_to_safe_point = 3;</code>
     * @return The isTransferToSafePoint.
     */
    boolean getIsTransferToSafePoint();
  }
  /**
   * <pre>
   * CmdId: 28287
   * Obf: LEOKBBDBAKN
   * </pre>
   *
   * Protobuf type {@code HomeTransferReq}
   */
  public static final class HomeTransferReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeTransferReq)
      HomeTransferReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeTransferReq.newBuilder() to construct.
    private HomeTransferReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeTransferReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeTransferReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeTransferReqOuterClass.internal_static_HomeTransferReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeTransferReqOuterClass.internal_static_HomeTransferReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.class, emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.Builder.class);
    }

    public static final int GUID_FIELD_NUMBER = 12;
    private int guid_ = 0;
    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int IS_TRANSFER_TO_MAIN_HOUSE_POINT_FIELD_NUMBER = 5;
    private boolean isTransferToMainHousePoint_ = false;
    /**
     * <code>bool is_transfer_to_main_house_point = 5;</code>
     * @return The isTransferToMainHousePoint.
     */
    @java.lang.Override
    public boolean getIsTransferToMainHousePoint() {
      return isTransferToMainHousePoint_;
    }

    public static final int IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER = 3;
    private boolean isTransferToSafePoint_ = false;
    /**
     * <code>bool is_transfer_to_safe_point = 3;</code>
     * @return The isTransferToSafePoint.
     */
    @java.lang.Override
    public boolean getIsTransferToSafePoint() {
      return isTransferToSafePoint_;
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
      if (isTransferToSafePoint_ != false) {
        output.writeBool(3, isTransferToSafePoint_);
      }
      if (isTransferToMainHousePoint_ != false) {
        output.writeBool(5, isTransferToMainHousePoint_);
      }
      if (guid_ != 0) {
        output.writeUInt32(12, guid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransferToSafePoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isTransferToSafePoint_);
      }
      if (isTransferToMainHousePoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isTransferToMainHousePoint_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq other = (emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq) obj;

      if (getGuid()
          != other.getGuid()) return false;
      if (getIsTransferToMainHousePoint()
          != other.getIsTransferToMainHousePoint()) return false;
      if (getIsTransferToSafePoint()
          != other.getIsTransferToSafePoint()) return false;
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
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + IS_TRANSFER_TO_MAIN_HOUSE_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferToMainHousePoint());
      hash = (37 * hash) + IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferToSafePoint());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq prototype) {
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
     * CmdId: 28287
     * Obf: LEOKBBDBAKN
     * </pre>
     *
     * Protobuf type {@code HomeTransferReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeTransferReq)
        emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeTransferReqOuterClass.internal_static_HomeTransferReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeTransferReqOuterClass.internal_static_HomeTransferReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.class, emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.newBuilder()
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
        guid_ = 0;
        isTransferToMainHousePoint_ = false;
        isTransferToSafePoint_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeTransferReqOuterClass.internal_static_HomeTransferReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq build() {
        emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq buildPartial() {
        emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq result = new emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isTransferToMainHousePoint_ = isTransferToMainHousePoint_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isTransferToSafePoint_ = isTransferToSafePoint_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq other) {
        if (other == emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq.getDefaultInstance()) return this;
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getIsTransferToMainHousePoint() != false) {
          setIsTransferToMainHousePoint(other.getIsTransferToMainHousePoint());
        }
        if (other.getIsTransferToSafePoint() != false) {
          setIsTransferToSafePoint(other.getIsTransferToSafePoint());
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
                isTransferToSafePoint_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                isTransferToMainHousePoint_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 96: {
                guid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int guid_ ;
      /**
       * <code>uint32 guid = 12;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {

        guid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guid_ = 0;
        onChanged();
        return this;
      }

      private boolean isTransferToMainHousePoint_ ;
      /**
       * <code>bool is_transfer_to_main_house_point = 5;</code>
       * @return The isTransferToMainHousePoint.
       */
      @java.lang.Override
      public boolean getIsTransferToMainHousePoint() {
        return isTransferToMainHousePoint_;
      }
      /**
       * <code>bool is_transfer_to_main_house_point = 5;</code>
       * @param value The isTransferToMainHousePoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferToMainHousePoint(boolean value) {

        isTransferToMainHousePoint_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_to_main_house_point = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferToMainHousePoint() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isTransferToMainHousePoint_ = false;
        onChanged();
        return this;
      }

      private boolean isTransferToSafePoint_ ;
      /**
       * <code>bool is_transfer_to_safe_point = 3;</code>
       * @return The isTransferToSafePoint.
       */
      @java.lang.Override
      public boolean getIsTransferToSafePoint() {
        return isTransferToSafePoint_;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 3;</code>
       * @param value The isTransferToSafePoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferToSafePoint(boolean value) {

        isTransferToSafePoint_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferToSafePoint() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isTransferToSafePoint_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeTransferReq)
    }

    // @@protoc_insertion_point(class_scope:HomeTransferReq)
    private static final emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq();
    }

    public static emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeTransferReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeTransferReq>() {
      @java.lang.Override
      public HomeTransferReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeTransferReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeTransferReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeTransferReqOuterClass.HomeTransferReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeTransferReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeTransferReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HomeTransferReq.proto\"k\n\017HomeTransferR" +
      "eq\022\014\n\004guid\030\014 \001(\r\022\'\n\037is_transfer_to_main_" +
      "house_point\030\005 \001(\010\022!\n\031is_transfer_to_safe" +
      "_point\030\003 \001(\010B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeTransferReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeTransferReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeTransferReq_descriptor,
        new java.lang.String[] { "Guid", "IsTransferToMainHousePoint", "IsTransferToSafePoint", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
