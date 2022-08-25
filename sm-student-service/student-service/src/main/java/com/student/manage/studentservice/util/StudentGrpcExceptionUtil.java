package com.student.manage.studentservice.util;

import com.student.manage.student.proto.StudentGrpcError;
import com.student.manage.studentservice.common.ErrorCode;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.util.StringUtils;

/**
 * @author lkadai0801
 * @since 25/07/2022
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentGrpcExceptionUtil {
    public static StudentGrpcError asGrpcError(Exception e){
        var builder = StudentGrpcError.newBuilder()
                .setCode(ErrorCode.INTERNAL_ERROR.name())
                .setException(e.getClass().getSimpleName())
                .setMessage(getExceptionMessage(e))
                .setIsClientError(false);
//        if (e instanceof ObjectNotFoundException)
        return null;
    }

    private static String getExceptionMessage(Exception e) {
        return StringUtils.hasText(e.getMessage()) ? e.getMessage() : e.getClass().getSimpleName();
    }
}
