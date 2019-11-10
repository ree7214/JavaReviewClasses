package Review4;

public class Pyramid {

	public static void main(String[] args) {
		
		// funny way
//	     System.out.println("1");
//	     System.out.println("12");
//         System.out.println("123");
//		 System.out.println("1234");
//		 System.out.println("12345");
//		 System.out.println("-------------------------");
		
		// serious way
		
		for(int row=1; row<=5; row++) {
		
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		//same pattern increment by 3
		
		for(int row=1; row<=5; row++) {
		
			for(int col=1; col<=row; col++) {
				System.out.print(2*col-1);
			}
			System.out.println();
	}
		
		System.out.println("-------------------------------------");
		//same patter square of the value
		for(int row=1; row<=5; row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print(col*col+" ");
			}
			System.out.println();
	}
		
	}
}
