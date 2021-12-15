package project001;

import java.util.*;

// 그래프 클래스
class ListGraph {
    private ArrayList<ArrayList<Integer>> listGraph;
 
    // 그래프 초기화
    public ListGraph(int initSize) {
        this.listGraph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<initSize+1; i++) {
            listGraph.add(new ArrayList<Integer>());
        }
    }
 
    // 그래프
    public ArrayList<ArrayList<Integer>> getGraph() {
        return this.listGraph;
    }
 
    // 그래프의 특정 노드
    public ArrayList<Integer> getNode(int i) {
        return this.listGraph.get(i);
    }
 
    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
 
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        listGraph.get(x).add(y);
    }
    
    // 그래프 출력
    public void printGraphToAdjList() {
        for(int i=1; i<listGraph.size(); i++) {
            System.out.print("Vertex " + i + " adjList");
            
            for(int j=0; j<listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
}