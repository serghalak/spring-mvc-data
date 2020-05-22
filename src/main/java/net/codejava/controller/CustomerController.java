package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.model.Customer;
import net.codejava.service.CustomerService;
 
 
@Controller
@RequestMapping("/customer")
public class CustomerController {
 
    @Autowired
    private CustomerService customerService;
 
    @RequestMapping("/home")
    public ModelAndView home() {
        List<Customer> listCustomer = customerService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCustomer", listCustomer);
        System.out.println("-------controller /");
        return mav;
    }
    @RequestMapping("/cust")
    public String customer(){
    	return "index";
    }
}