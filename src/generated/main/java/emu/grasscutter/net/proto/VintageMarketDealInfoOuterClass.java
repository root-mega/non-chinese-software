// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketDealInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class VintageMarketDealInfoOuterClass {
  private VintageMarketDealInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketDealInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketDealInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    int getTraderItemInfoMapCount();
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    boolean containsTraderItemInfoMap(
        int key);
    /**
     * Use {@link #getTraderItemInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
    getTraderItemInfoMap();
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
    getTraderItemInfoMapMap();
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo defaultValue);
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: FENNPDEALKC
   * </pre>
   *
   * Protobuf type {@code VintageMarketDealInfo}
   */
  public static final class VintageMarketDealInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketDealInfo)
      VintageMarketDealInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketDealInfo.newBuilder() to construct.
    private VintageMarketDealInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketDealInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketDealInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 7:
          return internalGetTraderItemInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.class, emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.Builder.class);
    }

    public static final int TRADER_ITEM_INFO_MAP_FIELD_NUMBER = 7;
    private static final class TraderItemInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> traderItemInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
    internalGetTraderItemInfoMap() {
      if (traderItemInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TraderItemInfoMapDefaultEntryHolder.defaultEntry);
      }
      return traderItemInfoMap_;
    }
    public int getTraderItemInfoMapCount() {
      return internalGetTraderItemInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    @java.lang.Override
    public boolean containsTraderItemInfoMap(
        int key) {

      return internalGetTraderItemInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTraderItemInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> getTraderItemInfoMap() {
      return getTraderItemInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> getTraderItemInfoMapMap() {
      return internalGetTraderItemInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo defaultValue) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> map =
          internalGetTraderItemInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> map =
          internalGetTraderItemInfoMap().getMap();
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetTraderItemInfoMap(),
          TraderItemInfoMapDefaultEntryHolder.defaultEntry,
          7);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> entry
           : internalGetTraderItemInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
        traderItemInfoMap__ = TraderItemInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, traderItemInfoMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo other = (emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo) obj;

      if (!internalGetTraderItemInfoMap().equals(
          other.internalGetTraderItemInfoMap())) return false;
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
      if (!internalGetTraderItemInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + TRADER_ITEM_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetTraderItemInfoMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo prototype) {
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
     * Obf: FENNPDEALKC
     * </pre>
     *
     * Protobuf type {@code VintageMarketDealInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketDealInfo)
        emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
          int number) {
        switch (number) {
          case 7:
            return internalGetTraderItemInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutableTraderItemInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.class, emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.newBuilder()
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
        internalGetMutableTraderItemInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.internal_static_VintageMarketDealInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo build() {
        emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo buildPartial() {
        emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo result = new emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.traderItemInfoMap_ = internalGetTraderItemInfoMap().build(TraderItemInfoMapDefaultEntryHolder.defaultEntry);
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo other) {
        if (other == emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo.getDefaultInstance()) return this;
        internalGetMutableTraderItemInfoMap().mergeFrom(
            other.internalGetTraderItemInfoMap());
        bitField0_ |= 0x00000001;
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
              case 58: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
                traderItemInfoMap__ = input.readMessage(
                    TraderItemInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableTraderItemInfoMap().ensureBuilderMap().put(
                    traderItemInfoMap__.getKey(), traderItemInfoMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 58
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

      private static final class TraderItemInfoMapConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> {
        @java.lang.Override
        public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo build(emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder val) {
          if (val instanceof emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) { return (emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) val; }
          return ((emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder) val).build();
        }

        @java.lang.Override
        public com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> defaultEntry() {
          return TraderItemInfoMapDefaultEntryHolder.defaultEntry;
        }
      };
      private static final TraderItemInfoMapConverter traderItemInfoMapConverter = new TraderItemInfoMapConverter();

      private com.google.protobuf.MapFieldBuilder<
          java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder> traderItemInfoMap_;
      private com.google.protobuf.MapFieldBuilder<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder>
          internalGetTraderItemInfoMap() {
        if (traderItemInfoMap_ == null) {
          return new com.google.protobuf.MapFieldBuilder<>(traderItemInfoMapConverter);
        }
        return traderItemInfoMap_;
      }
      private com.google.protobuf.MapFieldBuilder<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder>
          internalGetMutableTraderItemInfoMap() {
        if (traderItemInfoMap_ == null) {
          traderItemInfoMap_ = new com.google.protobuf.MapFieldBuilder<>(traderItemInfoMapConverter);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return traderItemInfoMap_;
      }
      public int getTraderItemInfoMapCount() {
        return internalGetTraderItemInfoMap().ensureBuilderMap().size();
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      @java.lang.Override
      public boolean containsTraderItemInfoMap(
          int key) {

        return internalGetTraderItemInfoMap().ensureBuilderMap().containsKey(key);
      }
      /**
       * Use {@link #getTraderItemInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> getTraderItemInfoMap() {
        return getTraderItemInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> getTraderItemInfoMapMap() {
        return internalGetTraderItemInfoMap().getImmutableMap();
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrDefault(
          int key,
          /* nullable */
emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo defaultValue) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder> map = internalGetMutableTraderItemInfoMap().ensureBuilderMap();
        return map.containsKey(key) ? traderItemInfoMapConverter.build(map.get(key)) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getTraderItemInfoMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder> map = internalGetMutableTraderItemInfoMap().ensureBuilderMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return traderItemInfoMapConverter.build(map.get(key));
      }
      public Builder clearTraderItemInfoMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableTraderItemInfoMap().clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      public Builder removeTraderItemInfoMap(
          int key) {

        internalGetMutableTraderItemInfoMap().ensureBuilderMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo>
          getMutableTraderItemInfoMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableTraderItemInfoMap().ensureMessageMap();
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      public Builder putTraderItemInfoMap(
          int key,
          emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableTraderItemInfoMap().ensureBuilderMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      public Builder putAllTraderItemInfoMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> values) {
        for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo> e : values.entrySet()) {
          if (e.getKey() == null || e.getValue() == null) {
            throw new NullPointerException();
          }
        }
        internalGetMutableTraderItemInfoMap().ensureBuilderMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .VintageMarketTraderInfo&gt; trader_item_info_map = 7;</code>
       */
      public emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder putTraderItemInfoMapBuilderIfAbsent(
          int key) {
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder> builderMap = internalGetMutableTraderItemInfoMap().ensureBuilderMap();
        emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder entry = builderMap.get(key);
        if (entry == null) {
          entry = emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.newBuilder();
          builderMap.put(key, entry);
        }
        if (entry instanceof emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) {
          entry = ((emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) entry).toBuilder();
          builderMap.put(key, entry);
        }
        return (emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder) entry;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketDealInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketDealInfo)
    private static final emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo();
    }

    public static emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketDealInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketDealInfo>() {
      @java.lang.Override
      public VintageMarketDealInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageMarketDealInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketDealInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketDealInfoOuterClass.VintageMarketDealInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketDealInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketDealInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033VintageMarketDealInfo.proto\032\035VintageMa" +
      "rketTraderInfo.proto\"\270\001\n\025VintageMarketDe" +
      "alInfo\022K\n\024trader_item_info_map\030\007 \003(\0132-.V" +
      "intageMarketDealInfo.TraderItemInfoMapEn" +
      "try\032R\n\026TraderItemInfoMapEntry\022\013\n\003key\030\001 \001" +
      "(\r\022\'\n\005value\030\002 \001(\0132\030.VintageMarketTraderI" +
      "nfo:\0028\001B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.getDescriptor(),
        });
    internal_static_VintageMarketDealInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketDealInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketDealInfo_descriptor,
        new java.lang.String[] { "TraderItemInfoMap", });
    internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_descriptor =
      internal_static_VintageMarketDealInfo_descriptor.getNestedTypes().get(0);
    internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketDealInfo_TraderItemInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.VintageMarketTraderInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
