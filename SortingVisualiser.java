import java.util.Arrays;
import java.util.Scanner;

public class SortingVisualiser {

    static int bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapCount++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        return swapCount;
    }
    static int selectionSort(int[] array) {
    int n = array.length;
    int swapCount = 0;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        
        for (int j = i + 1; j < n; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        swapCount++;
        
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
    return swapCount;
}
    static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        
        merge(array, left, mid, right);
    }
}

static void merge(int[] array, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];
    
    for (int i = 0; i < n1; i++)
        leftArray[i] = array[left + i];
    for (int j = 0; j < n2; j++)
        rightArray[j] = array[mid + 1 + j];
    
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            array[k] = leftArray[i];
            i++;
        } else {
            array[k] = rightArray[j];
            j++;
        }
        k++;
    }
    
    while (i < n1) { array[k++] = leftArray[i++]; }
    while (j < n2) { array[k++] = rightArray[j++]; }
    
    System.out.println(Arrays.toString(array));
}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];
        System.out.println("Enter the numbers for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the numbers for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println("Enter the numbers for the third array:");
        for (int i = 0; i < size; i++) {
            array3[i] = scanner.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(array1));
        int bubbleSwaps = bubbleSort(array1);
        System.out.println("After: " + Arrays.toString(array1));

        System.out.println("\n=== Selection Sort ===");
        System.out.println("Before: " + Arrays.toString(array2));
        int selectionSwaps = selectionSort(array2);
        System.out.println("After: " + Arrays.toString(array2));

        System.out.println("\n=== Merge Sort ===");
        System.out.println("Before: " + Arrays.toString(array3));
        mergeSort(array3, 0, array3.length - 1);
        System.out.println("After: " + Arrays.toString(array3));

         System.out.println("\n=== Summary ===");
         System.out.println("Bubble Sort: " + bubbleSwaps + " swaps");
         System.out.println("Selection Sort: " + selectionSwaps + " swaps");
         System.out.println("Merge Sort: completed (swap counting not applicable)");
if (bubbleSwaps < selectionSwaps) {
    System.out.println("Winner: Bubble Sort!");
} else if (selectionSwaps < bubbleSwaps) {
    System.out.println("Winner: Selection Sort!");
} else {
    System.out.println("It's a tie!");
}

scanner.close();

    }
}