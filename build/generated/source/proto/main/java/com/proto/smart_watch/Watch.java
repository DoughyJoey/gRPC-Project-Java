// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_watch/watch.proto

package com.proto.smart_watch;

public final class Watch {
  private Watch() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_CalorieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_CalorieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_CalorieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_CalorieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_SleepAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_SleepAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_SleepAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_SleepAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_MaxHeartRateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_MaxHeartRateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_MaxHeartRateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_MaxHeartRateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_Alarm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_Alarm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_AlarmRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_AlarmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smart_watch_AlarmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smart_watch_AlarmResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027smart_watch/watch.proto\022\013smart_watch\"\200" +
      "\001\n\016CalorieRequest\022\024\n\014first_number\030\001 \001(\005\022" +
      "\025\n\rsecond_number\030\002 \001(\005\022\024\n\014third_number\030\003" +
      " \001(\005\022\025\n\rfourth_number\030\004 \001(\005\022\024\n\014fifth_num" +
      "ber\030\005 \001(\005\"%\n\017CalorieResponse\022\022\n\nsum_resu" +
      "lt\030\001 \001(\005\"%\n\023SleepAverageRequest\022\016\n\006numbe" +
      "r\030\001 \001(\005\"\'\n\024SleepAverageResponse\022\017\n\007avera" +
      "ge\030\001 \001(\001\"%\n\023MaxHeartRateRequest\022\016\n\006numbe" +
      "r\030\001 \001(\005\"\'\n\024MaxHeartRateResponse\022\017\n\007maxim" +
      "um\030\001 \001(\005\"\025\n\005Alarm\022\014\n\004time\030\001 \001(\005\"1\n\014Alarm" +
      "Request\022!\n\005alarm\030\001 \001(\0132\022.smart_watch.Ala" +
      "rm\"\037\n\rAlarmResponse\022\016\n\006result\030\001 \001(\t2\317\002\n\014" +
      "WatchService\022G\n\010Calories\022\033.smart_watch.C" +
      "alorieRequest\032\034.smart_watch.CalorieRespo" +
      "nse\"\000\022W\n\014SleepAverage\022 .smart_watch.Slee" +
      "pAverageRequest\032!.smart_watch.SleepAvera" +
      "geResponse\"\000(\001\022B\n\005Alarm\022\031.smart_watch.Al" +
      "armRequest\032\032.smart_watch.AlarmResponse\"\000" +
      "0\001\022Y\n\014MaxHeartRate\022 .smart_watch.MaxHear" +
      "tRateRequest\032!.smart_watch.MaxHeartRateR" +
      "esponse\"\000(\0010\001B\031\n\025com.proto.smart_watchP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_smart_watch_CalorieRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smart_watch_CalorieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_CalorieRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", "ThirdNumber", "FourthNumber", "FifthNumber", });
    internal_static_smart_watch_CalorieResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smart_watch_CalorieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_CalorieResponse_descriptor,
        new java.lang.String[] { "SumResult", });
    internal_static_smart_watch_SleepAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smart_watch_SleepAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_SleepAverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_smart_watch_SleepAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smart_watch_SleepAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_SleepAverageResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_smart_watch_MaxHeartRateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smart_watch_MaxHeartRateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_MaxHeartRateRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_smart_watch_MaxHeartRateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smart_watch_MaxHeartRateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_MaxHeartRateResponse_descriptor,
        new java.lang.String[] { "Maximum", });
    internal_static_smart_watch_Alarm_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smart_watch_Alarm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_Alarm_descriptor,
        new java.lang.String[] { "Time", });
    internal_static_smart_watch_AlarmRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smart_watch_AlarmRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_AlarmRequest_descriptor,
        new java.lang.String[] { "Alarm", });
    internal_static_smart_watch_AlarmResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_smart_watch_AlarmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smart_watch_AlarmResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
