// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckUgcStateReq.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class CheckUgcStateReqOuterClass {
  private CheckUgcStateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CheckUgcStateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CheckUgcStateReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * CmdId: 3955
   * Obf: HAIPIFGOHHJ
   * </pre>
   *
   * Protobuf type {@code CheckUgcStateReq}
   */
  public static final class CheckUgcStateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CheckUgcStateReq)
      CheckUgcStateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckUgcStateReq.newBuilder() to construct.
    private CheckUgcStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckUgcStateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CheckUgcStateReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.internal_static_CheckUgcStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.internal_static_CheckUgcStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.class, emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq other = (emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq prototype) {
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
     * CmdId: 3955
     * Obf: HAIPIFGOHHJ
     * </pre>
     *
     * Protobuf type {@code CheckUgcStateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CheckUgcStateReq)
        emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.internal_static_CheckUgcStateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.internal_static_CheckUgcStateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.class, emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.internal_static_CheckUgcStateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq build() {
        emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq buildPartial() {
        emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq result = new emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq(this);
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq) {
          return mergeFrom((emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq other) {
        if (other == emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:CheckUgcStateReq)
    }

    // @@protoc_insertion_point(class_scope:CheckUgcStateReq)
    private static final emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq();
    }

    public static emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CheckUgcStateReq>
        PARSER = new com.google.protobuf.AbstractParser<CheckUgcStateReq>() {
      @java.lang.Override
      public CheckUgcStateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<CheckUgcStateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CheckUgcStateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CheckUgcStateReqOuterClass.CheckUgcStateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CheckUgcStateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CheckUgcStateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026CheckUgcStateReq.proto\"\022\n\020CheckUgcStat" +
      "eReqB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CheckUgcStateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CheckUgcStateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CheckUgcStateReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
