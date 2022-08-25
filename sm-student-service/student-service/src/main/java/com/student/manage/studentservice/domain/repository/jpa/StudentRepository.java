package com.student.manage.studentservice.domain.repository.jpa;

import com.student.manage.studentservice.domain.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lkadai0801
 * @since 20/07/2022
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
