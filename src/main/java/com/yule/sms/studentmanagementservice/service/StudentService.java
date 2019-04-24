package com.yule.sms.studentmanagementservice.service;

import com.yule.sms.studentmanagementservice.model.Student;
import com.yule.sms.studentmanagementservice.request.UpdateRequest;

import java.util.List;
import java.util.Optional;

/**
 * Created by Yule.Paulusha on 4/18/2019.
 */
public interface StudentService {
    Student save(Student student);
    List<Student> fetch();
    Student fetch(Integer id);
    boolean delete(Integer id);
    Student update(Integer id, Student student);
}
