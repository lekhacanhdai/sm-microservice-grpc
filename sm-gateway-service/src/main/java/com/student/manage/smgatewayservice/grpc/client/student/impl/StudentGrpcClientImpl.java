package com.student.manage.smgatewayservice.grpc.client.student.impl;

import com.student.manage.smgatewayservice.grpc.client.student.StudentGrpcClient;
import com.student.manage.smgatewayservice.payload.request.student.ListStudentRequest;
import com.student.manage.student.proto.ListStudentResponse;
import com.student.manage.student.proto.StudentPageRequest;
import com.student.manage.student.proto.StudentServiceGrpc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */

@Service
@RequiredArgsConstructor
public class StudentGrpcClientImpl implements StudentGrpcClient {

    private final StudentServiceGrpc.StudentServiceBlockingStub studentServiceBlockingStub;

    @Override
    public ListStudentResponse getAllStudent(ListStudentRequest request) {
        var builder = com.student.manage.student.proto.ListStudentRequest.newBuilder();
        builder.setFirstName(StringUtils.hasText(request.getFirstName()) ? request.getFirstName() : "");
        builder.setLastName(StringUtils.hasText(request.getLastName()) ? request.getLastName() : "");
        builder.setFromAge(request.getFromAge() == null ? -1 : request.getFromAge());
        builder.setToAge(request.getToAge() == null ? -1 : request.getToAge());
        builder.setClassId(request.getClassId() == null ? -1 : request.getClassId());
        builder.setAllInOne(Boolean.TRUE.equals(request.isAllInOne()));
        builder.setPageRequest(StudentPageRequest.newBuilder()
                .setPage(request.getPage())
                .setSize(request.getSize())
                .setSort(StringUtils.hasText(request.getSort()) ? request.getSort() : "")
                .setDirection(request.getDirection())
                .build());
        return studentServiceBlockingStub.listStudents(builder.build());
    }
}
