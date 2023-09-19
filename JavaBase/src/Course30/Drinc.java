package Course30;

public class Drinc {

	int price;
	String name;

	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをした時に自動的に発動する。
	Drinc(int p, String n) {
		price = p;
		name = n;
	}

	void display() {
		System.out.println("商品名は：" + name);
		System.out.println("値段は：" + price);
	}
	int calcSum(int x, int y) {
		int sum = x*y;
		return sum;
	}
}