package com.dlm.jctx.bam_basemanagement.vo;

import java.util.List;

import com.dlm.jctx.pojo.HouseholdInfo;
import com.dlm.jctx.pojo.HouseholdMember;
import com.dlm.jctx.pojo.UserInfo;

public class UserInfoExtends extends UserInfo {
	private List<HouseholdMember> householdMemberList;
	public List<HouseholdMember> getHouseholdMemberList() {
		return householdMemberList;
	}
	public void setHouseholdMemberList(List<HouseholdMember> householdMemberList) {
		this.householdMemberList = householdMemberList;
	}
}
