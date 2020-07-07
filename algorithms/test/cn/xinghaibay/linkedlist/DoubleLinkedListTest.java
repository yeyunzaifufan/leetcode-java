package cn.xinghaibay.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    @Test
    public void testDoubleLinkedList(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(new Node(1, "宋江", "呼保义"));
        doubleLinkedList.add(new Node(2, "卢俊义", "玉麒麟"));
        doubleLinkedList.add(new Node(3, "吴用", "智多星"));
        doubleLinkedList.add(new Node(4, "公孙胜", "入云龙"));
//        doubleLinkedList.show();
        doubleLinkedList.delete(4);
        doubleLinkedList.show();
        doubleLinkedList.update(new Node(1, "宋公明", "及时雨"));
        doubleLinkedList.show();
    }

}