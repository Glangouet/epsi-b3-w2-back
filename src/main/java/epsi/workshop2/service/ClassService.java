/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.repository.ClassRepository;
import javax.annotation.Resource;

/**
 *
 * @author rfera
 */
public class ClassService implements ClassServiceInterface{
    @Resource
    private ClassRepository classRepository;

    @Override
    public void createClass(Class studentClass) {
        classRepository.save(studentClass);
    }

    @Override
    public void updateClass(Class studentClass) {
        classRepository.save(studentClass);
    }

    @Override
    public void deleteClass(Class studentClass) {
        classRepository.delete(studentClass);
    }

    @Override
    public Class getClassById(int id) {
       return classRepository.findOne(String.valueOf(id));
    }
    
}
