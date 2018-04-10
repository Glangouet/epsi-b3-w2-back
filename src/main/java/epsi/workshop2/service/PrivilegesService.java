/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Privileges;
import javax.annotation.Resource;
import epsi.workshop2.repository.PrivilegesRepository;

/**
 *
 * @author rfera
 */
public class PrivilegesService implements PrivilegesServiceInterface{
    @Resource
    private PrivilegesRepository privilegesRepository;

    @Override
    public void createPrivileges(Privileges privileges) {
        privilegesRepository.save(privileges);
    }

    @Override
    public void updatePrivileges(Privileges privileges) {
        privilegesRepository.save(privileges);
    }

    @Override
    public void deletePrivileges(Privileges privileges) {
        privilegesRepository.delete(privileges);
    }

    @Override
    public Privileges getPrivilegesById(int id) {
       return privilegesRepository.findOne(String.valueOf(id));
    }
    
}
