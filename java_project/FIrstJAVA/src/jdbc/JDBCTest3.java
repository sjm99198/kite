package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

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
			
			//conn.setAutoCommit(false);
			
			// 3. 데이터의 검색과 변경처리 : select / DML
			
			
			
			
			
			Dao dao = Dao.getInstance();
			
			// 부서 정보 입력
			//dao.insertDept(conn, 90, "design", "seoul");
			
			// 부서 정보 수정
			//dao.editDept(conn, 80, "MARKETING", "NEWYORK");
			//dao.editDept(conn, 60, "MARKETING", "NEWYORK");
			
			// 부서정보 삭제
			//dao.deleteDept(conn, 90);
			//dao.deleteDept(conn, 70);
			
			// 부서 리스트 출력
			//dao.listDept(conn);
			
			// 부서 검색
			dao.searchDept(conn, 90);
			dao.searchDept(conn, 10);
			dao.searchDept(conn, 40);
			dao.searchDept(conn, 60);
			
			
			
			
			
			
			
			
			//conn.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
	
			
			
			e.printStackTrace();
			//System.out.println("입력오류");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
