package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entiry.Customer;
import service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/retrieveall")
	public List<Customer> retrieveAll() {
		return customerService.findAll();
	}

	@RequestMapping("/retrieve/{customerId}")
	public Customer retrieve(@PathVariable Integer customerId) {
		return customerService.findOne(customerId);
	}

	@RequestMapping("/save")
	public Customer store(@RequestBody Customer customer) {
		return customerService.save(customer);

	}

	@RequestMapping("/remove/{id}")
	public String delete(Integer id) {
		customerService.delete(id);
		return "Recored deleted";
	}

	@RequestMapping("/update/{id}")
	public String update(@RequestBody Customer customer, @PathVariable Integer id) {
		Customer tempCustomer = customerService.findOne(id);
		tempCustomer.setName(customer.getName());
		tempCustomer.setAddress(customer.getAddress());
		tempCustomer.setAge(customer.getAge());
		customerService.save(tempCustomer);
		return "record updated cussessfully";
	}
}
