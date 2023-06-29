// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package com.movies.rental;

/**
 * Protobuf type {@code com.movies.rental.GetCustomerResponse}
 */
public final class GetCustomerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.movies.rental.GetCustomerResponse)
    GetCustomerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCustomerResponse.newBuilder() to construct.
  private GetCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCustomerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCustomerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCustomerResponse(
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
            com.movies.rental.Customer.Builder subBuilder = null;
            if (customer_ != null) {
              subBuilder = customer_.toBuilder();
            }
            customer_ = input.readMessage(com.movies.rental.Customer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customer_);
              customer_ = subBuilder.buildPartial();
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
    return com.movies.rental.CustomerOuterClass.internal_static_com_movies_rental_GetCustomerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.movies.rental.CustomerOuterClass.internal_static_com_movies_rental_GetCustomerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.movies.rental.GetCustomerResponse.class, com.movies.rental.GetCustomerResponse.Builder.class);
  }

  public static final int CUSTOMER_FIELD_NUMBER = 1;
  private com.movies.rental.Customer customer_;
  /**
   * <code>.com.movies.rental.Customer customer = 1;</code>
   * @return Whether the customer field is set.
   */
  @java.lang.Override
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   * <code>.com.movies.rental.Customer customer = 1;</code>
   * @return The customer.
   */
  @java.lang.Override
  public com.movies.rental.Customer getCustomer() {
    return customer_ == null ? com.movies.rental.Customer.getDefaultInstance() : customer_;
  }
  /**
   * <code>.com.movies.rental.Customer customer = 1;</code>
   */
  @java.lang.Override
  public com.movies.rental.CustomerOrBuilder getCustomerOrBuilder() {
    return getCustomer();
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
    if (customer_ != null) {
      output.writeMessage(1, getCustomer());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomer());
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
    if (!(obj instanceof com.movies.rental.GetCustomerResponse)) {
      return super.equals(obj);
    }
    com.movies.rental.GetCustomerResponse other = (com.movies.rental.GetCustomerResponse) obj;

    if (hasCustomer() != other.hasCustomer()) return false;
    if (hasCustomer()) {
      if (!getCustomer()
          .equals(other.getCustomer())) return false;
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
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.movies.rental.GetCustomerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.movies.rental.GetCustomerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.movies.rental.GetCustomerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.movies.rental.GetCustomerResponse parseFrom(
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
  public static Builder newBuilder(com.movies.rental.GetCustomerResponse prototype) {
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
   * Protobuf type {@code com.movies.rental.GetCustomerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.movies.rental.GetCustomerResponse)
      com.movies.rental.GetCustomerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.movies.rental.CustomerOuterClass.internal_static_com_movies_rental_GetCustomerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.movies.rental.CustomerOuterClass.internal_static_com_movies_rental_GetCustomerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.movies.rental.GetCustomerResponse.class, com.movies.rental.GetCustomerResponse.Builder.class);
    }

    // Construct using com.movies.rental.GetCustomerResponse.newBuilder()
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
      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.movies.rental.CustomerOuterClass.internal_static_com_movies_rental_GetCustomerResponse_descriptor;
    }

    @java.lang.Override
    public com.movies.rental.GetCustomerResponse getDefaultInstanceForType() {
      return com.movies.rental.GetCustomerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.movies.rental.GetCustomerResponse build() {
      com.movies.rental.GetCustomerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.movies.rental.GetCustomerResponse buildPartial() {
      com.movies.rental.GetCustomerResponse result = new com.movies.rental.GetCustomerResponse(this);
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
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
      if (other instanceof com.movies.rental.GetCustomerResponse) {
        return mergeFrom((com.movies.rental.GetCustomerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.movies.rental.GetCustomerResponse other) {
      if (other == com.movies.rental.GetCustomerResponse.getDefaultInstance()) return this;
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
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
      com.movies.rental.GetCustomerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.movies.rental.GetCustomerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.movies.rental.Customer customer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.movies.rental.Customer, com.movies.rental.Customer.Builder, com.movies.rental.CustomerOrBuilder> customerBuilder_;
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     * @return The customer.
     */
    public com.movies.rental.Customer getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null ? com.movies.rental.Customer.getDefaultInstance() : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public Builder setCustomer(com.movies.rental.Customer value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public Builder setCustomer(
        com.movies.rental.Customer.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public Builder mergeCustomer(com.movies.rental.Customer value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
            com.movies.rental.Customer.newBuilder(customer_).mergeFrom(value).buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public com.movies.rental.Customer.Builder getCustomerBuilder() {
      
      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    public com.movies.rental.CustomerOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null ?
            com.movies.rental.Customer.getDefaultInstance() : customer_;
      }
    }
    /**
     * <code>.com.movies.rental.Customer customer = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.movies.rental.Customer, com.movies.rental.Customer.Builder, com.movies.rental.CustomerOrBuilder> 
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.movies.rental.Customer, com.movies.rental.Customer.Builder, com.movies.rental.CustomerOrBuilder>(
                getCustomer(),
                getParentForChildren(),
                isClean());
        customer_ = null;
      }
      return customerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.movies.rental.GetCustomerResponse)
  }

  // @@protoc_insertion_point(class_scope:com.movies.rental.GetCustomerResponse)
  private static final com.movies.rental.GetCustomerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.movies.rental.GetCustomerResponse();
  }

  public static com.movies.rental.GetCustomerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCustomerResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCustomerResponse>() {
    @java.lang.Override
    public GetCustomerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCustomerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCustomerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCustomerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.movies.rental.GetCustomerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
