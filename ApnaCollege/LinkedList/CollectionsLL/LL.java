

public class LL {
     class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
     node head;
     void insert(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
     void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    node mid(node head){
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    node merge(node head1, node head2){
        node dummy = new node(-1);
        node temp = dummy;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                 temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
             temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
             temp = temp.next;
        }
        return dummy.next;
    }
    node mergesort(node head){
        if(head == null || head.next == null){
            return head;
        }
        node midnode = mid(head);
        node righthead = midnode.next;
        midnode.next = null;

        node rightsort = mergesort(righthead);
        node lefthead = mergesort(head);
        return merge(lefthead, rightsort);
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(3);
        ll.insert(1);
        ll.insert(5);
        ll.insert(7);
        ll.insert(1);
        ll.display();
        ll.head = ll.mergesort(ll.head);
        ll.display();
    }
}
