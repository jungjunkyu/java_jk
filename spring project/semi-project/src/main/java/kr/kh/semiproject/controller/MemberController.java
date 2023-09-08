package kr.kh.semiproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kh.semiproject.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	
}
