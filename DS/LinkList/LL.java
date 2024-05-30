package DS.LinkList;

public class LL {
    Node head;
    class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }
    //Add first to LL
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head; //As head is pointing to 1st node
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }

        Node iterator = head;
        while (iterator.next != null){
            iterator = iterator.next;
        }
        iterator.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node iterator = head;
        while (iterator != null){
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.print("Null");
    }

    public void revIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node recursiveInvert(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = recursiveInvert(head.next); //returns the reverse list until last point
        head.next.next = head;
        head.next = null;

        return newHead;
    }





    public static void main(String[] args) {
        LL list = new LL();
        list.printList();
        list.addFirst("World");
        list.addFirst("Hello");
        list.addFirst("Hey,");
        list.addLast("ok,");
        list.addLast("Bye");
        list.printList();

        list.revIterate();
        System.out.println();
        list.printList();

        list.head = list.recursiveInvert(list.head);
        System.out.println();
        list.printList();


    }
}
