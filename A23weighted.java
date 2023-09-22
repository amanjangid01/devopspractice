import java.util.Scanner;

public class A23weighted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        double sum = 0;
        double weightSum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            double value = input.nextDouble();
            System.out.print("Enter weight for value " + i + ": ");
            double weight = input.nextDouble();

            sum += value * weight;
            weightSum += weight;
        }

        double weightedAverage = sum / weightSum;
        System.out.println("The weighted average is: " + weightedAverage);
	}

}
