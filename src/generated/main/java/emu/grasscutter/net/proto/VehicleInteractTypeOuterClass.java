// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleInteractType.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class VehicleInteractTypeOuterClass {
  private VehicleInteractTypeOuterClass() {}
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
   * Obf: HHAEHDABPEB
   * </pre>
   *
   * Protobuf enum {@code VehicleInteractType}
   */
  public enum VehicleInteractType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VEHICLE_INTERACT_TYPE_NONE = 0;</code>
     */
    VEHICLE_INTERACT_TYPE_NONE(0),
    /**
     * <code>VEHICLE_INTERACT_TYPE_IN = 1;</code>
     */
    VEHICLE_INTERACT_TYPE_IN(1),
    /**
     * <code>VEHICLE_INTERACT_TYPE_OUT = 2;</code>
     */
    VEHICLE_INTERACT_TYPE_OUT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>VEHICLE_INTERACT_TYPE_NONE = 0;</code>
     */
    public static final int VEHICLE_INTERACT_TYPE_NONE_VALUE = 0;
    /**
     * <code>VEHICLE_INTERACT_TYPE_IN = 1;</code>
     */
    public static final int VEHICLE_INTERACT_TYPE_IN_VALUE = 1;
    /**
     * <code>VEHICLE_INTERACT_TYPE_OUT = 2;</code>
     */
    public static final int VEHICLE_INTERACT_TYPE_OUT_VALUE = 2;


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
    public static VehicleInteractType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VehicleInteractType forNumber(int value) {
      switch (value) {
        case 0: return VEHICLE_INTERACT_TYPE_NONE;
        case 1: return VEHICLE_INTERACT_TYPE_IN;
        case 2: return VEHICLE_INTERACT_TYPE_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VehicleInteractType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VehicleInteractType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VehicleInteractType>() {
            public VehicleInteractType findValueByNumber(int number) {
              return VehicleInteractType.forNumber(number);
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
      return emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final VehicleInteractType[] VALUES = values();

    public static VehicleInteractType valueOf(
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

    private VehicleInteractType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:VehicleInteractType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031VehicleInteractType.proto*r\n\023VehicleIn" +
      "teractType\022\036\n\032VEHICLE_INTERACT_TYPE_NONE" +
      "\020\000\022\034\n\030VEHICLE_INTERACT_TYPE_IN\020\001\022\035\n\031VEHI" +
      "CLE_INTERACT_TYPE_OUT\020\002B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
