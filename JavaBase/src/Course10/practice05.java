package Course10;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Xの値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		System.out.println("Yの値を入力してください");
		int y = stdIn.nextInt();
		
		if(x>y) {
			System.out.println("Xがでかい！");
		}else if(x<y) {
				
			
			System.out.println("Yがでかい！");
			
		}else {
			System.out.println("おなじー");
		}
	}
		
	}
		
	
	


