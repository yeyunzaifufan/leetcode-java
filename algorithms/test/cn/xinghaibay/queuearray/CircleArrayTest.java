package cn.xinghaibay.queuearray;

import org.junit.Test;

public class CircleArrayTest {

    @Test
    public void testCircleArray(){
        CircleArray circleArray = new CircleArray(5);
        System.out.println("队列大小："+circleArray.size());
        circleArray.addQueue(1);
        circleArray.showQueue();
        circleArray.addQueue(2);
        System.out.println("出队："+circleArray.getQueue());
        circleArray.addQueue(3);
        circleArray.showQueue();
        circleArray.addQueue(4);
        circleArray.addQueue(5);
        circleArray.showQueue();
        circleArray.addQueue(6);
        circleArray.addQueue(7);
    }

}