import java.util.Scanner;

public class A26avgmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = input.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = input.nextDouble();
            sum += marks;
        }

        double average = sum / n;
        System.out.println("The average marks are: " + average);
	}

}
