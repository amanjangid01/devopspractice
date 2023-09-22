import java.util.Scanner;

public class A48reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();   
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit; 
            num /= 10; 
        }
      System.out.println("Reversed number: " + reversedNum);

	}

}
