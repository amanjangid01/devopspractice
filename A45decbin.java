import java.util.Scanner;

public class A45decbin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binary = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binary);

	}
	public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0"; 
        }
      StringBuilder binary = new StringBuilder();
       while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
       return binary.toString();
    }

}
