package Course41;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int[] variable = new int[stdIn.nextInt()];
		int o = stdIn.nextInt();
		String x = "x";
		
		mogi();
		calc(10,11);
		mojicon(x);
		System.out.println(x+"です。");

	}
   static void mogi() {
	   System.out.println("メソッド問題");
   }
	static void calc(int a, int b) {
		System.out.println(a + b);
	}
	static String mojicon(String moji) {
		moji = "今のところ全問正解でしょ？";
		String  concated = "こんにちは、" +moji;
		return concated;
	}
}
