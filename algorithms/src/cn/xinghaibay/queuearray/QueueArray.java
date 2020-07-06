package cn.xinghaibay.queuearray;

/**
 * 数组实现队列
 * maxSize：最大容量
 * front+1：队首
 * rear：队尾
 * arr：队列数组
 */
public class QueueArray {

    private int[] arr;
    private int maxSize;
    private int front;
    private int rear;

    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    // 入队
    public void addQueue(int value){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = value;
    }

    // 出队
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        System.out.print("当前队列：");
        for(int i=front+1; i<rear+1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int showHead(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front+1];
    }

}
