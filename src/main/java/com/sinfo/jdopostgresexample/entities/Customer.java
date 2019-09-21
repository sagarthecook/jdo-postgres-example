package com.sinfo.jdopostgresexample.entities;

import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * @author sagar 
 * ENTITY WHICH IS ACTUALLY MAPPED TABLE TO JAVA CLASS
 */
@PersistenceCapable(table = "customer", detachable = "true")
@DatastoreIdentity(customStrategy = "uuid")
public class Customer {

	@PrimaryKey(column = "CUSTOMERID")
	@Persistent(customValueStrategy = "uuid")
	private String customerId;

	@Persistent(column = "PHONENO")
	private String phoneNo;

	@Persistent(column = "FIRSTNAME")
	private String firstName;

	@Persistent(column = "LASTNAME")
	private String lastName;

	@Persistent(column = "TYPE")
	private Integer type;

	@Persistent(column = "ISACTIVE")
	private Boolean active = true;

	public String getCustomerId() {
		return customerId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getType() {
		return type;
	}

	public Boolean getActive() {
		return active;
	}

}
