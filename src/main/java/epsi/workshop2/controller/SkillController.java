package epsi.workshop2.controller;

import epsi.workshop2.entity.Skill;
import epsi.workshop2.entity.Student;
import epsi.workshop2.service.SkillService;
import epsi.workshop2.service.StudentService;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/skill")
public class SkillController {

    public static final Logger LOGGER = LoggerFactory.getLogger(SkillController.class);

    @Resource
    private SkillService skillService;

    @RequestMapping(method = RequestMethod.POST)
    public void createSkill(@RequestBody Skill skill) {
        skillService.createSkill(skill);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Skill getSkillForId(@PathVariable(value = "id") int id) {
        return skillService.getSkillById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSkill(@PathVariable(value = "id") int id, @RequestBody Skill skill) {
        skill.setIdSkill(id);
        skillService.deleteSkill(skill);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateSkill(@PathVariable(value = "id") int id, @RequestBody Skill skill) {
        skill.setIdSkill(id);
        skillService.updateSkill(skill);
    }

    public SkillService getSkillService() {
        return skillService;
    }

    public void setSkillsService(SkillService skillService) {
        this.skillService = skillService;
    }

}
