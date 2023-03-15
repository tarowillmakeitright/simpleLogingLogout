package bean;

import java.io.Serializable;


//データ保持用のじゃばビーンズとしてSerializableを継承する。
//どのフォルダからもアクセスできる用のぱぶりっく指定。
public class Product implements Serializable {
	//メンバ変数
	private String name;
	private int price;
//アクションクラスを定義して、引数なしのコンストラクターを定義しておく。
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
