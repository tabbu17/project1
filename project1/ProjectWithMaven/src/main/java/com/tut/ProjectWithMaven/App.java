package com.tut.ProjectWithMaven;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {   /*-----table created------*/
    	
    	
    	/*Laptop laptop=new Laptop();
        laptop.setId(1004L);
         laptop.setBrand("Apple");
    	laptop.setOsys("Mac");
    	laptop.setPrice(180000.00);
    	
        System.out.println( "project started" );
        Configuration configuration=new Configuration().configure()
        		.addAnnotatedClass(Laptop.class);
       SessionFactory sessionFactory=configuration.buildSessionFactory();
       Session session=sessionFactory.openSession();
       Transaction transaction=session.beginTransaction();
        session.save(laptop);
        transaction.commit();*/
    	
    	/*-----read operation-----*/
    	/* Configuration configuration=new Configuration().configure()
         		.addAnnotatedClass(Laptop.class);
    	 SessionFactory sessionFactory=configuration.buildSessionFactory();
    	  Session session=sessionFactory.openSession();
    	 Laptop laptop=(Laptop)session.get(Laptop.class,1002L);
    	 if(laptop!=null)
    		 System.out.println(laptop);
    	 else
    		 System.out.println("invalid id");*/
    	
    	
    	 /*------update table----*/
    	 
    	/* Configuration configuration=new Configuration().configure()
          		.addAnnotatedClass(Laptop.class);
     	 SessionFactory sessionFactory=configuration.buildSessionFactory();
     	  Session session=sessionFactory.openSession();
     	 Transaction transaction=session.beginTransaction();
     	 Laptop laptop=(Laptop)session.get(Laptop.class,1003L);
    	 if(laptop!=null)
    	 {
    		laptop.setPrice(60000D); 
    		session.update(laptop);
    		System.out.println("laptop lenevo price updated");
    	 }
    		else
    		
    			System.out.println("not updated");
    	  transaction.commit();*/
    	
    	
    /*	 Configuration configuration=new Configuration().configure()
           		.addAnnotatedClass(Laptop.class);
      	 SessionFactory sessionFactory=configuration.buildSessionFactory();
      	  Session session=sessionFactory.openSession();
      	  String hql="from Laptop where id=:laptop_id";
      	  Query query=session.createQuery(hql);
      	  query.setParameter("laptop_id", 1002L);
      	  System.out.println((Laptop)query.uniqueResult());
    	*/
    	
    	
    	/*-------------------------------for reading all data-------------------------------------------------*/
    	
    	
    /*	 Configuration configuration=new Configuration().configure()
            		.addAnnotatedClass(Laptop.class);
       	 SessionFactory sessionFactory=configuration.buildSessionFactory();
       	  Session session=sessionFactory.openSession();
       	  String hql="from Laptop";
       	  Query query=session.createQuery(hql);
       	  System.out.println(query.list());
       	  */
       
    	
    /*	
    	  Configuration configuration=new Configuration().configure()
          		.addAnnotatedClass(Laptop.class);
         SessionFactory sessionFactory=configuration.buildSessionFactory();
         Session session=sessionFactory.openSession();
         Transaction transaction=session.beginTransaction();
         String hql="update Laptop set brand=:BRAND where id=:Lid";
         Query query=session.createQuery(hql);
         query.setParameter("BRAND","MAC" );
         query.setParameter("Lid","1004L" );
         int updateRows=query.executeUpdate();
         transaction.commit();
         if(updateRows==0)
         {
        	 System.out.println("update operation failed");
        	 return;
         }
         
         System.out.println("updated successfully");*/
    	  Configuration configuration=new Configuration().configure()
            		.addAnnotatedClass(Laptop.class);
           SessionFactory sessionFactory=configuration.buildSessionFactory();
           Session session=sessionFactory.openSession();
           Transaction transaction=session.beginTransaction();
    	String hql="delete Laptop where id=:id";
    	
     Query query=session.createQuery(hql);
         query.setParameter("id",1002L );
         System.out.println("check 1");
         int updateRows=query.executeUpdate();
         System.out.println("check 2");
         transaction.commit();
         if(updateRows==0)
         {
        	 System.out.println("delete operation failed");
         }
         System.out.println("delete successfully");
    	
    	 
    	 }
    
    
    
    	
    }

