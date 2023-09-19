package Course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);
		
		int yy = stdIn.nextInt();
				
		
		for(int i = 1 ; i<=yy; i++) {
			System.out.println(i+"です。");
		
		int y = i%2;
		if(y==0) {
			System.out.print("偶数です");
		}	else {
			System.out.print("奇数だよ");
		}
		
		if(100<=i) {
			System.out.println("回しすぎ");
		}
	
		
		
		
		
		
		
		

	}


	}
}