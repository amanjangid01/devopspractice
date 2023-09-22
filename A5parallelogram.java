import java.util.Scanner;

public class A5parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the base length of the parallelogram: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double height = input.nextDouble();
        
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
	}

}
