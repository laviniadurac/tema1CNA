package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: person.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Person.UserRequest,
      proto.Person.Response> getGetNameAndCNPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNameAndCNP",
      requestType = proto.Person.UserRequest.class,
      responseType = proto.Person.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Person.UserRequest,
      proto.Person.Response> getGetNameAndCNPMethod() {
    io.grpc.MethodDescriptor<proto.Person.UserRequest, proto.Person.Response> getGetNameAndCNPMethod;
    if ((getGetNameAndCNPMethod = PersonServiceGrpc.getGetNameAndCNPMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetNameAndCNPMethod = PersonServiceGrpc.getGetNameAndCNPMethod) == null) {
          PersonServiceGrpc.getGetNameAndCNPMethod = getGetNameAndCNPMethod = 
              io.grpc.MethodDescriptor.<proto.Person.UserRequest, proto.Person.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getNameAndCNP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getNameAndCNP"))
                  .build();
          }
        }
     }
     return getGetNameAndCNPMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNameAndCNP(proto.Person.UserRequest request,
        io.grpc.stub.StreamObserver<proto.Person.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameAndCNPMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNameAndCNPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Person.UserRequest,
                proto.Person.Response>(
                  this, METHODID_GET_NAME_AND_CNP)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNameAndCNP(proto.Person.UserRequest request,
        io.grpc.stub.StreamObserver<proto.Person.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameAndCNPMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Person.Response getNameAndCNP(proto.Person.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNameAndCNPMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Person.Response> getNameAndCNP(
        proto.Person.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameAndCNPMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME_AND_CNP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAME_AND_CNP:
          serviceImpl.getNameAndCNP((proto.Person.UserRequest) request,
              (io.grpc.stub.StreamObserver<proto.Person.Response>) responseObserver);
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Person.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetNameAndCNPMethod())
              .build();
        }
      }
    }
    return result;
  }
}
