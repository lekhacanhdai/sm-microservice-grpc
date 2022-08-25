package com.student.manage.smgatewayservice.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.student.manage.smgatewayservice.common.ErrorCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */
@Getter
@Setter
@SuperBuilder
public class Response<T> implements Serializable {
    private boolean success;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private ErrorCode errorCode;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ErrorDTO> errors;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String exception;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private T data;
}
