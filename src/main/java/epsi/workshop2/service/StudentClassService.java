/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.StudentClass;
import javax.annotation.Resource;
import epsi.workshop2.repository.StudentClassRepository;

/**
 *
 * @author rfera
 */
public class StudentClassService implements StudentClassServiceInterface{
    @Resource
    private StudentClassRepository classRepository;

    @Override
    public void createClass(StudentClass studentClass) {
        classRepository.save(studentClass);
    }

    @Override
    public void updateClass(StudentClass studentClass) {
        classRepository.save(studentClass);
    }

    @Override
    public void deleteClass(StudentClass studentClass) {
        classRepository.delete(studentClass);
    }

    @Override
    public StudentClass getClassById(int id) {
       return classRepository.findOne(String.valueOf(id));
    }
    
}
