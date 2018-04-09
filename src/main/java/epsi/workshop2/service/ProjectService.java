/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Project;
import epsi.worshop2.repository.ProjectRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author rfera
 */
@Service(value = "projectService")

public class ProjectService implements ProjectServiceInterface {

    @Resource
    private ProjectRepository projectRepository;

    @Override
    public void createProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void updateProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void deleteProject(Project project) {
        projectRepository.delete(project);
    }

    @Override
    public Project getProjectById(int id) {
        return this.projectRepository.findOne(String.valueOf(id));
    }
}
