/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Project;

/**
 *
 * @author rfera
 */
public interface ProjectServiceInterface {

    void createProject(Project project);

    void updateProject(Project project);

    void deleteProject(Project project);
    
    Project getProjectById(int id);

}
