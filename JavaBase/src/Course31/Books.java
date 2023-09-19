package Course31;

public class Books {

	
		// TODO 自動生成されたメソッド・スタブ
         String name;
         int page;
         String author;
         
        Books(String n,int page,String a){
        	page = page;
        	name = n;
        	author = a;
        }
            void display() {
            	System.out.println(name);
            	System.out.println(page);
            	System.out.println(author);
        	 
         }
	
}

