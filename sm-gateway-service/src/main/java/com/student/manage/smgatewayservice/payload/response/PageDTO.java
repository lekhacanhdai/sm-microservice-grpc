package com.student.manage.smgatewayservice.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

/**
 * @author lkadai0801
 * @since 24/07/2022
 */

@Getter
@Setter
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageDTO<T> {
    private Integer page;
    private Integer size;
    private Long totalElement;
    private Long totalPage;
    private List<T> items;
    private Map<Object, Object> metadata;
}
