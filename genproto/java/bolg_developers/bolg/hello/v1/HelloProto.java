// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bolg/hello/v1/hello.proto

package bolg_developers.bolg.hello.v1;

public final class HelloProto {
  private HelloProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bolg_hello_v1_GreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bolg_hello_v1_GreetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031bolg/hello/v1/hello.proto\022\rbolg.hello." +
      "v1\032\025bolg/type/empty.proto\" \n\rGreetRespon" +
      "se\022\017\n\007message\030\001 \001(\t2B\n\005Hello\0229\n\005Greet\022\020." +
      "bolg.type.Empty\032\034.bolg.hello.v1.GreetRes" +
      "ponse\"\000Bm\n\035bolg_developers.bolg.hello.v1" +
      "B\nHelloProtoP\001Z>github.com/bolg-develope" +
      "rs/BoLG-Server/genproto/hello/v1;hellob\006" +
      "proto3"
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
          bolg_developers.bolg.type.TypeProto.getDescriptor(),
        }, assigner);
    internal_static_bolg_hello_v1_GreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bolg_hello_v1_GreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bolg_hello_v1_GreetResponse_descriptor,
        new java.lang.String[] { "Message", });
    bolg_developers.bolg.type.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}