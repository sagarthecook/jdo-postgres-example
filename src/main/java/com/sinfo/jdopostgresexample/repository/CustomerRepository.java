package com.sinfo.jdopostgresexample.repository;

import com.sinfo.jdopostgresexample.entities.Customer;
import com.sinfo.jdopostgresexample.exception.RepositoryException;

/**
 * @author sagar
 *
 */
public interface CustomerRepository {
	
	public Customer save(Customer customer) throws RepositoryException;

	public Customer findByCusomerId(String customerId) throws RepositoryException;

}
