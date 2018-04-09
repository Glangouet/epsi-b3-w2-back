/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.DAO.Project;

/**
 *
 * @author rfera
 */
public interface ProjectInterface {

    Project createProject(Project project);

    Project updateProject(Project project);

    void deleteProject(int id);

}
