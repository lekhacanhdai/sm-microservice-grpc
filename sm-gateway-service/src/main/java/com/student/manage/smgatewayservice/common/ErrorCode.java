package com.student.manage.smgatewayservice.common;

public enum ErrorCode {
    //////////////////////////////////////////////////////////////////
    // Common code
    //////////////////////////////////////////////////////////////////
    OK,

    // Security code
    ACCESS_DENIED,
    UNAUTHORIZED,

    // Server error (5xx) code
    INTERNAL_ERROR,
    IO_ERROR,
    TIMEOUT,
    UNAVAILABLE,

    // Client error (4xx) code
    ACTIVATION_EXPIRED,
    ALREADY_EXISTS,
    BAD_REQUEST,
    INVALID_CODE,
    INVALID_VALUE,
    NOT_FOUND,
    DUPLICATED,
    CONFLICT,
    CONFLICT_DATE_TIME,
    REQUIRED_FIELD_MISSING,
    VALIDATION_FAILED,
    INVALID_FILE_FORMAT,
    INVALID_FORMAT,
    INVALID_LENGTH,
    TOO_SHORT,
    TOO_LONG,
    FILE_SIZE,
    REQUEST_SIZE,

    //////////////////////////////////////////////////////////////////
    // Service-specific code
    //////////////////////////////////////////////////////////////////

    // Account service specific code
    USERNAME_INVALID,
    USERNAME_DUPLICATED,
    INVALID_CAPTCHA,
    INVALID_WITH_VALUE,
    ONLY_TEACHER_RESET_PASSWORD_FOR_STUDENT,
    NOT_ALLOW_DELETE_USER_WITH_CAUSE_HAS_ASSIGNMENT,
    NOT_ALLOW_DELETE_USER_WITH_CAUSE_HAS_CLASS,
    NOT_ALLOW_DELETE_DISTRICT_WITH_CAUSE_ASSOCIATED_SCHOOL,
    USER_DISABLED,
    STUDENT_EXISTED_IN_CLASS,
    TEACHER_UNVERIFIED,
    NOT_UNIQUE,
    IN_PROGRESS,
    ACCOUNT_HAS_BEEN_ACTIVATED_BEFORE,
    HAVE_TO_REMOVE_ALL_REFERENCE,


    // Product service specific code
    PRODUCT_LOCKED,
    INVALID_PRODUCT,


    /* License service specific code */
    ACCESS_CODE_NOT_FOUND,
    PRODUCT_NOT_AVAILABLE,
    LICENSE_PRODUCT_ALREADY_EXIST,
    EXCEED_QUANTITY,


    /* Assignment service */
    CAN_NOT_DELETE_ASSIGNMENT,



}