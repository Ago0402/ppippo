package Course28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		
		hu1.hp = 50;
		hu1.neru();
		
		System.out.println(hu1.name);

	
	//Chrクラスのインタンス「numata」を生成。
			//attack def spd love mp hpに好きなパラメータを設定してみよう。
			Chr numata = new Chr();
			numata.attack =9;
			numata.def = 40;
			numata.spd=70;
			numata.love=2;
			numata.mp=40;
			numata.hp=50;
		
		//Chrクラスのインスタンス「kajima」を生成
		//パラメータを設定してみよう
			Chr kajima = new Chr();
			kajima.attack =300 ;
			kajima.def = 50;
			kajima.spd=70;
			kajima.love=2;
			kajima.mp=40;
			kajima.hp=500;
			
			kajima.naguru(kajima.attack, numata.def);

}}
