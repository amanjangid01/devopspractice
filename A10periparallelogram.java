import java.util.Scanner;

public class A10periparallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of one side of the parallelogram: ");
        double sideLength = input.nextDouble();
        System.out.print("Enter the length of the adjacent side of the parallelogram: ");
        double adjacentSideLength = input.nextDouble();
        
        double perimeter = 2 * (sideLength + adjacentSideLength);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
	}

}
