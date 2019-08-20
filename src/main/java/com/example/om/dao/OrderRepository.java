package com.example.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.om.pojo.Order;

public abstract interface OrderRepository extends JpaRepository<Order, Integer> {
}
