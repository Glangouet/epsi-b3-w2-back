package epsi.workshop2.controller;

import epsi.workshop2.entity.Student;
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
@RequestMapping(value = "/student")
public class StudentController {

    public static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getUserForId(@PathVariable(value = "id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable(value = "id") int id, @RequestBody Student student) {
        student.setIdUser(id);
        studentService.deleteStudent(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateStudent(@PathVariable(value = "id") int id, @RequestBody Student student) {
        student.setIdUser(id);
        studentService.updateStudent(student);
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

}
