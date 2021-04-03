package les5;

import java.util.Arrays;

public class Homework {
    private static int counter = 0;
    private static long startTime = 0;
    private static int[] arrayRecursion = new int[10];
    private static int[] arrayCycle = new int[10];

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    private static void task1() {
        System.out.println("TASK1:\n" +
                "Два зеркала, поставленные дург напротив друга");
    }

    private static void task2() {
        System.out.println("TASK2:");
//        recursion(0);
        recursionWithExit(0);
    }

    private static void task3() {
        System.out.println("\nTASK3:\n" +
                "Стек вызова: распорядок дня в армии\n" +
                "Cтек вызова с рекурсией: процесс игры в профессиональных шахматах(с часами)");
    }

    private static void task4() {
        startTime = System.nanoTime();
        simpleRecursion(5);
        long recursionTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        simpleCycle();
        long cycleTime = System.nanoTime() - startTime;
        System.out.println("TASK4:\n" +
                "recursion: " + recursionTime + "ns\n" +
                "cycle: " + cycleTime + "ns" );
    }

    private static void task5() {
        int[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        Arrays.sort(arr);
        long startTime = System.nanoTime();
        int result = Arrays.binarySearch(arr, 666);
        long binSearchTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        int res = recursionBinarySearch(666, 0,arr2.length, arr2);
        long recBinSearchTime = System.nanoTime() - startTime;
        System.out.println("TASK5\n" +
                "usual binarySearch: " + binSearchTime + "ns\n" +
                "recursion binarySearch: " + recBinSearchTime + "ns\n");
    }

    private static void task6() {
        int[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        long startTime1 = System.nanoTime();
        Arrays.sort(arr);
        long finishTime1 = System.nanoTime() - startTime1;
        long startTime2 = System.nanoTime();
        sortMerge(arr2);
        long finishTime2 = System.nanoTime() - startTime2;
        System.out.println("TASK6:\n" +
                "usual sort: " + finishTime1 + "ns\n" +
                "merge sort: " + finishTime2 + "ns");
    }

    public static int[] sortMerge(int[] arr) {
        int length = arr.length;
        if (length < 2) {
            return arr;
        }
        int middle = length / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, length)));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }

    public static int recursionBinarySearch(int searchKey, int low, int high, int[] arr) {
        if (low > high) {
            return arr.length;
        }
        int middle = (low + high) / 2;
        if (arr[middle] == searchKey) {
            return middle;
        } else if (arr[middle] < searchKey) {
            return recursionBinarySearch(searchKey, low + 1, high, arr);
        } else {
            return recursionBinarySearch(searchKey, low, high - 1, arr);
        }
    }


    private static void simpleRecursion(int i) {

        arrayRecursion[counter++] = i;
        if (counter < 10)
            return;
        simpleRecursion(++i);
    }

    private static void simpleCycle() {
        for (int i = 0; i < 10; i++) {
            arrayCycle[i] = 5;
        }
    }

    private static int recursion(int i) {
        System.out.print(i++ + " ");
        return recursion(i);
    }

    private static int recursionWithExit(int i) {
        System.out.print(i++ + " ");
        if (i >= 15)
            return i;
        return recursionWithExit(i);
    }
}
