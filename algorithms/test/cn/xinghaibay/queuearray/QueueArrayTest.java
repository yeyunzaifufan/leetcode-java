package cn.xinghaibay.queuearray;

import org.junit.Test;

public class QueueArrayTest {

    @Test
    public void testQueue(){
        QueueArray queueArray = new QueueArray(3);
        queueArray.showQueue();
        queueArray.addQueue(1);
        System.out.println("队首："+queueArray.showHead());
        queueArray.addQueue(2);
        queueArray.showQueue();
        System.out.println("出队："+queueArray.getQueue());
        queueArray.showQueue();
        queueArray.addQueue(3);
        queueArray.showQueue();
        queueArray.addQueue(4);
        System.out.println("出队："+queueArray.getQueue());
        System.out.println("出队："+queueArray.getQueue());
//        System.out.println("出队："+queueArray.getQueue());
    }
}
