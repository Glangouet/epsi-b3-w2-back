/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Student;

/**
 *
 * @author Nico
 */
public interface StudentServiceInterface {
    
    void createStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Student student);

    Student getStudentById(int id);
    
}
