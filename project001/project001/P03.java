package project001;

public class P03 {
	public static void main(String[] args) {
        ListGraph listGraph = new ListGraph(6);
        
        listGraph.put(1, 2);
        listGraph.put(1, 3);
        listGraph.put(2, 3);
        listGraph.put(2, 4);
        listGraph.put(3, 4);
        listGraph.put(3, 5);
        listGraph.put(4, 5);
        listGraph.put(4, 6);
        
        listGraph.printGraphToAdjList();
	}
}
