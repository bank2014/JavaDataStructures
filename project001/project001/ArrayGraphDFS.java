package project001;

public class ArrayGraphDFS extends ArrayGraph{

	private int nV;
    private int[][] dfsGraph;
    private boolean[] visitArr;
	
	public ArrayGraphDFS(int initSize) {
		super(initSize);
		nV = initSize;
		dfsGraph = getGraph();
		visitArr = new boolean[nV+1];
	}
	
	// DFS
    public void dfs(int vIdx) {
        this.visitArr[vIdx] = true;				//	방문 체크 표시
        System.out.print(vIdx + " ");         	//	방문지 출력
        for(int i=1; i<=this.nV; i++) {  		//	연결된 지점 순회
            if(dfsGraph[vIdx][i] == 1 && visitArr[i] == false) {	//	연결된 지점 중 방문하지 않은 곳 탐색
                dfs(i);							//	재귀 호출
            }
        }
    }
}