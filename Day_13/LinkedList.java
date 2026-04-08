import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = null;
        temp.next = newNode;
        temp = newNode;

    }

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            insertAtStart(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        temp = newNode;

    }

    public void DeleteAtStart()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
    }

    public void DeleteAtEnd()
    {
        if(head==null)
        {
            return;
        }

        if (head.next==null)
        {
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;

    }

    public void  DeleteAtPosition(int pos)
    {
        if (head==null) return;
        Node temp=head;
        
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    public void Display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(5);
        list.insertAtPosition(10,1);
        list.insertAtEnd(30);
        list.insertAtPosition(15,2); 
        list.DeleteAtStart();
        list.DeleteAtEnd();
        list.DeleteAtPosition(1);
        list.Display();
    }

}
