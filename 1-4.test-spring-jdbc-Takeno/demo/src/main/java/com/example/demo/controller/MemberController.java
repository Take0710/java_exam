package com.example.demo.controller;

import java.lang.reflect.Member;
import java.util.List;

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
List <Member> memberlist = repository.findAll();
for(Member list : memberlist){
  System.out.println("ID"+list.getId()+"名前"+list.getName()+"年齢"+list.getAge()+"部署ID"+list.getDep_id());
}

  memberlist = repository.load(2);
  System.out.println("ID"+memberlist.getId()+"名前"+memberlist.getName()+"年齢"+memberlist.getAge()+"部署ID"+memberlist .getDep_id());


  memberlist = repository.save(null);
  memberlist.update(5, "武野",24,99);
 memberlist = repository.save(id);
  return "finished (console output only)"; 
	}
}
