package com.yule.sms.studentmanagementservice.controller;

import com.yule.sms.studentmanagementservice.model.Student;
import com.yule.sms.studentmanagementservice.request.UpdateRequest;
import com.yule.sms.studentmanagementservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/18/2019.
 */
@RestController
@RequestMapping("studentcloud")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentControllerImpl implements StudentController {
    @Autowired
    private StudentService studentService;

    @Override
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @Override
    @RequestMapping(value = "student", method = RequestMethod.GET)
    public List<Student> fetch() {
        return studentService.fetch();
    }

    @Override
    @RequestMapping(value = "/student/{id}",  method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Integer id) {
        return studentService.delete(id);
    }

    @Override
    @RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public Student update(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @Override
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> fetch(@PathVariable Integer id) {
        if(id<0){
            return ResponseEntity.badRequest().build();
        } else {
            Student student = studentService.fetch(id);
            if(student == null){
                return ResponseEntity.notFound().build();
            }
            else {
                return ResponseEntity.ok(student);
            }
        }
    }
}
