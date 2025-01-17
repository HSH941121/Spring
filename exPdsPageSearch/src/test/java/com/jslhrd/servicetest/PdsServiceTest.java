package com.jslhrd.servicetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.service.PdsService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PdsServiceTest {
	@Setter(onMethod_=@Autowired)
	private PdsService service;
	
	@Test
	public void pdsCountTest() {
		log.info("Service Total Count : " + service.pdsCount());
	}
}
