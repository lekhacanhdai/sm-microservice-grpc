// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student/student.proto

package com.student.manage.student.proto;

public final class StudentOuterClass {
  private StudentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_StudentPageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_StudentPageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_ListStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_ListStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_StudentPageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_StudentPageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_StudentGrpcError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_StudentGrpcError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_StudentGrpcError_ErrorsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_StudentGrpcError_ErrorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_ListStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_ListStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_ListStudentResponse_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_ListStudentResponse_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_ListStudentResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_ListStudentResponse_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025student/student.proto\022\007student\032\033google" +
      "/protobuf/empty.proto\"\216\001\n\022StudentPageReq" +
      "uest\022\021\n\004page\030\001 \001(\005H\000\210\001\001\022\021\n\004size\030\002 \001(\005H\001\210" +
      "\001\001\022\021\n\004sort\030\003 \001(\tH\002\210\001\001\022\026\n\tdirection\030\004 \001(\t" +
      "H\003\210\001\001B\007\n\005_pageB\007\n\005_sizeB\007\n\005_sortB\014\n\n_dir" +
      "ection\"\377\001\n\022ListStudentRequest\0221\n\014page_re" +
      "quest\030\001 \001(\0132\033.student.StudentPageRequest" +
      "\022\027\n\nfirst_name\030\002 \001(\tH\000\210\001\001\022\026\n\tlast_name\030\003" +
      " \001(\tH\001\210\001\001\022\025\n\010from_age\030\004 \001(\005H\002\210\001\001\022\023\n\006to_a" +
      "ge\030\005 \001(\005H\003\210\001\001\022\020\n\010class_id\030\006 \001(\003\022\022\n\nall_i" +
      "n_one\030\007 \001(\010B\r\n\013_first_nameB\014\n\n_last_name" +
      "B\013\n\t_from_ageB\t\n\007_to_age\"\\\n\023StudentPageR" +
      "esponse\022\014\n\004page\030\001 \001(\005\022\014\n\004size\030\002 \001(\005\022\025\n\rt" +
      "otal_element\030\003 \001(\003\022\022\n\ntotal_page\030\004 \001(\003\"\303" +
      "\001\n\020StudentGrpcError\022\014\n\004code\030\001 \001(\t\022\017\n\007mes" +
      "sage\030\002 \001(\t\0225\n\006errors\030\003 \003(\0132%.student.Stu" +
      "dentGrpcError.ErrorsEntry\022\021\n\texception\030\004" +
      " \001(\t\022\027\n\017is_client_error\030\005 \001(\010\032-\n\013ErrorsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\343\002\n" +
      "\023ListStudentResponse\022\017\n\007success\030\001 \001(\010\0221\n" +
      "\004data\030\002 \001(\0132!.student.ListStudentRespons" +
      "e.DataH\000\022*\n\005error\030\003 \001(\0132\031.student.Studen" +
      "tGrpcErrorH\000\032[\n\007Student\022\n\n\002id\030\001 \001(\003\022\022\n\nf" +
      "irst_name\030\002 \001(\t\022\021\n\tlast_name\030\003 \001(\t\022\013\n\003ag" +
      "e\030\004 \001(\005\022\020\n\010class_id\030\005 \001(\003\032s\n\004Data\0223\n\rpag" +
      "e_response\030\001 \001(\0132\034.student.StudentPageRe" +
      "sponse\0226\n\010students\030\002 \003(\0132$.student.ListS" +
      "tudentResponse.StudentB\n\n\010response2]\n\016St" +
      "udentService\022K\n\014ListStudents\022\033.student.L" +
      "istStudentRequest\032\034.student.ListStudentR" +
      "esponse\"\000B$\n com.student.manage.student." +
      "protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_student_StudentPageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_student_StudentPageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_StudentPageRequest_descriptor,
        new java.lang.String[] { "Page", "Size", "Sort", "Direction", "Page", "Size", "Sort", "Direction", });
    internal_static_student_ListStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_student_ListStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_ListStudentRequest_descriptor,
        new java.lang.String[] { "PageRequest", "FirstName", "LastName", "FromAge", "ToAge", "ClassId", "AllInOne", "FirstName", "LastName", "FromAge", "ToAge", });
    internal_static_student_StudentPageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_student_StudentPageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_StudentPageResponse_descriptor,
        new java.lang.String[] { "Page", "Size", "TotalElement", "TotalPage", });
    internal_static_student_StudentGrpcError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_student_StudentGrpcError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_StudentGrpcError_descriptor,
        new java.lang.String[] { "Code", "Message", "Errors", "Exception", "IsClientError", });
    internal_static_student_StudentGrpcError_ErrorsEntry_descriptor =
      internal_static_student_StudentGrpcError_descriptor.getNestedTypes().get(0);
    internal_static_student_StudentGrpcError_ErrorsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_StudentGrpcError_ErrorsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_student_ListStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_student_ListStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_ListStudentResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Error", "Response", });
    internal_static_student_ListStudentResponse_Student_descriptor =
      internal_static_student_ListStudentResponse_descriptor.getNestedTypes().get(0);
    internal_static_student_ListStudentResponse_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_ListStudentResponse_Student_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "Age", "ClassId", });
    internal_static_student_ListStudentResponse_Data_descriptor =
      internal_static_student_ListStudentResponse_descriptor.getNestedTypes().get(1);
    internal_static_student_ListStudentResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_ListStudentResponse_Data_descriptor,
        new java.lang.String[] { "PageResponse", "Students", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}