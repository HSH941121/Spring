package com.jslhrd.mappertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.mapper.PdsMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PdsMapperTest {
	@Setter(onMethod_=@Autowired)
	private PdsMapper mapper;
	
	@Test
	public void pdsCountTest() {
		log.info("Total Count : " + mapper.pdsCount());
	}
}
