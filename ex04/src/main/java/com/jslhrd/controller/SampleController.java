package com.jslhrd.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jslhrd.domain.SampleVO;

@Controller
@RequestMapping("sample")
public class SampleController {
	private static final Logger log = LoggerFactory.getLogger(SampleController.class);
	
	
	@RequestMapping("")
	public void test01() {
		log.info("test01() Call................");
	}
	
	@RequestMapping("test02")
	public void test02() {
		log.info("test02() Call................");
	}
	
	@RequestMapping("test03")
	public void test03(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name : " + name);
		log.info("age : " + age);
	}
	
	@RequestMapping("test04")
	public void test04(String name, int age) {
		log.info("name : " + name);
		log.info("age : " + age);
	}
	
	@RequestMapping("test05")
	public void test05(SampleVO vo) {
		log.info("SampleVO : " + vo);
	}
	
	@RequestMapping("test06")
	public void test06(String[] ids) {
		log.info("String[] ids : " + Arrays.toString(ids));
	}
	
	@RequestMapping("test07")
	public void test07(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ArrayList<String> ids : " + ids);
	}
	
	@RequestMapping("test08")
	public void test08(Model model) {
		log.info("test08() Call................");
		
		model.addAttribute("row",100);
		model.addAttribute("name","홍길동");
	}
	
	@RequestMapping("test09")
	public void test09(Model model, @RequestParam("page") int page) {
		log.info("test09() Call................");
		
		List<String> list = new ArrayList<String>();
		list.add("김학생");
		list.add("이학생");
		list.add("권학생");
		list.add("박학생");
		list.add("윤학생");
		
		model.addAttribute("list",list);
	}
	
	//Java Bean 파일(VO,DTO) 자동 전달자 역할
	@RequestMapping("test10")
	public void test10(Model model,SampleVO vo, @RequestParam("page") int page) {
		log.info("test10() Call................");
		log.info("SampleVO : " + vo);
		log.info("page : " + page);
		model.addAttribute("vo",vo);	
	}
	
	@RequestMapping("test11")
	public void test11(SampleVO vo, @ModelAttribute("page") int page) {
		log.info("test11() Call................");
		log.info("SampleVO : " + vo);
		log.info("page : " + page);	
	}
	
	//일회성 전달 (RedirectAttribute)
	@RequestMapping("test12")
	public String test12(RedirectAttributes rttr) {
		log.info("test12() Call................");
		
		rttr.addFlashAttribute("row",1);
		return "redirect:/sample/test12_pro";
	}
	
	@GetMapping("test12_pro")
	public void test12_pro() {
		
	}
	
	@RequestMapping("test13")
	public String test13() {
		log.info("test13() Call................");
		
		return "/sample/test12_pro";
	}
	
	//리턴타입 객체(VO,DTO)
	//JSON 데이터(속성-값 쌍으로 구성된 데이터)
	@RequestMapping("test14")
	public @ResponseBody SampleVO test14() {
		log.info("test14() Call................");
		SampleVO vo = new SampleVO();
		vo.setName("홍길동");
		vo.setAge(26);
		vo.setTel("010-1111-2222");
		
		return vo;
		
		
	}
	
}
