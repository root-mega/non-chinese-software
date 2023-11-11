// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Status.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class StatusOuterClass {
  private StatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_INVALID = 0;</code>
     */
    STATUS_INVALID(0),
    /**
     * <code>STATUS_UNFINISHED = 1;</code>
     */
    STATUS_UNFINISHED(1),
    /**
     * <code>STATUS_FINISHED = 2;</code>
     */
    STATUS_FINISHED(2),
    /**
     * <code>STATUS_REWARD_TAKEN = 3;</code>
     */
    STATUS_REWARD_TAKEN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_INVALID = 0;</code>
     */
    public static final int STATUS_INVALID_VALUE = 0;
    /**
     * <code>STATUS_UNFINISHED = 1;</code>
     */
    public static final int STATUS_UNFINISHED_VALUE = 1;
    /**
     * <code>STATUS_FINISHED = 2;</code>
     */
    public static final int STATUS_FINISHED_VALUE = 2;
    /**
     * <code>STATUS_REWARD_TAKEN = 3;</code>
     */
    public static final int STATUS_REWARD_TAKEN_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_INVALID;
        case 1: return STATUS_UNFINISHED;
        case 2: return STATUS_FINISHED;
        case 3: return STATUS_REWARD_TAKEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Status)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Status.proto*a\n\006Status\022\022\n\016STATUS_INVAL" +
      "ID\020\000\022\025\n\021STATUS_UNFINISHED\020\001\022\023\n\017STATUS_FI" +
      "NISHED\020\002\022\027\n\023STATUS_REWARD_TAKEN\020\003B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
