package com.zhouyi.springdemo.controller;

import com.zhouyi.springdemo.dao.CustomerDAO;
import com.zhouyi.springdemo.dao.imp.CustomerDaoImp;
import com.zhouyi.springdemo.entity.Customer;
import com.zhouyi.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // inject customer service
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model theModel){

        // get customers from the dao
        List<Customer> customerList = customerService.getCustomers();

        // add the customers to the model
        theModel.addAttribute("customerList", customerList);

        return "list-customers";
    }


}
