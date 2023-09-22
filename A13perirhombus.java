import java.util.Scanner;

public class A13perirhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of one side of the rhombus: ");
        double sideLength = input.nextDouble();
        
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
	}

}
