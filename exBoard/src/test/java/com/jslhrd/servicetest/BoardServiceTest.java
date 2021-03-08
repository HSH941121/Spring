package com.jslhrd.servicetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
	
	@Setter(onMethod_=@Autowired)
	private BoardService service;
	
	/*
	@Test
	public void boardCountTest() {
		log.info("Service boardCount : " + service.boardCount());
	}
	
	
	@Test
	public void boardListTest() {
		log.info("Service boardList : " + service.boardList()); 
	}
	
	
	@Test
	public void boardSelectTest() {
		log.info("Service boardSelect : " + service.boardSelect(1)); 
	}
	*/
	
	@Test
	public void boardWriteTest() {
		BoardVO vo = new BoardVO();
		log.info("Service boardWirte : " + service.boardWrite(vo)); 
	}
}
