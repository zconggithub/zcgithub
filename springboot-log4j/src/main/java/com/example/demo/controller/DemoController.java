package com.example.demo.controller;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Friend;
import com.example.demo.service.FriendService;


@RestController
public class DemoController {
	
	//此处引用的包也是import org.apache.log4j.Logger;
	private Logger logger=Logger.getLogger(DemoController.class);
	
	@Autowired
	private FriendService FriendService;

	@RequestMapping("/getOneFriend")//返回的是json数据
	public Friend getOneJsonFriend(){
				
	Friend friend=FriendService.selectByPrimaryKey(1);
	logger.info("####log4j的测试####");
		logger.info("####我是zcgithub####,我删除了所有的测试信息，除了此条");
		return friend;
	}
	

	
	

}
