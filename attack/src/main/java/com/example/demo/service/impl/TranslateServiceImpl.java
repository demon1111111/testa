package com.example.demo.service.impl;

import com.example.demo.service.TranslateService;
import com.example.demo.mapper.AttackCnMapper;
import com.example.demo.model.AttackCn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Windows7 on 2018/12/28.
 */
@Service
public class TranslateServiceImpl implements TranslateService {

    @Autowired
    AttackCnMapper attackCnMapper;

    @Override
    public List<AttackCn> getAttackCh() {
        return attackCnMapper.selectByExample(null);
    }
}
