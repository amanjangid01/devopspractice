import java.util.Scanner;

public class A46temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("Temperature in Celsius: " + celsius);

	}

}
