package cn.xinghaibay.linkedlist;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void testSingleLinkedList(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(new Node(1, "宋江", "呼保义"));
//        singleLinkedList.add(new Node(3, "吴用", "智多星"));
//        singleLinkedList.add(new Node(2, "卢俊义", "玉麒麟"));
//        singleLinkedList.showLinkedList();
//        System.out.println();
//        singleLinkedList.update(new Node(1, "宋公明", "及时雨"));
//        singleLinkedList.showLinkedList();
//        System.out.println();
//        singleLinkedList.delete(2);
//        singleLinkedList.showLinkedList();
//        System.out.println();
        singleLinkedList.addByOrder(new Node(1, "宋江", "呼保义"));
        singleLinkedList.addByOrder(new Node(3, "吴用", "智多星"));
        singleLinkedList.addByOrder(new Node(2, "卢俊义", "玉麒麟"));
        singleLinkedList.showLinkedList();
    }

}