package Course31;

public class display {
	public static void main(String[] args) {
		 
		Books books = new Books("",100,"");
		books.display();
		
		books.name = "初期太郎";
		books.page = 300;
		books.author = "初期ネーム";
		
		books.display();
	}

}
