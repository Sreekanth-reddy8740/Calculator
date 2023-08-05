package org.sreekanth.calculator.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sreekanth.calculator.entity.UserEntity;
import org.sreekanth.calculator.util.SessionFactoryUtil;

public class UserRepository {

	public void saveOrUpdate(UserEntity userEntity) {
		SessionFactory sessionFactory = SessionFactoryUtil.getsessionfactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
	}
}
