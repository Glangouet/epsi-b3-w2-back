/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Professor;
import epsi.workshop2.repository.ProfessorRepository;
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

    public void createProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public void updateProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public void deleteProfessor(Professor professor) {
        professorRepository.delete(professor);
    }

    public Professor getProfessorById(int id) {
        return this.professorRepository.findOne(String.valueOf(id));
    }
    
}
