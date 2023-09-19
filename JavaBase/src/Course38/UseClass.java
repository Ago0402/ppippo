package Course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		Pocketon pok = new Pocketon();
		pok.name = "銭カメ";
		pok.power = 100;
		pok.difficult = 1;
		pok.display();

		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		poke2.display();

		Pocketon poke3 = new Pocketon();
		String x = stdIn.next();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();

		poke3.name = x;

		poke3.power = y;

		poke3.difficult = z;

		poke3.display();

		String[] arr2 = new String[3];
		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";

		for (int a = 0; a < 3; a++) {
			System.out.println(arr2[a]);
		}
			Pocketon[] mypockes = new Pocketon[3];
			mypockes[0] = pok;
			mypockes[1] = poke2;
			mypockes[2] = poke3;

			System.out.println(mypockes[0].name);
			System.out.println(mypockes[1].difficult);
			System.out.println(mypockes[2].name);

			for (int i = 0; i < 3; i++) {
				System.out.println(mypockes[i].name);
			}
			mypockes[1].display();
			
			Student stu = new Student();
			stu.name ="大吾";
			stu.no =23;
			
			
			
			Student stu2 = new Student();
			stu2.name ="りょうすけ";
			stu2.no =11;
			
			
			Student[] myfriend = new Student[3];
			myfriend[0] = stu;
			myfriend[1] = stu2;
			
			for (int p = 0; p < 3; p++) {
				System.out.println(myfriend[p].name);
			}
		}
	    
	
}
