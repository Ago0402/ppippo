package Course29;

public class viewStatus {
	 String name;
	  int agi;
	  int hp;
	  int str;
	  int def;
	   int dex;
     
     void viewStatus() {
    	 System.out.println(name+"のステータスは");
    	 System.out.println("HP"+hp);
    	 System.out.println("防御力"+def);
    	 System.out.println("攻撃力"+str);
    	 System.out.println("命中率"+dex);
    	 System.out.println("回避率"+agi);
     }
     void battle (Character me = new Character();

		System.out.println("プレイヤー１のパラメータを入力してね");

		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は？");
		me.name = stdIn.next();

		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃は？");
		me.str = stdIn.nextInt();
		System.out.println("dexは？");
		me.dex = stdIn.nextInt();
		System.out.println("agiは？");
		me.agi = stdIn.nextInt();
		System.out.println("防御は？");
		me.def = stdIn.nextInt();

		
    	 
     }
}
