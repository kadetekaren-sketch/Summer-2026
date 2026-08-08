import java.util.Arrays;

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
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before: " + Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("After: " + Arrays.toString(array1));

        System.out.println("\n=== Selection Sort ===");
    System.out.println("Before: " + Arrays.toString(array2));
    selectionSort(array2);
    System.out.println("After: " + Arrays.toString(array2));
    }
}