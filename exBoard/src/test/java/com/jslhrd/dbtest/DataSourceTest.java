package com.jslhrd.dbtest;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {
	/*
	@Setter(onMethod_= @Autowired) //¡÷¿‘
	private DataSource dataSource;
	*/
	
	
	@Inject
	private DataSource dataSource;
	
	
	@Test
	public void testConnection() {
		try {
			Connection con = dataSource.getConnection();
			log.info(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
