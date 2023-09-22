import java.util.Scanner;

public class A27add2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
	}

}
