package Course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Product pro1 = new Product();

		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantitiy = 10;

		pro1.display();

		Food pro2 = new Food();

		
		pro2.name = "Item1";
		pro2.price = 200;
		
		pro2.display();

	}

}
