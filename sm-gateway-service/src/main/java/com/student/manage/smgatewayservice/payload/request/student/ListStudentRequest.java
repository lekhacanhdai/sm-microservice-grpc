package com.student.manage.smgatewayservice.payload.request.student;

import com.student.manage.smgatewayservice.payload.request.AbstractPageRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */
@Getter
@Setter
public class ListStudentRequest extends AbstractPageRequest {
    private String firstName;
    private String lastName;
    private Integer fromAge;
    private Integer toAge;
    private Long classId;
    private boolean allInOne;
}
