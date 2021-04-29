package les7;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2(getGraph());
        task3(getGraph());
        task4(getGraph());
    }

    private static Graph getGraph() {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        return graph;
    }

    private static void task1(){
        System.out.println("TASK1:\nВ логистике для проложения наиболее выгодного маршрута\n");
    }

    private static void task2(Graph graph){
        System.out.println("TASK2:\n");
        System.out.print("The output of the vertex at index 3: ");
        graph.displayVertex(3);
        System.out.println("\n");
    }

    private static void task3(Graph graph) {
        long lastTime;
        lastTime = System.nanoTime();
        graph.dfs(0);
        System.out.println("TASK3: " + (System.nanoTime() - lastTime) + " ns");
    }

    private static void task4(Graph graph) {
        long lastTime;
        lastTime = System.nanoTime();
        graph.bfs();
        System.out.println("TASK4: " + (System.nanoTime() - lastTime) + " ns");
    }
}
