// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FAFPLBDIGDH.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class FAFPLBDIGDHOuterClass {
  private FAFPLBDIGDHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FAFPLBDIGDHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FAFPLBDIGDH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     * @return Whether the dFFBILKONHM field is set.
     */
    boolean hasDFFBILKONHM();
    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     * @return The dFFBILKONHM.
     */
    emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDFFBILKONHM();
    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     */
    emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder getDFFBILKONHMOrBuilder();
  }
  /**
   * Protobuf type {@code FAFPLBDIGDH}
   */
  public static final class FAFPLBDIGDH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FAFPLBDIGDH)
      FAFPLBDIGDHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FAFPLBDIGDH.newBuilder() to construct.
    private FAFPLBDIGDH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FAFPLBDIGDH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FAFPLBDIGDH();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.internal_static_FAFPLBDIGDH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.internal_static_FAFPLBDIGDH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.class, emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.Builder.class);
    }

    private int bitField0_;
    public static final int DFFBILKONHM_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK dFFBILKONHM_;
    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     * @return Whether the dFFBILKONHM field is set.
     */
    @java.lang.Override
    public boolean hasDFFBILKONHM() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     * @return The dFFBILKONHM.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDFFBILKONHM() {
      return dFFBILKONHM_ == null ? emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance() : dFFBILKONHM_;
    }
    /**
     * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder getDFFBILKONHMOrBuilder() {
      return dFFBILKONHM_ == null ? emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance() : dFFBILKONHM_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(12, getDFFBILKONHM());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getDFFBILKONHM());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH other = (emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH) obj;

      if (hasDFFBILKONHM() != other.hasDFFBILKONHM()) return false;
      if (hasDFFBILKONHM()) {
        if (!getDFFBILKONHM()
            .equals(other.getDFFBILKONHM())) return false;
      }
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
      if (hasDFFBILKONHM()) {
        hash = (37 * hash) + DFFBILKONHM_FIELD_NUMBER;
        hash = (53 * hash) + getDFFBILKONHM().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH prototype) {
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
     * Protobuf type {@code FAFPLBDIGDH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FAFPLBDIGDH)
        emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.internal_static_FAFPLBDIGDH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.internal_static_FAFPLBDIGDH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.class, emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDFFBILKONHMFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        dFFBILKONHM_ = null;
        if (dFFBILKONHMBuilder_ != null) {
          dFFBILKONHMBuilder_.dispose();
          dFFBILKONHMBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.internal_static_FAFPLBDIGDH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH build() {
        emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH buildPartial() {
        emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH result = new emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dFFBILKONHM_ = dFFBILKONHMBuilder_ == null
              ? dFFBILKONHM_
              : dFFBILKONHMBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH) {
          return mergeFrom((emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH other) {
        if (other == emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH.getDefaultInstance()) return this;
        if (other.hasDFFBILKONHM()) {
          mergeDFFBILKONHM(other.getDFFBILKONHM());
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
              case 98: {
                input.readMessage(
                    getDFFBILKONHMFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
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

      private emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK dFFBILKONHM_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder> dFFBILKONHMBuilder_;
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       * @return Whether the dFFBILKONHM field is set.
       */
      public boolean hasDFFBILKONHM() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       * @return The dFFBILKONHM.
       */
      public emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDFFBILKONHM() {
        if (dFFBILKONHMBuilder_ == null) {
          return dFFBILKONHM_ == null ? emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance() : dFFBILKONHM_;
        } else {
          return dFFBILKONHMBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public Builder setDFFBILKONHM(emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK value) {
        if (dFFBILKONHMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dFFBILKONHM_ = value;
        } else {
          dFFBILKONHMBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public Builder setDFFBILKONHM(
          emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder builderForValue) {
        if (dFFBILKONHMBuilder_ == null) {
          dFFBILKONHM_ = builderForValue.build();
        } else {
          dFFBILKONHMBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public Builder mergeDFFBILKONHM(emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK value) {
        if (dFFBILKONHMBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            dFFBILKONHM_ != null &&
            dFFBILKONHM_ != emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance()) {
            getDFFBILKONHMBuilder().mergeFrom(value);
          } else {
            dFFBILKONHM_ = value;
          }
        } else {
          dFFBILKONHMBuilder_.mergeFrom(value);
        }
        if (dFFBILKONHM_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public Builder clearDFFBILKONHM() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dFFBILKONHM_ = null;
        if (dFFBILKONHMBuilder_ != null) {
          dFFBILKONHMBuilder_.dispose();
          dFFBILKONHMBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder getDFFBILKONHMBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDFFBILKONHMFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      public emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder getDFFBILKONHMOrBuilder() {
        if (dFFBILKONHMBuilder_ != null) {
          return dFFBILKONHMBuilder_.getMessageOrBuilder();
        } else {
          return dFFBILKONHM_ == null ?
              emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance() : dFFBILKONHM_;
        }
      }
      /**
       * <code>optional .LAOBOIBJGOK DFFBILKONHM = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder> 
          getDFFBILKONHMFieldBuilder() {
        if (dFFBILKONHMBuilder_ == null) {
          dFFBILKONHMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder, emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder>(
                  getDFFBILKONHM(),
                  getParentForChildren(),
                  isClean());
          dFFBILKONHM_ = null;
        }
        return dFFBILKONHMBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FAFPLBDIGDH)
    }

    // @@protoc_insertion_point(class_scope:FAFPLBDIGDH)
    private static final emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH();
    }

    public static emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FAFPLBDIGDH>
        PARSER = new com.google.protobuf.AbstractParser<FAFPLBDIGDH>() {
      @java.lang.Override
      public FAFPLBDIGDH parsePartialFrom(
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

    public static com.google.protobuf.Parser<FAFPLBDIGDH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FAFPLBDIGDH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FAFPLBDIGDHOuterClass.FAFPLBDIGDH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FAFPLBDIGDH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FAFPLBDIGDH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FAFPLBDIGDH.proto\032\021LAOBOIBJGOK.proto\"E" +
      "\n\013FAFPLBDIGDH\022&\n\013DFFBILKONHM\030\014 \001(\0132\014.LAO" +
      "BOIBJGOKH\000\210\001\001B\016\n\014_DFFBILKONHMB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.getDescriptor(),
        });
    internal_static_FAFPLBDIGDH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FAFPLBDIGDH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FAFPLBDIGDH_descriptor,
        new java.lang.String[] { "DFFBILKONHM", });
    emu.grasscutter.net.proto.LAOBOIBJGOKOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
