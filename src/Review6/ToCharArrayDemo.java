package Review6;

public class ToCharArrayDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not monday.";
		char[] charArray = longStr.toCharArray();
		
		System.out.println(charArray.length);//<-----Property of char array
		System.out.println(longStr.length());//<-----() Method of String
		
		System.out.println();

		for(int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();

		
		System.out.println("---------another way----------");
		/*
		 *  for each loop or enhanced for loop.
		 *  we can only use this method if we DO NOT want the reverse
		 */
		
		
		for (char element : charArray) {
		System.out.print(element);
		}
		
		

	}

}
