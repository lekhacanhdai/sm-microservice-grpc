package com.student.manage.studentservice.util;

/**
 * @author lkadai0801
 * @since 21/07/2022
 */
public class RequestUtils {
    public static int getPage(Integer page){
        return ((page == null) || page < 1) ? 0 : page - 1;
    }

    public static int getSize(Integer size){
        return (size == null || size < 1) ? 10 : size;
    }
}
