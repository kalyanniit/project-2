package com.chat.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.UserDetails;
@Transactional
@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void addUser(UserDetails userDetails) {
		sessionFactory.getCurrentSession().save(userDetails);
		
		
	}

	
		
	}


