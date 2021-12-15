package project001;

public class P3 {
	public static void main(String[] args) {

		ArrayGraphBFS arrGraphBFS = new ArrayGraphBFS(8);

		arrGraphBFS.put(1, 2);
		arrGraphBFS.put(1, 3);
		arrGraphBFS.put(2, 4);
		arrGraphBFS.put(2, 5);
		arrGraphBFS.put(3, 6);
		arrGraphBFS.put(3, 7);
		arrGraphBFS.put(4, 8);
		arrGraphBFS.put(5, 8);
		arrGraphBFS.put(6, 8);
		arrGraphBFS.put(7, 8);
		
		arrGraphBFS.bfs(3);
	}
}
