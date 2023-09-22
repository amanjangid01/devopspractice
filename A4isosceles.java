import java.util.Scanner;

public class A4isosceles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter the base of the isosceles triangle: ");
	        double base = input.nextDouble();
	        System.out.print("Enter the height of the isosceles triangle: ");
	        double height = input.nextDouble();
	        
	        double area = 0.5 * base * height;
	        System.out.println("The area of the isosceles triangle is: " + area);
	}

}
