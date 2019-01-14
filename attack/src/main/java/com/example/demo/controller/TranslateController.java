package com.example.demo.controller;

import com.example.demo.service.TranslateService;
import com.example.demo.model.AttackCn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Windows7 on 2018/12/27.
 */
@RestController
@RequestMapping(value = "/attack")
public class TranslateController {

    @Resource
    private TranslateService translateService;

    @RequestMapping(value = "/tt")
    public String tt() {
        return "ok";
    }

    @RequestMapping(value = "/getAttackCh")
    public List<AttackCn> getAttackCh() {
        return translateService.getAttackCh();
    }

}
