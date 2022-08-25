package com.student.manage.studentservice.grpc.server;

import com.student.manage.student.proto.ListStudentRequest;
import com.student.manage.student.proto.ListStudentResponse;
import com.student.manage.student.proto.StudentGrpcError;
import com.student.manage.student.proto.StudentServiceGrpc;
import com.student.manage.studentservice.grpc.service.StudentService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
@GrpcService
@RequiredArgsConstructor
public class StudentServer extends StudentServiceGrpc.StudentServiceImplBase {
    private final StudentService studentService;

    @Override
    public void listStudents(ListStudentRequest request, StreamObserver<ListStudentResponse> responseObserver) {
        try {
            responseObserver.onNext(studentService.listStudents(request));
            responseObserver.onCompleted();
        }
        catch (Exception e){
            responseObserver.onNext(ListStudentResponse.newBuilder()
                    .setSuccess(false)
                    .setError(StudentGrpcError.newBuilder()
                            .setCode("Not found")
                            .setException(e.getMessage())
                            .build())
                    .build());
            responseObserver.onCompleted();
            throw e;
        }
    }
}
