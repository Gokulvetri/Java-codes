class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}

public class Linkedlist {
    public Node head;

    public void insert(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head =newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    

    public void insertAtMiddle(int data){
        if(head == null){
           head = new Node(data);
           return;
        }
         int count = 0;
         Node temp = head;
         while(temp != null){
            temp = temp.next;
            count++;
         }
         int mid = count/2;
         temp = head;
         for(int i= 0;i<mid;i++){
           temp = temp.next;
         }
         Node newNode = new Node(data);
         newNode.next = temp.next;
         temp.next = newNode;

    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(1);
                ll.insert(1);
                ll.insert(2);
                ll.insert(3);
                ll.insert(4);

                ll.insertAtMiddle(6);
                ll.display();
        
            }



}