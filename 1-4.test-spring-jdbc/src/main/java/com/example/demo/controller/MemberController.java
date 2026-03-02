package com.example.demo.controller;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		Member member = new Member();
		repository.member(member);

		Member member2 = repository.load(3);
		System.out.println(member2);
		repository.deleteById(3);
		repository.findAll().forEach(System.out.println);
		return "member";
	}
}
