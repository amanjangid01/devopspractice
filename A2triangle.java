import java.util.Scanner;
public class A2triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the base length of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
	}

}
