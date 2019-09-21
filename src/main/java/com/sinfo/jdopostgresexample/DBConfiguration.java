package com.sinfo.jdopostgresexample;

import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sagar 
 * THIS CLASS CONFIGURURE WITH POSTGRES DB WHICH PROPERTIES ALEADY
 *         ADDED IN PERSITANT.XML IN META-INF CREATE ONE INSTANCE OF
 *         PERSITANTMANAGER WITH THE HELP OF JDO HELPER
 */
@Configuration
public class DBConfiguration {

	@Bean
	public PersistenceManagerFactory getPersistenceManagerFactory() {
		Properties prop = new Properties();
		prop.setProperty("javax.jdo.option.ConnectionURL", "jdbc:postgresql://localhost:5432/customerdb");
		prop.setProperty("javax.jdo.option.ConnectionDriverName", "org.postgresql.Driver");
		prop.setProperty("javax.jdo.option.ConnectionUserName", "postgres");
		prop.setProperty("javax.jdo.option.DetachAllOnCommit", "true");
		prop.setProperty("javax.jdo.option.Mapping", "postgres");
		prop.setProperty("javax.jdo.option.ConnectionPassword", "postgres");
		prop.setProperty("datanucleus.schema.autoCreateAll", "false");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(prop);
		return pmf;
	}
}
