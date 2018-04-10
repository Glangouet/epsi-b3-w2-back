/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Campus;
import epsi.workshop2.entity.Project;
import epsi.workshop2.entity.Role;
import epsi.workshop2.entity.Skill;
import epsi.workshop2.entity.User;
import epsi.workshop2.repository.UserRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service(value = "UserService")

public class UserService implements UserServiceInterface {
    
    @Resource
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUserById(int id) {
        return this.userRepository.findOne(String.valueOf(id));
    }

    @Override
    public Iterable<User> getAllUsersBySkills(Skill skill) {
        return this.userRepository.findAllUsersBySkills(skill);
    }

    @Override
    public Iterable<User> getAllUserByCampusAndRole(Campus campus, Role role) {
        return this.userRepository.findAllUserByCampusAndRole(campus, role);
    }

    @Override
    public Iterable<User> getUsersByProject(Project project) {
        return this.userRepository.findUserByProject(project);
    }

    @Override
    public Iterable<User> getAllUsers() {
         return this.userRepository.findAll();
    }
    
}
