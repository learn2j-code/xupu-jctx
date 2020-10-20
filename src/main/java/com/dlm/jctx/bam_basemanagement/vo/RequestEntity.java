package com.dlm.jctx.bam_basemanagement.vo;


import com.dlm.jctx.pojo.AlbumInfo;
import com.dlm.jctx.pojo.ArticleInfo;
import com.dlm.jctx.pojo.DigitalAssets;
import com.dlm.jctx.pojo.FileInfo;
import com.dlm.jctx.pojo.HouseholdInfo;
import com.dlm.jctx.pojo.HouseholdMember;
import com.dlm.jctx.pojo.UserInfo;
import com.dlm.jctx.util.Page;


public class RequestEntity {
	private UserInfo userInfo;
	private HouseholdMember householdMember;
	private HouseholdInfo householdInfo;
	private FileInfo fileInfo;
	private AlbumInfo albumInfo;
	private DigitalAssets digitalAssets;
	private ArticleInfo articleInfo;
	
	private Integer id;
	
	private Page page;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public HouseholdMember getHouseholdMember() {
		return householdMember;
	}

	public void setHouseholdMember(HouseholdMember householdMember) {
		this.householdMember = householdMember;
	}

	public HouseholdInfo getHouseholdInfo() {
		return householdInfo;
	}

	public void setHouseholdInfo(HouseholdInfo householdInfo) {
		this.householdInfo = householdInfo;
	}

	public ArticleInfo getArticleInfo() {
		return articleInfo;
	}

	public void setArticleInfo(ArticleInfo articleInfo) {
		this.articleInfo = articleInfo;
	}

	public FileInfo getFileInfo() {
		return fileInfo;
	}

	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}

	public AlbumInfo getAlbumInfo() {
		return albumInfo;
	}

	public void setAlbumInfo(AlbumInfo albumInfo) {
		this.albumInfo = albumInfo;
	}

	public DigitalAssets getDigitalAssets() {
		return digitalAssets;
	}

	public void setDigitalAssets(DigitalAssets digitalAssets) {
		this.digitalAssets = digitalAssets;
	}

}
