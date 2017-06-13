package com.example.demo.service;

import com.example.demo.entity.Friend;

public interface FriendService {
	
	Friend selectByPrimaryKey(Integer fid);
	
	int insertFriend(Friend friend);
	
	int insertSelectiveFriend(Friend friend);

}
