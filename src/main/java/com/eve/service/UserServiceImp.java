package com.eve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eve.bean.User;
import com.eve.sql.IUserDao;
@Service
public class UserServiceImp implements IUserService{
	@Autowired
private IUserDao iUserDao;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> us=new ArrayList<User>();
		us=iUserDao.getAllUser();
		return us;
	}

}
