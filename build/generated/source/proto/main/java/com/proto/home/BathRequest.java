// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/home.proto

package com.proto.home;

/**
 * Protobuf type {@code home.BathRequest}
 */
public  final class BathRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:home.BathRequest)
    BathRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BathRequest.newBuilder() to construct.
  private BathRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BathRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BathRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BathRequest(
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
          case 10: {
            com.proto.home.Bath.Builder subBuilder = null;
            if (bath_ != null) {
              subBuilder = bath_.toBuilder();
            }
            bath_ = input.readMessage(com.proto.home.Bath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bath_);
              bath_ = subBuilder.buildPartial();
            }

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
    return com.proto.home.Home.internal_static_home_BathRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.home.Home.internal_static_home_BathRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.home.BathRequest.class, com.proto.home.BathRequest.Builder.class);
  }

  public static final int BATH_FIELD_NUMBER = 1;
  private com.proto.home.Bath bath_;
  /**
   * <code>.home.Bath bath = 1;</code>
   * @return Whether the bath field is set.
   */
  public boolean hasBath() {
    return bath_ != null;
  }
  /**
   * <code>.home.Bath bath = 1;</code>
   * @return The bath.
   */
  public com.proto.home.Bath getBath() {
    return bath_ == null ? com.proto.home.Bath.getDefaultInstance() : bath_;
  }
  /**
   * <code>.home.Bath bath = 1;</code>
   */
  public com.proto.home.BathOrBuilder getBathOrBuilder() {
    return getBath();
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
    if (bath_ != null) {
      output.writeMessage(1, getBath());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bath_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBath());
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
    if (!(obj instanceof com.proto.home.BathRequest)) {
      return super.equals(obj);
    }
    com.proto.home.BathRequest other = (com.proto.home.BathRequest) obj;

    if (hasBath() != other.hasBath()) return false;
    if (hasBath()) {
      if (!getBath()
          .equals(other.getBath())) return false;
    }
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
    if (hasBath()) {
      hash = (37 * hash) + BATH_FIELD_NUMBER;
      hash = (53 * hash) + getBath().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.home.BathRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.home.BathRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.home.BathRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.home.BathRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.home.BathRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.home.BathRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.home.BathRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.home.BathRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.home.BathRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.home.BathRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.home.BathRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.home.BathRequest parseFrom(
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
  public static Builder newBuilder(com.proto.home.BathRequest prototype) {
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
   * Protobuf type {@code home.BathRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:home.BathRequest)
      com.proto.home.BathRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.home.Home.internal_static_home_BathRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.home.Home.internal_static_home_BathRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.home.BathRequest.class, com.proto.home.BathRequest.Builder.class);
    }

    // Construct using com.proto.home.BathRequest.newBuilder()
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
      if (bathBuilder_ == null) {
        bath_ = null;
      } else {
        bath_ = null;
        bathBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.home.Home.internal_static_home_BathRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.home.BathRequest getDefaultInstanceForType() {
      return com.proto.home.BathRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.home.BathRequest build() {
      com.proto.home.BathRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.home.BathRequest buildPartial() {
      com.proto.home.BathRequest result = new com.proto.home.BathRequest(this);
      if (bathBuilder_ == null) {
        result.bath_ = bath_;
      } else {
        result.bath_ = bathBuilder_.build();
      }
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
      if (other instanceof com.proto.home.BathRequest) {
        return mergeFrom((com.proto.home.BathRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.home.BathRequest other) {
      if (other == com.proto.home.BathRequest.getDefaultInstance()) return this;
      if (other.hasBath()) {
        mergeBath(other.getBath());
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
      com.proto.home.BathRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.home.BathRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.home.Bath bath_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.home.Bath, com.proto.home.Bath.Builder, com.proto.home.BathOrBuilder> bathBuilder_;
    /**
     * <code>.home.Bath bath = 1;</code>
     * @return Whether the bath field is set.
     */
    public boolean hasBath() {
      return bathBuilder_ != null || bath_ != null;
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     * @return The bath.
     */
    public com.proto.home.Bath getBath() {
      if (bathBuilder_ == null) {
        return bath_ == null ? com.proto.home.Bath.getDefaultInstance() : bath_;
      } else {
        return bathBuilder_.getMessage();
      }
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public Builder setBath(com.proto.home.Bath value) {
      if (bathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bath_ = value;
        onChanged();
      } else {
        bathBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public Builder setBath(
        com.proto.home.Bath.Builder builderForValue) {
      if (bathBuilder_ == null) {
        bath_ = builderForValue.build();
        onChanged();
      } else {
        bathBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public Builder mergeBath(com.proto.home.Bath value) {
      if (bathBuilder_ == null) {
        if (bath_ != null) {
          bath_ =
            com.proto.home.Bath.newBuilder(bath_).mergeFrom(value).buildPartial();
        } else {
          bath_ = value;
        }
        onChanged();
      } else {
        bathBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public Builder clearBath() {
      if (bathBuilder_ == null) {
        bath_ = null;
        onChanged();
      } else {
        bath_ = null;
        bathBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public com.proto.home.Bath.Builder getBathBuilder() {
      
      onChanged();
      return getBathFieldBuilder().getBuilder();
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    public com.proto.home.BathOrBuilder getBathOrBuilder() {
      if (bathBuilder_ != null) {
        return bathBuilder_.getMessageOrBuilder();
      } else {
        return bath_ == null ?
            com.proto.home.Bath.getDefaultInstance() : bath_;
      }
    }
    /**
     * <code>.home.Bath bath = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.home.Bath, com.proto.home.Bath.Builder, com.proto.home.BathOrBuilder> 
        getBathFieldBuilder() {
      if (bathBuilder_ == null) {
        bathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.home.Bath, com.proto.home.Bath.Builder, com.proto.home.BathOrBuilder>(
                getBath(),
                getParentForChildren(),
                isClean());
        bath_ = null;
      }
      return bathBuilder_;
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


    // @@protoc_insertion_point(builder_scope:home.BathRequest)
  }

  // @@protoc_insertion_point(class_scope:home.BathRequest)
  private static final com.proto.home.BathRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.home.BathRequest();
  }

  public static com.proto.home.BathRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BathRequest>
      PARSER = new com.google.protobuf.AbstractParser<BathRequest>() {
    @java.lang.Override
    public BathRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BathRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BathRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BathRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.home.BathRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

