package com.dlm.jctx.bam_basemanagement.service;

import java.util.List;

import com.dlm.jctx.pojo.DigitalAssets;


public interface DigitalAssetsService {
	List<DigitalAssets> list();
	void add(DigitalAssets record);
	void update(DigitalAssets record);
	void delete(int id);
	DigitalAssets get(int id);
	
	List<DigitalAssets> findListByCondition(DigitalAssets condition);
}
