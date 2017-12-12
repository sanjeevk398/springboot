package service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entiry.Customer;

public interface CustomerService extends JpaRepository<Customer, Integer> {
	public List<Customer> findByNameOrderByAge();
}
