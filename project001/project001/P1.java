package project001;

public class P1 {
	public static void main(String[] args) {

		ArrayGraphDFS arrGraphDFS = new ArrayGraphDFS(8);

		arrGraphDFS.put(1, 2);
		arrGraphDFS.put(1, 3);
		arrGraphDFS.put(2, 4);
		arrGraphDFS.put(2, 5);
		arrGraphDFS.put(3, 6);
		arrGraphDFS.put(3, 7);
		arrGraphDFS.put(4, 8);
		arrGraphDFS.put(5, 8);
		arrGraphDFS.put(6, 8);
		arrGraphDFS.put(7, 8);
		
		arrGraphDFS.dfs(1);
	}
}
