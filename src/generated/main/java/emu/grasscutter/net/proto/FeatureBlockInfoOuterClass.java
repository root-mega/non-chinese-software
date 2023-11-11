// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FeatureBlockInfo.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class FeatureBlockInfoOuterClass {
  private FeatureBlockInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FeatureBlockInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FeatureBlockInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 feature_type = 1;</code>
     * @return The featureType.
     */
    int getFeatureType();

    /**
     * <code>uint32 end_time = 2;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * <pre>
   * Obf: NGEGAFNJIFO
   * </pre>
   *
   * Protobuf type {@code FeatureBlockInfo}
   */
  public static final class FeatureBlockInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FeatureBlockInfo)
      FeatureBlockInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FeatureBlockInfo.newBuilder() to construct.
    private FeatureBlockInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FeatureBlockInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FeatureBlockInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.internal_static_FeatureBlockInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.internal_static_FeatureBlockInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.class, emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.Builder.class);
    }

    public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
    private int featureType_ = 0;
    /**
     * <code>uint32 feature_type = 1;</code>
     * @return The featureType.
     */
    @java.lang.Override
    public int getFeatureType() {
      return featureType_;
    }

    public static final int END_TIME_FIELD_NUMBER = 2;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 2;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
      if (featureType_ != 0) {
        output.writeUInt32(1, featureType_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(2, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (featureType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, featureType_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo other = (emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo) obj;

      if (getFeatureType()
          != other.getFeatureType()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      hash = (37 * hash) + FEATURE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureType();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo prototype) {
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
     * Obf: NGEGAFNJIFO
     * </pre>
     *
     * Protobuf type {@code FeatureBlockInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FeatureBlockInfo)
        emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.internal_static_FeatureBlockInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.internal_static_FeatureBlockInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.class, emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.newBuilder()
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
        featureType_ = 0;
        endTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.internal_static_FeatureBlockInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo build() {
        emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo buildPartial() {
        emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo result = new emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.featureType_ = featureType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.endTime_ = endTime_;
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
        if (other instanceof emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo other) {
        if (other == emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo.getDefaultInstance()) return this;
        if (other.getFeatureType() != 0) {
          setFeatureType(other.getFeatureType());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
                featureType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                endTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private int featureType_ ;
      /**
       * <code>uint32 feature_type = 1;</code>
       * @return The featureType.
       */
      @java.lang.Override
      public int getFeatureType() {
        return featureType_;
      }
      /**
       * <code>uint32 feature_type = 1;</code>
       * @param value The featureType to set.
       * @return This builder for chaining.
       */
      public Builder setFeatureType(int value) {

        featureType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 feature_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeatureType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        featureType_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 2;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 2;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {

        endTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FeatureBlockInfo)
    }

    // @@protoc_insertion_point(class_scope:FeatureBlockInfo)
    private static final emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo();
    }

    public static emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FeatureBlockInfo>
        PARSER = new com.google.protobuf.AbstractParser<FeatureBlockInfo>() {
      @java.lang.Override
      public FeatureBlockInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FeatureBlockInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FeatureBlockInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FeatureBlockInfoOuterClass.FeatureBlockInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FeatureBlockInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FeatureBlockInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FeatureBlockInfo.proto\":\n\020FeatureBlock" +
      "Info\022\024\n\014feature_type\030\001 \001(\r\022\020\n\010end_time\030\002" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FeatureBlockInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FeatureBlockInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FeatureBlockInfo_descriptor,
        new java.lang.String[] { "FeatureType", "EndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
