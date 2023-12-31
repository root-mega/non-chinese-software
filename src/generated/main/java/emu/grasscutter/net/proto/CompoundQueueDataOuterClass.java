// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompoundQueueData.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class CompoundQueueDataOuterClass {
  private CompoundQueueDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CompoundQueueDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CompoundQueueData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 outputTime = 1;</code>
     * @return The outputTime.
     */
    int getOutputTime();

    /**
     * <code>uint32 waitCount = 14;</code>
     * @return The waitCount.
     */
    int getWaitCount();

    /**
     * <code>uint32 compound_id = 11;</code>
     * @return The compoundId.
     */
    int getCompoundId();

    /**
     * <code>uint32 outputCount = 12;</code>
     * @return The outputCount.
     */
    int getOutputCount();
  }
  /**
   * <pre>
   * Obf: EEHJDMLBLEE
   * </pre>
   *
   * Protobuf type {@code CompoundQueueData}
   */
  public static final class CompoundQueueData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CompoundQueueData)
      CompoundQueueDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CompoundQueueData.newBuilder() to construct.
    private CompoundQueueData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CompoundQueueData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CompoundQueueData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.class, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder.class);
    }

    public static final int OUTPUTTIME_FIELD_NUMBER = 1;
    private int outputTime_ = 0;
    /**
     * <code>uint32 outputTime = 1;</code>
     * @return The outputTime.
     */
    @java.lang.Override
    public int getOutputTime() {
      return outputTime_;
    }

    public static final int WAITCOUNT_FIELD_NUMBER = 14;
    private int waitCount_ = 0;
    /**
     * <code>uint32 waitCount = 14;</code>
     * @return The waitCount.
     */
    @java.lang.Override
    public int getWaitCount() {
      return waitCount_;
    }

    public static final int COMPOUND_ID_FIELD_NUMBER = 11;
    private int compoundId_ = 0;
    /**
     * <code>uint32 compound_id = 11;</code>
     * @return The compoundId.
     */
    @java.lang.Override
    public int getCompoundId() {
      return compoundId_;
    }

    public static final int OUTPUTCOUNT_FIELD_NUMBER = 12;
    private int outputCount_ = 0;
    /**
     * <code>uint32 outputCount = 12;</code>
     * @return The outputCount.
     */
    @java.lang.Override
    public int getOutputCount() {
      return outputCount_;
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
      if (outputTime_ != 0) {
        output.writeUInt32(1, outputTime_);
      }
      if (compoundId_ != 0) {
        output.writeUInt32(11, compoundId_);
      }
      if (outputCount_ != 0) {
        output.writeUInt32(12, outputCount_);
      }
      if (waitCount_ != 0) {
        output.writeUInt32(14, waitCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (outputTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, outputTime_);
      }
      if (compoundId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, compoundId_);
      }
      if (outputCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, outputCount_);
      }
      if (waitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, waitCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData other = (emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData) obj;

      if (getOutputTime()
          != other.getOutputTime()) return false;
      if (getWaitCount()
          != other.getWaitCount()) return false;
      if (getCompoundId()
          != other.getCompoundId()) return false;
      if (getOutputCount()
          != other.getOutputCount()) return false;
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
      hash = (37 * hash) + OUTPUTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getOutputTime();
      hash = (37 * hash) + WAITCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getWaitCount();
      hash = (37 * hash) + COMPOUND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCompoundId();
      hash = (37 * hash) + OUTPUTCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getOutputCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData prototype) {
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
     * Obf: EEHJDMLBLEE
     * </pre>
     *
     * Protobuf type {@code CompoundQueueData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CompoundQueueData)
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.class, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.newBuilder()
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
        outputTime_ = 0;
        waitCount_ = 0;
        compoundId_ = 0;
        outputCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData build() {
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData buildPartial() {
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData result = new emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.outputTime_ = outputTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.waitCount_ = waitCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.compoundId_ = compoundId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.outputCount_ = outputCount_;
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
        if (other instanceof emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData) {
          return mergeFrom((emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData other) {
        if (other == emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance()) return this;
        if (other.getOutputTime() != 0) {
          setOutputTime(other.getOutputTime());
        }
        if (other.getWaitCount() != 0) {
          setWaitCount(other.getWaitCount());
        }
        if (other.getCompoundId() != 0) {
          setCompoundId(other.getCompoundId());
        }
        if (other.getOutputCount() != 0) {
          setOutputCount(other.getOutputCount());
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
                outputTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 88: {
                compoundId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 96: {
                outputCount_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
              case 112: {
                waitCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int outputTime_ ;
      /**
       * <code>uint32 outputTime = 1;</code>
       * @return The outputTime.
       */
      @java.lang.Override
      public int getOutputTime() {
        return outputTime_;
      }
      /**
       * <code>uint32 outputTime = 1;</code>
       * @param value The outputTime to set.
       * @return This builder for chaining.
       */
      public Builder setOutputTime(int value) {

        outputTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 outputTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOutputTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        outputTime_ = 0;
        onChanged();
        return this;
      }

      private int waitCount_ ;
      /**
       * <code>uint32 waitCount = 14;</code>
       * @return The waitCount.
       */
      @java.lang.Override
      public int getWaitCount() {
        return waitCount_;
      }
      /**
       * <code>uint32 waitCount = 14;</code>
       * @param value The waitCount to set.
       * @return This builder for chaining.
       */
      public Builder setWaitCount(int value) {

        waitCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 waitCount = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWaitCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        waitCount_ = 0;
        onChanged();
        return this;
      }

      private int compoundId_ ;
      /**
       * <code>uint32 compound_id = 11;</code>
       * @return The compoundId.
       */
      @java.lang.Override
      public int getCompoundId() {
        return compoundId_;
      }
      /**
       * <code>uint32 compound_id = 11;</code>
       * @param value The compoundId to set.
       * @return This builder for chaining.
       */
      public Builder setCompoundId(int value) {

        compoundId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 compound_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompoundId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        compoundId_ = 0;
        onChanged();
        return this;
      }

      private int outputCount_ ;
      /**
       * <code>uint32 outputCount = 12;</code>
       * @return The outputCount.
       */
      @java.lang.Override
      public int getOutputCount() {
        return outputCount_;
      }
      /**
       * <code>uint32 outputCount = 12;</code>
       * @param value The outputCount to set.
       * @return This builder for chaining.
       */
      public Builder setOutputCount(int value) {

        outputCount_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 outputCount = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOutputCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        outputCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CompoundQueueData)
    }

    // @@protoc_insertion_point(class_scope:CompoundQueueData)
    private static final emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData();
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CompoundQueueData>
        PARSER = new com.google.protobuf.AbstractParser<CompoundQueueData>() {
      @java.lang.Override
      public CompoundQueueData parsePartialFrom(
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

    public static com.google.protobuf.Parser<CompoundQueueData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CompoundQueueData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompoundQueueData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompoundQueueData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CompoundQueueData.proto\"d\n\021CompoundQue" +
      "ueData\022\022\n\noutputTime\030\001 \001(\r\022\021\n\twaitCount\030" +
      "\016 \001(\r\022\023\n\013compound_id\030\013 \001(\r\022\023\n\013outputCoun" +
      "t\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CompoundQueueData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CompoundQueueData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompoundQueueData_descriptor,
        new java.lang.String[] { "OutputTime", "WaitCount", "CompoundId", "OutputCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
