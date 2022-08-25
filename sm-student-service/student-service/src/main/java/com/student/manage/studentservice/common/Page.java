package com.student.manage.studentservice.common;

import lombok.*;

import java.util.List;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(setterPrefix = "set")
public class Page<T> {
    private List<T> items;
    private Long total;
}
