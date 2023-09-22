import java.util.Scanner;

public class A11perirectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
	}

}
