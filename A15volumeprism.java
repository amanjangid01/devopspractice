import java.util.Scanner;

public class A15volumeprism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the base area of the prism: ");
        double baseArea = input.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = input.nextDouble();
        
        double volume = baseArea * height;
        System.out.println("The volume of the prism is: " + volume);
	}

}
