/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.controller;

import epsi.workshop2.entity.Professor;
import epsi.workshop2.service.ProfessorService;
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
@RequestMapping(value = "/professor")
public class ProfessorController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CampusController.class);

    @Resource
    private ProfessorService professorService;

    @RequestMapping(method = RequestMethod.POST)
    public void createProfessor(@RequestBody Professor professor) {
        getProfessorService().createProfessor(professor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Professor getProfessorForId(@PathVariable(value = "id") int id) {
        return getProfessorService().getProfessorById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCampus(@PathVariable(value = "id") int id, @RequestBody Professor professor) {
        professor.setIdUser(id);
        getProfessorService().deleteProfessor(professor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCampus(@PathVariable(value = "id") int id, @RequestBody Professor professor) {
        professor.setIdUser(id);
        getProfessorService().updateProfessor(professor);
    }

    /**
     * @return the professorService
     */
    public ProfessorService getProfessorService() {
        return professorService;
    }

    /**
     * @param professorService the professorService to set
     */
    public void setProfessorService(ProfessorService professorService) {
        this.professorService = professorService;
    }

}
