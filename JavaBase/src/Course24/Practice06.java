package Course24;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("入力してください");
		int x = stdIn.nextInt();
		if(x==1) {
			plus();
			
		}else {
	minus();
		
		

	}
	
	static void plus() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("入力してください");
		int x = stdIn.nextInt();
		if(x==1) {
		System.out.println("もう一回");
		int y = stdIn.nextInt();
		System.out.println(x+y);
		}
	}
	static void minus() {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if(x==2) {
		System.out.println("入力してください");
		System.out.println("もう一回");
		int y = stdIn.nextInt();
		System.out.println(x-y);
		}
	}

}
