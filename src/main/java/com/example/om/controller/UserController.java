package com.example.om.controller;

import com.example.om.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/user/" })
public class UserController {

	@Autowired
	private UserRepository userDao;


}