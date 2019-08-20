package com.example.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.om.pojo.Order;
import com.example.om.pojo.SystemConfig;

public abstract interface ConfigRepository extends JpaRepository<SystemConfig, Integer> {
}
