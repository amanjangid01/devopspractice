import java.util.Scanner;

public class A16volumecylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder's base: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume);
	}

}
