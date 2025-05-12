/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import za.ac.tut.entities.Lecturer;

/**
 *
 * @author ranka
 */
@Stateless
public class LecturerFacade extends AbstractFacade<Lecturer> implements LecturerFacadeLocal {

    @PersistenceContext(unitName = "VarsityFeedbackManagementSystemEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LecturerFacade() {
        super(Lecturer.class);
    }

    @Override
    public Lecturer findLecturer(Long userID) {

        //try{
        Query query = em.createQuery("SELECT l FROM Lecturer l WHERE l.staffNum = :userId");
       
        query.setParameter("userId",userID);
        Lecturer le = (Lecturer) query.getSingleResult();
          

        return le;
       // }
       // catch(NoResultException e)
        //{
       // return null ;
       // }
    }
    
}
