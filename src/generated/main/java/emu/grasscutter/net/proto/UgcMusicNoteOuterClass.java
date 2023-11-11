// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcMusicNote.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class UgcMusicNoteOuterClass {
  private UgcMusicNoteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcMusicNoteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcMusicNote)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_time = 9;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>uint32 end_time = 15;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * <pre>
   * Obf: BODJKMIGPEP
   * </pre>
   *
   * Protobuf type {@code UgcMusicNote}
   */
  public static final class UgcMusicNote extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcMusicNote)
      UgcMusicNoteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcMusicNote.newBuilder() to construct.
    private UgcMusicNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcMusicNote() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcMusicNote();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.internal_static_UgcMusicNote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.internal_static_UgcMusicNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.class, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 9;
    private int startTime_ = 0;
    /**
     * <code>uint32 start_time = 9;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int END_TIME_FIELD_NUMBER = 15;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 15;</code>
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
      if (startTime_ != 0) {
        output.writeUInt32(9, startTime_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(15, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, startTime_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote other = (emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
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
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote prototype) {
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
     * Obf: BODJKMIGPEP
     * </pre>
     *
     * Protobuf type {@code UgcMusicNote}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcMusicNote)
        emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNoteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.internal_static_UgcMusicNote_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.internal_static_UgcMusicNote_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.class, emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.newBuilder()
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
        startTime_ = 0;
        endTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.internal_static_UgcMusicNote_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote build() {
        emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote buildPartial() {
        emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote result = new emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startTime_ = startTime_;
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
        if (other instanceof emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote) {
          return mergeFrom((emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote other) {
        if (other == emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote.getDefaultInstance()) return this;
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
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
              case 72: {
                startTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 120: {
                endTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 9;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 9;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {

        startTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startTime_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 15;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 15;</code>
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
       * <code>uint32 end_time = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:UgcMusicNote)
    }

    // @@protoc_insertion_point(class_scope:UgcMusicNote)
    private static final emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote();
    }

    public static emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcMusicNote>
        PARSER = new com.google.protobuf.AbstractParser<UgcMusicNote>() {
      @java.lang.Override
      public UgcMusicNote parsePartialFrom(
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

    public static com.google.protobuf.Parser<UgcMusicNote> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcMusicNote> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UgcMusicNoteOuterClass.UgcMusicNote getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcMusicNote_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcMusicNote_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022UgcMusicNote.proto\"4\n\014UgcMusicNote\022\022\n\n" +
      "start_time\030\t \001(\r\022\020\n\010end_time\030\017 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UgcMusicNote_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcMusicNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcMusicNote_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
