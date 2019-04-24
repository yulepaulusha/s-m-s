package com.yule.sms.studentmanagementservice.controller;

import com.yule.sms.studentmanagementservice.model.Student;
import com.yule.sms.studentmanagementservice.request.UpdateRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/18/2019.
 */
public interface StudentController {
    Student save(Student student);
    List<Student> fetch();
    ResponseEntity<Student> fetch(Integer id);
    boolean delete(Integer id);
    Student update(Integer id,Student student);
}
