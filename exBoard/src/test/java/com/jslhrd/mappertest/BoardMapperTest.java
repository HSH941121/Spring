package com.jslhrd.mappertest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	@Inject
	private BoardMapper mapper;
	
	/*
	@Test
	public void boardCount() {
		log.info("boardCount : " + mapper.boardCount());
	}
	
	@Test
	public void boardList() {
		log.info("boardList : " + mapper.boardList());
	}
	
	@Test
	public void boardSelect() {
		BoardVO vo = mapper.boardSelect(2);
		log.info(vo);
	}
	
	
	
	@Test
	public void boardWrite() {
		BoardVO vo = new BoardVO();
		vo.setName("json");
		vo.setEmail("www.com.com");
		vo.setPass("1234");
		vo.setSubject("title");
		vo.setContents("contents");
		log.info("���ó�� : " + mapper.boardWrite(vo));
	}
	
	
	
	@Test
	public void boardUpdate() {
		BoardVO vo = new BoardVO();
		vo.setIdx(2);
		vo.setSubject("��������");
		vo.setContents("��������");
		
		log.info("����ó�� : " + mapper.boardUpdate(vo));
	}
	
	@Test
	public void boardDelete() {
		
		log.info("���� ó�� : " + mapper.boardDelete(6));
	}
	*/
}
