package practiceSelf;

public class LargestNumber {
	public static void main(String[] args) {
		
		int x =50;
		int y = 100;
		int z = 150;
		if((x>y)&& (x>z)) {
			System.out.println("x is large");
		}
		else if ((y>x) &&(y>z)) {
			System.out.println("y is larger");
		}
		else {
			System.out.println("z is largest");
		}
	}

}
