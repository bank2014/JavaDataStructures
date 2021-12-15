package project001;

public class P02 {
	public static void main(String[] args) {
        ArrayGraph arrGraph = new ArrayGraph(6);
        
        arrGraph.put(1, 2);
        arrGraph.put(1, 3);
        arrGraph.put(2, 3);
        arrGraph.put(2, 4);
        arrGraph.put(3, 4);
        arrGraph.put(3, 5);
        arrGraph.put(4, 5);
        arrGraph.put(4, 6);
        
        arrGraph.printGraphToAdjArr();
    }
}
