package LinkedList;

public class LinkedList {


    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    Node head = null;
    Node tail = null;
    public void insertRight(int data){
        Node node = new Node(data);
        if(head == null && tail == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    public void insertLeft(int data){
        Node node = new Node(data);
        if(head == null && tail == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head = node;
        }

    }

    public void printList(){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data + "-->");
            pointer = pointer.next;
        }
        System.out.println("X");

    }
}
