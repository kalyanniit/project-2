package com.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.dao.UserDetailsDao;
import com.chat.model.UserDetails;

@RestController
public class HomeController {
	@Autowired
	UserDetailsDao userDetailsDao;
	
	// Service provider url: http://localhost:8080/chat/addUser
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST,headers="accept=Application/json")
	public void addUser(@RequestBody UserDetails userDetails)
	{
		userDetailsDao.addUser(userDetails);
 
}
}