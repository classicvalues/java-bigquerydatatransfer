/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public final class DataSourceProto {
  private DataSourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "6google/cloud/bigquery/datatransfer/v1/datasource.proto\022%google.cloud.bigquery."
          + "datatransfer.v1\032\034google/api/annotations."
          + "proto\0328google/cloud/bigquery/datatransfer/v1/datatransfer.proto\0324google/cloud/bi"
          + "gquery/datatransfer/v1/transfer.proto\032\036g"
          + "oogle/protobuf/duration.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\032\036google/protobuf/wrappers.proto\032\027google/api/client.proto\"\236\016\n"
          + "\020ImportedDataInfo\022\013\n"
          + "\003sql\030\001 \001(\t\022\034\n"
          + "\024destination_table_id\030\002 \001(\t\022%\n"
          + "\035destination_table_description\030\n"
          + " \001(\t\022[\n\n"
          + "table_defs\030\003"
          + " \003(\0132G.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition\022\036\n"
          + "\026user_defined_functions\030\004 \003(\t\022R\n"
          + "\021write_disposition\030\006"
          + " \001(\01627.google.cloud.bigquery.datatransfer.v1.WriteDisposition\032\255\003\n"
          + "\013FieldSchema\022\022\n\n"
          + "field_name\030\001 \001(\t\022V\n"
          + "\004type\030\002"
          + " \001(\0162H.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.FieldSchema.Type\022\023\n"
          + "\013is_repeated\030\003 \001(\010\022\023\n"
          + "\013description\030\004 \001(\t\022T\n"
          + "\006schema\030\005"
          + " \001(\0132D.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.RecordSchema\"\261\001\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006STRING\020\001\022\013\n"
          + "\007INTEGER\020\002\022\t\n"
          + "\005FLOAT\020\003\022\n\n"
          + "\006RECORD\020\004\022\t\n"
          + "\005BYTES\020\005\022\013\n"
          + "\007BOOLEAN\020\006\022\r\n"
          + "\tTIMESTAMP\020\007\022\010\n"
          + "\004DATE\020\010\022\010\n"
          + "\004TIME\020\t\022\014\n"
          + "\010DATETIME\020\n"
          + "\022\013\n"
          + "\007NUMERIC\020\013\022\r\n"
          + "\tGEOGRAPHY\020\014\032c\n"
          + "\014RecordSchema\022S\n"
          + "\006fields\030\001"
          + " \003(\0132C.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.FieldSchema\032\221\006\n"
          + "\017TableDefinition\022\020\n"
          + "\010table_id\030\001 \001(\t\022\023\n"
          + "\013source_uris\030\002 \003(\t\022N\n"
          + "\006format\030\003"
          + " \001(\0162>.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.Format\022\027\n"
          + "\017max_bad_records\030\004 \001(\005\022R\n"
          + "\010encoding\030\005"
          + " \001(\0162@.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.Encoding\022g\n"
          + "\013csv_options\030\006"
          + " \001(\0132R.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition.CsvOptions\022T\n"
          + "\006schema\030\007"
          + " \001(\0132D.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.RecordSchema\0229\n"
          + "\025ignore_unknown_values\030\n"
          + " \001(\0132\032.google.protobuf.BoolValue\032\237\002\n\n"
          + "CsvOptions\0225\n"
          + "\017field_delimiter\030\001 \001(\0132\034.google.protobuf.StringValue\0229\n"
          + "\025allow_quoted_newlines\030\002 \001(\0132\032.google.protobuf.BoolValue\0220\n\n"
          + "quote_char\030\003 \001(\0132\034.google.protobuf.StringValue\0226\n"
          + "\021skip_leading_rows\030\004 \001(\0132\033.google.protobuf.Int64Value\0225\n"
          + "\021allow_jagged_rows\030\005 \001(\0132\032.google.protobuf.BoolValue\"~\n"
          + "\006Format\022\026\n"
          + "\022FORMAT_UNSPECIFIED\020\000\022\007\n"
          + "\003CSV\020\001\022\010\n"
          + "\004JSON\020\002\022\010\n"
          + "\004AVRO\020\003\022\014\n"
          + "\010RECORDIO\020\004\022\014\n"
          + "\010COLUMNIO\020\005\022\r\n"
          + "\tCAPACITOR\020\006\022\013\n"
          + "\007PARQUET\020\007\022\007\n"
          + "\003ORC\020\010\">\n"
          + "\010Encoding\022\030\n"
          + "\024ENCODING_UNSPECIFIED\020\000\022\016\n\n"
          + "ISO_8859_1\020\001\022\010\n"
          + "\004UTF8\020\002\"\225\001\n"
          + "\030UpdateTransferRunRequest\022H\n"
          + "\014transfer_run\030\001"
          + " \001(\01322.google.cloud.bigquery.datatransfer.v1.TransferRun\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"\200\001\n"
          + "\035LogTransferRunMessagesRequest\022\014\n"
          + "\004name\030\001 \001(\t\022Q\n"
          + "\021transfer_messages\030\002"
          + " \003(\01326.google.cloud.bigquery.datatransfer.v1.TransferMessage\"\253\001\n"
          + "\030StartBigQueryJobsRequest\022\014\n"
          + "\004name\030\001 \001(\t\022N\n\r"
          + "imported_data\030\002"
          + " \003(\01327.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo\022\030\n"
          + "\020user_credentials\030\003 \001(\014\022\027\n"
          + "\017max_parallelism\030\010 \001(\005\" \n"
          + "\020FinishRunRequest\022\014\n"
          + "\004name\030\001 \001(\t\"\220\001\n"
          + "!CreateDataSourceDefinitionRequest\022\016\n"
          + "\006parent\030\001 \001(\t\022[\n"
          + "\026data_source_definition\030\002"
          + " \001(\0132;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\"\261\001\n"
          + "!UpdateDataSourceDefinitionRequest\022[\n"
          + "\026data_source_definition\030\001"
          + " \001(\0132;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"1\n"
          + "!DeleteDataSourceDefinitionRequest\022\014\n"
          + "\004name\030\001 \001(\t\".\n"
          + "\036GetDataSourceDefinitionRequest\022\014\n"
          + "\004name\030\001 \001(\t\"Y\n"
          + " ListDataSourceDefinitionsRequest\022\016\n"
          + "\006parent\030\001 \001(\t\022\022\n\n"
          + "page_token\030\002 \001(\t\022\021\n"
          + "\tpage_size\030\003 \001(\005\"\232\001\n"
          + "!ListDataSourceDefinitionsResponse\022\\\n"
          + "\027data_source_definitions\030\001"
          + " \003(\0132;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\313\002\n"
          + "\024DataSourceDefinition\022\014\n"
          + "\004name\030\025 \001(\t\022F\n"
          + "\013data_source\030\001"
          + " \001(\01321.google.cloud.bigquery.datatransfer.v1.DataSource\022!\n"
          + "\031transfer_run_pubsub_topic\030\r"
          + " \001(\t\0222\n"
          + "\017run_time_offset\030\020 \001(\0132\031.google.protobuf.Duration\022\025\n\r"
          + "support_email\030\026 \001(\t\022\027\n"
          + "\017service_account\030\002 \001(\t\022\020\n"
          + "\010disabled\030\005 \001(\010\022$\n"
          + "\034transfer_config_pubsub_topic\030\014 \001(\t\022\036\n"
          + "\026supported_location_ids\030\027 \003(\t*[\n"
          + "\020WriteDisposition\022!\n"
          + "\035WRITE_DISPOSITION_UNSPECIFIED\020\000\022\022\n"
          + "\016WRITE_TRUNCATE\020\001\022\020\n"
          + "\014WRITE_APPEND\020\0022\235\020\n"
          + "\021DataSourceService\022\347\001\n"
          + "\021UpdateTransferRun\022?.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest\0322.google.cloud.bigquery.datatransfer.v1.TransferRun\"]\202\323\344\223\002W2G/v1/{transfer_run.name=projects/*/locations/*/transferConfigs/*/runs/*}:\014transfer_run\022\311\001\n"
          + "\026LogTransferRunMessages\022D.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest\032\026.google.protobuf.Empty\"Q\202\323\344\223\002K\"F/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:logMessages:\001*\022\305\001\n"
          + "\021StartBigQueryJobs\022?.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest\032\026.google.protobuf.Empty\"W\202\323\344\223\002Q\"L/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:startBigQueryJobs:\001*\022\255\001\n"
          + "\tFinishRun\0227.google.cloud.bigquery.datatransfer.v1.FinishRunRequest\032\026.google.protobuf.Empty\"O\202\323\344\223\002I\"D/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:finishRun:\001*\022\376\001\n"
          + "\032CreateDataSourceDefinition\022H.google.clou"
          + "d.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest\032;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\"Y\202\323\344\223\002S\"9/v1/{parent=projects/*/locations/*}/dataSourceDefinitions:\026data_source_definition\022\225\002\n"
          + "\032UpdateDataSourceDefinition\022H.google.cloud.bigquery.datatransfer"
          + ".v1.UpdateDataSourceDefinitionRequest\032;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\"p\202\323\344\223\002j2P/v1/{data_source_definition.name=projects/*/locations/*/dataSourceDefinitions/*}:\026data_source_definition\022\301\001\n"
          + "\032DeleteDataSourceDefinition\022H.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest\032\026.google.protobuf.Empty\"A\202\323\344\223\002;*9/v1/{name=projects/*/locations/*/dataSourceDefinitions/*}\022\340\001\n"
          + "\027GetDataSourceDefinition\022E.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest\032;.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition\"A\202\323\344\223\002;\0229/v1/{name=projects/*/locations/*/dataSourceDefinitions/*}\022\361\001\n"
          + "\031ListDataSourceDefinitions\022G.google.cloud"
          + ".bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest\032H.google.cloud.bigque"
          + "ry.datatransfer.v1.ListDataSourceDefinitionsResponse\"A\202\323\344\223\002;\0229/v1/{parent=projects/*/locations/*}/dataSourceDefinitions\032&\312A#bigquerydatatransfer.googleapis.comB\341\001\n"
          + ")com.google.cloud.bigquery.datatransfer.v1B\017DataSourceProtoP\001ZQgoogle.golang."
          + "org/genproto/googleapis/cloud/bigquery/datatransfer/v1;datatransfer\252\002%Google.Clo"
          + "ud.BigQuery.DataTransfer.V1\312\002%Google\\Clo"
          + "ud\\BigQuery\\DataTransfer\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.getDescriptor(),
          com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor,
            new java.lang.String[] {
              "Sql",
              "DestinationTableId",
              "DestinationTableDescription",
              "TableDefs",
              "UserDefinedFunctions",
              "WriteDisposition",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor =
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor,
            new java.lang.String[] {
              "FieldName", "Type", "IsRepeated", "Description", "Schema",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor =
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor =
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor,
            new java.lang.String[] {
              "TableId",
              "SourceUris",
              "Format",
              "MaxBadRecords",
              "Encoding",
              "CsvOptions",
              "Schema",
              "IgnoreUnknownValues",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor =
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor,
            new java.lang.String[] {
              "FieldDelimiter",
              "AllowQuotedNewlines",
              "QuoteChar",
              "SkipLeadingRows",
              "AllowJaggedRows",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor,
            new java.lang.String[] {
              "TransferRun", "UpdateMask",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor,
            new java.lang.String[] {
              "Name", "TransferMessages",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor,
            new java.lang.String[] {
              "Name", "ImportedData", "UserCredentials", "MaxParallelism",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DataSourceDefinition",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor,
            new java.lang.String[] {
              "DataSourceDefinition", "UpdateMask",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor,
            new java.lang.String[] {
              "DataSourceDefinitions", "NextPageToken",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor,
            new java.lang.String[] {
              "Name",
              "DataSource",
              "TransferRunPubsubTopic",
              "RunTimeOffset",
              "SupportEmail",
              "ServiceAccount",
              "Disabled",
              "TransferConfigPubsubTopic",
              "SupportedLocationIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.getDescriptor();
    com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
