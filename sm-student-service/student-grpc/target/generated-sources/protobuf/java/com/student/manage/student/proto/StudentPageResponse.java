// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student/student.proto

package com.student.manage.student.proto;

/**
 * Protobuf type {@code student.StudentPageResponse}
 */
public final class StudentPageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:student.StudentPageResponse)
    StudentPageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentPageResponse.newBuilder() to construct.
  private StudentPageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentPageResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentPageResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentPageResponse(
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
          case 8: {

            page_ = input.readInt32();
            break;
          }
          case 16: {

            size_ = input.readInt32();
            break;
          }
          case 24: {

            totalElement_ = input.readInt64();
            break;
          }
          case 32: {

            totalPage_ = input.readInt64();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.student.manage.student.proto.StudentOuterClass.internal_static_student_StudentPageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.student.manage.student.proto.StudentOuterClass.internal_static_student_StudentPageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.student.manage.student.proto.StudentPageResponse.class, com.student.manage.student.proto.StudentPageResponse.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>int32 page = 1;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private int size_;
  /**
   * <code>int32 size = 2;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int TOTAL_ELEMENT_FIELD_NUMBER = 3;
  private long totalElement_;
  /**
   * <code>int64 total_element = 3;</code>
   * @return The totalElement.
   */
  @java.lang.Override
  public long getTotalElement() {
    return totalElement_;
  }

  public static final int TOTAL_PAGE_FIELD_NUMBER = 4;
  private long totalPage_;
  /**
   * <code>int64 total_page = 4;</code>
   * @return The totalPage.
   */
  @java.lang.Override
  public long getTotalPage() {
    return totalPage_;
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
    if (page_ != 0) {
      output.writeInt32(1, page_);
    }
    if (size_ != 0) {
      output.writeInt32(2, size_);
    }
    if (totalElement_ != 0L) {
      output.writeInt64(3, totalElement_);
    }
    if (totalPage_ != 0L) {
      output.writeInt64(4, totalPage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, page_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, size_);
    }
    if (totalElement_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalElement_);
    }
    if (totalPage_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalPage_);
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
    if (!(obj instanceof com.student.manage.student.proto.StudentPageResponse)) {
      return super.equals(obj);
    }
    com.student.manage.student.proto.StudentPageResponse other = (com.student.manage.student.proto.StudentPageResponse) obj;

    if (getPage()
        != other.getPage()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getTotalElement()
        != other.getTotalElement()) return false;
    if (getTotalPage()
        != other.getTotalPage()) return false;
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
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + TOTAL_ELEMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalElement());
    hash = (37 * hash) + TOTAL_PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalPage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.student.manage.student.proto.StudentPageResponse parseFrom(
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
  public static Builder newBuilder(com.student.manage.student.proto.StudentPageResponse prototype) {
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
   * Protobuf type {@code student.StudentPageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:student.StudentPageResponse)
      com.student.manage.student.proto.StudentPageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.student.manage.student.proto.StudentOuterClass.internal_static_student_StudentPageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.student.manage.student.proto.StudentOuterClass.internal_static_student_StudentPageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.student.manage.student.proto.StudentPageResponse.class, com.student.manage.student.proto.StudentPageResponse.Builder.class);
    }

    // Construct using com.student.manage.student.proto.StudentPageResponse.newBuilder()
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
      page_ = 0;

      size_ = 0;

      totalElement_ = 0L;

      totalPage_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.student.manage.student.proto.StudentOuterClass.internal_static_student_StudentPageResponse_descriptor;
    }

    @java.lang.Override
    public com.student.manage.student.proto.StudentPageResponse getDefaultInstanceForType() {
      return com.student.manage.student.proto.StudentPageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.student.manage.student.proto.StudentPageResponse build() {
      com.student.manage.student.proto.StudentPageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.student.manage.student.proto.StudentPageResponse buildPartial() {
      com.student.manage.student.proto.StudentPageResponse result = new com.student.manage.student.proto.StudentPageResponse(this);
      result.page_ = page_;
      result.size_ = size_;
      result.totalElement_ = totalElement_;
      result.totalPage_ = totalPage_;
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
      if (other instanceof com.student.manage.student.proto.StudentPageResponse) {
        return mergeFrom((com.student.manage.student.proto.StudentPageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.student.manage.student.proto.StudentPageResponse other) {
      if (other == com.student.manage.student.proto.StudentPageResponse.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getTotalElement() != 0L) {
        setTotalElement(other.getTotalElement());
      }
      if (other.getTotalPage() != 0L) {
        setTotalPage(other.getTotalPage());
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
      com.student.manage.student.proto.StudentPageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.student.manage.student.proto.StudentPageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 1;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 1;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 2;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private long totalElement_ ;
    /**
     * <code>int64 total_element = 3;</code>
     * @return The totalElement.
     */
    @java.lang.Override
    public long getTotalElement() {
      return totalElement_;
    }
    /**
     * <code>int64 total_element = 3;</code>
     * @param value The totalElement to set.
     * @return This builder for chaining.
     */
    public Builder setTotalElement(long value) {
      
      totalElement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_element = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalElement() {
      
      totalElement_ = 0L;
      onChanged();
      return this;
    }

    private long totalPage_ ;
    /**
     * <code>int64 total_page = 4;</code>
     * @return The totalPage.
     */
    @java.lang.Override
    public long getTotalPage() {
      return totalPage_;
    }
    /**
     * <code>int64 total_page = 4;</code>
     * @param value The totalPage to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPage(long value) {
      
      totalPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_page = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPage() {
      
      totalPage_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:student.StudentPageResponse)
  }

  // @@protoc_insertion_point(class_scope:student.StudentPageResponse)
  private static final com.student.manage.student.proto.StudentPageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.student.manage.student.proto.StudentPageResponse();
  }

  public static com.student.manage.student.proto.StudentPageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentPageResponse>
      PARSER = new com.google.protobuf.AbstractParser<StudentPageResponse>() {
    @java.lang.Override
    public StudentPageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentPageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentPageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentPageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.student.manage.student.proto.StudentPageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
