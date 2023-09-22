import java.util.Scanner;

public class A12perisquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = input.nextDouble();
        
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the square is: " + perimeter);
	}

}
