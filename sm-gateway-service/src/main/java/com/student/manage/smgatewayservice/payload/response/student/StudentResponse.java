package com.student.manage.smgatewayservice.payload.response.student;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
@EqualsAndHashCode
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Long classId;
}