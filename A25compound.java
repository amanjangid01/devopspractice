import java.util.Scanner;

public class A25compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = input.nextDouble() / 100;
        System.out.print("Enter the number of years: ");
        int time = input.nextInt();
        
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = input.nextInt();

        double compoundInterest = principal * Math.pow(1 + (rate / n), n * time) - principal;
        
        System.out.println("The compound interest is: " + compoundInterest);
	}

}
