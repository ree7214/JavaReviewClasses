package Review6;

public class SpitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "I am very happy today, because today it is not Monday.";
		
		String [] stringArray=longStr.split("today");
		System.out.println(stringArray.length);
		
		System.out.println();
		
//		System.out.println(anotherStr[0]); <----long way
//		System.out.println(anotherStr[1]); <----long way
//		System.out.println(anotherStr[2]); <----long way
		
		 // should use for loop
		
		for (int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
			
		}
		
		System.out.println();
		// reverse split
		for (int i=stringArray.length-1; i>=0; i--) {
			
				System.out.println(stringArray[i]);
		
		}
		System.out.println();
		
		System.out.println("----for each loop----");
		
		for (String str : stringArray) {
			System.out.print(str);
		}

	}
	}

