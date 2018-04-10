/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Student;
import epsi.workshop2.repository.StudentRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service(value = "StudentService")

public class StudentService {
    
    @Resource
    private StudentRepository studentRepository;

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public Student getStudentById(int id) {
        return this.studentRepository.findOne(String.valueOf(id));
    }
    
}
