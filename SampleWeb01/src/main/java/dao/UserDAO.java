package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDAO {
	private DBConnection db;

	public UserDAO(DBConnection db) {
		this.db = db;
	}

	public User find(String id) throws Exception {
		//ユーザーくらすの宣言　まずは空っぽで設定しまス。
		User user = null;
		//この部分がSQL上で実行する設定。SQL構文になっていることに注目
		
		//また「？」引数の「id」を設定できるようにします。<= public User find(String id)....
		String sql = "SELECT id, name FROM Users WHERE id = ?";
		//String sql = "SELECT id, name FROM Users WHERE id = '" + id + "'";

		//コネクションの生成
		Connection con = db.getConnect();
		// ＳＱＬ構文をｓｔｍｔに入れる。 //select文=>excuteQuery()メソッド使用　
		//select分以外=>excuteUpdate();
		PreparedStatement stmt = con.prepareStatement(sql);
		//一つ目の値にidを入れてください。 
		//setFloat setInt, setLong setDouble...(int parameterIndex, int x) throws SQL Exce@tion 
		stmt.setString(1, id);
		//ここでＳＱＬ文をじっこうして結果を出力します。
		ResultSet rs = stmt.executeQuery();
		//もしデータベーすにid, nameがあったら、それをユーザーのＩＤと名前として取ってください。
		
		if (rs.next()) {
			//MySQLから値を取得する。
			String userId = rs.getString("id");
			String name = rs.getString("name");

			user = new User(userId, name);
		}
		//お願いします。
		return user;
	}
}
