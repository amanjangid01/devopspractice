import java.util.Scanner;

public class A53binary {

	public static void main(String[] args) {

		int[] sortedArray = {3, 6, 9, 12, 15, 18, 21};
        int target = 12;
        int left = 0;
        int right = sortedArray.length - 1;
        boolean found = false;
        

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (sortedArray[mid] == target) {
                found = true;
                System.out.println("Element " + target + " found at index " + mid);
                break;
            }
            
            if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
	}

}
