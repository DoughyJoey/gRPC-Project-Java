// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_watch/watch.proto

package com.proto.smart_watch;

/**
 * Protobuf type {@code smart_watch.CalorieRequest}
 */
public  final class CalorieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smart_watch.CalorieRequest)
    CalorieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalorieRequest.newBuilder() to construct.
  private CalorieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalorieRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalorieRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalorieRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            firstNumber_ = input.readInt32();
            break;
          }
          case 16: {

            secondNumber_ = input.readInt32();
            break;
          }
          case 24: {

            thirdNumber_ = input.readInt32();
            break;
          }
          case 32: {

            fourthNumber_ = input.readInt32();
            break;
          }
          case 40: {

            fifthNumber_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.smart_watch.Watch.internal_static_smart_watch_CalorieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.smart_watch.Watch.internal_static_smart_watch_CalorieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.smart_watch.CalorieRequest.class, com.proto.smart_watch.CalorieRequest.Builder.class);
  }

  public static final int FIRST_NUMBER_FIELD_NUMBER = 1;
  private int firstNumber_;
  /**
   * <code>int32 first_number = 1;</code>
   * @return The firstNumber.
   */
  public int getFirstNumber() {
    return firstNumber_;
  }

  public static final int SECOND_NUMBER_FIELD_NUMBER = 2;
  private int secondNumber_;
  /**
   * <code>int32 second_number = 2;</code>
   * @return The secondNumber.
   */
  public int getSecondNumber() {
    return secondNumber_;
  }

  public static final int THIRD_NUMBER_FIELD_NUMBER = 3;
  private int thirdNumber_;
  /**
   * <code>int32 third_number = 3;</code>
   * @return The thirdNumber.
   */
  public int getThirdNumber() {
    return thirdNumber_;
  }

  public static final int FOURTH_NUMBER_FIELD_NUMBER = 4;
  private int fourthNumber_;
  /**
   * <code>int32 fourth_number = 4;</code>
   * @return The fourthNumber.
   */
  public int getFourthNumber() {
    return fourthNumber_;
  }

  public static final int FIFTH_NUMBER_FIELD_NUMBER = 5;
  private int fifthNumber_;
  /**
   * <code>int32 fifth_number = 5;</code>
   * @return The fifthNumber.
   */
  public int getFifthNumber() {
    return fifthNumber_;
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
    if (firstNumber_ != 0) {
      output.writeInt32(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      output.writeInt32(2, secondNumber_);
    }
    if (thirdNumber_ != 0) {
      output.writeInt32(3, thirdNumber_);
    }
    if (fourthNumber_ != 0) {
      output.writeInt32(4, fourthNumber_);
    }
    if (fifthNumber_ != 0) {
      output.writeInt32(5, fifthNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNumber_);
    }
    if (thirdNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, thirdNumber_);
    }
    if (fourthNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fourthNumber_);
    }
    if (fifthNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, fifthNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.smart_watch.CalorieRequest)) {
      return super.equals(obj);
    }
    com.proto.smart_watch.CalorieRequest other = (com.proto.smart_watch.CalorieRequest) obj;

    if (getFirstNumber()
        != other.getFirstNumber()) return false;
    if (getSecondNumber()
        != other.getSecondNumber()) return false;
    if (getThirdNumber()
        != other.getThirdNumber()) return false;
    if (getFourthNumber()
        != other.getFourthNumber()) return false;
    if (getFifthNumber()
        != other.getFifthNumber()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRST_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNumber();
    hash = (37 * hash) + SECOND_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNumber();
    hash = (37 * hash) + THIRD_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getThirdNumber();
    hash = (37 * hash) + FOURTH_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFourthNumber();
    hash = (37 * hash) + FIFTH_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFifthNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.smart_watch.CalorieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.smart_watch.CalorieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.smart_watch.CalorieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.smart_watch.CalorieRequest parseFrom(
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
  public static Builder newBuilder(com.proto.smart_watch.CalorieRequest prototype) {
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
   * Protobuf type {@code smart_watch.CalorieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smart_watch.CalorieRequest)
      com.proto.smart_watch.CalorieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.smart_watch.Watch.internal_static_smart_watch_CalorieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.smart_watch.Watch.internal_static_smart_watch_CalorieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.smart_watch.CalorieRequest.class, com.proto.smart_watch.CalorieRequest.Builder.class);
    }

    // Construct using com.proto.smart_watch.CalorieRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstNumber_ = 0;

      secondNumber_ = 0;

      thirdNumber_ = 0;

      fourthNumber_ = 0;

      fifthNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.smart_watch.Watch.internal_static_smart_watch_CalorieRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.smart_watch.CalorieRequest getDefaultInstanceForType() {
      return com.proto.smart_watch.CalorieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.smart_watch.CalorieRequest build() {
      com.proto.smart_watch.CalorieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.smart_watch.CalorieRequest buildPartial() {
      com.proto.smart_watch.CalorieRequest result = new com.proto.smart_watch.CalorieRequest(this);
      result.firstNumber_ = firstNumber_;
      result.secondNumber_ = secondNumber_;
      result.thirdNumber_ = thirdNumber_;
      result.fourthNumber_ = fourthNumber_;
      result.fifthNumber_ = fifthNumber_;
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
      if (other instanceof com.proto.smart_watch.CalorieRequest) {
        return mergeFrom((com.proto.smart_watch.CalorieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.smart_watch.CalorieRequest other) {
      if (other == com.proto.smart_watch.CalorieRequest.getDefaultInstance()) return this;
      if (other.getFirstNumber() != 0) {
        setFirstNumber(other.getFirstNumber());
      }
      if (other.getSecondNumber() != 0) {
        setSecondNumber(other.getSecondNumber());
      }
      if (other.getThirdNumber() != 0) {
        setThirdNumber(other.getThirdNumber());
      }
      if (other.getFourthNumber() != 0) {
        setFourthNumber(other.getFourthNumber());
      }
      if (other.getFifthNumber() != 0) {
        setFifthNumber(other.getFifthNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.proto.smart_watch.CalorieRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.smart_watch.CalorieRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstNumber_ ;
    /**
     * <code>int32 first_number = 1;</code>
     * @return The firstNumber.
     */
    public int getFirstNumber() {
      return firstNumber_;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @param value The firstNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNumber(int value) {
      
      firstNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNumber() {
      
      firstNumber_ = 0;
      onChanged();
      return this;
    }

    private int secondNumber_ ;
    /**
     * <code>int32 second_number = 2;</code>
     * @return The secondNumber.
     */
    public int getSecondNumber() {
      return secondNumber_;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @param value The secondNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNumber(int value) {
      
      secondNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNumber() {
      
      secondNumber_ = 0;
      onChanged();
      return this;
    }

    private int thirdNumber_ ;
    /**
     * <code>int32 third_number = 3;</code>
     * @return The thirdNumber.
     */
    public int getThirdNumber() {
      return thirdNumber_;
    }
    /**
     * <code>int32 third_number = 3;</code>
     * @param value The thirdNumber to set.
     * @return This builder for chaining.
     */
    public Builder setThirdNumber(int value) {
      
      thirdNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 third_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearThirdNumber() {
      
      thirdNumber_ = 0;
      onChanged();
      return this;
    }

    private int fourthNumber_ ;
    /**
     * <code>int32 fourth_number = 4;</code>
     * @return The fourthNumber.
     */
    public int getFourthNumber() {
      return fourthNumber_;
    }
    /**
     * <code>int32 fourth_number = 4;</code>
     * @param value The fourthNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFourthNumber(int value) {
      
      fourthNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fourth_number = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFourthNumber() {
      
      fourthNumber_ = 0;
      onChanged();
      return this;
    }

    private int fifthNumber_ ;
    /**
     * <code>int32 fifth_number = 5;</code>
     * @return The fifthNumber.
     */
    public int getFifthNumber() {
      return fifthNumber_;
    }
    /**
     * <code>int32 fifth_number = 5;</code>
     * @param value The fifthNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFifthNumber(int value) {
      
      fifthNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fifth_number = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFifthNumber() {
      
      fifthNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:smart_watch.CalorieRequest)
  }

  // @@protoc_insertion_point(class_scope:smart_watch.CalorieRequest)
  private static final com.proto.smart_watch.CalorieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.smart_watch.CalorieRequest();
  }

  public static com.proto.smart_watch.CalorieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalorieRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalorieRequest>() {
    @java.lang.Override
    public CalorieRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalorieRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalorieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalorieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.smart_watch.CalorieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

