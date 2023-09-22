import java.util.Scanner;

public class A42octalhex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter an octal number: ");
        String octalString = sc.nextLine();
        int octalNumber = Integer.parseInt(octalString, 8);
        String hexadecimalString = Integer.toHexString(octalNumber);
        System.out.println("Hexadecimal equivalent: 0x" + hexadecimalString.toUpperCase());

	}

}
