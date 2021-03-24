package les3;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        long start = System.nanoTime();
        List<Integer> list = Arrays.asList(arr);
        long totalTime = System.nanoTime() - start;
        System.out.println("TASK1\n " +
                 totalTime + " ns");
    }

    private static void task2() {
        List<Integer> list = new ArrayList<>();
        list.add(14532);
        list.add(1);
        list.add(12414);
        list.add(25);

        long start1 = System.nanoTime();
        list.add(45);
        long time1 = System.nanoTime() - start1;

        long start2 = System.nanoTime();
        list.add(4, 34100);
        long time2 = System.nanoTime() - start2;

        long start3 = System.nanoTime();
        Integer num = list.get(3);
        long time3 = System.nanoTime() - start3;


        long start4 = System.nanoTime();
        list.remove(4);
        long time4 = System.nanoTime() - start4;
        System.out.println("TASK2\n" +
                "add: " + time1 + " ns\n" +
                "add with index: " + time2 + " ns\n" +
                "get: " + time3 + " ns\n" +
                "remove: " + time4 + " ns\n");
    }

    private static void task3() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.insert(i);
        }
        list.find(3);
        Boolean isEmpty = list.isEmpty();
        list.delete();
    }

    private static java.util.LinkedList<Integer> task4() {
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        List<Integer> list = Arrays.asList(arr);

        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.addAll(0, list);
        linkedList.add(100);
        linkedList.set(4, 500);
        linkedList.remove(9);
        linkedList.addFirst(100);
        linkedList.addLast(200);
        return linkedList;
    }

    private static void task5() {
        System.out.println("TASK5\n");
        ListIterator<Integer> iterator = task4().listIterator();
        long start = System.nanoTime();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        long time1 = System.nanoTime() - start;
        System.out.println("");
        start = System.nanoTime();
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        long time2 = System.nanoTime() - start;
        System.out.println("");
        start = System.nanoTime();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        long time3 = System.nanoTime() - start;
        System.out.println("\n" +
                "action1: " + time1 + "ns\n" +
                "action2: " + time2 + "ns\n" +
                "action3: " + time3 + "ns\n");
    }
}

class Link<T> {
    private T link;
    private Link<T> next;

    public Link(T link) {
        this.link = link;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public T getValue() {
        return link;
    }
}

class LinkedList<T> {
    private Link<T> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }

    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public T find(T searchNode) {
        Link<T> findNote = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNote.getValue())) {
                return findNote.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
