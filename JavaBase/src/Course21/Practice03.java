package Course21;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください");
		System.out.print("1:" + "台風件数");
		System.out.print("2:" + "地震件数");
		System.out.println("3:" + "降水量");

		int x = stdIn.nextInt();

		System.out.println("年別か月別かを選んでください");
		System.out.println("1:年別");
		System.out.println("2:月別");

		int xx = stdIn.nextInt();
		int sum = 0;
		int sumsum = 0;
		
		

		//台風
		int[] typhoon = new int[12];

		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;
		
		int[] quake = new int[12];
		
		quake[0] = 153;
		quake[1] = 127;
		quake[2] = 130;
		quake[3] = 109;
		quake[4] = 118;
		quake[5] = 164;
		quake[6] = 130;
		quake[7] = 103;
		quake[8] = 103;
		quake[9] = 104;
		quake[10] = 123;
		quake[11] = 141;
		

		int[] rain = new int[12];
		
		rain[0] = 20;
		rain[1] = 58;
		rain[2] = 107;
		rain[3] = 87;
		rain[4] = 114;
		rain[5] = 187;
		rain[6] = 200;
		rain[7] = 59;
		rain[8] = 169;
		rain[9] = 441;
		rain[10] = 158;
		rain[11] = 94;
		
		if (x == 1&&xx==1) {
			for (int i = 0; i < typhoon.length; i++) {
               sum=sum+typhoon[i];
				{
				}
				}
			System.out.println( "一年の発生件数は「" +sum + "」件です");
			}
			if(x==2) {
				System.out.println();
			}
			
		  if(x==2&&xx==1) {
			for (int z = 0; z < quake.length; z++) {
				sum=sum+quake[z];

			}
			System.out.println("一年間で「" + sum + "」件です");
			}

			
		     if (x == 3&&xx==1) {
			for (int y = 0; y < rain.length; y++) {
				sum = sum+rain[y];
				}
			System.out.println(sum+ "mmです");
			

			}
		     if(x==1&&xx==2) {
		    	 System.out.println("見たい月を入力してよ");
		     
		     int yy = stdIn.nextInt();
		     System.out.println(yy+"月の台風は"+typhoon[yy-1]+"です");
		     
		     }
		     if(x==2&&xx==2) {
		    	 System.out.println("見たい月を入力してよ");
		    	 int yy = stdIn.nextInt();
		    	 System.out.println(yy+"月の地震は"+quake[yy-1]+"です");
		     }
		     if(x==3&&xx==2) {
		    	 System.out.println("見たい月を入力してよ");
		    	 int yy = stdIn.nextInt();
		    	 System.out.println(yy+"月の降水量は"+rain[yy-1]+"です");
		    	 
		     }
}
		}
	
