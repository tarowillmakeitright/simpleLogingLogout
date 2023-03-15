package bean;

import java.io.Serializable;

//データ保持用javaビーンズと実装いたしますので、Serializableを必ず継承します。
public class User implements Serializable {
	//プライベートにして、直接値を入れさせない。だからセッターげったーを作る。
	private String id;
	private String name;

	//コンストラクターをオーバーロード
	public User() {}

	public User(String id, String name) {
		//メンバ変数
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
