package com.student.manage.studentservice.grpc.service;

import com.student.manage.student.proto.ListStudentRequest;
import com.student.manage.student.proto.ListStudentResponse;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
public interface StudentService {
    ListStudentResponse listStudents(ListStudentRequest request);
}
