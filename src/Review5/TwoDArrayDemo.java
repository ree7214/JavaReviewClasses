package Review5;

public class TwoDArrayDemo {

	public static void main(String[] args) {
//		int [] a = new int [4];
//		
//		for (int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
                          //row col 		
		int [][] a = new int[3][4];
		
		a[1][2]=3;
		a[2][1]=5;
		
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				int value = a[row][col];
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
