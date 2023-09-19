package Course26;

import java.util.Random;
import java.util.Scanner;

public class pea {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ハイカード");
		
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();	
		int x = 1000;
		System.out.println("現在の所持金は"+x+"です。");
		int z = modoriOne(3);
		System.out.println("カードは"+z+"です");
		System.out.print("次のカードはこれよりも高い？低い？");
		System.out.println("高いと予想するなら「1」、低いと予想するなら「2」");
		int r = stdIn.nextInt();
		int d = modori(0);
		System.out.println("現在のカード："+z);
		System.out.println("次のカード："+d);
		
		
		 
	}//乱数①
	static int modoriOne(int x) {
		Random rnd = new Random();	
		int mom = rnd.nextInt(12)+1;
		return mom;
		
	
	}
   //乱数②
   static int modori(int xx) {
	Random rnd = new Random();	
	int p = rnd.nextInt(12)+1;
	return p;
   }
	
	

}
