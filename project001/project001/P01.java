package project001;

public class P01 {
    public static void main(String[] args) {

        CircularQueue cQueue = new CircularQueue(5);

        cQueue.EnQueue(5);        
        cQueue.EnQueue(4);
        System.out.println(cQueue.DeQueue());
        System.out.println(cQueue.DeQueue());

        cQueue.EnQueue(5);        
        cQueue.EnQueue(4);
        System.out.println(cQueue.DeQueue());
        System.out.println(cQueue.DeQueue());
        
        cQueue.EnQueue(3);
        cQueue.EnQueue(2);
        cQueue.EnQueue(1);
        System.out.println(cQueue.DeQueue());
        System.out.println(cQueue.DeQueue());
        System.out.println(cQueue.DeQueue());
    }
}
