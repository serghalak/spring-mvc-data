package net.codejava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.codejava.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}