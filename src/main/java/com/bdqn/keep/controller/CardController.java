package com.bdqn.keep.controller;

import com.bdqn.keep.entity.GymCard;
import com.bdqn.keep.server.CardServer;
import com.bdqn.keep.server.impl.CardServerImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.log.LogInputStream;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @author AiWba
 * @create -12-16-20:13
 */
@Controller
@RequestMapping("/card")
public class CardController {
    @Resource
    private CardServer cardServer;

    @RequestMapping("/all")
    public String all(Model model,@RequestParam(value = "id",defaultValue = "0",required = false) String cardtypeid) {
        System.out.println(cardtypeid);
        Long ids=Long.parseLong(cardtypeid);
        List<GymCard> list = cardServer.getall(ids);
        model.addAttribute("list", list);
        return "test";
    }
}
