class LinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (first == null)
            first = newNode;
        else {
            Node current = first;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.link;
        }
        System.out.println("null");
    }

    public void copyLinkList(LinkedList l1)
    {
        if(l1.first==null)
        {
            System.out.println("can't Copy Empty Linked List");
        }
        else{
            this.first=null;
            Node save=l1.first;
            while (save!=null) {
                this.append(save.data);
                save=save.link;
            }
        }
    }
}
public class Copylinkedlist {    
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.append(0);
        l1.append(1);
        l1.append(2);
        l1.append(3);
        LinkedList l2=new LinkedList();
        l2.copyLinkList(l1);
        l2.printList();
    }
    }