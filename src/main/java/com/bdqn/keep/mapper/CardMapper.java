package com.bdqn.keep.mapper;

import com.bdqn.keep.entity.GymCard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author AiWba
 * @create -12-16-20:12
 */
@Repository
@Mapper
public interface CardMapper {
    public List<GymCard> getall(@Param("ids") Long cardtypeid);
}
