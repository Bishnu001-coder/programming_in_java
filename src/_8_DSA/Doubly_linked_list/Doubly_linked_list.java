package _8_DSA.Doubly_linked_list;

public class Doubly_linked_list {
    public static Node head;
    public static  Node tail;
    public static  int size;
public void  _1_addfirst(Object ele){
    Node newnode=new Node(ele);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
    }
    public void _2_D_addlast(Object ele){
    Node newnode=new Node(ele);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
    }
    public void _3_D_printll(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.ele+ "<->");
        curr=curr.next;
        }
        System.out.println("null");
    }

}



