package com.sinfo.jdopostgresexample.repository;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.sinfo.jdopostgresexample.exception.RepositoryException;

/**
 * @author sagar
 *
 */
public abstract class GenericRepository<T> {

	@Autowired
	private PersistenceManagerFactory persistenceManagerFactory;

	public PersistenceManager pm() {
		return persistenceManagerFactory.getPersistenceManager();
	}

	public T save(T t) throws RepositoryException {
		try {
			PersistenceManager pm = persistenceManagerFactory.getPersistenceManager();
			T savedT = pm.makePersistent(t);
			return pm.detachCopy(savedT);
		} catch (Exception e) {
			throw new RepositoryException("Repo exception", e);
		}
	}
}
