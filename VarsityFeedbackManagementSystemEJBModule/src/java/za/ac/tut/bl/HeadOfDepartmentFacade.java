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
import za.ac.tut.entities.HeadOfDepartment;

/**
 *
 * @author ranka
 */
@Stateless
public class HeadOfDepartmentFacade extends AbstractFacade<HeadOfDepartment> implements HeadOfDepartmentFacadeLocal {

    @PersistenceContext(unitName = "VarsityFeedbackManagementSystemEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HeadOfDepartmentFacade() {
        super(HeadOfDepartment.class);
    }

    @Override
    public HeadOfDepartment findHod(Long userId) {

        
        try {
        Query query = em.createQuery("SELECT h FROM HeadOfDepartment h WHERE h.staffNum = :userId");
        query.setParameter("userId", userId);
        
        return (HeadOfDepartment) query.getSingleResult();
        }
        catch(NoResultException e)
        {
        return null ;
        }

    }
    
}
