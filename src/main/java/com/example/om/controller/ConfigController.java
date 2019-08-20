package com.example.om.controller;

import com.example.om.bean.LayData;
import com.example.om.bean.RespData;
import com.example.om.dao.ConfigRepository;
import com.example.om.pojo.SystemConfig;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/system/" })
public class ConfigController {

	@Autowired
	private ConfigRepository configDao;

	@PostMapping({ "getTime" })
	private LayData<SystemConfig> getTime() {
		LayData<SystemConfig> layData = new LayData<SystemConfig>();
		layData.setCode("200");
		layData.setData(this.configDao.findAll());
		layData.setMsg("请求成功！");
		return layData;
	}

	@PostMapping({ "setTime" })
	private RespData setTime(String start, String end) {
		SystemConfig systemConfig = new SystemConfig();
		if (this.configDao.existsById(Integer.valueOf(1))) {
			Optional<SystemConfig> opt = this.configDao.findById(Integer.valueOf(1));
			if (opt.isPresent()) {
				systemConfig = (SystemConfig) opt.get();
			}
		}
		systemConfig.setStart_time(start);
		systemConfig.setEnd_time(end);
		this.configDao.save(systemConfig);
		return RespData.success();
	}
}