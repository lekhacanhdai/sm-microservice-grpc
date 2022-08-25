package com.student.manage.studentservice.grpc.service.impl;

import com.student.manage.student.proto.ListStudentRequest;
import com.student.manage.student.proto.ListStudentResponse;
import com.student.manage.student.proto.StudentPageResponse;
import com.student.manage.studentservice.domain.repository.dsl.StudentDslRepository;
import com.student.manage.studentservice.grpc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDslRepository studentDslRepository;

    @Override
    public ListStudentResponse listStudents(ListStudentRequest request) {
        var students = studentDslRepository.getAllStudent(request);
        return ListStudentResponse.newBuilder()
                .setSuccess(true)
                .setData(ListStudentResponse.Data.newBuilder()
                        .setPageResponse(StudentPageResponse.newBuilder()
                                .setPage(request.getPageRequest().getPage())
                                .setSize(request.getPageRequest().getSize())
                                .setTotalElement(students.getTotal())
                                .setTotalPage((students.getTotal() + request.getPageRequest().getSize() - 1) / request.getPageRequest().getSize())
                                .build())
                        .addAllStudents(students.getItems().stream()
                                .map(s -> ListStudentResponse.Student.newBuilder()
                                        .setAge(s.getAge())
                                        .setClassId(s.getClassId())
                                        .setFirstName(s.getFirstName())
                                        .setLastName(s.getLastName())
                                        .setId(s.getId())
                                        .build())
                                .collect(Collectors.toUnmodifiableList()))
                        .build())
                .build();
    }
}
