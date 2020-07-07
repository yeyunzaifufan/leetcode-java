package cn.xinghaibay.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleSingleLinkedListTest {

    @Test
    public void testCircleSingleLinkedList(){
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.create(5);
        circleSingleLinkedList.show();

        circleSingleLinkedList.josepho(5, 2, 10);
    }
}