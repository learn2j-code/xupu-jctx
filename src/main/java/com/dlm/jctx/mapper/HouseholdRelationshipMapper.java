package com.dlm.jctx.mapper;

import com.dlm.jctx.pojo.HouseholdRelationship;
import com.dlm.jctx.pojo.HouseholdRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdRelationshipMapper {
    int countByExample(HouseholdRelationshipExample example);

    int deleteByExample(HouseholdRelationshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdRelationship record);

    int insertSelective(HouseholdRelationship record);

    List<HouseholdRelationship> selectByExample(HouseholdRelationshipExample example);

    HouseholdRelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseholdRelationship record, @Param("example") HouseholdRelationshipExample example);

    int updateByExample(@Param("record") HouseholdRelationship record, @Param("example") HouseholdRelationshipExample example);

    int updateByPrimaryKeySelective(HouseholdRelationship record);

    int updateByPrimaryKey(HouseholdRelationship record);
}