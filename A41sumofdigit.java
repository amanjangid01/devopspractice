import java.util.Scanner;

public class A41sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;            
            sum += digit; 
            number /= 10;
        }
        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);

	}

}
