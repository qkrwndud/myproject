package com.spring.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.MemberDAO;
import com.spring.vo.MemberVO;

@Controller
public class TestDAO {
	
	@Inject
	private MemberDAO dao;
	
	@RequestMapping(value="/testDAO", method= RequestMethod.GET)
	public void testDAO() {
		MemberVO vo =new MemberVO();
		vo.setId("jubong");
		vo.setName("JungJubong");
		vo.setPw("jjb");
		
		dao.insertMember(vo);
	}
}
