package project001;

public class P2 {
	public static void main(String[] args) {

		ListGraphDFS listGraphDFS = new ListGraphDFS(8);

		listGraphDFS.put(1, 2);
		listGraphDFS.put(1, 3);
		listGraphDFS.put(2, 4);
		listGraphDFS.put(2, 5);
		listGraphDFS.put(3, 6);
		listGraphDFS.put(3, 7);
		listGraphDFS.put(4, 8);
		listGraphDFS.put(5, 8);
		listGraphDFS.put(6, 8);
		listGraphDFS.put(7, 8);
		
		listGraphDFS.dfs(2);		
	}
}
