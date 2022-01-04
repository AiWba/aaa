package com.bdqn.keep.server.impl;

import com.bdqn.keep.entity.CardType;
import com.bdqn.keep.mapper.TypeMapper;
import com.bdqn.keep.server.TypeServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author AiWba
 * @create -12-20-22:02
 */
@Service
public class TypeServerImpl implements TypeServer {
   @Resource
    private TypeMapper mapper;

    @Override
    public List<CardType> getalls() {
        return mapper.getalls();
    }
}
