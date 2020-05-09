package com.freezk.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: HelloWorld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HelloWorld.HelloRequest,
      HelloWorld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = HelloWorld.HelloRequest.class,
      responseType = HelloWorld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HelloWorld.HelloRequest,
      HelloWorld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<HelloWorld.HelloRequest, HelloWorld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<HelloWorld.HelloRequest, HelloWorld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloWorld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloWorld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(HelloWorld.HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloWorld.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HelloWorld.HelloRequest,
                HelloWorld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }

//    public abstract void sayHello(com.freezk.provider.server.HelloWorld.HelloRequest req, StreamObserver<com.freezk.provider.server.HelloWorld.HelloReply> responseObserver);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(HelloWorld.HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloWorld.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public HelloWorld.HelloReply sayHello(HelloWorld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloWorld.HelloReply> sayHello(
        HelloWorld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((HelloWorld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloWorld.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }

  public static final class HelloWorld {
    private HelloWorld() {}
    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistry registry) {
      registerAllExtensions(
          (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface HelloRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:helloworld.HelloRequest)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      String getName();
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      com.google.protobuf.ByteString
          getNameBytes();
    }
    /**
     * <pre>
     * The request message containing the user's name.
     * </pre>
     *
     * Protobuf type {@code helloworld.HelloRequest}
     */
    public  static final class HelloRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:helloworld.HelloRequest)
            HelloRequestOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use HelloRequest.newBuilder() to construct.
      private HelloRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private HelloRequest() {
        name_ = "";
      }

      @Override
      @SuppressWarnings({"unused"})
      protected Object newInstance(
          UnusedPrivateParameter unused) {
        return new HelloRequest();
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private HelloRequest(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new NullPointerException();
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
                String s = input.readStringRequireUtf8();

                name_ = s;
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
        return HelloWorld.internal_static_helloworld_HelloRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HelloWorld.internal_static_helloworld_HelloRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HelloRequest.class, Builder.class);
      }

      public static final int NAME_FIELD_NUMBER = 1;
      private volatile Object name_;
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      @Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getNameBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
        }
        unknownFields.writeTo(output);
      }

      @Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getNameBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @Override
      public boolean equals(final Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof HelloRequest)) {
          return super.equals(obj);
        }
        HelloRequest other = (HelloRequest) obj;

        if (!getName()
            .equals(other.getName())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static HelloRequest parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloRequest parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloRequest parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloRequest parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloRequest parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloRequest parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloRequest parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HelloRequest parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static HelloRequest parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static HelloRequest parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static HelloRequest parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HelloRequest parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(HelloRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @Override
      protected Builder newBuilderForType(
          BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * The request message containing the user's name.
       * </pre>
       *
       * Protobuf type {@code helloworld.HelloRequest}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:helloworld.HelloRequest)
              HelloRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return HelloWorld.internal_static_helloworld_HelloRequest_descriptor;
        }

        @Override
        protected FieldAccessorTable
            internalGetFieldAccessorTable() {
          return HelloWorld.internal_static_helloworld_HelloRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  HelloRequest.class, Builder.class);
        }

        // Construct using com.freezk.provider.server.GreeterGrpc.HelloWorld.HelloRequest.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @Override
        public Builder clear() {
          super.clear();
          name_ = "";

          return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return HelloWorld.internal_static_helloworld_HelloRequest_descriptor;
        }

        @Override
        public HelloRequest getDefaultInstanceForType() {
          return HelloRequest.getDefaultInstance();
        }

        @Override
        public HelloRequest build() {
          HelloRequest result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @Override
        public HelloRequest buildPartial() {
          HelloRequest result = new HelloRequest(this);
          result.name_ = name_;
          onBuilt();
          return result;
        }

        @Override
        public Builder clone() {
          return super.clone();
        }
        @Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return super.setField(field, value);
        }
        @Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return super.addRepeatedField(field, value);
        }
        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof HelloRequest) {
            return mergeFrom((HelloRequest)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(HelloRequest other) {
          if (other == HelloRequest.getDefaultInstance()) return this;
          if (!other.getName().isEmpty()) {
            name_ = other.name_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @Override
        public final boolean isInitialized() {
          return true;
        }

        @Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          HelloRequest parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (HelloRequest) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private Object name_ = "";
        /**
         * <code>string name = 1;</code>
         * @return The name.
         */
        public String getName() {
          Object ref = name_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            name_ = s;
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>string name = 1;</code>
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string name = 1;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
            String value) {
          if (value == null) {
      throw new NullPointerException();
    }

          name_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {

          name_ = getDefaultInstance().getName();
          onChanged();
          return this;
        }
        /**
         * <code>string name = 1;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
      throw new NullPointerException();
    }
    checkByteStringIsUtf8(value);

          name_ = value;
          onChanged();
          return this;
        }
        @Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:helloworld.HelloRequest)
      }

      // @@protoc_insertion_point(class_scope:helloworld.HelloRequest)
      private static final HelloRequest DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new HelloRequest();
      }

      public static HelloRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<HelloRequest>
          PARSER = new com.google.protobuf.AbstractParser<HelloRequest>() {
        @Override
        public HelloRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HelloRequest(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<HelloRequest> parser() {
        return PARSER;
      }

      @Override
      public com.google.protobuf.Parser<HelloRequest> getParserForType() {
        return PARSER;
      }

      @Override
      public HelloRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface HelloReplyOrBuilder extends
        // @@protoc_insertion_point(interface_extends:helloworld.HelloReply)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>string message = 1;</code>
       * @return The message.
       */
      String getMessage();
      /**
       * <code>string message = 1;</code>
       * @return The bytes for message.
       */
      com.google.protobuf.ByteString
          getMessageBytes();
    }
    /**
     * <pre>
     * The response message containing the greetings
     * </pre>
     *
     * Protobuf type {@code helloworld.HelloReply}
     */
    public  static final class HelloReply extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:helloworld.HelloReply)
            HelloReplyOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use HelloReply.newBuilder() to construct.
      private HelloReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private HelloReply() {
        message_ = "";
      }

      @Override
      @SuppressWarnings({"unused"})
      protected Object newInstance(
          UnusedPrivateParameter unused) {
        return new HelloReply();
      }

      @Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private HelloReply(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new NullPointerException();
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
                String s = input.readStringRequireUtf8();

                message_ = s;
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
        return HelloWorld.internal_static_helloworld_HelloReply_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HelloWorld.internal_static_helloworld_HelloReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HelloReply.class, Builder.class);
      }

      public static final int MESSAGE_FIELD_NUMBER = 1;
      private volatile Object message_;
      /**
       * <code>string message = 1;</code>
       * @return The message.
       */
      public String getMessage() {
        Object ref = message_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          message_ = s;
          return s;
        }
      }
      /**
       * <code>string message = 1;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      @Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getMessageBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
        }
        unknownFields.writeTo(output);
      }

      @Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getMessageBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @Override
      public boolean equals(final Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof HelloReply)) {
          return super.equals(obj);
        }
        HelloReply other = (HelloReply) obj;

        if (!getMessage()
            .equals(other.getMessage())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static HelloReply parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloReply parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloReply parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloReply parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloReply parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HelloReply parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HelloReply parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HelloReply parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static HelloReply parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static HelloReply parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static HelloReply parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HelloReply parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(HelloReply prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @Override
      protected Builder newBuilderForType(
          BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * The response message containing the greetings
       * </pre>
       *
       * Protobuf type {@code helloworld.HelloReply}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:helloworld.HelloReply)
              HelloReplyOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return HelloWorld.internal_static_helloworld_HelloReply_descriptor;
        }

        @Override
        protected FieldAccessorTable
            internalGetFieldAccessorTable() {
          return HelloWorld.internal_static_helloworld_HelloReply_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  HelloReply.class, Builder.class);
        }

        // Construct using com.freezk.provider.server.GreeterGrpc.HelloWorld.HelloReply.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @Override
        public Builder clear() {
          super.clear();
          message_ = "";

          return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return HelloWorld.internal_static_helloworld_HelloReply_descriptor;
        }

        @Override
        public HelloReply getDefaultInstanceForType() {
          return HelloReply.getDefaultInstance();
        }

        @Override
        public HelloReply build() {
          HelloReply result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @Override
        public HelloReply buildPartial() {
          HelloReply result = new HelloReply(this);
          result.message_ = message_;
          onBuilt();
          return result;
        }

        @Override
        public Builder clone() {
          return super.clone();
        }
        @Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return super.setField(field, value);
        }
        @Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return super.addRepeatedField(field, value);
        }
        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof HelloReply) {
            return mergeFrom((HelloReply)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(HelloReply other) {
          if (other == HelloReply.getDefaultInstance()) return this;
          if (!other.getMessage().isEmpty()) {
            message_ = other.message_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @Override
        public final boolean isInitialized() {
          return true;
        }

        @Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          HelloReply parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (HelloReply) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private Object message_ = "";
        /**
         * <code>string message = 1;</code>
         * @return The message.
         */
        public String getMessage() {
          Object ref = message_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            message_ = s;
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>string message = 1;</code>
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
            getMessageBytes() {
          Object ref = message_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            message_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string message = 1;</code>
         * @param value The message to set.
         * @return This builder for chaining.
         */
        public Builder setMessage(
            String value) {
          if (value == null) {
      throw new NullPointerException();
    }

          message_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string message = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearMessage() {

          message_ = getDefaultInstance().getMessage();
          onChanged();
          return this;
        }
        /**
         * <code>string message = 1;</code>
         * @param value The bytes for message to set.
         * @return This builder for chaining.
         */
        public Builder setMessageBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
      throw new NullPointerException();
    }
    checkByteStringIsUtf8(value);

          message_ = value;
          onChanged();
          return this;
        }
        @Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:helloworld.HelloReply)
      }

      // @@protoc_insertion_point(class_scope:helloworld.HelloReply)
      private static final HelloReply DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new HelloReply();
      }

      public static HelloReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<HelloReply>
          PARSER = new com.google.protobuf.AbstractParser<HelloReply>() {
        @Override
        public HelloReply parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HelloReply(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<HelloReply> parser() {
        return PARSER;
      }

      @Override
      public com.google.protobuf.Parser<HelloReply> getParserForType() {
        return PARSER;
      }

      @Override
      public HelloReply getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_helloworld_HelloRequest_descriptor;
    private static final
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_helloworld_HelloRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_helloworld_HelloReply_descriptor;
    private static final
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_helloworld_HelloReply_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
        getDescriptor() {
      return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
        descriptor;
    static {
      String[] descriptorData = {
        "\n\020HelloWorld.proto\022\nhelloworld\"\034\n\014HelloR" +
        "equest\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007me" +
        "ssage\030\001 \001(\t2I\n\007Greeter\022>\n\010SayHello\022\030.hel" +
        "loworld.HelloRequest\032\026.helloworld.HelloR" +
        "eply\"\000B\025\n\023com.freezk.consumerb\006proto3"
      };
      descriptor = com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
          new com.google.protobuf.Descriptors.FileDescriptor[] {
          });
      internal_static_helloworld_HelloRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
      internal_static_helloworld_HelloRequest_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
          internal_static_helloworld_HelloRequest_descriptor,
          new String[] { "Name", });
      internal_static_helloworld_HelloReply_descriptor =
        getDescriptor().getMessageTypes().get(1);
      internal_static_helloworld_HelloReply_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
          internal_static_helloworld_HelloReply_descriptor,
          new String[] { "Message", });
    }

    // @@protoc_insertion_point(outer_class_scope)
  }
}
