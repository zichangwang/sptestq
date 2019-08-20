package com.example.om.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
public class Goods {

	@Id
	private int id;
	private String goodsname;
	private String goodsdec;
	private String goodsprice;
	private String goodstype;
	private String status;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getGoodsdec() {
		return this.goodsdec;
	}

	public void setGoodsdec(String goodsdec) {
		this.goodsdec = goodsdec;
	}

	public String getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}

	public String getGoodstype() {
		return this.goodstype;
	}

	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}