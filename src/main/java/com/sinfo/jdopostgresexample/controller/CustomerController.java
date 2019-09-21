package com.sinfo.jdopostgresexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfo.jdopostgresexample.dto.ResponseBean;
import com.sinfo.jdopostgresexample.entities.Customer;
import com.sinfo.jdopostgresexample.exception.BusinessServiceException;
import com.sinfo.jdopostgresexample.service.CustomerService;

/**
 * @author sagar ALL REST END POINT OF CUSTOMER
 */
@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBean> save(@RequestBody Customer customer) {
		ResponseBean responseBean = new ResponseBean();
		try {
			responseBean = new ResponseBean(true, "Record saved successfully", customerService.save(customer));
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			responseBean = new ResponseBean(true, e.getMessage(), null);
		}
		return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);
	}

	@GetMapping(value = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBean> findByCustomerId(@PathVariable String customerId) {
		ResponseBean responseBean = new ResponseBean();
		try {
			responseBean = new ResponseBean(true, "Data return successfully",
					customerService.findByCustomerId(customerId));
		} catch (BusinessServiceException e) {
			e.printStackTrace();
			responseBean = new ResponseBean(true, e.getMessage(), null);
		}
		return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);
	}
}
