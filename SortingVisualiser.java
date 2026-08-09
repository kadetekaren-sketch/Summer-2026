import java.util.Arrays;
import java.util.Scanner;

public class SortingVisualiser {

    static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
    static void selectionSort(int[] array) {
    int n = array.length;
    
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        
        for (int j = i + 1; j < n; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        
        
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter the numbers for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the numbers for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("After: " + Arrays.toString(array1));

        System.out.println("\n=== Selection Sort ===");
    System.out.println("Before: " + Arrays.toString(array2));
    selectionSort(array2);
    System.out.println("After: " + Arrays.toString(array2));
    }
}