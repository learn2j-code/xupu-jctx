package com.dlm.jctx.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.jctx.bam_basemanagement.service.AlbumInfoService;
import com.dlm.jctx.mapper.AlbumInfoMapper;
import com.dlm.jctx.pojo.AlbumInfo;
import com.dlm.jctx.pojo.AlbumInfoExample;
import com.dlm.jctx.pojo.AlbumInfoExample.Criteria;

@Service
public class AlbumInfoServiceImpl implements AlbumInfoService {
	@Autowired
	AlbumInfoMapper mapper;

	@Override
	public List<AlbumInfo> list() {
		AlbumInfoExample example = new AlbumInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AlbumInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(AlbumInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public AlbumInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AlbumInfo> findListByCondition(AlbumInfo condition) {
		AlbumInfoExample example = new AlbumInfoExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getTitle())) {
			criteria.andTitleLike(condition.getTitle()+"%");
		}
		if(condition.getAlbumType()!=null) {
			criteria.andAlbumTypeEqualTo(condition.getAlbumType());
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
