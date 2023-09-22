import java.util.Scanner;

public class A6rhombus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of one diagonal of the rhombus: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Enter the length of the other diagonal of the rhombus: ");
        double diagonal2 = input.nextDouble();
        
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("The area of the rhombus is: " + area);
	}

}
