package Course53;

public class BookControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Book book1 = new Book();
		Book book2 = new Book("IT");
		
		
		Book book3 = new Book("IT",1000);
		
		System.out.println(book1.getTitle());
		System.out.println(book2.getPrice());
		
		System.out.println(book3.getPrice());
		System.out.println(book3.getTitle());


		//Book book2 = new Book("ITワールド");

	}

	}


