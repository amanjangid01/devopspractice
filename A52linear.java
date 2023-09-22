import java.util.Scanner;

public class A52linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 25, 3, 45, 12, 30};
        int target = 45;
        boolean found = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
	}

}
