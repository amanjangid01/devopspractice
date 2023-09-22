import java.util.Scanner;

public class A34perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i != number / i) {
                    sumOfDivisors += number / i;
                }
            }
        }
        return sumOfDivisors == number;

	}

}
