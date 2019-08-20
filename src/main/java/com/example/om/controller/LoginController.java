package com.example.om.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.om.Util.MD5;
import com.example.om.bean.LayData;
import com.example.om.bean.RespData;
import com.example.om.dao.UserRepository;
import com.example.om.pojo.User;

@RestController
@RequestMapping("/login/")
public class LoginController {
	@Autowired
	private UserRepository userDao;
	//登录
	@PostMapping("login")
	private RespData login(HttpServletRequest request,User user){
		String username=user.getUsername();
		String password=user.getPassword();
		if (!password.matches("(?![0-9A-Z]+$)(?![0-9a-z]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,18}$")) {
			return RespData.error("密码必须为大小写字母加字符串！");
		}
		User user2=userDao.findByUserame(username);
		if(user2==null) {
			return  RespData.error("账号密码输入错误！");
		}
		//用户输入密码加密
		String str=MD5.MD5Encode2(password)+MD5.MD5Encode2(user2.getSalt());
		if(str.equals(user2.getPassword())) {
			String token=UUID.randomUUID().toString();
			request.getSession().setAttribute(token, user2);
			return RespData.success(token);
		}
		return RespData.error("账号密码输入错误！");
	}
	//注册
	@PostMapping("register")
	private RespData register(User user) {
		String username=user.getUsername();
		String password=user.getPassword();
		User user2=userDao.findByUserame(username);
		if(user2!=null) {
			return  RespData.error("用户名已经存在！");
		}
		if (!password.matches("(?![0-9A-Z]+$)(?![0-9a-z]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,18}$")) {
			return RespData.error("密码必须为大小写字母加字符串！");
		}
		String salt=UUID.randomUUID().toString().substring(0, 8);
		String enpPass=MD5.MD5Encode2(password)+MD5.MD5Encode2(salt);
		user.setPassword(enpPass);
		user.setSalt(salt);
		userDao.save(user);
		return RespData.success();
	}
	//找回密码
	@PostMapping("updatePass")
	private RespData updatePass(User user) {
		
		
		
		
		return null;
	}
}
