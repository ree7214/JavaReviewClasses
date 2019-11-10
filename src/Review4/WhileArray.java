package Review4;

import java.util.Scanner;

public class WhileArray {

	public static void main(String[] args) {
		//The size of the array is fixed
		String [] strArray = new String [10]; 
		
		Scanner scan = new Scanner (System.in);
		
		int index = 0;
		String name = "";
		do {
		System.out.println("Enter names, to stop enter 'STOP");
		name=scan.nextLine();
		strArray[index]=name;
		index++;
		}while(!name.equals("STOP"));
		
		
	}

}
