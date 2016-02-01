package sist.co.controller;

import java.util.Date;
import java.util.List;

import sist.co.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloMemberController {
	
private static final Logger logger = LoggerFactory.getLogger(HelloMemberController.class);
	

		//자동적으로 가게 되는 곳
	@RequestMapping(value = "login.do", method = RequestMethod.GET)	
	public String login(Model model) {		
		/* #002 controller */ 
		logger.info("Welcome HelloMemberController login! "+ new Date());
		
		
		//layout.xml에서 해당 리턴값 보고 그곳에 맞춰 jsp파일 뿌려줌
		return "login.tiles";
	}
}
