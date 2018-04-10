/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.controller;

import epsi.workshop2.entity.Project;
import epsi.workshop2.service.ProjectService;
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
@RequestMapping(value = "/project")
public class ProjectController {
    public static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);

    @Resource
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.POST)
    public void createProject(@RequestBody Project project) {
        getProjectService().createProject(project);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Project getProjectForId(@PathVariable(value = "id") int id) {
        return getProjectService().getProjectById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable(value = "id") int id, @RequestBody Project project) {
        project.setIdProject(id);
        getProjectService().deleteProject(project);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateProject(@PathVariable(value = "id") int id, @RequestBody Project project) {
        project.setIdProject(id);
        getProjectService().updateProject(project);
    }

    /**
     * @return the projectService
     */
    public ProjectService getProjectService() {
        return projectService;
    }

    /**
     * @param projectService the projectService to set
     */
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }
    
    
    
}
