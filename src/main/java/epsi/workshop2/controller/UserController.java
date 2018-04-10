package epsi.workshop2.controller;

import epsi.workshop2.entity.User;
import epsi.workshop2.service.UserService;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void createCampus(@RequestBody User user) {
        userService.createUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserForId(@PathVariable(value = "id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCampus(@PathVariable(value = "id") int id, @RequestBody User user) {
        user.setIdUser(id);
        userService.deleteUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCampus(@PathVariable(value = "id") int id, @RequestBody User user) {
        user.setIdUser(id);
        userService.updateUser(user);
    }

    public UserService getCampusService() {
        return userService;
    }

    public void setCampusService(UserService campusService) {
        this.userService = userService;
    }

}
