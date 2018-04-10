/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.StudentClass;

/**
 *
 * @author rfera
 */
public interface StudentClassServiceInterface {
    void createClass(StudentClass studentClass);

    void updateClass(StudentClass studentClass);

    void deleteClass(StudentClass studentClass);
    
    StudentClass getClassById(int id);
}
