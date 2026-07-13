public class LLtest {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    node head;
    node tail;
    void insertatfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insert(int data){
        node newnode = new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    void add(int index, int data){
        node newnode = new node(data);
        if(index == 0){
            insertatfirst(data);
            return;
        }
        node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    int sizeofll(){
        if(head == null){
            return 0;
        }
        node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    void deletefromfirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
    }
    void deletefromend(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    int search(int value){
        node temp = head;
        int i = 0;
        boolean flag = false;
        while(temp != null){
            if(temp.data == value){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    int recursivesearch(int value, int i){
        if(head == null){
            return -1;
        }
        if(head.data == value){

        }
        return recursivesearch(value, i+1);
    }
    void reversell(){
        node prev = null;
        node curr = tail = head;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    void removeNthNode(int n){
        int sz = 0;
        node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int pos = 1;
        int itofind = sz-n;
        node prev = head;
        while(pos < itofind){
            prev = prev.next;
            pos++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        LLtest ll = new LLtest();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.add(2, 25);
        // ll.display();
        // ll.deletefromfirst();
        // ll.display();
        // ll.deletefromend();
        // ll.display();
        // System.out.println(ll.search(25));
        // System.out.println(ll.sizeofll());
        // System.out.println(ll.recursivesearch(25, 0));
        // ll.reversell();
        ll.display();
        ll.removeNthNode(3);
        ll.display();
    }
}
