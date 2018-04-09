/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Skill;
import epsi.worshop2.repository.SkillRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service(value = "SkillService")

public class SkillService {
    
    @Resource
    private SkillRepository skillRepository;

    public void createUser(Skill skill) {
        skillRepository.save(skill);
    }

    public void updateUser(Skill skill) {
        skillRepository.save(skill);
    }

    public void deleteUser(Skill skill) {
        skillRepository.delete(skill);
    }

    public Skill getStudentById(int id) {
        return this.skillRepository.findOne(String.valueOf(id));
    }
    
}
