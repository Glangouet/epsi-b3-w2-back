package epsi.workshop2.controller;

import epsi.workshop2.entity.Privileges;
import epsi.workshop2.service.PrivilegesService;
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
public class PrivilegesController {

    public static final Logger LOGGER = LoggerFactory.getLogger(PrivilegesController.class);

    @Resource
    private PrivilegesService privilegesService;

    @RequestMapping(method = RequestMethod.POST)
    public void createClass(@RequestBody Privileges privileges) {
        privilegesService.createPrivileges(privileges);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Privileges getClassForId(@PathVariable(value = "id") int id) {
        return privilegesService.getPrivilegesById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteClass(@PathVariable(value = "id") int id, @RequestBody Privileges privileges) {
        privileges.setIdPrivileges(id);
        
        privilegesService.deletePrivileges(privileges);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateClass(@PathVariable(value = "id") int id, @RequestBody Privileges privileges) {
        privileges.setIdPrivileges(id);
        privilegesService.updatePrivileges(privileges);
    }

    public PrivilegesService getCampusService() {
        return privilegesService;
    }

    public void setPrivilegesService(PrivilegesService privilegesService) {
        this.privilegesService = privilegesService;
    }

}
