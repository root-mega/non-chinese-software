// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ADHOJAAOLNO.proto

// Protobuf Java Version: 3.25.0-rc1
package emu.grasscutter.net.proto;

public final class ADHOJAAOLNOOuterClass {
  private ADHOJAAOLNOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ADHOJAAOLNO}
   */
  public enum ADHOJAAOLNO
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeNone = 0;</code>
     */
    ADHOJAAOLNO_DungeonCandidateAvatarTypeNone(0),
    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeFormal = 1;</code>
     */
    ADHOJAAOLNO_DungeonCandidateAvatarTypeFormal(1),
    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeUgc = 2;</code>
     */
    ADHOJAAOLNO_DungeonCandidateAvatarTypeUgc(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeNone = 0;</code>
     */
    public static final int ADHOJAAOLNO_DungeonCandidateAvatarTypeNone_VALUE = 0;
    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeFormal = 1;</code>
     */
    public static final int ADHOJAAOLNO_DungeonCandidateAvatarTypeFormal_VALUE = 1;
    /**
     * <code>ADHOJAAOLNO_DungeonCandidateAvatarTypeUgc = 2;</code>
     */
    public static final int ADHOJAAOLNO_DungeonCandidateAvatarTypeUgc_VALUE = 2;


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
    public static ADHOJAAOLNO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ADHOJAAOLNO forNumber(int value) {
      switch (value) {
        case 0: return ADHOJAAOLNO_DungeonCandidateAvatarTypeNone;
        case 1: return ADHOJAAOLNO_DungeonCandidateAvatarTypeFormal;
        case 2: return ADHOJAAOLNO_DungeonCandidateAvatarTypeUgc;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ADHOJAAOLNO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ADHOJAAOLNO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ADHOJAAOLNO>() {
            public ADHOJAAOLNO findValueByNumber(int number) {
              return ADHOJAAOLNO.forNumber(number);
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
      return emu.grasscutter.net.proto.ADHOJAAOLNOOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ADHOJAAOLNO[] VALUES = values();

    public static ADHOJAAOLNO valueOf(
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

    private ADHOJAAOLNO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ADHOJAAOLNO)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ADHOJAAOLNO.proto*\236\001\n\013ADHOJAAOLNO\022.\n*A" +
      "DHOJAAOLNO_DungeonCandidateAvatarTypeNon" +
      "e\020\000\0220\n,ADHOJAAOLNO_DungeonCandidateAvata" +
      "rTypeFormal\020\001\022-\n)ADHOJAAOLNO_DungeonCand" +
      "idateAvatarTypeUgc\020\002B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
