package chap03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample03_03 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sample_db";
		String userName = "root";
		String password = "root";

		Connection con = null;
		PreparedStatement stmt = null;

		String sql = "INSERT INTO Products VALUES(?, ?, ?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);

			stmt = con.prepareStatement(sql);
			stmt.setString(1, "0104");
			stmt.setString(2, "ぶどう");
			stmt.setInt(3, 550);

			int count = stmt.executeUpdate();

			System.out.println(count + "件のレコードを登録しました。");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバがロードできません。");
		} catch (SQLException e) {
			System.out.println("データベース・アクセスエラーです。");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("データベース・アクセスエラーです。");
			}
		}
	}

}
