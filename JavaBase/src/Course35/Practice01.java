package Course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
				
		int x = stdIn.nextInt();
		if(x<50) {
			calc(x);
			
		}else {
			int y = stdIn.nextInt();
			calc(x,y);
		}
		
	}
	static void calc(int x, int y){
		System.out.println(x+y);
		
	}
	static void calc(int x) {
		System.out.println(x*10);
	}
		
        
	}


