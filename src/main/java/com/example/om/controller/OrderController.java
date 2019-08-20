package com.example.om.controller;

import com.example.om.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/order/" })
public class OrderController {

	@Autowired
	private OrderRepository orderDao;
}
