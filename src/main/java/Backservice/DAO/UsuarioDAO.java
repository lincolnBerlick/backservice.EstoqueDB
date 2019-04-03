/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backservice.DAO;

import Backservice.Infra.HibernateUtil;
import Model.Usuarios;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

/**
 *
 * @author lincoln
 */
public class UsuarioDAO {
    
    public int SalvarUsuarioDAO(Usuarios user){
        
        Session session = null;
        Integer iduser = 0;
        
        
     
        
          try {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
      
            
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            iduser = (Integer) session.save(user);
       
            transaction.commit();
                
           
           
            
        } catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("nao foin");
        }finally{
            if(session != null){
                session.close();
            }
        }      
        
        
     return iduser;
        
    }
    
    
    public List<Usuarios> getAllUsers(){
        List<Usuarios> listausers = null;
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try {
            
            
            session = sessionFactory.openSession();
            
            CriteriaBuilder builder = session.getCriteriaBuilder();
            
            
            CriteriaQuery<Usuarios> criteriaQuery = builder.createQuery(Usuarios.class);
            
            criteriaQuery.from(Usuarios.class);
            
            listausers = session.createQuery(criteriaQuery).getResultList();
            
            
            
        } catch (HibernateException e) {
        }finally{
            HibernateUtil.Closeconnection(session);
        }
        
        return listausers;
        
        
    }
    
    
    public boolean deleteUser(Usuarios usuarios){
        
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();                     
            session.update(usuarios);
            transaction.commit();
            
            
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }finally{
            HibernateUtil.Closeconnection(session);
        }
        
        
        return true;
    }

    
    public Usuarios getUser(int idUser) {
        
        Usuarios user = null;
        Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try {
             session = sessionFactory.openSession();
             Transaction transaction = session.beginTransaction();
             user = (Usuarios) session.get(Usuarios.class, idUser);
             transaction.commit();
            
        } catch (HibernateException e) {
        } finally{
            HibernateUtil.Closeconnection(session);
        }
        
        
      
        return user;

    }
    
      public List<Usuarios> getUseremail(String email) {
          
          
         Session session = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Usuarios user = null;
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction(); 
        
        Criteria crit = session.createCriteria(Usuarios.class);
        crit.add(Restrictions.like("user_email", "lincolf3@lingcolnfd5"))
                .setProjection(Projections.property("user_email"));
        
        List<Usuarios> results = crit.list();
      
      
        
        
        
        
        
        
     
      
        return results;

    }

    
     public boolean updateUser(Usuarios user){
        
        Session session = null;
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try {
            
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
            
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        
        
        
     return true;
    }
    
    
}
