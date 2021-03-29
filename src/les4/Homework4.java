package les4;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Homework4 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1(){
        System.out.println("TASK1:");
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        Stack<Integer> stack = new Stack<>();

        long start1 = System.nanoTime();
        stack.push(arr[0]);
        long time1 = System.nanoTime() - start1;
        System.out.println("push: " + time1 + "ns");

        for (Integer integer : arr) {
            stack.push(integer);
        }

        long start2 = System.nanoTime();
        Boolean empty = stack.isEmpty();
        long time2 = System.nanoTime() - start2;
        System.out.println("isEmpty: " + time2 + "ns");

        long start3 = System.nanoTime();
        Integer integer = stack.peek();
        long time3 = System.nanoTime() - start3;
        System.out.println("peek: " + time3 + "ns");

        long start4 = System.nanoTime();
        Integer num = stack.pop();
        long time4 = System.nanoTime() - start4;
        System.out.println("pop: " + time4 + "ns");

        long start5 = System.nanoTime();
        Integer a = stack.search(4);
        long time5 = System.nanoTime() - start5;
        System.out.println("search: " + time5 + "ns\n");
    }

    private static void task2() {
        System.out.println("TASK2:");
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        Queue<Integer> queue = new LinkedBlockingQueue<>();


        long start1 = System.nanoTime();
        queue.add(arr[0]);
        long time1 = System.nanoTime() - start1;
        System.out.println("add: " + time1 + "ns");

        Collections.addAll(queue, arr);

        long start2 = System.nanoTime();
        Boolean a = queue.isEmpty();
        long time2 = System.nanoTime() - start2;
        System.out.println("isEmpty: " + time2 + "ns");

        long start3 = System.nanoTime();
        Integer integer = queue.element();
        long time3 = System.nanoTime() - start3;
        System.out.println("element: " + time3 + "ns");

        long start4 = System.nanoTime();
        Integer num = queue.poll();
        long time4 = System.nanoTime() - start4;
        System.out.println("poll: " + time4 + "ns");

        long start5 = System.nanoTime();
        Integer ab = queue.peek();
        long time5 = System.nanoTime() - start5;
        System.out.println("peek: " + time5 + "ns");

        long start6 = System.nanoTime();
        Integer abv = queue.remove();
        long time6 = System.nanoTime() - start6;
        System.out.println("remove: " + time6 + "ns\n");
    }

    private static void task3() {
        System.out.println("TASK3:");
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        Deque<Integer> deque = new LinkedBlockingDeque<>();


        long start1 = System.nanoTime();
        deque.add(arr[0]);
        long time1 = System.nanoTime() - start1;
        System.out.println("add: " + time1 + "ns");

        Collections.addAll(deque, arr);

        long start2 = System.nanoTime();
        Boolean a = deque.isEmpty();
        long time2 = System.nanoTime() - start2;
        System.out.println("isEmpty: " + time2 + "ns");

        long start3 = System.nanoTime();
        Integer integer = deque.element();
        long time3 = System.nanoTime() - start3;
        System.out.println("element: " + time3 + "ns");

        long start4 = System.nanoTime();
        Integer num = deque.pollFirst();
        long time4 = System.nanoTime() - start4;
        System.out.println("pollFirst: " + time4 + "ns");

        long start41 = System.nanoTime();
        Integer num1 = deque.pollLast();
        long time41 = System.nanoTime() - start41;
        System.out.println("pollLast: " + time41 + "ns");

        long start5 = System.nanoTime();
        Integer ab = deque.peekLast();
        long time5 = System.nanoTime() - start5;
        System.out.println("peekLast: " + time5 + "ns");

        long start6 = System.nanoTime();
        Integer abv = deque.remove();
        long time6 = System.nanoTime() - start6;
        System.out.println("remove: " + time6 + "ns");

        long start7 = System.nanoTime();
        Integer gd = deque.getLast();
        long time7 = System.nanoTime() - start7;
        System.out.println("getLast: " + time7 + "ns\n");
    }

    private static void task4(){
        System.out.println("TASK4:");
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        Queue<Integer> queue = new PriorityQueue<>();


        long start1 = System.nanoTime();
        queue.add(arr[0]);
        long time1 = System.nanoTime() - start1;
        System.out.println("add: " + time1 + "ns");

        Collections.addAll(queue, arr);

        long start2 = System.nanoTime();
        Boolean a = queue.isEmpty();
        long time2 = System.nanoTime() - start2;
        System.out.println("isEmpty: " + time2 + "ns");

        long start3 = System.nanoTime();
        Integer integer = queue.element();
        long time3 = System.nanoTime() - start3;
        System.out.println("element: " + time3 + "ns");

        long start4 = System.nanoTime();
        Integer num = queue.poll();
        long time4 = System.nanoTime() - start4;
        System.out.println("poll: " + time4 + "ns");

        long start5 = System.nanoTime();
        Integer ab = queue.peek();
        long time5 = System.nanoTime() - start5;
        System.out.println("peek: " + time5 + "ns");

        long start6 = System.nanoTime();
        Integer abv = queue.remove();
        long time6 = System.nanoTime() - start6;
        System.out.println("remove: " + time6 + "ns\n");
    }

    private static void task5() {
        System.out.println("TASK5:");
        SimpleStackList myStack = new SimpleStackList();
        Stack<Integer> stack = new Stack<>();
        Integer[] arr = {124, 412, 543, 2, 73, 666, 34, 6548, 885};
        for (Integer integer : arr) {
            stack.push(integer);
        }
        long start = System.nanoTime();
        for (Integer integer : stack) myStack.push(integer);
        myStack.display();
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
        long time = System.nanoTime();
        System.out.println("\npopStack " + time + "ns");

        SimpleQueue myQueue = new SimpleQueue();
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        Collections.addAll(queue, arr);

        long start2 = System.nanoTime();
        for (int i = 0; i < queue.size(); ) {
            myQueue.insert(queue.peek());
            queue.poll();
        }
        myQueue.display();
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.delete() + " ");
        }
        long time2 = System.nanoTime();
        System.out.println("\ndeleteQueue " + time2 + "ns" );
    }

    static class Link {
        public int value;

        public Link next;

        public Link(int value) {
            this.value = value;
        }

        public void display() {
            System.out.print(this.value + " ");
        }
    }

    static class SimpleLinkedList {
        public Link first;

        public SimpleLinkedList() {
            first = null;
        }

        public boolean isEmpty() {
            return (first == null);
        }

        public void insert(int value) {
            Link newLink = new Link(value);
            newLink.next = first;
            first = newLink;
        }

        public Link delete() {
            Link temp = first;
            first = first.next;
            return temp;
        }

        public void display() {
            Link current = first;
            while (current != null) {
                current.display();
                current = current.next;
            }
        }
    }

    static class SimpleStackList {
        private SimpleLinkedList list;

        public SimpleStackList() {
            list = new SimpleLinkedList();
        }

        public void push(int value) {
            list.insert(value);
        }

        public int pop() {
            return list.delete().value;
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void display() {
            list.display();
        }
    }

    static class SimpleQueue {
        private SimpleLinkedList myQueue;

        public SimpleQueue() {
            myQueue = new SimpleLinkedList();
        }

        public void insert(int value) {
            myQueue.insert(value);
        }

        public int delete() {
            return myQueue.delete().value;
        }

        public boolean isEmpty() {
            return myQueue.isEmpty();
        }

        public void display() {
            myQueue.display();
        }
    }
}
