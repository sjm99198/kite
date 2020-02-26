package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner; 
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired  
	private DataSource datasource; 
	 
	 @Test  
	 public void contextLoads() {
		 
	 } 
	 
	 @Test  
	 public void testConnection() throws SQLException {  
		 System.out.println(datasource);   
		 Connection conn = datasource.getConnection();  
		 System.out.println(conn);   
		 conn.close();}

}
