package com.sinfo.jdopostgresexample.repository;

import javax.jdo.Query;

import org.springframework.stereotype.Repository;

import com.sinfo.jdopostgresexample.entities.Customer;
import com.sinfo.jdopostgresexample.exception.RepositoryException;

/**
 * @author sagar THIS REPOSITORY FOR CUSTOMER CURD OPERATION
 */
@Repository
public class CustomerRepositoryImpl extends GenericRepository<Customer> implements CustomerRepository {

	@Override
	public Customer save(Customer customer) throws RepositoryException {
		return super.save(customer);
	}

	@Override
	public Customer findByCusomerId(String customerId) throws RepositoryException {
		Query query = this.pm().newQuery(Customer.class);
		query.setFilter("this.customerId ==:customerId && this.active ==:active");
		query.setUnique(true);
		return (Customer) query.execute(customerId, true);
	}
}
