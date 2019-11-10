package Review6;

public class SubstingDemo {

	public static void main(String[] args) {
		
		String longStr="I am very happy today, because today is not monday.";
		System.out.println(longStr.substring(23, 51));
		System.out.println(longStr.length());
		
		//Replace method
		
		System.out.println(longStr.replace('a', 'A'));
		
		System.out.println(longStr.replace("today", "tomorrow"));
		
		System.out.println(longStr.replaceAll("[a-z]", ""));
	
		

	}

}
