public class Homework {
    static long startTime;

    public static void main(String[] args) {
        task1();
        task2();
        task4();
    }

    private static void task1() {
        String text = "Структура данных: библиотека; Алгоритм: поиск книги в библиотеке";
        System.out.println("Task1" + "\n" + text + "\n\n");
    }
    private static void task2() {
        String text = "Массивы и сортировка\n" +
                "Стеки и очереди\n" +
                "Списки и итераторы\n" +
                "Рекурсия\n" +
                "Деревья\n" +
                "Графы\n" +
                "Хеш-таблицы\n";
        System.out.println("Task2" + "\n" + text + "\n\n");
    }

    public static boolean isEquals(int... ints) {
        startTime = System.nanoTime();
        for (int i : ints) {
            if (i == 11)
                return true;
        }
        return false;
    }

    private static void task4() {
        ClassForTask classTask = new ClassForTask(57);

        System.out.println("Task4");
        System.out.println(classTask.getArgument());
        System.out.println(ClassForTask.a);
        System.out.println(ClassForTask.ref);

        System.out.println(isEquals(classTask.getArgument(), ClassForTask.a, ClassForTask.ref));
        System.out.println((System.nanoTime() - startTime));
    }
}

