import java.util.Scanner;

public class A1circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        input.close();
	}

}
