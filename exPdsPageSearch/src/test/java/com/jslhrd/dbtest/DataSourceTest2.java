package com.jslhrd.dbtest;

import java.sql.Connection;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest2 {
	/*
	@Setter(onMethod_= @Autowired) //林涝
	private SqlSessionFactory sqlSessionFactory;
	*/
	
	
	@Inject
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Test
	public void testConnection() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection con = session.getConnection();
			log.info("技记 按眉 : " + session);
			log.info("目池记 : " + con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
