import java.util.Scanner;

public class A14volumecone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cone's base: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = input.nextDouble();
        
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cone is: " + volume);
	}

}
