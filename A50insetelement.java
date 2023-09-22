import java.util.Scanner;

public class A50insetelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int indexToInsert = 2;
        if (indexToInsert >= 0 && indexToInsert <= array.length) {
            
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < indexToInsert; i++) {
                newArray[i] = array[i];
            }
            
            newArray[indexToInsert] = elementToInsert;
            
            for (int i = indexToInsert; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            array = newArray;
            System.out.println("Array after insertion: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid index for insertion.");
        }
	}

}
