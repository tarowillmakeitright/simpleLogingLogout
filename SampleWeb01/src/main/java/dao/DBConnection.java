package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/webapp_db?serverTimezone=UTC&useSSL=false";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "password";
	private Connection con;

	//データベース上に接続させるためのgetConnectメソッド
	public Connection getConnect() throws Exception {
		//もしまだデータベースに接続されていないなら
		if (con == null) {
			//driverNameを起動してください
			Class.forName(DRIVER_NAME);
			//connnect URL userName, passwordをもとに接続してください。
			// DriverManager.getConnectionメソッド("接続先URL"、"ユーザー名"、"パスワード") 
			con = DriverManager.getConnection(CONNECT_URL, USER_NAME, PASSWORD);
		}
		//上にCONにいれたからここで実行。
		return con;
	}

	//データベースを切断するためのメソッド。
	public void closeConnect() throws Exception {
		if (con != null) {
			//切断してください。
			con.close();
			//接続を空っぽにします。
			con = null;
		}
	}
}
