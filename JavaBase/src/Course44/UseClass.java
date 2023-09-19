package Course44;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human human = new Human();
		
		
		//Humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(600000);
		
		human.disp();
		human.dispweight();
		
		human.eat("ハンバーガー",1200);
		
		human.dispweight();
		
		Animal ani = new Animal();
		
		ani.setName("サイ");
		ani.setWeight(7000000);
		ani.setKari("角で相手を粉砕する");
		ani.setJumyou(30);
		
		ani.display();
		
	}


}
