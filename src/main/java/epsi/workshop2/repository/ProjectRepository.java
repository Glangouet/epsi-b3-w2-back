/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.repository;

import epsi.workshop2.entity.Project;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author rfera
 */
public interface ProjectRepository extends CrudRepository<Project, String>{
    
}
