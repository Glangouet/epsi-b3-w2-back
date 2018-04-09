/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Skill;

/**
 *
 * @author Nico
 */
public interface SkillServiceInterface {
    
    void createSkill(Skill skill);

    void updateSkill(Skill skill);

    void deleteSkill(Skill skill);

    Skill getSkillById(int id);
    
}
