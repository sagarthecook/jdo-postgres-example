package com.sinfo.jdopostgresexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfo.jdopostgresexample.constants.ExcecptionMsg;
import com.sinfo.jdopostgresexample.entities.Customer;
import com.sinfo.jdopostgresexample.exception.BusinessServiceException;
import com.sinfo.jdopostgresexample.exception.RepositoryException;
import com.sinfo.jdopostgresexample.repository.CustomerRepository;

/**
 * @author sagar 
 * CUSTOMER ALL BUSINESS LOGIC FUNCTION ADDED HERE
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) throws BusinessServiceException {
		try {
			return customerRepository.save(customer);
		} catch (RepositoryException e) {
			throw new BusinessServiceException(ExcecptionMsg.UNBABLE_TO_SAVE, e);
		}
	}

	@Override
	public Customer findByCustomerId(String customerId) throws BusinessServiceException {
		try {
			return customerRepository.findByCusomerId(customerId);
		} catch (RepositoryException e) {
			throw new BusinessServiceException(ExcecptionMsg.RECORD_NOT_FOUND, e);
		}
	}
}
