package com.zhouyi.springdemo.dao.imp;

import com.zhouyi.springdemo.dao.CustomerDAO;
import com.zhouyi.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDaoImp implements CustomerDAO {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Customer> getCustomers() {

        Session session = factory.getCurrentSession();

        Query<Customer> query = session.createQuery("from Customer", Customer.class);

        List<Customer> customers = query.getResultList();

        return customers;
    }
}
