package com.student.manage.smgatewayservice.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */
@Getter
@Setter
public abstract class AbstractPageRequest {
    @Min(1)
    private Integer page = 1;

    @Min(1)
    private Integer size = 100;

    private String sort;

    private String direction = "desc";
}
