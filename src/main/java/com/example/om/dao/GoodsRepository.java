package com.example.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.om.pojo.Goods;

public abstract interface GoodsRepository extends JpaRepository<Goods, Integer> {
}
