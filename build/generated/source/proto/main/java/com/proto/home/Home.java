// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/home.proto

package com.proto.home;

public final class Home {
  private Home() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_Bath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_Bath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_BathRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_BathRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_BathResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_BathResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_Light_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_Light_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_LightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_LightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_LightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_LightResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_Printer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_Printer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_PrinterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_PrinterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_PrinterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_PrinterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_Vacuum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_Vacuum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_VacuumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_VacuumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_VacuumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_VacuumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017home/home.proto\022\004home\"P\n\004Bath\022\r\n\005title" +
      "\030\001 \001(\t\022\014\n\004time\030\002 \001(\001\022+\n\016temp_sentiment\030\003" +
      " \001(\0162\023.home.TempSentiment\"\'\n\013BathRequest" +
      "\022\030\n\004bath\030\001 \001(\0132\n.home.Bath\"\036\n\014BathRespon" +
      "se\022\016\n\006result\030\001 \001(\t\"+\n\005Light\022\"\n\014light_act" +
      "ion\030\001 \001(\0162\014.home.Action\"*\n\014LightRequest\022" +
      "\032\n\005light\030\001 \001(\0132\013.home.Light\"\037\n\rLightResp" +
      "onse\022\016\n\006result\030\001 \001(\t\"d\n\007Printer\022\014\n\004name\030" +
      "\001 \001(\t\022\020\n\010document\030\002 \001(\t\022\021\n\tnum_pages\030\003 \001" +
      "(\005\022&\n\013orientation\030\004 \001(\0162\021.home.Orientati" +
      "on\"0\n\016PrinterRequest\022\036\n\007printer\030\001 \001(\0132\r." +
      "home.Printer\"!\n\017PrinterResponse\022\016\n\006resul" +
      "t\030\001 \001(\t\"\030\n\006Vacuum\022\016\n\006action\030\001 \001(\t\"-\n\rVac" +
      "uumRequest\022\034\n\006vacuum\030\001 \001(\0132\014.home.Vacuum" +
      "\" \n\016VacuumResponse\022\016\n\006result\030\001 \001(\t*,\n\rTe" +
      "mpSentiment\022\010\n\004COLD\020\000\022\010\n\004WARM\020\001\022\007\n\003HOT\020\002" +
      "*\031\n\006Action\022\006\n\002ON\020\000\022\007\n\003OFF\020\001**\n\013Orientati" +
      "on\022\014\n\010PORTRAIT\020\000\022\r\n\tLANDSCAPE\020\0012\351\001\n\013Home" +
      "Service\022-\n\004Bath\022\021.home.BathRequest\032\022.hom" +
      "e.BathResponse\0224\n\005Light\022\022.home.LightRequ" +
      "est\032\023.home.LightResponse\"\000(\001\022:\n\007Printer\022" +
      "\024.home.PrinterRequest\032\025.home.PrinterResp" +
      "onse\"\0000\001\0229\n\006Vacuum\022\023.home.VacuumRequest\032" +
      "\024.home.VacuumResponse\"\000(\0010\001B\022\n\016com.proto" +
      ".homeP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_home_Bath_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_home_Bath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_Bath_descriptor,
        new java.lang.String[] { "Title", "Time", "TempSentiment", });
    internal_static_home_BathRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_home_BathRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_BathRequest_descriptor,
        new java.lang.String[] { "Bath", });
    internal_static_home_BathResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_home_BathResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_BathResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_home_Light_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_home_Light_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_Light_descriptor,
        new java.lang.String[] { "LightAction", });
    internal_static_home_LightRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_home_LightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_LightRequest_descriptor,
        new java.lang.String[] { "Light", });
    internal_static_home_LightResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_home_LightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_LightResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_home_Printer_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_home_Printer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_Printer_descriptor,
        new java.lang.String[] { "Name", "Document", "NumPages", "Orientation", });
    internal_static_home_PrinterRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_home_PrinterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_PrinterRequest_descriptor,
        new java.lang.String[] { "Printer", });
    internal_static_home_PrinterResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_home_PrinterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_PrinterResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_home_Vacuum_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_home_Vacuum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_Vacuum_descriptor,
        new java.lang.String[] { "Action", });
    internal_static_home_VacuumRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_home_VacuumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_VacuumRequest_descriptor,
        new java.lang.String[] { "Vacuum", });
    internal_static_home_VacuumResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_home_VacuumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_VacuumResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
