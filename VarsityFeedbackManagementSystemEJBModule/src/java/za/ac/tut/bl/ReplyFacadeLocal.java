/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Local;
import java.util.List;
import za.ac.tut.entities.Reply;

/**
 *
 * @author ranka
 */
@Local
public interface ReplyFacadeLocal {

    void create(Reply reply);

    void edit(Reply reply);

    void remove(Reply reply);

    Reply find(Object id);

    List<Reply> findAll();

    List<Reply> findRange(int[] range);

    int count();
    
}
