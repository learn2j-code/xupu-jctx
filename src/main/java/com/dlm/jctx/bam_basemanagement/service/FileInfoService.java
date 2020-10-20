package com.dlm.jctx.bam_basemanagement.service;

import java.util.List;

import com.dlm.jctx.pojo.FileInfo;


public interface FileInfoService {
	List<FileInfo> list();
	void add(FileInfo record);
	void update(FileInfo record);
	void delete(int id);
	FileInfo get(int id);
	
	List<FileInfo> findListByCondition(FileInfo condition);
}
