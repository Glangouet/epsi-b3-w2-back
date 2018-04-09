/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Professor;
import epsi.worshop2.repository.ProfessorRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service(value = "ProfessorService")

public class ProfessorService {
    
    @Resource
    private ProfessorRepository professorRepository;

    public void createUser(Professor role) {
        professorRepository.save(role);
    }

    public void updateUser(Professor role) {
        professorRepository.save(role);
    }

    public void deleteUser(Professor role) {
        professorRepository.delete(role);
    }

    public Professor getStudentById(int id) {
        return this.professorRepository.findOne(String.valueOf(id));
    }
    
}
