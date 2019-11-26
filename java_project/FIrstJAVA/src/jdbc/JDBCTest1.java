package jdbc;

import java.sql.Connection;

public class JDBCTest1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
