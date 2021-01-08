/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-01-08
 * Time : 06:37
 */
package linked_list;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void printList(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        linkedList.head.next=second;
        second.next=third;

        linkedList.printList();

    }
}
