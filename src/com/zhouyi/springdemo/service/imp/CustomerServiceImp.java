package com.zhouyi.springdemo.service.imp;

import com.zhouyi.springdemo.dao.CustomerDAO;
import com.zhouyi.springdemo.entity.Customer;
import com.zhouyi.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
