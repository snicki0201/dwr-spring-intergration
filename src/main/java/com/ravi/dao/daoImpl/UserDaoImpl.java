package com.ravi.dao.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.dao.UserDao;
import com.ravi.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<User> getUserByUserEmail(String userEmail) {
		System.out.println("UserDaoImpl - getUserByUserEmail");

		return sessionFactory.getCurrentSession()
				.createQuery("from User where userEmail=:userEmail")
				.setString("userEmail", userEmail).list();
	}

}
