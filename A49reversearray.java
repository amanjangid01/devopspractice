import java.util.Scanner;

public class A49reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array = {1, 2, 3, 4, 5};
        
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.println("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}

}
