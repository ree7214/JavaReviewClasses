package Review5;

import java.util.Scanner;

public class Scanner2D_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many rows and columns do you want");
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		System.out.println("Your array will have "+rows+" rows and "+cols+" columns");
		
		String [][]names = new String [rows][cols];
		
		  //names.lenth = rows
		  //names[0].length = cols
		  //entering into array
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Please enter a name");
				names[i][j]=scan.next();
			}
			
		}
		//print array
		System.out.println("lets print the names");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println(names[i][j] + " ");
			}
		}System.out.println();
	}

}
