package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;


import com.example.demo.entity.Friend;

@Mapper
public interface FriendMapper {


    int deleteByPrimaryKey(Integer fid);

    int insert(Friend record);

    int insertSelective(Friend record);


    Friend selectByPrimaryKey(Integer fid);

  
    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}