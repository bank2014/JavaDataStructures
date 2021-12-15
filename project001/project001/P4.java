package project001;

public class P4 {
	public static void main(String[] args) {

		ListGraphBFS listGraphBFS = new ListGraphBFS(8);

		listGraphBFS.put(1, 2);
		listGraphBFS.put(1, 3);
		listGraphBFS.put(2, 4);
		listGraphBFS.put(2, 5);
		listGraphBFS.put(3, 6);
		listGraphBFS.put(3, 7);
		listGraphBFS.put(4, 8);
		listGraphBFS.put(5, 8);
		listGraphBFS.put(6, 8);
		listGraphBFS.put(7, 8);

		listGraphBFS.bfs(4);
	}
}
