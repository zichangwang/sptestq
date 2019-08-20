package com.example.om.controller;

import com.example.om.bean.LayData;
import com.example.om.bean.RespData;
import com.example.om.dao.GoodsRepository;
import com.example.om.pojo.Goods;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/goods/" })
public class GoodsController {

	@Autowired
	private GoodsRepository goodsDao;

	@GetMapping({ "/getAllGoods" })
	private LayData<Goods> getAllGoods() {
		LayData<Goods> layData = new LayData<Goods>();
		List<Goods>list = this.goodsDao.findAll();
		int count = (int) this.goodsDao.count();
		layData.setCode("200");
		layData.setMsg("请求成功！");
		layData.setData(list);
		layData.setCount(count);
		return layData;
	}

	@PostMapping({ "/addgoods" })
	private RespData addgoods(Goods goods) {
		Goods resgoods = (Goods) this.goodsDao.save(goods);
		if (resgoods != null) {
			return RespData.success();
		}
		return RespData.error("保存商品信息失败！");
	}

	@PostMapping({ "/deletegoods" })
	private RespData deletegoods(Integer id) {
		this.goodsDao.deleteById(id);
		return RespData.success();
	}

	@PostMapping({ "updategoods" })
	private RespData updategoods(Goods goods) {
		Goods resgoods = (Goods) this.goodsDao.save(goods);
		if (resgoods != null) {
			return RespData.success();
		}
		return RespData.error("保存商品信息失败！");
	}
}