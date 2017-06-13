package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendMapper;
import com.example.demo.entity.Friend;
import com.example.demo.service.FriendService;

@Service
public class FriendServiceImpl implements FriendService{
	@Autowired
	private FriendMapper	friendMapper;

	@Override
	public Friend selectByPrimaryKey(Integer fid) {
		
		return friendMapper.selectByPrimaryKey(fid);
	}

	@Override
	public int insertFriend(Friend friend){
		return friendMapper.insert(friend);
	}

	@Override
	public int insertSelectiveFriend(Friend friend) {
		
		return friendMapper.insertSelective(friend);
	}

}
