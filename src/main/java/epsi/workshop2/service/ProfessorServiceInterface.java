/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Professor;

/**
 *
 * @author Nico
 */
public interface ProfessorServiceInterface {
    
    void createRole(Professor professor);

    void updateRole (Professor professor);

    void deleteRole(Professor professor);

    Professor getProfessorById(int id);
    
}
