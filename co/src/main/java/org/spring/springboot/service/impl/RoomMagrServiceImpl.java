package org.spring.springboot.service.impl;

import org.spring.springboot.dao.RoomMagrDao;
import org.spring.springboot.service.RoomMagrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RoomMagrServiceImpl implements RoomMagrService{
	@Autowired
	RoomMagrDao roomMagrDao;
}
