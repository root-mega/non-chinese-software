// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeGetQueueDataRsp.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ForgeGetQueueDataRspOuterClass {
  private ForgeGetQueueDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeGetQueueDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeGetQueueDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_queue_num = 3;</code>
     * @return The maxQueueNum.
     */
    int getMaxQueueNum();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    int getForgeQueueMapCount();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    boolean containsForgeQueueMap(
        int key);
    /**
     * Use {@link #getForgeQueueMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    getForgeQueueMap();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    getForgeQueueMapMap();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue);
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 9429
   * Obf: HOLCPCEMEMI
   * </pre>
   *
   * Protobuf type {@code ForgeGetQueueDataRsp}
   */
  public static final class ForgeGetQueueDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeGetQueueDataRsp)
      ForgeGetQueueDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeGetQueueDataRsp.newBuilder() to construct.
    private ForgeGetQueueDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeGetQueueDataRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeGetQueueDataRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 12:
          return internalGetForgeQueueMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.class, emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.Builder.class);
    }

    public static final int MAX_QUEUE_NUM_FIELD_NUMBER = 3;
    private int maxQueueNum_ = 0;
    /**
     * <code>uint32 max_queue_num = 3;</code>
     * @return The maxQueueNum.
     */
    @java.lang.Override
    public int getMaxQueueNum() {
      return maxQueueNum_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FORGE_QUEUE_MAP_FIELD_NUMBER = 12;
    private static final class ForgeQueueMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>newDefaultInstance(
                  emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    internalGetForgeQueueMap() {
      if (forgeQueueMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ForgeQueueMapDefaultEntryHolder.defaultEntry);
      }
      return forgeQueueMap_;
    }
    public int getForgeQueueMapCount() {
      return internalGetForgeQueueMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    @java.lang.Override
    public boolean containsForgeQueueMap(
        int key) {

      return internalGetForgeQueueMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getForgeQueueMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
      return getForgeQueueMapMap();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
      return internalGetForgeQueueMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
          internalGetForgeQueueMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
          internalGetForgeQueueMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (maxQueueNum_ != 0) {
        output.writeUInt32(3, maxQueueNum_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetForgeQueueMap(),
          ForgeQueueMapDefaultEntryHolder.defaultEntry,
          12);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxQueueNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxQueueNum_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> entry
           : internalGetForgeQueueMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
        forgeQueueMap__ = ForgeQueueMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, forgeQueueMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp other = (emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp) obj;

      if (getMaxQueueNum()
          != other.getMaxQueueNum()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetForgeQueueMap().equals(
          other.internalGetForgeQueueMap())) return false;
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
      hash = (37 * hash) + MAX_QUEUE_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getMaxQueueNum();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (!internalGetForgeQueueMap().getMap().isEmpty()) {
        hash = (37 * hash) + FORGE_QUEUE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetForgeQueueMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp prototype) {
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
     * CmdId: 9429
     * Obf: HOLCPCEMEMI
     * </pre>
     *
     * Protobuf type {@code ForgeGetQueueDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeGetQueueDataRsp)
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
          int number) {
        switch (number) {
          case 12:
            return internalGetForgeQueueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableForgeQueueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.class, emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.newBuilder()
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
        maxQueueNum_ = 0;
        retcode_ = 0;
        internalGetMutableForgeQueueMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp build() {
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp buildPartial() {
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp result = new emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maxQueueNum_ = maxQueueNum_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.forgeQueueMap_ = internalGetForgeQueueMap().build(ForgeQueueMapDefaultEntryHolder.defaultEntry);
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
        if (other instanceof emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp other) {
        if (other == emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.getDefaultInstance()) return this;
        if (other.getMaxQueueNum() != 0) {
          setMaxQueueNum(other.getMaxQueueNum());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableForgeQueueMap().mergeFrom(
            other.internalGetForgeQueueMap());
        bitField0_ |= 0x00000004;
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
                maxQueueNum_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 98: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
                forgeQueueMap__ = input.readMessage(
                    ForgeQueueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableForgeQueueMap().ensureBuilderMap().put(
                    forgeQueueMap__.getKey(), forgeQueueMap__.getValue());
                bitField0_ |= 0x00000004;
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

      private int maxQueueNum_ ;
      /**
       * <code>uint32 max_queue_num = 3;</code>
       * @return The maxQueueNum.
       */
      @java.lang.Override
      public int getMaxQueueNum() {
        return maxQueueNum_;
      }
      /**
       * <code>uint32 max_queue_num = 3;</code>
       * @param value The maxQueueNum to set.
       * @return This builder for chaining.
       */
      public Builder setMaxQueueNum(int value) {

        maxQueueNum_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_queue_num = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxQueueNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maxQueueNum_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
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
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private static final class ForgeQueueMapConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> {
        @java.lang.Override
        public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData build(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder val) {
          if (val instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) { return (emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) val; }
          return ((emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder) val).build();
        }

        @java.lang.Override
        public com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry() {
          return ForgeQueueMapDefaultEntryHolder.defaultEntry;
        }
      };
      private static final ForgeQueueMapConverter forgeQueueMapConverter = new ForgeQueueMapConverter();

      private com.google.protobuf.MapFieldBuilder<
          java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder> forgeQueueMap_;
      private com.google.protobuf.MapFieldBuilder<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder>
          internalGetForgeQueueMap() {
        if (forgeQueueMap_ == null) {
          return new com.google.protobuf.MapFieldBuilder<>(forgeQueueMapConverter);
        }
        return forgeQueueMap_;
      }
      private com.google.protobuf.MapFieldBuilder<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder>
          internalGetMutableForgeQueueMap() {
        if (forgeQueueMap_ == null) {
          forgeQueueMap_ = new com.google.protobuf.MapFieldBuilder<>(forgeQueueMapConverter);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return forgeQueueMap_;
      }
      public int getForgeQueueMapCount() {
        return internalGetForgeQueueMap().ensureBuilderMap().size();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      @java.lang.Override
      public boolean containsForgeQueueMap(
          int key) {

        return internalGetForgeQueueMap().ensureBuilderMap().containsKey(key);
      }
      /**
       * Use {@link #getForgeQueueMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
        return getForgeQueueMapMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
        return internalGetForgeQueueMap().getImmutableMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
          int key,
          /* nullable */
emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder> map = internalGetMutableForgeQueueMap().ensureBuilderMap();
        return map.containsKey(key) ? forgeQueueMapConverter.build(map.get(key)) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder> map = internalGetMutableForgeQueueMap().ensureBuilderMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return forgeQueueMapConverter.build(map.get(key));
      }
      public Builder clearForgeQueueMap() {
        bitField0_ = (bitField0_ & ~0x00000004);
        internalGetMutableForgeQueueMap().clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      public Builder removeForgeQueueMap(
          int key) {

        internalGetMutableForgeQueueMap().ensureBuilderMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
          getMutableForgeQueueMap() {
        bitField0_ |= 0x00000004;
        return internalGetMutableForgeQueueMap().ensureMessageMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      public Builder putForgeQueueMap(
          int key,
          emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableForgeQueueMap().ensureBuilderMap()
            .put(key, value);
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      public Builder putAllForgeQueueMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> values) {
        for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> e : values.entrySet()) {
          if (e.getKey() == null || e.getValue() == null) {
            throw new NullPointerException();
          }
        }
        internalGetMutableForgeQueueMap().ensureBuilderMap()
            .putAll(values);
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 12;</code>
       */
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder putForgeQueueMapBuilderIfAbsent(
          int key) {
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder> builderMap = internalGetMutableForgeQueueMap().ensureBuilderMap();
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder entry = builderMap.get(key);
        if (entry == null) {
          entry = emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.newBuilder();
          builderMap.put(key, entry);
        }
        if (entry instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) {
          entry = ((emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) entry).toBuilder();
          builderMap.put(key, entry);
        }
        return (emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder) entry;
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


      // @@protoc_insertion_point(builder_scope:ForgeGetQueueDataRsp)
    }

    // @@protoc_insertion_point(class_scope:ForgeGetQueueDataRsp)
    private static final emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp();
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeGetQueueDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<ForgeGetQueueDataRsp>() {
      @java.lang.Override
      public ForgeGetQueueDataRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ForgeGetQueueDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeGetQueueDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeGetQueueDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeGetQueueDataRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ForgeGetQueueDataRsp.proto\032\024ForgeQueue" +
      "Data.proto\"\310\001\n\024ForgeGetQueueDataRsp\022\025\n\rm" +
      "ax_queue_num\030\003 \001(\r\022\017\n\007retcode\030\013 \001(\005\022A\n\017f" +
      "orge_queue_map\030\014 \003(\0132(.ForgeGetQueueData" +
      "Rsp.ForgeQueueMapEntry\032E\n\022ForgeQueueMapE" +
      "ntry\022\013\n\003key\030\001 \001(\r\022\036\n\005value\030\002 \001(\0132\017.Forge" +
      "QueueData:\0028\001B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ForgeQueueDataOuterClass.getDescriptor(),
        });
    internal_static_ForgeGetQueueDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeGetQueueDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeGetQueueDataRsp_descriptor,
        new java.lang.String[] { "MaxQueueNum", "Retcode", "ForgeQueueMap", });
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor =
      internal_static_ForgeGetQueueDataRsp_descriptor.getNestedTypes().get(0);
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.ForgeQueueDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
