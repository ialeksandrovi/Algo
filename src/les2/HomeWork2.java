package les2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3(getBigArray());
        task4(getBigArray());
        task5(getBigArray());
        task6(getBigArray());
    }

    private static void task1() {
        Random random = new Random();
        int SIZE = 10;
        ClassForTask[] array = new ClassForTask[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = new ClassForTask(random.nextInt(10));
        }
        int[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        int key = 34;
        System.out.println("Task 1: \n" +
                "Copy array: " + getCopyArrayTime(array) + " ns\n" +
                "Binary search: " + getBinSearchTime(arr, key) + " ns\n" +
                "Array equals: " + getArrayEqualTime(array, getCopiedArray(array)) + " ns");
    }

    private static long getCopyArrayTime(ClassForTask[] array) {
        long start = System.nanoTime();
        ClassForTask[] arrayCopy = getCopiedArray(array);
        return System.nanoTime() - start;
    }

    private static long getBinSearchTime(int[] array, int key) {
        long start = System.nanoTime();
        Arrays.binarySearch(array, key);
        return System.nanoTime() - start;
    }

    private static ClassForTask[] getCopiedArray(ClassForTask[] array) {
        return Arrays.copyOf(array, array.length);
    }

    private static long getArrayEqualTime(ClassForTask[] originalArray, ClassForTask[] copiedArray) {
        long start = System.nanoTime();
        boolean equal = Arrays.equals(originalArray, copiedArray);
        return System.nanoTime() - start;
    }

    private static void task2() {
        int[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        int key = 34;

        System.out.println("Task 2: \n" +
                "Linear search: " + getLinearSearchTime(arr, key) + " ns\n" +
                "Binary search: " + getBinSearchTime(arr, key) + " ns");
    }

    private static long getLinearSearchTime(int[] array, int key) {
        long start = System.nanoTime();
        linearSearch(array, key);
        return System.nanoTime() - start;
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int value : array) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }

    private static int[] getBigArray() {
        int ARRAY_SIZE = 400;
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }
        return array;
    }

    private static void task3(int[] array) {
        long startTime = System.nanoTime();
        Arrays.sort(array);
        long timeProcess = System.nanoTime() - startTime;
        System.out.println("Task 3: \n Array sorted for " + timeProcess + " ns");
    }

    private static void task4(int[] array) {
        long startTime = System.nanoTime();
        bubbleSort(array);
        long timeProcess = System.nanoTime() - startTime;
        System.out.println("Task 4: \n Array sorted by Bubble sort for " + timeProcess + " ns");
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
    }

    private static void task5(int[] array) {
        long startTime = System.nanoTime();
        selectSort(array);
        long timeProcess = System.nanoTime() - startTime;
        System.out.println("Task 5: \n Array sorted by Select sort for " + timeProcess + " ns");
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int buffer = array[i];
            array[i] = array[min];
            array[min] = buffer;
        }
    }

    private static void task6(int[] array) {
        long startTime = System.nanoTime();
        insertSort(array);
        long timeProcess = System.nanoTime() - startTime;
        System.out.println("Task 6: \n Array sorted by Insert sort for " + timeProcess + " ns");
    }

    public static void insertSort(int[] array) {
        int buffer;
        int in;
        for (int i = 1; i < array.length; i++) {
            buffer = array[i];
            in = i;
            while (in > 0 && array[in - 1] >= buffer) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = buffer;
        }
    }
}
