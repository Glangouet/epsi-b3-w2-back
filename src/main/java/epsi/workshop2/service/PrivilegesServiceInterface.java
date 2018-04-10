/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Privileges;

/**
 *
 * @author rfera
 */
public interface PrivilegesServiceInterface {
    void createPrivileges(Privileges privileges);

    void updatePrivileges(Privileges privileges);

    void deletePrivileges(Privileges privileges);
    
    Privileges getPrivilegesById(int id);
}
