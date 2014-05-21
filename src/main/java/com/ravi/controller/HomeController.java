package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravi.dao.UserDao;
import com.ravi.model.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		List<User> lstUser = userDao.getUserByUserEmail("user@examples.com");
		User user = lstUser.get(0);
		return user.getName() + " " + user.getUserEmail();
	}
	
}
