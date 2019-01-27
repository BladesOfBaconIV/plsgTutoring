import java.util.Random;

public class SortingExample {

    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] arr1 = generateIntArray(10);
        int[] arr2 = generateIntArray(10);
        int[] arr3 = generateIntArray(10);
        int[] arr4 = generateIntArray(100000);
        int[] arr5 = generateIntArray(100000);
        int[] arr6 = generateIntArray(100000);

        System.out.println("Selection Sort: ");
        printArray(arr1);
        selectionSort(arr1);
        printArray(arr1);

        System.out.println("Bubble Sort: ");
        printArray(arr2);
        bubbleSort(arr2);
        printArray(arr2);

        System.out.println("Quick Sort: ");
        printArray(arr3);
        quickSort(arr3, 0, arr3.length-1);
        printArray(arr3);

        // Takes about 8,000 - 9,000 ms
        long startTime = System.currentTimeMillis();
        selectionSort(arr4);
        long endTime = System.currentTimeMillis();
        System.out.printf("Selection sort of 100,000 element array took %d ms\n", endTime-startTime);

        // Takes about 17,000 - 19,000 ms
        startTime = System.currentTimeMillis();
        bubbleSort(arr5);
        endTime = System.currentTimeMillis();
        System.out.printf("Bubble sort of 100,000 element array took %d ms\n", endTime-startTime);

        // Takes about 15 ms
        startTime = System.currentTimeMillis();
        quickSort(arr6, 0, arr6.length-1);
        endTime = System.currentTimeMillis();
        System.out.printf("Quick sort of 100,000 element array took %d ms\n", endTime-startTime);
    }

    /*
     * Generate an array of random ints
     * @param length, int: Length of the array
     * @return array, int[]: Array of random ints
     */
    public static int[] generateIntArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(length);
        }
        return array;
    }

    /*
     * Prints an array, format [ n1 n2 n3 ... ]
     * @param array, int[]: array to print
     */
    public static void printArray(int[] array) {
        String arrayString = "[";
        for (int n: array) {
            arrayString += " " + n;
        }
        arrayString += " ]";
        System.out.println(arrayString);
    }

    /*
     * Implementation of the selection sort algorithm
     * O(n^2) average, O(n^2) best, O(n^2) worst
     *
     * @param array, int[]: array to be sorted
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { // for value starting at 0
            int smallestIndex = i;
            for (int j = i+1; j < array.length; j++) { // for all values after
                if (array[j] < array[smallestIndex]) { // getting the smallest value
                    smallestIndex = j;
                }
            }
            // swap current value at array[i] with smallest
            int smallestValue = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = smallestValue;
        }
    }

    /*
     * Implementation of the bubble sort algorithm
     * O(n^2) average, O(n) best, O(n^2) worst
     *
     * @param array, int[]: array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        // keep running till nothing is swapped
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // if the previous value is larger, swap its position with current value
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            n -= 1; // last value will always be largest with this sort, so only need to go to second last next time
        }while (swapped);
    }

    /*
     * Implementation of the quick sort algorithm
     * Works by recursively splitting the array until sorting is trivial (2 element array)
     * O(n*log(n)) average, O(n*log(n)) best, O(n^2) worst
     *
     * @param array, int[]: array to be sorted
     * @param start, int: index to start sorting the array at
     * @param end, int: index to stop sorting the array at
     */
    public static void quickSort(int[] array, int start, int end) {
        int partition = partition(array, start, end);

        if(partition-1>start) {
            quickSort(array, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(array, partition + 1, end);
        }
    }

    /*
     * Function for partitioning and array for quick sort
     *
     * @param arr, int[]: array to be partitioned
     * @param start, int: start of the partition
     * @param end, int: end of the partition
     */
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // pivot value to sort by

        // easiest to consider when only 2 elements
        // or 2 sorted elements and trying to insert the lest element in the correct place
        for(int i = start; i<end; i++){
            if(arr[i]<pivot){
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}
