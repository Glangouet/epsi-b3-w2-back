/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

/**
 *
 * @author rfera
 */
public interface ClassServiceInterface {
    void createClass(Class studentClass);

    void updateClass(Class studentClass);

    void deleteClass(Class studentClass);
    
    Class getClassById(int id);
}
