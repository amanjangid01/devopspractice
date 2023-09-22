import java.util.*;

public class A31hcf {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int hcf = calculateHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
    public static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHCF(b, a % b);
        }

}
}
