import java.util.Scanner;

public class A9periequilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = input.nextDouble();
        
        double perimeter = 3 * side;
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
	}

}
