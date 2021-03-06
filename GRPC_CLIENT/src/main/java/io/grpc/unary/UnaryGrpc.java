// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: unary.proto

package io.grpc.unary;

public final class UnaryGrpc {
  private UnaryGrpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnaryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:unary.UnaryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string RequsetParm1 = 1;</code>
     */
    java.lang.String getRequsetParm1();
    /**
     * <code>string RequsetParm1 = 1;</code>
     */
    com.google.protobuf.ByteString
        getRequsetParm1Bytes();
  }
  /**
   * Protobuf type {@code unary.UnaryRequest}
   */
  public  static final class UnaryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:unary.UnaryRequest)
      UnaryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnaryRequest.newBuilder() to construct.
    private UnaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnaryRequest() {
      requsetParm1_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnaryRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              requsetParm1_ = s;
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
      return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.unary.UnaryGrpc.UnaryRequest.class, io.grpc.unary.UnaryGrpc.UnaryRequest.Builder.class);
    }

    public static final int REQUSETPARM1_FIELD_NUMBER = 1;
    private volatile java.lang.Object requsetParm1_;
    /**
     * <code>string RequsetParm1 = 1;</code>
     */
    public java.lang.String getRequsetParm1() {
      java.lang.Object ref = requsetParm1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requsetParm1_ = s;
        return s;
      }
    }
    /**
     * <code>string RequsetParm1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequsetParm1Bytes() {
      java.lang.Object ref = requsetParm1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requsetParm1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRequsetParm1Bytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requsetParm1_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRequsetParm1Bytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requsetParm1_);
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
      if (!(obj instanceof io.grpc.unary.UnaryGrpc.UnaryRequest)) {
        return super.equals(obj);
      }
      io.grpc.unary.UnaryGrpc.UnaryRequest other = (io.grpc.unary.UnaryGrpc.UnaryRequest) obj;

      boolean result = true;
      result = result && getRequsetParm1()
          .equals(other.getRequsetParm1());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQUSETPARM1_FIELD_NUMBER;
      hash = (53 * hash) + getRequsetParm1().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.grpc.unary.UnaryGrpc.UnaryRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code unary.UnaryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:unary.UnaryRequest)
        io.grpc.unary.UnaryGrpc.UnaryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grpc.unary.UnaryGrpc.UnaryRequest.class, io.grpc.unary.UnaryGrpc.UnaryRequest.Builder.class);
      }

      // Construct using io.grpc.unary.UnaryGrpc.UnaryRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        requsetParm1_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryRequest_descriptor;
      }

      public io.grpc.unary.UnaryGrpc.UnaryRequest getDefaultInstanceForType() {
        return io.grpc.unary.UnaryGrpc.UnaryRequest.getDefaultInstance();
      }

      public io.grpc.unary.UnaryGrpc.UnaryRequest build() {
        io.grpc.unary.UnaryGrpc.UnaryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.grpc.unary.UnaryGrpc.UnaryRequest buildPartial() {
        io.grpc.unary.UnaryGrpc.UnaryRequest result = new io.grpc.unary.UnaryGrpc.UnaryRequest(this);
        result.requsetParm1_ = requsetParm1_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.grpc.unary.UnaryGrpc.UnaryRequest) {
          return mergeFrom((io.grpc.unary.UnaryGrpc.UnaryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grpc.unary.UnaryGrpc.UnaryRequest other) {
        if (other == io.grpc.unary.UnaryGrpc.UnaryRequest.getDefaultInstance()) return this;
        if (!other.getRequsetParm1().isEmpty()) {
          requsetParm1_ = other.requsetParm1_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.grpc.unary.UnaryGrpc.UnaryRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grpc.unary.UnaryGrpc.UnaryRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object requsetParm1_ = "";
      /**
       * <code>string RequsetParm1 = 1;</code>
       */
      public java.lang.String getRequsetParm1() {
        java.lang.Object ref = requsetParm1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          requsetParm1_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string RequsetParm1 = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRequsetParm1Bytes() {
        java.lang.Object ref = requsetParm1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requsetParm1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string RequsetParm1 = 1;</code>
       */
      public Builder setRequsetParm1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requsetParm1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string RequsetParm1 = 1;</code>
       */
      public Builder clearRequsetParm1() {
        
        requsetParm1_ = getDefaultInstance().getRequsetParm1();
        onChanged();
        return this;
      }
      /**
       * <code>string RequsetParm1 = 1;</code>
       */
      public Builder setRequsetParm1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requsetParm1_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:unary.UnaryRequest)
    }

    // @@protoc_insertion_point(class_scope:unary.UnaryRequest)
    private static final io.grpc.unary.UnaryGrpc.UnaryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grpc.unary.UnaryGrpc.UnaryRequest();
    }

    public static io.grpc.unary.UnaryGrpc.UnaryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnaryRequest>
        PARSER = new com.google.protobuf.AbstractParser<UnaryRequest>() {
      public UnaryRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnaryRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnaryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnaryRequest> getParserForType() {
      return PARSER;
    }

    public io.grpc.unary.UnaryGrpc.UnaryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UnaryReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:unary.UnaryReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string ReplyParm1 = 1;</code>
     */
    java.lang.String getReplyParm1();
    /**
     * <code>string ReplyParm1 = 1;</code>
     */
    com.google.protobuf.ByteString
        getReplyParm1Bytes();
  }
  /**
   * Protobuf type {@code unary.UnaryReply}
   */
  public  static final class UnaryReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:unary.UnaryReply)
      UnaryReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnaryReply.newBuilder() to construct.
    private UnaryReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnaryReply() {
      replyParm1_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnaryReply(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              replyParm1_ = s;
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
      return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.unary.UnaryGrpc.UnaryReply.class, io.grpc.unary.UnaryGrpc.UnaryReply.Builder.class);
    }

    public static final int REPLYPARM1_FIELD_NUMBER = 1;
    private volatile java.lang.Object replyParm1_;
    /**
     * <code>string ReplyParm1 = 1;</code>
     */
    public java.lang.String getReplyParm1() {
      java.lang.Object ref = replyParm1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        replyParm1_ = s;
        return s;
      }
    }
    /**
     * <code>string ReplyParm1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReplyParm1Bytes() {
      java.lang.Object ref = replyParm1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        replyParm1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getReplyParm1Bytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, replyParm1_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReplyParm1Bytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, replyParm1_);
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
      if (!(obj instanceof io.grpc.unary.UnaryGrpc.UnaryReply)) {
        return super.equals(obj);
      }
      io.grpc.unary.UnaryGrpc.UnaryReply other = (io.grpc.unary.UnaryGrpc.UnaryReply) obj;

      boolean result = true;
      result = result && getReplyParm1()
          .equals(other.getReplyParm1());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REPLYPARM1_FIELD_NUMBER;
      hash = (53 * hash) + getReplyParm1().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grpc.unary.UnaryGrpc.UnaryReply parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.grpc.unary.UnaryGrpc.UnaryReply prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code unary.UnaryReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:unary.UnaryReply)
        io.grpc.unary.UnaryGrpc.UnaryReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryReply_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grpc.unary.UnaryGrpc.UnaryReply.class, io.grpc.unary.UnaryGrpc.UnaryReply.Builder.class);
      }

      // Construct using io.grpc.unary.UnaryGrpc.UnaryReply.newBuilder()
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
      public Builder clear() {
        super.clear();
        replyParm1_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grpc.unary.UnaryGrpc.internal_static_unary_UnaryReply_descriptor;
      }

      public io.grpc.unary.UnaryGrpc.UnaryReply getDefaultInstanceForType() {
        return io.grpc.unary.UnaryGrpc.UnaryReply.getDefaultInstance();
      }

      public io.grpc.unary.UnaryGrpc.UnaryReply build() {
        io.grpc.unary.UnaryGrpc.UnaryReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.grpc.unary.UnaryGrpc.UnaryReply buildPartial() {
        io.grpc.unary.UnaryGrpc.UnaryReply result = new io.grpc.unary.UnaryGrpc.UnaryReply(this);
        result.replyParm1_ = replyParm1_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.grpc.unary.UnaryGrpc.UnaryReply) {
          return mergeFrom((io.grpc.unary.UnaryGrpc.UnaryReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grpc.unary.UnaryGrpc.UnaryReply other) {
        if (other == io.grpc.unary.UnaryGrpc.UnaryReply.getDefaultInstance()) return this;
        if (!other.getReplyParm1().isEmpty()) {
          replyParm1_ = other.replyParm1_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.grpc.unary.UnaryGrpc.UnaryReply parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grpc.unary.UnaryGrpc.UnaryReply) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object replyParm1_ = "";
      /**
       * <code>string ReplyParm1 = 1;</code>
       */
      public java.lang.String getReplyParm1() {
        java.lang.Object ref = replyParm1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          replyParm1_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ReplyParm1 = 1;</code>
       */
      public com.google.protobuf.ByteString
          getReplyParm1Bytes() {
        java.lang.Object ref = replyParm1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          replyParm1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ReplyParm1 = 1;</code>
       */
      public Builder setReplyParm1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        replyParm1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string ReplyParm1 = 1;</code>
       */
      public Builder clearReplyParm1() {
        
        replyParm1_ = getDefaultInstance().getReplyParm1();
        onChanged();
        return this;
      }
      /**
       * <code>string ReplyParm1 = 1;</code>
       */
      public Builder setReplyParm1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        replyParm1_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:unary.UnaryReply)
    }

    // @@protoc_insertion_point(class_scope:unary.UnaryReply)
    private static final io.grpc.unary.UnaryGrpc.UnaryReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grpc.unary.UnaryGrpc.UnaryReply();
    }

    public static io.grpc.unary.UnaryGrpc.UnaryReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnaryReply>
        PARSER = new com.google.protobuf.AbstractParser<UnaryReply>() {
      public UnaryReply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnaryReply(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnaryReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnaryReply> getParserForType() {
      return PARSER;
    }

    public io.grpc.unary.UnaryGrpc.UnaryReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_unary_UnaryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_unary_UnaryRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_unary_UnaryReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_unary_UnaryReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013unary.proto\022\005unary\"$\n\014UnaryRequest\022\024\n\014" +
      "RequsetParm1\030\001 \001(\t\" \n\nUnaryReply\022\022\n\nRepl" +
      "yParm1\030\001 \001(\t2E\n\014UnaryService\0225\n\tUnaryCal" +
      "l\022\023.unary.UnaryRequest\032\021.unary.UnaryRepl" +
      "y\"\000B\032\n\rio.grpc.unaryB\tUnaryGrpcb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_unary_UnaryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_unary_UnaryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_unary_UnaryRequest_descriptor,
        new java.lang.String[] { "RequsetParm1", });
    internal_static_unary_UnaryReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_unary_UnaryReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_unary_UnaryReply_descriptor,
        new java.lang.String[] { "ReplyParm1", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
