package Mains1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DAO() {
		connDB();
	}
	
	// 추천수 상위 3개 게시글 가져오기
	public void like3(String id, String title, int like, int views) {
		try {
			String sql = "" + " SELECT * FROM BCONTENTS ORDER BY BCLIKE DESC LIMIT 3";
		}
	}


	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


