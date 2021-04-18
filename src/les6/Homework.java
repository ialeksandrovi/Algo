package les6;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        long lastTime;
        System.out.println("Файловая структура ПК");
        Tree tree = new Tree();
        tree.insert(new Person(1, "Lex", 23));
        tree.insert(new Person(2, "Ivan", 52));
        tree.insert(new Person(3, "Nikolai", 20));
        tree.insert(new Person(4, "Sergey", 65));
        tree.insert(new Person(5, "John", 40));

        System.out.println("We estimate the time of the basic tree methods.");
        lastTime = System.nanoTime();
        System.out.println("Method displayTree");
        tree.displayTree();
        System.out.println("Method max and min");
        tree.max().display();
        tree.min().display();
        System.out.println("Method find(3)");
        tree.find(3).display();
        System.out.println("Method delete(4)");
        tree.delete(4);
        System.out.println("Method displayTree after method delete(4)");
        tree.displayTree();
        System.out.println("Method execution time max, min, display, find, delete и displayTree took: " + (System.nanoTime() - lastTime) + " nanosecond\n");

        System.out.println("We estimate the time of the heapsort algorithm. ");
        int[] arr = new int[]{95, 58, 32, 11, 25, 65, 44, 33, 510, 67};
        System.out.println("Current array:" + Arrays.toString(arr));
        lastTime = System.nanoTime();
        HeapSort.sort(arr);
        System.out.println("Sorted array arr:" + Arrays.toString(arr));
        System.out.println("The heapsort took: " + (System.nanoTime() - lastTime) + " nanosecond");
    }
}
