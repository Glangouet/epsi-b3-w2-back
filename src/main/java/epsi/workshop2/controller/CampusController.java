package epsi.workshop2.controller;

import epsi.workshop2.entity.Campus;
import epsi.workshop2.service.CampusService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/campus")
public class CampusController {

    public static final Logger LOGGER = LoggerFactory.getLogger(CampusController.class);

    @Resource
    private CampusService campusService;

    @RequestMapping(method = RequestMethod.POST)
    public void createCampus(@RequestBody Campus campus) {
        campusService.createCampus(campus);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Campus getCampusForId(@PathVariable(value = "id") int id) {
        return campusService.getCampusById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCampus(@PathVariable(value = "id") int id, @RequestBody Campus campus) {
        campus.setIdCampus(id);
        campusService.deleteCampus(campus);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateCampus(@PathVariable(value = "id") int id, @RequestBody Campus campus) {
        campus.setIdCampus(id);
        campusService.updateCampus(campus);
    }

    public CampusService getCampusService() {
        return campusService;
    }

    public void setCampusService(CampusService campusService) {
        this.campusService = campusService;
    }

}
