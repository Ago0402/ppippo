package Course30;

public class UseClass {
	public static void main(String[] args) {

		Drinc dr = new Drinc(100, "初期データ");
		dr.display();

		dr.name = "午後の紅茶";
		dr.price = 150;

		dr.display();
		
		int sum = dr.calcSum(dr.price,17);
		System.out.println("合計値は"+sum);
	}
}
