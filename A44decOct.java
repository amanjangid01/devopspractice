import java.util.Scanner;

public class A44decOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();
        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("Octal representation: " + octalNumber);

	}
	public static String decimalToOctal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
      StringBuilder octal = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal.insert(0, remainder); 
            decimalNumber /= 8; 
        }
        return octal.toString();
    }


}
