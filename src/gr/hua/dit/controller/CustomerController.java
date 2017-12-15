package gr.hua.dit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.dao.CustomerDao;
import gr.hua.dit.entity.Customer;

@Controller
//@RequestMapping("/customer")
public class CustomerController {

	// inject the customer dao
	private CustomerDao customerDao;

	@GetMapping("/list")
	public String listCustomers(Model model) {

		// get customers from dao
		List<Customer> customers = customerDao.getCustomers();

		// add the customers to the model
		model.addAttribute("customers", customers);
		return "list-customer";
	}

}