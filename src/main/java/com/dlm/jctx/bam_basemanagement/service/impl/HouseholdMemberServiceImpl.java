package com.dlm.jctx.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.jctx.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.jctx.bam_basemanagement.service.HouseholdRelationshipService;
import com.dlm.jctx.bam_basemanagement.vo.NewHouseholdMemberVo;
import com.dlm.jctx.bam_basemanagement.vo.SpouseMember;
import com.dlm.jctx.constant.CommonConstant;
import com.dlm.jctx.mapper.HouseholdMemberMapper;
import com.dlm.jctx.pojo.HouseholdMember;
import com.dlm.jctx.pojo.HouseholdMemberExample;
import com.dlm.jctx.pojo.HouseholdRelationship;

@Service
public class HouseholdMemberServiceImpl implements HouseholdMemberService {
	@Autowired
	HouseholdMemberMapper mapper;

	@Autowired
	HouseholdRelationshipService householdRelationshipService;
	
	@Override
	public List<HouseholdMember> list() {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdMember record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer householdId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByUserId(Integer userId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andUserIdEqualTo(userId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addHouseholdMember(HouseholdMember record) {
		add(record);
		Integer memberId = record.getId();
		//判断成员是主干还是非主干成员
		if(record.getMainFlag()==1) {
			//主
			//先添加与父亲的关系
			if(record.getFatherId()!=null&&record.getFatherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getFatherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_FATHER);
				householdRelationshipService.add(householdRelationship);
			}
			//再添加与母亲的关系
			if(record.getMotherId()!=null&&record.getMotherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getMotherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_MOTHER);
				householdRelationshipService.add(householdRelationship);
			}
		}else {
			//非主
			//添加与配偶的关系
			if(record.getSpouseId()!=null&&record.getSpouseId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getSpouseId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				householdRelationshipService.add(householdRelationship);
			}
		}
	}

	@Override
	public void updateHouseholdMember(HouseholdMember record) {
		update(record);
		//先删除原有的关系
		householdRelationshipService.deleteHouseholdRelationshipByMaId(record.getId());
		//判断成员是主干还是非主干成员
		if(record.getMainFlag()==1) {
			//主
			//先添加与父亲的关系
			if(record.getFatherId()!=null&&record.getFatherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getFatherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_FATHER);
				householdRelationshipService.add(householdRelationship);
			}
			//再添加与母亲的关系
			if(record.getMotherId()!=null&&record.getMotherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getMotherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_MOTHER);
				householdRelationshipService.add(householdRelationship);
			}
		}else {
			//非主
			//添加与配偶的关系
			if(record.getSpouseId()!=null&&record.getSpouseId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getSpouseId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				householdRelationshipService.add(householdRelationship);
			}
		}
		
	}

	@Override
	public void updateRelationListByHouseholdId(Integer householdId) {
		List<HouseholdMember> householdMemberList = findHouseholdMemberListByHouseholdId(householdId);
		for(HouseholdMember householdMember:householdMemberList) {
			//先判断成员是否是主干成员
			HouseholdMember newHouseholdMember = new HouseholdMember();
			if(householdMember.getMainFlag()==1) {
				String relationList = householdRelationshipService.getRelationListById(householdMember.getId());
				newHouseholdMember.setId(householdMember.getId());
				newHouseholdMember.setRelationList(relationList);
			}else {
				Integer mainId = householdRelationshipService.findMbIdByMaId(householdMember.getId(), CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				String relationList = householdRelationshipService.getRelationListById(mainId);
				String newRelationList = householdMember.getId()+"-"+relationList;
				newHouseholdMember.setRelationList(newRelationList);
			}
			newHouseholdMember.setId(householdMember.getId());
			update(newHouseholdMember);
		}
	}

	@Override
	public NewHouseholdMemberVo findNewHouseholdMemberVoByHeadId(Integer headId) {
		NewHouseholdMemberVo newHouseholdMemberVo = new NewHouseholdMemberVo();
		HouseholdMember headNode = get(headId);
		newHouseholdMemberVo.setHeadNode(headNode);
		List<SpouseMember> spouseMemberList = new ArrayList<>();
		// 先查配偶
		List<Integer> spouseIdList = householdRelationshipService.findMaIdListByMbId(headId, CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
		for(Integer spouseId:spouseIdList) {
			SpouseMember spouseMember = new SpouseMember();
			//根据配偶id查子女
			HouseholdMember spouseNode = get(spouseId);
			spouseMember.setSpouseNode(spouseNode);
			List<Integer> childIdList = new ArrayList<>();
			if(headNode.getGender()==1) {
				//如果主节点是男的，则
				childIdList = householdRelationshipService.findMaIdListByMbId(spouseId, CommonConstant.RELATIONSHIP_CHILD_MOTHER);
			}else {
				childIdList = householdRelationshipService.findMaIdListByMbId(headId, CommonConstant.RELATIONSHIP_CHILD_MOTHER);
			}
			if(childIdList!=null&&childIdList.size()>0) {
				List<HouseholdMember> childList = findHouseholdMemberListByIdList(childIdList);
				spouseMember.setChildList(childList);
			}
			spouseMemberList.add(spouseMember);
		}
		newHouseholdMemberVo.setSpouseMemberList(spouseMemberList);
		return newHouseholdMemberVo;
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByIdList(List<Integer> idList) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andIdIn(idList);
		return mapper.selectByExample(example);
	}
}
