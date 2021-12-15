package project001;

public class ArrayGraphBFS extends ArrayGraph{

	private int nV;
    private int[][] bfsGraph;
    private boolean[] visitArr;
	
	public ArrayGraphBFS(int initSize) {
		super(initSize);
		nV = initSize;
		bfsGraph = getGraph();
		visitArr = new boolean[nV+1];
	}
	
	// BFS    
    public void bfs(int vIdx) {
    	CircularQueue cQueue = new CircularQueue(this.nV);		//	CircularQueue 생성
    	visitArr[vIdx] = true;									//	방문 체크 표시
    	cQueue.EnQueue(vIdx);									//	방문 노드 Queue enqueue
    	
    	while (!cQueue.Isempty()) {								//	CircularQueue가 비었을떄까지 순회
    		vIdx = cQueue.DeQueue(); 							//	Queue dequeue
    		System.out.print(vIdx + " ");						//	방문지 출력
    		for (int i = 1; i <= this.nV; i++) {				//	연결지 순회
    			if (bfsGraph[vIdx][i] == 1 && !visitArr[i]) {	//	연결지가 방문되지 않았을경우
    				cQueue.EnQueue(i); 							//	연결지 방문 표시
    				visitArr[i] = true;							//	연결지 enqueue
    			}
    		}
    	}
    }
}