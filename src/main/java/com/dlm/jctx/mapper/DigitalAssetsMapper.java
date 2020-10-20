package com.dlm.jctx.mapper;

import com.dlm.jctx.pojo.DigitalAssets;
import com.dlm.jctx.pojo.DigitalAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DigitalAssetsMapper {
    int countByExample(DigitalAssetsExample example);

    int deleteByExample(DigitalAssetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DigitalAssets record);

    int insertSelective(DigitalAssets record);

    List<DigitalAssets> selectByExample(DigitalAssetsExample example);

    DigitalAssets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DigitalAssets record, @Param("example") DigitalAssetsExample example);

    int updateByExample(@Param("record") DigitalAssets record, @Param("example") DigitalAssetsExample example);

    int updateByPrimaryKeySelective(DigitalAssets record);

    int updateByPrimaryKey(DigitalAssets record);
}