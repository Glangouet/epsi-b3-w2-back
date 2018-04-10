/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.controller;

import epsi.workshop2.entity.Role;
import epsi.workshop2.service.RoleService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rfera
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController {
    public static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    @Resource
    private RoleService roleService;

    @RequestMapping(method = RequestMethod.POST)
    public void createRole(@RequestBody Role role) {
        getRoleService().createRole(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Role getRoleForId(@PathVariable(value = "id") int id) {
        return getRoleService().getRoleById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRole(@PathVariable(value = "id") int id, @RequestBody Role role) {
        role.setIdRole(id);
        getRoleService().deleteRole(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateRole(@PathVariable(value = "id") int id, @RequestBody Role role) {
        role.setIdRole(id);
        getRoleService().updateRole(role);
    }

    /**
     * @return the roleService
     */
    public RoleService getRoleService() {
        return roleService;
    }

    /**
     * @param roleService the roleService to set
     */
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
    
}
