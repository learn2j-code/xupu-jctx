package com.dlm.jctx.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.jctx.bam_basemanagement.service.FileInfoService;
import com.dlm.jctx.mapper.FileInfoMapper;
import com.dlm.jctx.pojo.FileInfo;
import com.dlm.jctx.pojo.FileInfoExample;
import com.dlm.jctx.pojo.FileInfoExample.Criteria;

@Service
public class FileInfoServiceImpl implements FileInfoService {
	@Autowired
	FileInfoMapper mapper;

	@Override
	public List<FileInfo> list() {
		FileInfoExample example = new FileInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FileInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FileInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FileInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FileInfo> findListByCondition(FileInfo condition) {
		FileInfoExample example = new FileInfoExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getOriginalName())) {
			criteria.andOriginalNameLike(condition.getOriginalName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getSuffix())) {
			criteria.andSuffixLike(condition.getSuffix()+"%");
		}
		if(condition.getEntityId()!=null) {
			criteria.andEntityIdEqualTo(condition.getEntityId());
		}
		
		if(condition.getEntityType()!=null) {
			criteria.andEntityTypeEqualTo(condition.getEntityType());
		}
		if(condition.getFileType()!=null) {
			criteria.andFileTypeEqualTo(condition.getFileType());
		}
		return mapper.selectByExample(example);
	}
}
