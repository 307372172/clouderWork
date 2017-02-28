package com.sample.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.SSDataDao;
import com.sample.dal.model.Enterprise;
import com.sample.dal.model.SSData;
import com.sample.service.SSDataService;

@Service
public class SSDataServiceImpl implements SSDataService {
	@Autowired SSDataDao ssdatadao;
	@Override
	public List<SSData> selectByMap(Map<String, Object> map) {
		List<Map<String, Object>> list = ssdatadao.selectByMap(map);
		List<SSData> ssdatas = new ArrayList<SSData>();
		for (Map<String, Object> map2 : list) {
			SSData data = new SSData();
			Enterprise enterprise = new Enterprise();
			enterprise.setEnterpriseNo((String) map2.get("enterprise_no"));
			enterprise.setEnterpriseName((String) map2.get("enterprise_name"));
			data.setDianyuan((String) map2.get("dianyuan"));
			data.setDoor((String) map2.get("door"));
			data.setEnterprise(enterprise);
			data.setI((Double) map2.get("i"));
			data.setInstrument_inwater((String) map2.get("instrument_inwater"));
			data.setInstrument_state((String) map2.get("instrument_state"));
			data.setNet((String) map2.get("net"));
			data.setSsdata_no((String) map2.get("ssdata_no"));
			data.setValve_set((String) map2.get("valve_set"));
			data.setValve_ss((String) map2.get("valve_ss"));
			data.setWater_level((String) map2.get("water_level"));
			ssdatas.add(data);
		}
		return ssdatas;
	}

}
