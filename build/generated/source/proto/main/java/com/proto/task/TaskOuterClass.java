// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/task.proto

package com.proto.task;

public final class TaskOuterClass {
  private TaskOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_CreateTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_CreateTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_CreateTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_CreateTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_ReadTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_ReadTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_ReadTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_ReadTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_UpdateTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_UpdateTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_UpdateTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_UpdateTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_DeleteTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_DeleteTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_DeleteTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_DeleteTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_ListTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_ListTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_ListTaskResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_ListTaskResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_task_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_task_Task_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017task/task.proto\022\004task\"-\n\021CreateTaskReq" +
      "uest\022\030\n\004task\030\001 \001(\0132\n.task.Task\".\n\022Create" +
      "TaskResponse\022\030\n\004task\030\001 \001(\0132\n.task.Task\"\"" +
      "\n\017ReadTaskRequest\022\017\n\007task_id\030\001 \001(\t\",\n\020Re" +
      "adTaskResponse\022\030\n\004task\030\001 \001(\0132\n.task.Task" +
      "\"-\n\021UpdateTaskRequest\022\030\n\004task\030\001 \001(\0132\n.ta" +
      "sk.Task\".\n\022UpdateTaskResponse\022\030\n\004task\030\001 " +
      "\001(\0132\n.task.Task\"$\n\021DeleteTaskRequest\022\017\n\007" +
      "task_id\030\001 \001(\t\"%\n\022DeleteTaskResponse\022\017\n\007t" +
      "ask_id\030\001 \001(\t\"\021\n\017ListTaskRequest\",\n\020ListT" +
      "askResponse\022\030\n\004task\030\001 \001(\0132\n.task.Task\"2\n" +
      "\004Task\022\n\n\002id\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022\017\n\007cont" +
      "ent\030\003 \001(\t2\322\002\n\013TaskService\022A\n\nCreateTask\022" +
      "\027.task.CreateTaskRequest\032\030.task.CreateTa" +
      "skResponse\"\000\022;\n\010ReadTask\022\025.task.ReadTask" +
      "Request\032\026.task.ReadTaskResponse\"\000\022A\n\nUpd" +
      "ateTask\022\027.task.UpdateTaskRequest\032\030.task." +
      "UpdateTaskResponse\"\000\022A\n\nDeleteTask\022\027.tas" +
      "k.DeleteTaskRequest\032\030.task.DeleteTaskRes" +
      "ponse\"\000\022=\n\010ListTask\022\025.task.ListTaskReque" +
      "st\032\026.task.ListTaskResponse\"\0000\001B\022\n\016com.pr" +
      "oto.taskP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_task_CreateTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_task_CreateTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_CreateTaskRequest_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_CreateTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_task_CreateTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_CreateTaskResponse_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_ReadTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_task_ReadTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_ReadTaskRequest_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_task_ReadTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_task_ReadTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_ReadTaskResponse_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_UpdateTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_task_UpdateTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_UpdateTaskRequest_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_UpdateTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_task_UpdateTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_UpdateTaskResponse_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_DeleteTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_task_DeleteTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_DeleteTaskRequest_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_task_DeleteTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_task_DeleteTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_DeleteTaskResponse_descriptor,
        new java.lang.String[] { "TaskId", });
    internal_static_task_ListTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_task_ListTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_ListTaskRequest_descriptor,
        new java.lang.String[] { });
    internal_static_task_ListTaskResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_task_ListTaskResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_ListTaskResponse_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_task_Task_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_task_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_task_Task_descriptor,
        new java.lang.String[] { "Id", "Title", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
