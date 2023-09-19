package Course15;

import java.util.Random;
import java.util.Scanner;
public class pea1 {
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		
		
		int x=10000;
		  System.out.println("所持金"+x);
		  System.out.println("ざわざわ…");
		  while(0<x&&x<50000) {
		  int yy = stdIn.nextInt();
		  int num1 = rnd.nextInt(7)+1;
		  int num2 = rnd.nextInt(7)+1;
		  int num3 = rnd.nextInt(7)+1;
		  System.out.println(num1);
		  System.out.println(num2);
		  System.out.println(num3);
		  System.out.println(x=x-yy);
		  //ぞろ目
		  
		  
		  if(num1==1&&num2==1&&num3==1){
				System.out.println(x=yy*5);
			}else if(num1==num2&&num2==num3){
				System.out.println("ぞろ目");
				System.out.println(x=yy*3);
				//シゴロ
				if(num1!=num2&&num2!=num3&&num1!=num3)
				if(4<=6)
					System.out.println("シゴロ");
					System.out.println(x=yy*2);
					//ヒフミ
				if(num1!=num2&&num2!=num3&&num1!=num3)
				 if(1<=3)
					 System.out.println("ヒフミ");
				     System.out.println(x=yy*-2);
			     
				    	 System.out.println("通常の目");
				    	 System.out.println(x=x+yy);
			
					System.out.println("役なし");
					System.out.println(x=x-yy);
				
					
					
				
					
					
					
				}
						
					
					
					
					
				
					
				
				}	
				}	
					
				
					
				
			
					
					
				
					
					
				
					
				
			
				}
			
					
				
				
				
				
			
			
			
		
			
		
			
			
		
			
		
			
		  

			
			

			
			
			
