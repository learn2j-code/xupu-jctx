package com.dlm.jctx.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.jctx.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.jctx.mapper.HouseholdInfoMapper;
import com.dlm.jctx.pojo.HouseholdInfo;
import com.dlm.jctx.pojo.HouseholdInfoExample;

@Service
public class HouseholdInfoServiceImpl implements HouseholdInfoService {
	@Autowired
	HouseholdInfoMapper mapper;

	@Override
	public List<HouseholdInfo> list() {
		HouseholdInfoExample example = new HouseholdInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}
}
