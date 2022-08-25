package com.student.manage.studentservice.domain.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
@Configuration
public class JpaQueryDslConfig {
    @Bean
    public JPAQueryFactory jpaQueryBuilder(EntityManager em) {
        return new JPAQueryFactory(em);
    }
}
