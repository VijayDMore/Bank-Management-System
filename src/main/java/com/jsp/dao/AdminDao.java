package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Manager;

public class AdminDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    
    
  //====================To Save Admin Details====================
    public Admin saveAdmin(Admin admin) {
    	entityTransaction.begin();
    	entityManager.persist(admin);
    	entityTransaction.commit();
    	
    	return admin;
    	
    }
    
    //====================To Fetching All manager details=======================
  
    public List<Manager> getAllManagerDetails(){
    	String sql="select m from Manager m";
    	
    	Query query=entityManager.createQuery(sql);
    	
    	List<Manager> managers=query.getResultList();
    	
    	return managers;
    	
    }

}

