package com.example.demo.mapper;

import com.example.demo.model.AttackEn;
import com.example.demo.model.AttackEnExample;
import com.example.demo.model.AttackEnWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttackEnMapper {
    int countByExample(AttackEnExample example);

    int deleteByExample(AttackEnExample example);

    int insert(AttackEnWithBLOBs record);

    int insertSelective(AttackEnWithBLOBs record);

    List<AttackEnWithBLOBs> selectByExampleWithBLOBs(AttackEnExample example);

    List<AttackEn> selectByExample(AttackEnExample example);

    int updateByExampleSelective(@Param("record") AttackEnWithBLOBs record, @Param("example") AttackEnExample example);

    int updateByExampleWithBLOBs(@Param("record") AttackEnWithBLOBs record, @Param("example") AttackEnExample example);

    int updateByExample(@Param("record") AttackEn record, @Param("example") AttackEnExample example);
}