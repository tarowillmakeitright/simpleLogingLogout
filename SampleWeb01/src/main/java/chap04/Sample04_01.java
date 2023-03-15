package chap04;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample04_01 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sample_db";
		String userName = "root";
		String password = "root";

		Connection con = null;
		PreparedStatement stmt = null;

		String sql = "UPDATE Products SET price = ? WHERE id = ?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);

			con.setAutoCommit(false);

			stmt = con.prepareStatement(sql);

			stmt.setInt(1, 400);
			stmt.setString(2, "0102");
			int count1 = stmt.executeUpdate();

			stmt.setInt(1, 600);
			stmt.setString(2, "0103");
			int count2 = stmt.executeUpdate();

			if (count1 == 1 && count2 == 1) {
				con.commit();
				System.out.println("正常にレコードを変更しました。");
			} else {
				con.rollback();
				System.out.println("レコードの変更に失敗しました。");
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
