// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/home.proto

package com.proto.home;

/**
 * Protobuf enum {@code home.TempSentiment}
 */
public enum TempSentiment
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COLD = 0;</code>
   */
  COLD(0),
  /**
   * <code>WARM = 1;</code>
   */
  WARM(1),
  /**
   * <code>HOT = 2;</code>
   */
  HOT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COLD = 0;</code>
   */
  public static final int COLD_VALUE = 0;
  /**
   * <code>WARM = 1;</code>
   */
  public static final int WARM_VALUE = 1;
  /**
   * <code>HOT = 2;</code>
   */
  public static final int HOT_VALUE = 2;


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
  public static TempSentiment valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TempSentiment forNumber(int value) {
    switch (value) {
      case 0: return COLD;
      case 1: return WARM;
      case 2: return HOT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TempSentiment>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TempSentiment> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TempSentiment>() {
          public TempSentiment findValueByNumber(int number) {
            return TempSentiment.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.proto.home.Home.getDescriptor().getEnumTypes().get(0);
  }

  private static final TempSentiment[] VALUES = values();

  public static TempSentiment valueOf(
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

  private TempSentiment(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:home.TempSentiment)
}

