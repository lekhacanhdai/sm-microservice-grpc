package com.student.manage.studentservice;

import com.student.manage.studentservice.grpc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class StudentServiceApplication {
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

}
