package com.hibernate.test;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.pojo.User;
import com.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	 
        session.beginTransaction();
        User user = new User();
 
       
        user.setUsername("sam");
        user.setCreatedBy("javajar");
        user.setCreatedDate(new Date());
 
        session.save(user);
        session.getTransaction().commit();
    }
}
