package Course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] mygroup = new String[3];
		//慣れよう問題①
		mygroup[0]="まさくに";
		mygroup[1]="はるや";
		mygroup[2]="ひろむ";
		
		for(int i=0; i<3; i++ ) {
			System.out.println("俺の友達の名前は"+ mygroup[i]+"だ。");
		}
		
		
		//慣れよう問題②
		int[] mygroupnum = new int[3];
		
		 mygroupnum[0] =7;
		 mygroupnum[1] =14;
		 mygroupnum[2] =16;
		 
		{ for(int i=0; i<3; i++ ) 
			 System.out.println("俺の友達の番号は"+ mygroupnum[i]+"だ。");
			 
			 
			//慣れよう問題③
			 int[] mynum = new int[3];
			 
			 mynum[0] = 10;
			 mynum[1] = 50;
			 mynum[2] = mynum[0]+mynum[1];
			 
			 for(int i=0; i<3; i++ ) {
				 System.out.println(mynum[i]);
			 }
			 
			 //慣れよう問題④
			 int[] myNumScan = new int[3];
			 Scanner stdIn = new Scanner(System.in);
			 System.out.println("入力してください");
			 int  x = stdIn.nextInt();
			
			 
			 myNumScan[0]=10;
			 myNumScan[1]=x;
			 myNumScan[2]=myNumScan[0]+myNumScan[1];
			 
			 for(int i=0; i<3; i++ ) {
					System.out.println(myNumScan[i]);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		
		
		}
		
		

	}

}
