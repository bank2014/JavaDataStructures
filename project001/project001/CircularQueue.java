package project001;



public class CircularQueue {
	
    int rear = 0;			//	Queue 시작점
    int front = 0;			//	Queue 끝점
    int maxsize = 0;		// 	Queue Size
    int[] circular_Queue;	//	Queue 담을 배열
    
    
    public CircularQueue(int maxsize){
        this.maxsize = maxsize;
        circular_Queue = new int[this.maxsize];
    }

    //	queue empty check
    public boolean Isempty(){
        if(rear == front){
            return true;
        }
        return false;
    }
    
    //	queue full check
    public boolean Isfull(){
        if((rear+1)%maxsize == front){
            return true;
        }
        return false;
    }
    
    //	queue push
    public void EnQueue(int num){
        if(Isfull()){
            System.out.println("Queue is Full");
        } else {
            rear = (rear+1) % maxsize;
            circular_Queue[rear]=num;
        }
    }
    
    //	queue pop
    public int DeQueue(){
        if(Isempty()){						//	Queue가 비었을때
            return -1;
        } else {							//	Queue가 비지 않았을 경우
            front = (front+1)%maxsize;		//	가장 나중에 들어온 자리를 가리킴 
            return circular_Queue[front];	//	가장 나중에 들어온 값 출력
        }
    }
}