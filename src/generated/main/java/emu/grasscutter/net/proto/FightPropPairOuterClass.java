// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FightPropPair.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class FightPropPairOuterClass {
  private FightPropPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FightPropPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FightPropPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float prop_value = 2;</code>
     * @return The propValue.
     */
    float getPropValue();

    /**
     * <code>uint32 prop_type = 1;</code>
     * @return The propType.
     */
    int getPropType();
  }
  /**
   * Protobuf type {@code FightPropPair}
   */
  public static final class FightPropPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FightPropPair)
      FightPropPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FightPropPair.newBuilder() to construct.
    private FightPropPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FightPropPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FightPropPair();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FightPropPairOuterClass.internal_static_FightPropPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.class, emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.Builder.class);
    }

    public static final int PROP_VALUE_FIELD_NUMBER = 2;
    private float propValue_ = 0F;
    /**
     * <code>float prop_value = 2;</code>
     * @return The propValue.
     */
    @java.lang.Override
    public float getPropValue() {
      return propValue_;
    }

    public static final int PROP_TYPE_FIELD_NUMBER = 1;
    private int propType_ = 0;
    /**
     * <code>uint32 prop_type = 1;</code>
     * @return The propType.
     */
    @java.lang.Override
    public int getPropType() {
      return propType_;
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
      if (propType_ != 0) {
        output.writeUInt32(1, propType_);
      }
      if (java.lang.Float.floatToRawIntBits(propValue_) != 0) {
        output.writeFloat(2, propValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (propType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, propType_);
      }
      if (java.lang.Float.floatToRawIntBits(propValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, propValue_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair other = (emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair) obj;

      if (java.lang.Float.floatToIntBits(getPropValue())
          != java.lang.Float.floatToIntBits(
              other.getPropValue())) return false;
      if (getPropType()
          != other.getPropType()) return false;
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
      hash = (37 * hash) + PROP_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getPropValue());
      hash = (37 * hash) + PROP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPropType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair prototype) {
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
     * Protobuf type {@code FightPropPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FightPropPair)
        emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FightPropPairOuterClass.internal_static_FightPropPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.class, emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.newBuilder()
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
        propValue_ = 0F;
        propType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair build() {
        emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair buildPartial() {
        emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair result = new emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.propValue_ = propValue_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.propType_ = propType_;
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
        if (other instanceof emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair) {
          return mergeFrom((emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair other) {
        if (other == emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair.getDefaultInstance()) return this;
        if (other.getPropValue() != 0F) {
          setPropValue(other.getPropValue());
        }
        if (other.getPropType() != 0) {
          setPropType(other.getPropType());
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
              case 8: {
                propType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 21: {
                propValue_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
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

      private float propValue_ ;
      /**
       * <code>float prop_value = 2;</code>
       * @return The propValue.
       */
      @java.lang.Override
      public float getPropValue() {
        return propValue_;
      }
      /**
       * <code>float prop_value = 2;</code>
       * @param value The propValue to set.
       * @return This builder for chaining.
       */
      public Builder setPropValue(float value) {

        propValue_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float prop_value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        propValue_ = 0F;
        onChanged();
        return this;
      }

      private int propType_ ;
      /**
       * <code>uint32 prop_type = 1;</code>
       * @return The propType.
       */
      @java.lang.Override
      public int getPropType() {
        return propType_;
      }
      /**
       * <code>uint32 prop_type = 1;</code>
       * @param value The propType to set.
       * @return This builder for chaining.
       */
      public Builder setPropType(int value) {

        propType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 prop_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        propType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FightPropPair)
    }

    // @@protoc_insertion_point(class_scope:FightPropPair)
    private static final emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair();
    }

    public static emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FightPropPair>
        PARSER = new com.google.protobuf.AbstractParser<FightPropPair>() {
      @java.lang.Override
      public FightPropPair parsePartialFrom(
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

    public static com.google.protobuf.Parser<FightPropPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FightPropPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FightPropPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FightPropPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023FightPropPair.proto\"6\n\rFightPropPair\022\022" +
      "\n\nprop_value\030\002 \001(\002\022\021\n\tprop_type\030\001 \001(\rB3\n" +
      "\031emu.grasscutter.net.proto\252\002\025FurinaImpac" +
      "t.Protocolb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FightPropPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FightPropPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FightPropPair_descriptor,
        new java.lang.String[] { "PropValue", "PropType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
