import java.util.Scanner;

public class A7equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = input.nextDouble();
        
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("The area of the equilateral triangle is: " + area);
	}

}
