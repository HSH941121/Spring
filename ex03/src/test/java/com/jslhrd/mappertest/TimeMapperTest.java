package com.jslhrd.mappertest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTest {
	@Inject
	private TimeMapper timeMapper;
	
/*
	@Test
	public void testGetTime() {
		log.info("getTime() : " + timeMapper.getTime());
	}
*/
	@Test
	public void testGetTime2() {
		log.info("getTime2() : " + timeMapper.getTime2());
	}
}
