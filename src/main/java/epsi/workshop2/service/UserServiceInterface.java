/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.User;

/**
 *
 * @author Nico
 */
public interface UserServiceInterface {

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(int id);

}
