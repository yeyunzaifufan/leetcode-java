package cn.xinghaibay.linkedlist;

class Node{
    public int id;
    public String name;
    public String nickName;
    public Node next;
    public Node pre;

    public Node(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

public class DoubleLinkedList {

    private Node head = new Node(0, "", "");

    public void add(Node node){
        Node temp = head;
        while (null!=temp.next){
            temp = temp.next;
        }
        temp.next = node;
        if(temp!=head) {
            node.pre = temp;
        }
    }

    public void update(Node node){
        boolean flag = false;
        Node temp = head;
        while (null!=temp){
            if(temp.id==node.id){
                flag = true;
                temp.name = node.name;
                temp.nickName = node.nickName;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.println("未找到该节点");
        }
    }

    public void delete(int id){
        boolean flag = false;
        Node temp = head;
        while (null!=temp.next){
            if(temp.next.id==id){
                flag = true;
                if(null!=temp.next.next) {
                    temp.next.next.pre = temp;
                }
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.println("未找到该节点");
        }
    }

    public void show(){
        Node temp = head;
        while (null!=temp.next){
            System.out.println(temp.next.toString());
            temp = temp.next;
        }
        System.out.println("pre");
        while (null!=temp.pre){
            System.out.println(temp.pre);
            temp = temp.pre;
        }
    }
}
