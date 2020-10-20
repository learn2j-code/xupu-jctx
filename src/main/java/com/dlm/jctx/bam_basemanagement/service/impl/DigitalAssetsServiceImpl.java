package com.dlm.jctx.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.jctx.bam_basemanagement.service.DigitalAssetsService;
import com.dlm.jctx.mapper.DigitalAssetsMapper;
import com.dlm.jctx.pojo.DigitalAssets;
import com.dlm.jctx.pojo.DigitalAssetsExample;
import com.dlm.jctx.pojo.DigitalAssetsExample.Criteria;

@Service
public class DigitalAssetsServiceImpl implements DigitalAssetsService {
	@Autowired
	DigitalAssetsMapper mapper;

	@Override
	public List<DigitalAssets> list() {
		DigitalAssetsExample example = new DigitalAssetsExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(DigitalAssets record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(DigitalAssets record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public DigitalAssets get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DigitalAssets> findListByCondition(DigitalAssets condition) {
		DigitalAssetsExample example = new DigitalAssetsExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(condition.getAssetsType()!=null) {
			criteria.andAssetsTypeEqualTo(condition.getAssetsType());
		}
		
		if(condition.getHouseholdId()!=null) {
			criteria.andHouseholdIdEqualTo(condition.getHouseholdId());
		}
		if(condition.getHouseholdMemberId()!=null) {
			criteria.andHouseholdMemberIdEqualTo(condition.getHouseholdMemberId());
		}
		return mapper.selectByExample(example);
	}
}
