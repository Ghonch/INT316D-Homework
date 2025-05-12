/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Local;
import java.util.List;
import za.ac.tut.entities.HeadOfDepartment;

/**
 *
 * @author ranka
 */
@Local
public interface HeadOfDepartmentFacadeLocal {

    void create(HeadOfDepartment headOfDepartment);

    void edit(HeadOfDepartment headOfDepartment);

    void remove(HeadOfDepartment headOfDepartment);

    HeadOfDepartment find(Object id);

    List<HeadOfDepartment> findAll();

    List<HeadOfDepartment> findRange(int[] range);

    int count();
    
    //-----------------------------
    
    HeadOfDepartment findHod(Long userId);
    
}
