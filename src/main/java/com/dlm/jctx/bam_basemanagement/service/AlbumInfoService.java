package com.dlm.jctx.bam_basemanagement.service;

import java.util.List;

import com.dlm.jctx.pojo.AlbumInfo;


public interface AlbumInfoService {
	List<AlbumInfo> list();
	void add(AlbumInfo record);
	void update(AlbumInfo record);
	void delete(int id);
	AlbumInfo get(int id);
	
	List<AlbumInfo> findListByCondition(AlbumInfo condition);
}
