package cn.xinghaibay.queuearray;

/**
 * 会空一个位置
 * maxSize-1：最大容量
 */
public class CircleArray {
    private int[] arr;
    private int maxSize;
    private int front;
    private int rear;

    public CircleArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }

    public boolean isFull(){
        return (rear+1) % maxSize == front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    // 入队
    public void addQueue(int value){
        if(isFull()){
            System.out.println("队列已满"+front+" "+rear);
            return;
        }
        arr[rear] = value;
        rear = (rear+1) % maxSize;
    }

    // 出队
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int result = arr[front];
        front = (front+1) % maxSize;
        return result;
    }

    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        System.out.print("当前队列：");
        for(int i=front; i<front+size(); i++){
            System.out.print(arr[i%maxSize]+" ");
        }
        System.out.println();
    }

    public int showHead(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }

    public int size(){
        return (rear+maxSize-front) % maxSize;
    }
}
