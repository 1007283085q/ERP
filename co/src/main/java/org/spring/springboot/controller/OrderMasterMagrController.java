package org.spring.springboot.controller;

import java.util.List;

import org.spring.springboot.service.RoomMagrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
@CrossOrigin
@RestController
@RequestMapping("/api/task")
public class OrderMasterMagrController {
	
	@Autowired private RoomMagrService roomMagrService;

//	@RequestMapping("getAllInfo")
//	public List<?> getAllInfo(){
//		return orderMasterMagrService.getAllInfo();
//	}
	
//    @RequestMapping(value = "/index")
//    public String success(){
//        return "index";
//    }
}
