package Review4;

public class HotelNestedLoop {

	public static void main(String[] args) {
		
		for (int row=1; row<=4; row++) {
			System.out.print("row"+row+"--->");
			for(int col=1; col<=6; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
		for (int floor=1; floor<=4; floor++) {
			System.out.print("floor"+floor+"--->");
			for(int room=1; room<=6; room++) {
				System.out.print(room+" ");
			}
			System.out.println();

	}
	}
}
