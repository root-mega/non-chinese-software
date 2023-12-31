// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeResourceNotify.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class HomeResourceNotifyOuterClass {
  private HomeResourceNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeResourceNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeResourceNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     * @return Whether the fetterExp field is set.
     */
    boolean hasFetterExp();
    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     * @return The fetterExp.
     */
    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp();
    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     */
    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getFetterExpOrBuilder();

    /**
     * <code>.HomeResource home_coin = 12;</code>
     * @return Whether the homeCoin field is set.
     */
    boolean hasHomeCoin();
    /**
     * <code>.HomeResource home_coin = 12;</code>
     * @return The homeCoin.
     */
    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getHomeCoin();
    /**
     * <code>.HomeResource home_coin = 12;</code>
     */
    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getHomeCoinOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5204
   * Obf: MCCGNBOJCCK
   * </pre>
   *
   * Protobuf type {@code HomeResourceNotify}
   */
  public static final class HomeResourceNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeResourceNotify)
      HomeResourceNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeResourceNotify.newBuilder() to construct.
    private HomeResourceNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeResourceNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeResourceNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.internal_static_HomeResourceNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.internal_static_HomeResourceNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.class, emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.Builder.class);
    }

    private int bitField0_;
    public static final int FETTER_EXP_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource fetterExp_;
    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     * @return Whether the fetterExp field is set.
     */
    @java.lang.Override
    public boolean hasFetterExp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     * @return The fetterExp.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp() {
      return fetterExp_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : fetterExp_;
    }
    /**
     * <code>.HomeResource fetter_exp = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getFetterExpOrBuilder() {
      return fetterExp_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : fetterExp_;
    }

    public static final int HOME_COIN_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource homeCoin_;
    /**
     * <code>.HomeResource home_coin = 12;</code>
     * @return Whether the homeCoin field is set.
     */
    @java.lang.Override
    public boolean hasHomeCoin() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.HomeResource home_coin = 12;</code>
     * @return The homeCoin.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getHomeCoin() {
      return homeCoin_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : homeCoin_;
    }
    /**
     * <code>.HomeResource home_coin = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getHomeCoinOrBuilder() {
      return homeCoin_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : homeCoin_;
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
        output.writeMessage(1, getFetterExp());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(12, getHomeCoin());
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
          .computeMessageSize(1, getFetterExp());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getHomeCoin());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify other = (emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify) obj;

      if (hasFetterExp() != other.hasFetterExp()) return false;
      if (hasFetterExp()) {
        if (!getFetterExp()
            .equals(other.getFetterExp())) return false;
      }
      if (hasHomeCoin() != other.hasHomeCoin()) return false;
      if (hasHomeCoin()) {
        if (!getHomeCoin()
            .equals(other.getHomeCoin())) return false;
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
      if (hasFetterExp()) {
        hash = (37 * hash) + FETTER_EXP_FIELD_NUMBER;
        hash = (53 * hash) + getFetterExp().hashCode();
      }
      if (hasHomeCoin()) {
        hash = (37 * hash) + HOME_COIN_FIELD_NUMBER;
        hash = (53 * hash) + getHomeCoin().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify prototype) {
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
     * CmdId: 5204
     * Obf: MCCGNBOJCCK
     * </pre>
     *
     * Protobuf type {@code HomeResourceNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeResourceNotify)
        emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.internal_static_HomeResourceNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.internal_static_HomeResourceNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.class, emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.newBuilder()
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
          getFetterExpFieldBuilder();
          getHomeCoinFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        fetterExp_ = null;
        if (fetterExpBuilder_ != null) {
          fetterExpBuilder_.dispose();
          fetterExpBuilder_ = null;
        }
        homeCoin_ = null;
        if (homeCoinBuilder_ != null) {
          homeCoinBuilder_.dispose();
          homeCoinBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.internal_static_HomeResourceNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify build() {
        emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify buildPartial() {
        emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify result = new emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fetterExp_ = fetterExpBuilder_ == null
              ? fetterExp_
              : fetterExpBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.homeCoin_ = homeCoinBuilder_ == null
              ? homeCoin_
              : homeCoinBuilder_.build();
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify other) {
        if (other == emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify.getDefaultInstance()) return this;
        if (other.hasFetterExp()) {
          mergeFetterExp(other.getFetterExp());
        }
        if (other.hasHomeCoin()) {
          mergeHomeCoin(other.getHomeCoin());
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
              case 10: {
                input.readMessage(
                    getFetterExpFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 98: {
                input.readMessage(
                    getHomeCoinFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
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

      private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource fetterExp_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder> fetterExpBuilder_;
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       * @return Whether the fetterExp field is set.
       */
      public boolean hasFetterExp() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       * @return The fetterExp.
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp() {
        if (fetterExpBuilder_ == null) {
          return fetterExp_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : fetterExp_;
        } else {
          return fetterExpBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public Builder setFetterExp(emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
        if (fetterExpBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fetterExp_ = value;
        } else {
          fetterExpBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public Builder setFetterExp(
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder builderForValue) {
        if (fetterExpBuilder_ == null) {
          fetterExp_ = builderForValue.build();
        } else {
          fetterExpBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public Builder mergeFetterExp(emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
        if (fetterExpBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            fetterExp_ != null &&
            fetterExp_ != emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance()) {
            getFetterExpBuilder().mergeFrom(value);
          } else {
            fetterExp_ = value;
          }
        } else {
          fetterExpBuilder_.mergeFrom(value);
        }
        if (fetterExp_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public Builder clearFetterExp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fetterExp_ = null;
        if (fetterExpBuilder_ != null) {
          fetterExpBuilder_.dispose();
          fetterExpBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder getFetterExpBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFetterExpFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getFetterExpOrBuilder() {
        if (fetterExpBuilder_ != null) {
          return fetterExpBuilder_.getMessageOrBuilder();
        } else {
          return fetterExp_ == null ?
              emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : fetterExp_;
        }
      }
      /**
       * <code>.HomeResource fetter_exp = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder> 
          getFetterExpFieldBuilder() {
        if (fetterExpBuilder_ == null) {
          fetterExpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder>(
                  getFetterExp(),
                  getParentForChildren(),
                  isClean());
          fetterExp_ = null;
        }
        return fetterExpBuilder_;
      }

      private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource homeCoin_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder> homeCoinBuilder_;
      /**
       * <code>.HomeResource home_coin = 12;</code>
       * @return Whether the homeCoin field is set.
       */
      public boolean hasHomeCoin() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       * @return The homeCoin.
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getHomeCoin() {
        if (homeCoinBuilder_ == null) {
          return homeCoin_ == null ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : homeCoin_;
        } else {
          return homeCoinBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public Builder setHomeCoin(emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
        if (homeCoinBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          homeCoin_ = value;
        } else {
          homeCoinBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public Builder setHomeCoin(
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder builderForValue) {
        if (homeCoinBuilder_ == null) {
          homeCoin_ = builderForValue.build();
        } else {
          homeCoinBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public Builder mergeHomeCoin(emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
        if (homeCoinBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            homeCoin_ != null &&
            homeCoin_ != emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance()) {
            getHomeCoinBuilder().mergeFrom(value);
          } else {
            homeCoin_ = value;
          }
        } else {
          homeCoinBuilder_.mergeFrom(value);
        }
        if (homeCoin_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public Builder clearHomeCoin() {
        bitField0_ = (bitField0_ & ~0x00000002);
        homeCoin_ = null;
        if (homeCoinBuilder_ != null) {
          homeCoinBuilder_.dispose();
          homeCoinBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder getHomeCoinBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getHomeCoinFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getHomeCoinOrBuilder() {
        if (homeCoinBuilder_ != null) {
          return homeCoinBuilder_.getMessageOrBuilder();
        } else {
          return homeCoin_ == null ?
              emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance() : homeCoin_;
        }
      }
      /**
       * <code>.HomeResource home_coin = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder> 
          getHomeCoinFieldBuilder() {
        if (homeCoinBuilder_ == null) {
          homeCoinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder, emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder>(
                  getHomeCoin(),
                  getParentForChildren(),
                  isClean());
          homeCoin_ = null;
        }
        return homeCoinBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeResourceNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeResourceNotify)
    private static final emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify();
    }

    public static emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeResourceNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeResourceNotify>() {
      @java.lang.Override
      public HomeResourceNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeResourceNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeResourceNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeResourceNotifyOuterClass.HomeResourceNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeResourceNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeResourceNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030HomeResourceNotify.proto\032\022HomeResource" +
      ".proto\"Y\n\022HomeResourceNotify\022!\n\nfetter_e" +
      "xp\030\001 \001(\0132\r.HomeResource\022 \n\thome_coin\030\014 \001" +
      "(\0132\r.HomeResourceB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeResourceOuterClass.getDescriptor(),
        });
    internal_static_HomeResourceNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeResourceNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeResourceNotify_descriptor,
        new java.lang.String[] { "FetterExp", "HomeCoin", });
    emu.grasscutter.net.proto.HomeResourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
