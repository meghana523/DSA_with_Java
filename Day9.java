//Singly linked list
/*class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Day9
{
    public static void main(String[] args)
    {
        Node d1 = new Node(10);
        Node d2 = new Node(20);
        Node d3 = new Node(30);
        d1.next = d2;
        d2.next = d3;
        Node head = d1;
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}*/

//designed list
class MyLinkedList {
    class ListNode
    {
        int data;
        ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    ListNode head;
    int size;
    public MyLinkedList()
    {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index>=0 && index<this.size)
        {
            ListNode temp = this.head;
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode new_node=new ListNode(val);
        new_node.next = this.head;
        this.head = new_node;
        this.size++;
    }
    
    public void addAtTail(int val) {
        ListNode new_node = new ListNode(val);
        ListNode temp = this.head;
        if(temp==null)
        {
            this.head=new_node;
        }
        else
        {
            while(temp.next != null)
            {
                temp= temp.next;
            }
            temp.next=new_node;
            new_node.next=null;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index <= this.size) {
            if(index==0)
            {
                this.addAtHead(val);
            }
            else if(index==this.size)
            {
                this.addAtTail(val);
            }
            else
            {
                ListNode temp = this.head;
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.next;
                }
                ListNode new_node=new ListNode(val);
                new_node.next=temp.next;
                temp.next=new_node;
                this.size++;
            }
            
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0 && index<this.size)
        {
            if(index==0)
            {
                ListNode next_node=this.head.next;
                this.head.next=null;
                this.head=next_node;
            }
            else
            {
                ListNode temp = this.head;
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.next;
                }
            }
            if(temp==null && temp.next!=null)
            {
                ListNode next_node=temp.next;
                temp.next=next_node.next;
                next_node.next=null;
                this.size--;
            }
        }
    }
    public void display()
    {
        ListNode temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Day9
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(50);
        list.addAtIndex(3,40);
        list.deleteAtIndex(0);
        list.display();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */


/*class MyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node current = head;
        for(int ind=0; ind < index ; ind++){
            current = current.next;
        }
        return current.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    
    public void addAtTail(int val) {
        if(this.head == null){ // no nodes
            this.head = new Node(val);
        }
        else{ //some nodes
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(val);
        }
        this.size ++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > this.size){
            return ;
        }
        if(index == 0){
            this.addAtHead(val);
            return ;
        }
        if(index == this.size){
            this.addAtTail(val);
            return ;
        }
        Node current = this.head;
        for(int ind = 0;ind < index-1; ind++){
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        this.size += 1;
    }
    
     public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }

        size--;
    }
} */
