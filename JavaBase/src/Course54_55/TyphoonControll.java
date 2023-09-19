package Course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		//格納用配列
				Typhoon[] typhoonList = new Typhoon[9];

				Typhoon ty1 = new Typhoon(1, "2022年4月8日", "マラカス");
				Typhoon ty2 = new Typhoon(2, "2022年4月10日", "メーギー");
				Typhoon ty3 = new Typhoon(3, "2022年6月30日", "チャバ");
				Typhoon ty4 = new Typhoon(4, "2022年7月1日", "アイレー");
				Typhoon ty5 = new Typhoon(5, "2022年7月28日", "ソングダー");
				Typhoon ty6 = new Typhoon(6, "2022年7月31日", "トローセス");
				Typhoon ty7 = new Typhoon(7, "2022年8月9日", "ムーラン");
				Typhoon ty8 = new Typhoon(8, "2022年8月12日", "メアリー");
				Typhoon ty9 = new Typhoon(9, "2022年8月22日", "マーゴン");

				typhoonList[0] = ty1;
				typhoonList[1] = ty2;
				typhoonList[2] = ty3;
				typhoonList[3] = ty4;
				typhoonList[4] = ty5;
				typhoonList[5] = ty6;
				typhoonList[6] = ty7;
				typhoonList[7] = ty8;
				typhoonList[8] = ty9;
				
				
				System.out.println("入力してください");
				int x = stdIn.nextInt();
				
                if(x==2) {              	
				for (int i = 0; i < typhoonList.length; i++) {
					System.out.println(typhoonList[i].getAsiaName());
				}
                }else if(x==99){
                	System.out.println("どの名前を変更しますか？");
                	
                }
			}
		}