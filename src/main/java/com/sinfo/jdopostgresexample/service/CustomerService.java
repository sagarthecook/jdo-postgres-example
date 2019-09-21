package com.sinfo.jdopostgresexample.service;

import com.sinfo.jdopostgresexample.entities.Customer;
import com.sinfo.jdopostgresexample.exception.BusinessServiceException;

/**
 * @author sagar
 *
 */
public interface CustomerService {
	
	public Customer save(Customer customer) throws BusinessServiceException;
	
	public Customer findByCustomerId(String customerId) throws BusinessServiceException;
}
