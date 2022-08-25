package com.student.manage.studentservice.domain.repository.dsl;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.student.manage.student.proto.ListStudentRequest;
import com.student.manage.studentservice.common.Page;
import com.student.manage.studentservice.common.SortDirection;
import com.student.manage.studentservice.domain.entity.QStudentEntity;
import com.student.manage.studentservice.domain.entity.StudentEntity;
import com.student.manage.studentservice.util.RequestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import static com.querydsl.core.types.OrderSpecifier.NullHandling.NullsFirst;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
@Repository
@RequiredArgsConstructor
public class StudentDslRepository {
    private final QStudentEntity student = QStudentEntity.studentEntity;
    private final JPAQueryFactory jpaQueryFactory;

    public Page<StudentEntity> getAllStudent(ListStudentRequest request) {
        int _page = RequestUtils.getPage(request.getPageRequest().getPage());
        int _size = RequestUtils.getSize(request.getPageRequest().getSize());
        int _offset = _page * _size;

        JPAQuery<StudentEntity> query = jpaQueryFactory.select(student)
                .from(student);

        if (request.getClassId() > 0) {
            query.where(student.classId.eq(request.getClassId()));
        }

        if (request.getFromAge() >= 0) {
            query.where(student.age.loe(request.getFromAge()));
        }

        if (StringUtils.hasText(request.getFirstName())) {
            query.where(student.firstName.containsIgnoreCase(request.getFirstName()));
        }

        if (StringUtils.hasText(request.getLastName())) {
            query.where(student.lastName.containsIgnoreCase(request.getLastName()));
        }

        Order _order = StringUtils.hasText(request.getPageRequest().getDirection()) &&
                !SortDirection.isInvalid(request.getPageRequest().getDirection()) ?
                Order.valueOf(SortDirection.parse(request.getPageRequest().getDirection()).shortName.toUpperCase()) :
                Order.ASC;

        if (StringUtils.hasText(request.getPageRequest().getSort())) {
            if (request.getPageRequest().getSort().equalsIgnoreCase("firstName")) {
                query.orderBy(new OrderSpecifier<>(_order, student.firstName, NullsFirst));
            } else if (request.getPageRequest().getSort().equalsIgnoreCase("lastName")){
                query.orderBy(new OrderSpecifier<>(_order, student.lastName, NullsFirst));
            } else if (request.getPageRequest().getSort().equalsIgnoreCase("age")) {
                query.orderBy(new OrderSpecifier<>(_order, student.age, NullsFirst));
            } else if (request.getPageRequest().getSort().equalsIgnoreCase("classId")){
                query.orderBy(new OrderSpecifier<>(_order, student.classId, NullsFirst));
            } else {
                query.orderBy(new OrderSpecifier<>(_order, student.firstName, NullsFirst));
            }
        } else {
            query.orderBy(new OrderSpecifier<>(_order, student.lastName, NullsFirst));
        }

        JPAQuery<Long> count = query.clone().select(student.id.countDistinct());
        if (!request.getAllInOne()){
            query.offset(_offset).limit(_size);
        }

        return new Page<>(query.fetch(), count.fetchFirst());
    }
}
