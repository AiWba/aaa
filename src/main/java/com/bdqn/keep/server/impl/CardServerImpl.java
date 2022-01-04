package com.bdqn.keep.server.impl;

import com.bdqn.keep.entity.GymCard;
import com.bdqn.keep.mapper.CardMapper;
import com.bdqn.keep.server.CardServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author AiWba
 * @create -12-16-20:14
 */
@Service
public class CardServerImpl implements CardServer {

    @Resource
    private CardMapper cardMapper;

    @Override
    public List<GymCard> getall(@Param("cardtypeid") Long cardtypeid) {
        return cardMapper.getall(cardtypeid);
    }
}
