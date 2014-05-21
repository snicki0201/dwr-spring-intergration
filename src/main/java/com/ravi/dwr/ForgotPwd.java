package com.ravi.dwr;

import java.util.List;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;

import com.ravi.dao.UserDao;
import com.ravi.model.User;

@RemoteProxy
public class ForgotPwd {
	
	@Autowired
	private UserDao userDao;

	@RemoteMethod
	public void sendMail(String EmailId) {
		System.out.println("DWR Called.");

		List<User> lstUser = userDao.getUserByUserEmail(EmailId);
		User user = lstUser.get(0);

		System.out.println("DWR Called.-- userEmail :" + user.getUserEmail());
	}

}
