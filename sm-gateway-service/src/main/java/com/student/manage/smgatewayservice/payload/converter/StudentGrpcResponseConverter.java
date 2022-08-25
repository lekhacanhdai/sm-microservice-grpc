package com.student.manage.smgatewayservice.payload.converter;

import com.student.manage.smgatewayservice.payload.response.PageDTO;
import com.student.manage.smgatewayservice.payload.response.Response;
import com.student.manage.smgatewayservice.payload.response.student.StudentResponse;
import com.student.manage.student.proto.ListStudentResponse;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */

@Component
public class StudentGrpcResponseConverter {
    public Response<PageDTO<StudentResponse>> asSuccessResponse(ListStudentResponse.Data data){
        return Response.<PageDTO<StudentResponse>>builder()
                .success(true)
                .message("List students")
                .data(PageDTO.<StudentResponse>builder()
                        .page(data.getPageResponse().getPage())
                        .size(data.getPageResponse().getSize())
                        .totalElement(data.getPageResponse().getTotalElement())
                        .totalPage(data.getPageResponse().getTotalPage())
                        .items(data.getStudentsList().stream()
                                .map(s -> StudentResponse.builder()
                                        .setFirstName(s.getFirstName())
                                        .setLastName(s.getLastName())
                                        .setAge(s.getAge())
                                        .setClassId(s.getClassId())
                                        .setId(s.getId())
                                        .build())
                                .collect(Collectors.toUnmodifiableList()))
                        .build())
                .build();
    }
}
