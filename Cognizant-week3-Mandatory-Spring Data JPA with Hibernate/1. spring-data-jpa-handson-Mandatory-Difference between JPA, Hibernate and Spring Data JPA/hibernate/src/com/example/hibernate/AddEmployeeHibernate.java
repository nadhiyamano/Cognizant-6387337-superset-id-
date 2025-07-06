package com.example.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.example.hibernate.model.Employee;

public class AddEmployeeHibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        Integer empId = null;

        try {
            tx = session.beginTransaction();
            Employee emp = new Employee(101, "John");
            empId = (Integer) session.save(emp);
            tx.commit();
            System.out.println("Employee saved with ID: " + empId);
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}