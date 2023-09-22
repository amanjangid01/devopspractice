import java.util.Scanner;

public class A32lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); 
        int lcm = findLCM(num1, num2);   
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int findLCM(int a, int b) {
        int hcf = findHCF(a, b);
        int lcm = (a * b) / hcf;
        return lcm;
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

	}

}
