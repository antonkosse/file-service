// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/FileEntity.proto

package com.example.fileservice;

public final class FileEntityProto {
  private FileEntityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FileEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.fileservice.FileEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string fileName = 1;</code>
     * @return The fileName.
     */
    java.lang.String getFileName();
    /**
     * <code>string fileName = 1;</code>
     * @return The bytes for fileName.
     */
    com.google.protobuf.ByteString
        getFileNameBytes();

    /**
     * <code>string absolutePath = 2;</code>
     * @return The absolutePath.
     */
    java.lang.String getAbsolutePath();
    /**
     * <code>string absolutePath = 2;</code>
     * @return The bytes for absolutePath.
     */
    com.google.protobuf.ByteString
        getAbsolutePathBytes();
  }
  /**
   * Protobuf type {@code com.example.fileservice.FileEntity}
   */
  public static final class FileEntity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.fileservice.FileEntity)
      FileEntityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FileEntity.newBuilder() to construct.
    private FileEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FileEntity() {
      fileName_ = "";
      absolutePath_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FileEntity();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FileEntity(
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
              java.lang.String s = input.readStringRequireUtf8();

              fileName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              absolutePath_ = s;
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
      return com.example.fileservice.FileEntityProto.internal_static_com_example_fileservice_FileEntity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.fileservice.FileEntityProto.internal_static_com_example_fileservice_FileEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.fileservice.FileEntityProto.FileEntity.class, com.example.fileservice.FileEntityProto.FileEntity.Builder.class);
    }

    public static final int FILENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object fileName_;
    /**
     * <code>string fileName = 1;</code>
     * @return The fileName.
     */
    @java.lang.Override
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      }
    }
    /**
     * <code>string fileName = 1;</code>
     * @return The bytes for fileName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ABSOLUTEPATH_FIELD_NUMBER = 2;
    private volatile java.lang.Object absolutePath_;
    /**
     * <code>string absolutePath = 2;</code>
     * @return The absolutePath.
     */
    @java.lang.Override
    public java.lang.String getAbsolutePath() {
      java.lang.Object ref = absolutePath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        absolutePath_ = s;
        return s;
      }
    }
    /**
     * <code>string absolutePath = 2;</code>
     * @return The bytes for absolutePath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAbsolutePathBytes() {
      java.lang.Object ref = absolutePath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        absolutePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(absolutePath_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, absolutePath_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(absolutePath_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, absolutePath_);
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
      if (!(obj instanceof com.example.fileservice.FileEntityProto.FileEntity)) {
        return super.equals(obj);
      }
      com.example.fileservice.FileEntityProto.FileEntity other = (com.example.fileservice.FileEntityProto.FileEntity) obj;

      if (!getFileName()
          .equals(other.getFileName())) return false;
      if (!getAbsolutePath()
          .equals(other.getAbsolutePath())) return false;
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
      hash = (37 * hash) + FILENAME_FIELD_NUMBER;
      hash = (53 * hash) + getFileName().hashCode();
      hash = (37 * hash) + ABSOLUTEPATH_FIELD_NUMBER;
      hash = (53 * hash) + getAbsolutePath().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.fileservice.FileEntityProto.FileEntity parseFrom(
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
    public static Builder newBuilder(com.example.fileservice.FileEntityProto.FileEntity prototype) {
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
     * Protobuf type {@code com.example.fileservice.FileEntity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.fileservice.FileEntity)
        com.example.fileservice.FileEntityProto.FileEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.fileservice.FileEntityProto.internal_static_com_example_fileservice_FileEntity_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.fileservice.FileEntityProto.internal_static_com_example_fileservice_FileEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.fileservice.FileEntityProto.FileEntity.class, com.example.fileservice.FileEntityProto.FileEntity.Builder.class);
      }

      // Construct using com.example.fileservice.FileEntityProto.FileEntity.newBuilder()
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
        fileName_ = "";

        absolutePath_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.fileservice.FileEntityProto.internal_static_com_example_fileservice_FileEntity_descriptor;
      }

      @java.lang.Override
      public com.example.fileservice.FileEntityProto.FileEntity getDefaultInstanceForType() {
        return com.example.fileservice.FileEntityProto.FileEntity.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.fileservice.FileEntityProto.FileEntity build() {
        com.example.fileservice.FileEntityProto.FileEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.fileservice.FileEntityProto.FileEntity buildPartial() {
        com.example.fileservice.FileEntityProto.FileEntity result = new com.example.fileservice.FileEntityProto.FileEntity(this);
        result.fileName_ = fileName_;
        result.absolutePath_ = absolutePath_;
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
        if (other instanceof com.example.fileservice.FileEntityProto.FileEntity) {
          return mergeFrom((com.example.fileservice.FileEntityProto.FileEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.fileservice.FileEntityProto.FileEntity other) {
        if (other == com.example.fileservice.FileEntityProto.FileEntity.getDefaultInstance()) return this;
        if (!other.getFileName().isEmpty()) {
          fileName_ = other.fileName_;
          onChanged();
        }
        if (!other.getAbsolutePath().isEmpty()) {
          absolutePath_ = other.absolutePath_;
          onChanged();
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
        com.example.fileservice.FileEntityProto.FileEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.fileservice.FileEntityProto.FileEntity) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object fileName_ = "";
      /**
       * <code>string fileName = 1;</code>
       * @return The fileName.
       */
      public java.lang.String getFileName() {
        java.lang.Object ref = fileName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fileName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string fileName = 1;</code>
       * @return The bytes for fileName.
       */
      public com.google.protobuf.ByteString
          getFileNameBytes() {
        java.lang.Object ref = fileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string fileName = 1;</code>
       * @param value The fileName to set.
       * @return This builder for chaining.
       */
      public Builder setFileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string fileName = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFileName() {
        
        fileName_ = getDefaultInstance().getFileName();
        onChanged();
        return this;
      }
      /**
       * <code>string fileName = 1;</code>
       * @param value The bytes for fileName to set.
       * @return This builder for chaining.
       */
      public Builder setFileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fileName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object absolutePath_ = "";
      /**
       * <code>string absolutePath = 2;</code>
       * @return The absolutePath.
       */
      public java.lang.String getAbsolutePath() {
        java.lang.Object ref = absolutePath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          absolutePath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string absolutePath = 2;</code>
       * @return The bytes for absolutePath.
       */
      public com.google.protobuf.ByteString
          getAbsolutePathBytes() {
        java.lang.Object ref = absolutePath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          absolutePath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string absolutePath = 2;</code>
       * @param value The absolutePath to set.
       * @return This builder for chaining.
       */
      public Builder setAbsolutePath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        absolutePath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string absolutePath = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbsolutePath() {
        
        absolutePath_ = getDefaultInstance().getAbsolutePath();
        onChanged();
        return this;
      }
      /**
       * <code>string absolutePath = 2;</code>
       * @param value The bytes for absolutePath to set.
       * @return This builder for chaining.
       */
      public Builder setAbsolutePathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        absolutePath_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:com.example.fileservice.FileEntity)
    }

    // @@protoc_insertion_point(class_scope:com.example.fileservice.FileEntity)
    private static final com.example.fileservice.FileEntityProto.FileEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.fileservice.FileEntityProto.FileEntity();
    }

    public static com.example.fileservice.FileEntityProto.FileEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FileEntity>
        PARSER = new com.google.protobuf.AbstractParser<FileEntity>() {
      @java.lang.Override
      public FileEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileEntity(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FileEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FileEntity> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.fileservice.FileEntityProto.FileEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_fileservice_FileEntity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_fileservice_FileEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026proto/FileEntity.proto\022\027com.example.fi" +
      "leservice\"4\n\nFileEntity\022\020\n\010fileName\030\001 \001(" +
      "\t\022\024\n\014absolutePath\030\002 \001(\tB*\n\027com.example.f" +
      "ileserviceB\017FileEntityProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_fileservice_FileEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_fileservice_FileEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_fileservice_FileEntity_descriptor,
        new java.lang.String[] { "FileName", "AbsolutePath", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}