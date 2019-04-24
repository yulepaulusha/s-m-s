package com.yule.sms.studentmanagementservice.repository;

import com.yule.sms.studentmanagementservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yule.Paulusha on 4/18/2019.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findById(int id);
}
