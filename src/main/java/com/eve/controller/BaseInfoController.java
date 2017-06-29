package com.eve.controller;

import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eve.bean.User;
import com.eve.service.IUserService;

@Controller
@RequestMapping("/user")
public class BaseInfoController {
	
	@Autowired
	private IUserService iUserService;
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request,Model model){
		System.out.println("##############################22222");
		List<User> uList=iUserService.getAllUser();
		model.addAttribute("uList", uList);
	
		System.out.println("##############################33333");
		return "userList";
	}
}
