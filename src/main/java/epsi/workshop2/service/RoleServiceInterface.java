/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Role;

/**
 *
 * @author Nico
 */
public interface RoleServiceInterface {
    
    void createRole(Role skill);

    void updateRole (Role skill);

    void deleteRole(Role skill);

    Role getRoleById(int id);
    
}
