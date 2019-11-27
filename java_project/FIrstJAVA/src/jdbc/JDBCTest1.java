package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료");
			
			// 호스트, port, db name
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			// 계정
			String user = "scott";
			// 비밀번호
			String pw = "tiger";
			
			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("데이터베이스에 정상적으로 접속되었습니다.");
			
			// 3. 데이터의 검색과 변경처리 : select / DML
			
			// 3.1 dept 테이블의 내용을 출력
			// Statement 객체 생성
			
			Statement stmt = conn.createStatement();
			
			String sql1 = "select * from dept ";
			
			ResultSet rs = stmt.executeQuery(sql1);
			
			while(rs.next()) {
				
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + " | " + dname + " | " + loc);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
