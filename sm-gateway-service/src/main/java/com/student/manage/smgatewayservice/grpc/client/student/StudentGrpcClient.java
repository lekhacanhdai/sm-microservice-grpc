package com.student.manage.smgatewayservice.grpc.client.student;

import com.student.manage.smgatewayservice.payload.request.student.ListStudentRequest;
import com.student.manage.student.proto.ListStudentResponse;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */
public interface StudentGrpcClient {
    ListStudentResponse getAllStudent(ListStudentRequest request);
}
