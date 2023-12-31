// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NIEIDCBLDML.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class NIEIDCBLDMLOuterClass {
  private NIEIDCBLDMLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code NIEIDCBLDML}
   */
  public enum NIEIDCBLDML
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NIEIDCBLDML_SandwormLevelNotOpen = 0;</code>
     */
    NIEIDCBLDML_SandwormLevelNotOpen(0),
    /**
     * <code>NIEIDCBLDML_SandwormLevelPreQuest = 1;</code>
     */
    NIEIDCBLDML_SandwormLevelPreQuest(1),
    /**
     * <code>NIEIDCBLDML_SandwormLevelStart = 2;</code>
     */
    NIEIDCBLDML_SandwormLevelStart(2),
    /**
     * <code>NIEIDCBLDML_SandwormLevelSequelQuest = 3;</code>
     */
    NIEIDCBLDML_SandwormLevelSequelQuest(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NIEIDCBLDML_SandwormLevelNotOpen = 0;</code>
     */
    public static final int NIEIDCBLDML_SandwormLevelNotOpen_VALUE = 0;
    /**
     * <code>NIEIDCBLDML_SandwormLevelPreQuest = 1;</code>
     */
    public static final int NIEIDCBLDML_SandwormLevelPreQuest_VALUE = 1;
    /**
     * <code>NIEIDCBLDML_SandwormLevelStart = 2;</code>
     */
    public static final int NIEIDCBLDML_SandwormLevelStart_VALUE = 2;
    /**
     * <code>NIEIDCBLDML_SandwormLevelSequelQuest = 3;</code>
     */
    public static final int NIEIDCBLDML_SandwormLevelSequelQuest_VALUE = 3;


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
    public static NIEIDCBLDML valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NIEIDCBLDML forNumber(int value) {
      switch (value) {
        case 0: return NIEIDCBLDML_SandwormLevelNotOpen;
        case 1: return NIEIDCBLDML_SandwormLevelPreQuest;
        case 2: return NIEIDCBLDML_SandwormLevelStart;
        case 3: return NIEIDCBLDML_SandwormLevelSequelQuest;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NIEIDCBLDML>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NIEIDCBLDML> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NIEIDCBLDML>() {
            public NIEIDCBLDML findValueByNumber(int number) {
              return NIEIDCBLDML.forNumber(number);
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
      return emu.grasscutter.net.proto.NIEIDCBLDMLOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final NIEIDCBLDML[] VALUES = values();

    public static NIEIDCBLDML valueOf(
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

    private NIEIDCBLDML(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:NIEIDCBLDML)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NIEIDCBLDML.proto*\250\001\n\013NIEIDCBLDML\022$\n N" +
      "IEIDCBLDML_SandwormLevelNotOpen\020\000\022%\n!NIE" +
      "IDCBLDML_SandwormLevelPreQuest\020\001\022\"\n\036NIEI" +
      "DCBLDML_SandwormLevelStart\020\002\022(\n$NIEIDCBL" +
      "DML_SandwormLevelSequelQuest\020\003B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
