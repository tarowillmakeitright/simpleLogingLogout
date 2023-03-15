package chap03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample03_01 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sample_db";
		String userName = "root";
		String password = "root";

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM Products";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");

				System.out.println(id + "\t" + name + "\t" + price);
			}
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
