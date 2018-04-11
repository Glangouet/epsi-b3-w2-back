/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author rfera
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(model.service.service.CampusFacadeREST.class);
        resources.add(model.service.service.CommentFacadeREST.class);
        resources.add(model.service.service.ObtainFacadeREST.class);
        resources.add(model.service.service.PossessFacadeREST.class);
        resources.add(model.service.service.PrivilegeFacadeREST.class);
        resources.add(model.service.service.ProjectFacadeREST.class);
        resources.add(model.service.service.RoleFacadeREST.class);
        resources.add(model.service.service.SkillsFacadeREST.class);
        resources.add(model.service.service.TokenFacadeREST.class);
        resources.add(model.service.service.UsersFacadeREST.class);
    }
    
}
