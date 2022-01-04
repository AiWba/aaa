package com.bdqn.keep.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.keep.entity.CardType;
import com.bdqn.keep.server.TypeServer;
import com.bdqn.keep.util.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author AiWba
 * @create -12-20-22:03
 */
@Controller
@RequestMapping("type")
public class TypeController {
    @Resource
    private TypeServer typeServer;
    @Resource
    private RedisUtil redisUtil;
    @RequestMapping("/all")
    @ResponseBody
    public String all(){
        List<CardType> typeList=typeServer.getalls();
//        String allcard= JSON.toJSONString(typeList);
//        redisUtil.set("allcard",allcard);
//        return redisUtil.get("allcard").toString();
        return JSON.toJSONString(typeList);
    }
    @RequestMapping("/index")
    public String index(){
        return "redirect:/card/all";
    }
}
