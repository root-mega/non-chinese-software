// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MGIHJDAHEAB.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class MGIHJDAHEABOuterClass {
  private MGIHJDAHEABOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MGIHJDAHEABOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MGIHJDAHEAB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 object_id = 8;</code>
     * @return The objectId.
     */
    int getObjectId();

    /**
     * <code>uint32 finish_time = 5;</code>
     * @return The finishTime.
     */
    int getFinishTime();
  }
  /**
   * Protobuf type {@code MGIHJDAHEAB}
   */
  public static final class MGIHJDAHEAB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MGIHJDAHEAB)
      MGIHJDAHEABOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MGIHJDAHEAB.newBuilder() to construct.
    private MGIHJDAHEAB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MGIHJDAHEAB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MGIHJDAHEAB();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.internal_static_MGIHJDAHEAB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.internal_static_MGIHJDAHEAB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.class, emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.Builder.class);
    }

    public static final int OBJECT_ID_FIELD_NUMBER = 8;
    private int objectId_ = 0;
    /**
     * <code>uint32 object_id = 8;</code>
     * @return The objectId.
     */
    @java.lang.Override
    public int getObjectId() {
      return objectId_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 5;
    private int finishTime_ = 0;
    /**
     * <code>uint32 finish_time = 5;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
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
      if (finishTime_ != 0) {
        output.writeUInt32(5, finishTime_);
      }
      if (objectId_ != 0) {
        output.writeUInt32(8, objectId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, finishTime_);
      }
      if (objectId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, objectId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB other = (emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB) obj;

      if (getObjectId()
          != other.getObjectId()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
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
      hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getObjectId();
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB prototype) {
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
     * Protobuf type {@code MGIHJDAHEAB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MGIHJDAHEAB)
        emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEABOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.internal_static_MGIHJDAHEAB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.internal_static_MGIHJDAHEAB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.class, emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.newBuilder()
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
        objectId_ = 0;
        finishTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.internal_static_MGIHJDAHEAB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB build() {
        emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB buildPartial() {
        emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB result = new emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.objectId_ = objectId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.finishTime_ = finishTime_;
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
        if (other instanceof emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB) {
          return mergeFrom((emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB other) {
        if (other == emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB.getDefaultInstance()) return this;
        if (other.getObjectId() != 0) {
          setObjectId(other.getObjectId());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
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
              case 40: {
                finishTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 64: {
                objectId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
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

      private int objectId_ ;
      /**
       * <code>uint32 object_id = 8;</code>
       * @return The objectId.
       */
      @java.lang.Override
      public int getObjectId() {
        return objectId_;
      }
      /**
       * <code>uint32 object_id = 8;</code>
       * @param value The objectId to set.
       * @return This builder for chaining.
       */
      public Builder setObjectId(int value) {

        objectId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 object_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        objectId_ = 0;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 5;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 5;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {

        finishTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        finishTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MGIHJDAHEAB)
    }

    // @@protoc_insertion_point(class_scope:MGIHJDAHEAB)
    private static final emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB();
    }

    public static emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MGIHJDAHEAB>
        PARSER = new com.google.protobuf.AbstractParser<MGIHJDAHEAB>() {
      @java.lang.Override
      public MGIHJDAHEAB parsePartialFrom(
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

    public static com.google.protobuf.Parser<MGIHJDAHEAB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MGIHJDAHEAB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MGIHJDAHEABOuterClass.MGIHJDAHEAB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MGIHJDAHEAB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MGIHJDAHEAB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MGIHJDAHEAB.proto\"5\n\013MGIHJDAHEAB\022\021\n\tob" +
      "ject_id\030\010 \001(\r\022\023\n\013finish_time\030\005 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MGIHJDAHEAB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MGIHJDAHEAB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MGIHJDAHEAB_descriptor,
        new java.lang.String[] { "ObjectId", "FinishTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
