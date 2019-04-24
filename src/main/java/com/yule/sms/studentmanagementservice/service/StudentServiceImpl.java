package com.yule.sms.studentmanagementservice.service;

import com.yule.sms.studentmanagementservice.model.Student;
import com.yule.sms.studentmanagementservice.repository.StudentRepository;
import com.yule.sms.studentmanagementservice.request.UpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Yule.Paulusha on 4/18/2019.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetch() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetch(Integer id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.isPresent() ? student.get() : null;
    }

    @Override
    public boolean delete(Integer id) {
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public Student update(Integer id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }
}
