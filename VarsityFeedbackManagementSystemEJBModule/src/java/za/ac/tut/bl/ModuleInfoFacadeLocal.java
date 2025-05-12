/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Local;
import java.util.List;
import za.ac.tut.entities.ModuleInfo;

/**
 *
 * @author ranka
 */
@Local
public interface ModuleInfoFacadeLocal {

    void create(ModuleInfo moduleInfo);

    void edit(ModuleInfo moduleInfo);

    void remove(ModuleInfo moduleInfo);

    ModuleInfo find(Object id);

    List<ModuleInfo> findAll();

    List<ModuleInfo> findRange(int[] range);

    int count();
    
}
