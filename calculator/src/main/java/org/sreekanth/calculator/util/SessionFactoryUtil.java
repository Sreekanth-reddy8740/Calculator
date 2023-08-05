package org.sreekanth.calculator.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sreekanth.calculator.entity.UserEntity;

public class SessionFactoryUtil {

	private static SessionFactory sessionfactory=null;
	
	public static SessionFactory getsessionfactory() {
		
		if(sessionfactory==null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			sessionfactory = cfg.buildSessionFactory();
		}
		return sessionfactory;
	}

}
