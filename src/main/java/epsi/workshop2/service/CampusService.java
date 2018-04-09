/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Campus;
import epsi.worshop2.repository.CampusRepository;
import javax.annotation.Resource;

/**
 *
 * @author rfera
 */
public class CampusService implements CampusServiceInterface{

    @Resource
    private CampusRepository campusRepository;
    
    @Override
    public void createCampus(Campus campus) {
        campusRepository.save(campus);
    }

    @Override
    public void updateCampus(Campus campus) {
        campusRepository.save(campus);
    }

    @Override
    public void deleteCampus(Campus campus) {
       campusRepository.delete(campus);
    }

    @Override
    public Campus getCampusById(int id) {
        return this.campusRepository.findOne(String.valueOf(id));
    }

    private void save(Campus campus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
