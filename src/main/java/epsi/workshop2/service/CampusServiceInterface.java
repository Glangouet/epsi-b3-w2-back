/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.service;

import epsi.workshop2.entity.Campus;

/**
 *
 * @author rfera
 */
public interface CampusServiceInterface {

    void createCampus(Campus campus);

    void updateCampus(Campus campus);

    void deleteCampus(Campus campus);

    Campus getCampusById(int id);
}
