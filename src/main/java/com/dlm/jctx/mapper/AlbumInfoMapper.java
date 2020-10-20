package com.dlm.jctx.mapper;

import com.dlm.jctx.pojo.AlbumInfo;
import com.dlm.jctx.pojo.AlbumInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumInfoMapper {
    int countByExample(AlbumInfoExample example);

    int deleteByExample(AlbumInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlbumInfo record);

    int insertSelective(AlbumInfo record);

    List<AlbumInfo> selectByExample(AlbumInfoExample example);

    AlbumInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlbumInfo record, @Param("example") AlbumInfoExample example);

    int updateByExample(@Param("record") AlbumInfo record, @Param("example") AlbumInfoExample example);

    int updateByPrimaryKeySelective(AlbumInfo record);

    int updateByPrimaryKey(AlbumInfo record);
}