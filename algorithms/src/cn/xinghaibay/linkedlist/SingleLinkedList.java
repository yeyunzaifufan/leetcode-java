package cn.xinghaibay.linkedlist;

class Node{
    public int id;
    public String name;
    public String nickName;
    public Node next;

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

public class SingleLinkedList {

    private Node head = new Node(0, "", "");

    public void add(Node node){
        Node temp = head;
        while (null!=temp.next){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByOrder(Node node){
        boolean flag = false;
        Node temp = head;
        while (null!=temp.next){
            if(node.id == temp.next.id){
                return;
            } else if(node.id < temp.next.id){
                flag = true;
                node.next = temp.next;
                temp.next = node;
                break;
            } else{
                temp = temp.next;
            }
        }
        if(!flag){
            temp.next = node;
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
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.println("未找到该节点");
        }
    }

    public void showLinkedList(){
        Node temp = head.next;
        while (null!=temp){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
