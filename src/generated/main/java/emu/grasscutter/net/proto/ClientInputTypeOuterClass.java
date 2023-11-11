// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientInputType.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ClientInputTypeOuterClass {
  private ClientInputTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: NIHDBIEPBGP
   * </pre>
   *
   * Protobuf enum {@code ClientInputType}
   */
  public enum ClientInputType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CLIENT_INPUT_NONE = 0;</code>
     */
    CLIENT_INPUT_NONE(0),
    /**
     * <code>CLIENT_INPUT_KEYBORD_MOUSE = 1;</code>
     */
    CLIENT_INPUT_KEYBORD_MOUSE(1),
    /**
     * <code>CLIENT_INPUT_GAMEPAD = 2;</code>
     */
    CLIENT_INPUT_GAMEPAD(2),
    /**
     * <code>CLIENT_INPUT_TOUCH_PANEL = 3;</code>
     */
    CLIENT_INPUT_TOUCH_PANEL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CLIENT_INPUT_NONE = 0;</code>
     */
    public static final int CLIENT_INPUT_NONE_VALUE = 0;
    /**
     * <code>CLIENT_INPUT_KEYBORD_MOUSE = 1;</code>
     */
    public static final int CLIENT_INPUT_KEYBORD_MOUSE_VALUE = 1;
    /**
     * <code>CLIENT_INPUT_GAMEPAD = 2;</code>
     */
    public static final int CLIENT_INPUT_GAMEPAD_VALUE = 2;
    /**
     * <code>CLIENT_INPUT_TOUCH_PANEL = 3;</code>
     */
    public static final int CLIENT_INPUT_TOUCH_PANEL_VALUE = 3;


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
    public static ClientInputType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClientInputType forNumber(int value) {
      switch (value) {
        case 0: return CLIENT_INPUT_NONE;
        case 1: return CLIENT_INPUT_KEYBORD_MOUSE;
        case 2: return CLIENT_INPUT_GAMEPAD;
        case 3: return CLIENT_INPUT_TOUCH_PANEL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClientInputType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClientInputType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientInputType>() {
            public ClientInputType findValueByNumber(int number) {
              return ClientInputType.forNumber(number);
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
      return emu.grasscutter.net.proto.ClientInputTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClientInputType[] VALUES = values();

    public static ClientInputType valueOf(
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

    private ClientInputType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ClientInputType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ClientInputType.proto*\200\001\n\017ClientInputT" +
      "ype\022\025\n\021CLIENT_INPUT_NONE\020\000\022\036\n\032CLIENT_INP" +
      "UT_KEYBORD_MOUSE\020\001\022\030\n\024CLIENT_INPUT_GAMEP" +
      "AD\020\002\022\034\n\030CLIENT_INPUT_TOUCH_PANEL\020\003B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
