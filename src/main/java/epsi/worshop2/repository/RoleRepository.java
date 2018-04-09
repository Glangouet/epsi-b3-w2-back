/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.worshop2.repository;

import epsi.workshop2.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Nico
 */
public interface RoleRepository extends CrudRepository<Role, String> {
    
}
