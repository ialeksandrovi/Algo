package les7;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        Random random = new Random();
        task4(random);
        task5(random);
    }

    private static void task1(){
        System.out.println("TASK1:\nТелефонный справочник");
    }

    private static void task2(){
        System.out.println("TASK2:\nКлюч: ФИО в телефонном справочнике\nКоллизия:у одного человека более одного телефонного номера");
    }

    private static void task3(){
        System.out.println("TASK3:\nпопулярная - наиболее быстрая, эффективная - с наименьшим шансом вызвать коллизию");
    }

    private static void task4(Random random) {
        Item aDataItem;
        int aKey = 0;
        int size = 66;
        HashTable hashTable = new HashTable(size);
        for (int i = 0; i < 10; i++) {
            aKey = random.nextInt(300);
            aDataItem = new Item(aKey);
            hashTable.insert(aDataItem);
        }
        hashTable.display();
        System.out.println(hashTable.find(aKey).getKey());
    }

    private static void task5(Random random) {
        Item aDataItem;
        int aKey = 0;
        int size = 66;
        SecondHashTable hashTableSecond = new SecondHashTable(size);
        for (int i = 0; i < 10; i++) {
            aKey = random.nextInt(300);
            aDataItem = new Item(aKey);
            hashTableSecond.insert(aDataItem);
        }
        hashTableSecond.display();
        System.out.println(hashTableSecond.find(aKey).getKey());
    }
}
