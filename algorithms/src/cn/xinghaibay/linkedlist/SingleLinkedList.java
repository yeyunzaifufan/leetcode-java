package cn.xinghaibay.linkedlist;

class Node1{
    public int id;
    public String name;
    public String nickName;
    public Node1 next;

    public Node1(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

public class SingleLinkedList {

    private Node1 head = new Node1(0, "", "");

    public void add(Node1 node1){
        Node1 temp = head;
        while (null!=temp.next){
            temp = temp.next;
        }
        temp.next = node1;
    }

    public void addByOrder(Node1 node1){
        boolean flag = false;
        Node1 temp = head;
        while (null!=temp.next){
            if(node1.id == temp.next.id){
                return;
            } else if(node1.id < temp.next.id){
                flag = true;
                node1.next = temp.next;
                temp.next = node1;
                break;
            } else{
                temp = temp.next;
            }
        }
        if(!flag){
            temp.next = node1;
        }
    }

    public void update(Node1 node1){
        boolean flag = false;
        Node1 temp = head;
        while (null!=temp){
            if(temp.id==node1.id){
                flag = true;
                temp.name = node1.name;
                temp.nickName = node1.nickName;
            }
            temp = temp.next;
        }
        if(!flag){
            System.out.println("未找到该节点");
        }
    }

    public void delete(int id){
        boolean flag = false;
        Node1 temp = head;
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
        Node1 temp = head.next;
        while (null!=temp){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}
