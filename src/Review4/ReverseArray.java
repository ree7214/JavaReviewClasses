package Review4;

public class ReverseArray {

	public static void main(String[] args) {
		//forward
		String[] animals = { "dog", "cat", "mouse", "bird", };

		for (int i = 0; i<animals.length; i++) {

			System.out.println(animals[i]);

		}
		System.out.println("------Reverse-------");

		for (int i = animals.length - 1; i >= 0; i--) {

			System.out.println(animals[i]);

		}

	}
}