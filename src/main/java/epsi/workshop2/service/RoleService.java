/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Role;
import epsi.workshop2.repository.RoleRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service(value = "RoleService")

public class RoleService {
    
    @Resource
    private RoleRepository skillRepository;

    public void createRole(Role role) {
        skillRepository.save(role);
    }

    public void updateRole(Role role) {
        skillRepository.save(role);
    }

    public void deleteRole(Role role) {
        skillRepository.delete(role);
    }

    public Role getRoleById(int id) {
        return this.skillRepository.findOne(String.valueOf(id));
    }
    
}
