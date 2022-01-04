package com.bdqn.keep.server;

import com.bdqn.keep.entity.GymCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author AiWba
 * @create -12-16-20:12
 */
public interface CardServer {

    public List<GymCard> getall(@Param("cardtypeid") Long cardtypeid);
}
