package Course54_55;

public class BookControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;

		System.out.println(arr[3]);

		Book book1 = new Book("明解JAVA", 1500);
		System.out.println(book1.getPrice());
		
		Book book2 = new Book("ITパスポート", 2500);
		
		Book book3 = new Book("30時間", 1200);
		
		Book book4 = new Book("確かな力", 2800);
		
		Book[] hondana = new Book[4];
		
		hondana[0] = book1;
	

	}

}
