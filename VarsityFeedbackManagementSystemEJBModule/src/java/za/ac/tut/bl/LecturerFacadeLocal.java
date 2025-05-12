/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Local;
import java.util.List;
import za.ac.tut.entities.Lecturer;

/**
 *
 * @author ranka
 */
@Local
public interface LecturerFacadeLocal {

    void create(Lecturer lecturer);

    void edit(Lecturer lecturer);

    void remove(Lecturer lecturer);

    Lecturer find(Object id);

    List<Lecturer> findAll();

    List<Lecturer> findRange(int[] range);

    int count();
    
    //---------------------------------
    Lecturer findLecturer(Long userId);
    
}
