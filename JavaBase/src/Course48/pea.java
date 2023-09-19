package Course48;

import java.util.Scanner;

public class pea {

	

		public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in );
			int[][] a = new int[6][6];
			for (int c = 1; c <= 6; c++) {
				for (int b = 1; b <= 6; b++) {
					a = ss(c, b);
					a[c-1][b-1]=stdIn.nextInt();
					
					
				}
				System.out.println();
			}

		}

		static int[][] ss(int a, int b) {
			int[][] ss = new int[0][0];
			ss = new int[a][b];

			return ss;

		}

	}



