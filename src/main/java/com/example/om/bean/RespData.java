package com.example.om.bean;

public class RespData {
	private String code;//200成功201失败202需要登录
	private String msg;
	private String data;
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static RespData success() {
		RespData respData = new RespData();
		respData.setCode("200");;
		respData.setMsg("请求成功！");
		return respData;
	}
	public static RespData success(String data) {
		RespData respData = new RespData();
		respData.setCode("200");
		respData.setMsg("成功！");
		respData.setData(data);
		return respData;
	}
	public static RespData error(String msg) {
		RespData respData = new RespData();
		respData.setCode("201");
		respData.setMsg(msg);
		return respData;
	}
}