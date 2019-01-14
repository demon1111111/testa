package com.example.demo.mapper;

import com.example.demo.model.AttackCn;
import com.example.demo.model.AttackCnExample;
import com.example.demo.model.AttackCnWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttackCnMapper {
    int countByExample(AttackCnExample example);

    int deleteByExample(AttackCnExample example);

    int insert(AttackCnWithBLOBs record);

    int insertSelective(AttackCnWithBLOBs record);

    List<AttackCnWithBLOBs> selectByExampleWithBLOBs(AttackCnExample example);

    List<AttackCn> selectByExample(AttackCnExample example);

    int updateByExampleSelective(@Param("record") AttackCnWithBLOBs record, @Param("example") AttackCnExample example);

    int updateByExampleWithBLOBs(@Param("record") AttackCnWithBLOBs record, @Param("example") AttackCnExample example);

    int updateByExample(@Param("record") AttackCn record, @Param("example") AttackCnExample example);
}