package com.student.manage.smgatewayservice.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.student.manage.smgatewayservice.common.ErrorCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDTO {
    private String key;

    private ErrorCode code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    public static ErrorDTO of(String key, ErrorCode code){
        ErrorDTO inst = new ErrorDTO();
        inst.setKey(key);
        inst.setCode(code);
        return inst;
    }

    public static ErrorDTO of(String key, ErrorCode code, String value){
        ErrorDTO inst = new ErrorDTO();
        inst.setKey(key);
        inst.setCode(code);
        inst.setValue(value);
        return inst;
    }
}
