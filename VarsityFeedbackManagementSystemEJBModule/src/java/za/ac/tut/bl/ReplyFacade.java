/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import za.ac.tut.entities.Reply;

/**
 *
 * @author ranka
 */
@Stateless
public class ReplyFacade extends AbstractFacade<Reply> implements ReplyFacadeLocal {

    @PersistenceContext(unitName = "VarsityFeedbackManagementSystemEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReplyFacade() {
        super(Reply.class);
    }
    
}
