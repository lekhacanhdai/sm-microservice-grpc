package com.student.manage.smgatewayservice.controller.student;

import com.student.manage.smgatewayservice.grpc.client.student.StudentGrpcClient;
import com.student.manage.smgatewayservice.payload.converter.StudentGrpcResponseConverter;
import com.student.manage.smgatewayservice.payload.request.student.ListStudentRequest;
import com.student.manage.smgatewayservice.payload.response.PageDTO;
import com.student.manage.smgatewayservice.payload.response.Response;
import com.student.manage.smgatewayservice.payload.response.student.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */
@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentGrpcClient studentGrpcClient;
    private final StudentGrpcResponseConverter studentGrpcResponseConverter;

    @GetMapping("/students")
    public Response<PageDTO<StudentResponse>> getAllStudent(@ModelAttribute ListStudentRequest request){
        var grpc = studentGrpcClient.getAllStudent(request);
        if (grpc.getSuccess()){
            return studentGrpcResponseConverter.asSuccessResponse(grpc.getData());
        }
        return null;
    }
}
