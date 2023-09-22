import java.util.Scanner;

public class A43dechex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        String hexadecimal = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal representation: " + hexadecimal);

	}

}
