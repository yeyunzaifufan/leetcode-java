package cn.xinghaibay.linkedlist;

class Boy{
    private int id;
    private Boy next;

    public Boy(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}

public class CircleSingleLinkedList {

    private Boy first;

    public void create(int nums){
        Boy curBoy = null;
        for(int i=1;i<=nums;i++){
            Boy boy = new Boy(i);
            if(i==1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else{
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    public void show(){
        System.out.print("环形链表：");
        Boy curBoy = first;
        while (true){
            System.out.print(curBoy.getId()+" ");
            if(curBoy.getNext().getId()==first.getId()){
                break;
            }
            curBoy = curBoy.getNext();
        }
        System.out.println();
    }

    public void josepho(int k, int m, int nums){
        create(nums);
        Boy kBoy = first;
        while (kBoy.getNext().getId()!=first.getId()){
            kBoy = kBoy.getNext();
        }
        for(int i=0;i<k-1;i++){
            kBoy = kBoy.getNext();
        }
        while (kBoy.getNext().getId()!=kBoy.getId()){
            for(int i=0;i<m-1;i++){
                kBoy = kBoy.getNext();
            }
            System.out.println(kBoy.getNext().getId());
            kBoy.setNext(kBoy.getNext().getNext());
        }
        System.out.println(kBoy.getId());
    }
}
