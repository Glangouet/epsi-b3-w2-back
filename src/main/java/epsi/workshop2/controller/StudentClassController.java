package epsi.workshop2.controller;

import epsi.workshop2.entity.StudentClass;
import epsi.workshop2.service.StudentClassService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/studentclass")
public class StudentClassController {

    public static final Logger LOGGER = LoggerFactory.getLogger(StudentClassController.class);

    @Resource
    private StudentClassService classService;

    @RequestMapping(method = RequestMethod.POST)
    public void createClass(@RequestBody StudentClass studentClass) {
        classService.createClass(studentClass);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public StudentClass getClassForId(@PathVariable(value = "id") int id) {
        return classService.getClassById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteClass(@PathVariable(value = "id") int id, @RequestBody StudentClass studentClass) {
        studentClass.setIdClass(id);
        
        classService.deleteClass(studentClass);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateClass(@PathVariable(value = "id") int id, @RequestBody StudentClass studentClass) {
        studentClass.setIdClass(id);
        classService.updateClass(studentClass);
    }

    public StudentClassService getCampusService() {
        return classService;
    }

    public void setClassService(StudentClassService classService) {
        this.classService = classService;
    }

}
