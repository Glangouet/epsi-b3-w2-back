/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.repository;

import epsi.workshop2.entity.Campus;
import epsi.workshop2.entity.Project;
import epsi.workshop2.entity.Role;
import epsi.workshop2.entity.Skill;
import epsi.workshop2.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nico
 */
public interface UserRepository extends CrudRepository<User, String> { 
    Iterable<User> findAllUsersBySkills(Skill skill);
    
    Iterable<User> findAllUserByCampusAndRole(Campus campus, Role role);
    
    Iterable<User> findUserByProject(Project project);
}
