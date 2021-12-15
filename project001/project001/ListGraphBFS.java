package project001;

import java.util.*;

public class ListGraphBFS extends ListGraph{
	
	private int nV;
    private ArrayList<ArrayList<Integer>> bfsGraph;
    private boolean[] visitArr;


	public ListGraphBFS(int initSize) {
		super(initSize);
		nV = initSize;
		bfsGraph = getGraph();
		visitArr = new boolean[nV+1];
	}

	// BFS 
	public void bfs(int vIdx) {
		CircularQueue cQueue = new CircularQueue(this.nV);	//	CircularQueue 생성
		visitArr[vIdx] = true; 								//	방문 체크 표시
		cQueue.EnQueue(vIdx);								//	방문 노드 Queue enqueue
	
		while(cQueue.Isempty()) { 							//	CircularQueue가 비었을떄까지 순회
			vIdx = cQueue.DeQueue(); 						//	Queue dequeue
			System.out.print(vIdx + " ");					//	방문지 출력
			Iterator<Integer> iter = bfsGraph.get(vIdx).listIterator();	//	연결된 지점 순회
			while(iter.hasNext()) { 						//	연결이 없을때까지 순회
				int w = iter.next(); 						//	연결지
				if(!visitArr[w]) { 							//	연결지가 방문되지 않았을경우
					visitArr[w] = true; 					//	연결지 방문 표시
					cQueue.EnQueue(w); 						//	연결지 enqueue
				} 
			}
		}
	}
}
