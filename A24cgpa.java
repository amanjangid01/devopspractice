import java.util.Scanner;

public class A24cgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = input.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter credits for subject " + i + ": ");
            double credits = input.nextDouble();
            System.out.print("Enter grade for subject " + i + ": ");
            double grade = input.nextDouble();

            totalCredits += credits;
            totalGradePoints += credits * grade;
        }

        double cgpa = totalGradePoints / totalCredits;
        System.out.println("CGPA: " + cgpa);
	}

}
