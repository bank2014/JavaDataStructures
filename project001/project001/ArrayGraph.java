package project001;

class ArrayGraph {
    private int[][] arrGraph;
 
    // 그래프 초기화
    public ArrayGraph(int initSize) {
        this.arrGraph = new int[initSize+1][initSize+1];
    }
 
    // 그래프 return
    public int[][] getGraph() {
        return this.arrGraph;
    }
 
    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        arrGraph[x][y] = arrGraph[y][x] = 1;
    }
 
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        arrGraph[x][y] = 1;
    }
    
    // 그래프 출력 (인접행렬)
    public void printGraphToAdjArr() {
        for(int i=0; i<arrGraph.length; i++) {
            for(int j=0; j<arrGraph[i].length; j++) {
                System.out.print(" " + arrGraph[i][j]);
            }
            System.out.println();
        }
    }
}
 