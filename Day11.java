import java.util.*;
//Basic Queue program
/*class Day11{
    public static void main(String[] args)
    {
        Queue<Integer> que = new LinkedList<>();
        que.offer(10);//adding 
        que.offer(20);
        que.offer(30);
        que.offer(40);
        System.out.println(que.poll());//removing
        System.out.println(que.peek());//look at the front element
        System.out.print(que);
    }
}*/

// Deque basic program
/*class Day11{
    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10);//adding at first
        dq.offerFirst(20);
        dq.offerLast(30); //adding at last
        dq.offerLast(40);   
        System.out.println(dq);
        System.out.println(dq.pollFirst());//deleting at first
        System.out.println(dq.pollLast());//deleting at last
        System.out.println(dq);
        System.out.println(dq.peekFirst());//peek element from first
        System.out.println(dq.peekLast());//peek element from last
    }
}*/

// Custom Deque Implementation without using built-in methods
/*class Day11{
    public static void main(String[] args)
    {
        CustomDeque dq = new CustomDeque();
        
        System.out.println("=== Adding elements ===");
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.display();
        
        System.out.println("\n=== Peeking elements ===");
        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());
        
        System.out.println("\n=== Removing elements ===");
        System.out.println("Removed from first: " + dq.removeFirst());
        System.out.println("Removed from last: " + dq.removeLast());
        dq.display();
        
        System.out.println("\n=== Checking empty ===");
        System.out.println("Is empty: " + dq.isEmpty());
    }
}*/

// Node class for doubly linked list
/*class Node{
    int data;
    Node prev, next;
    
    public Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Custom Deque class
class Deque{
    Node head, tail;
    
    public Deque()
    {
        this.head = null;
        this.tail = null;
    }

    // Add element at the first
    public void addFirst(int data)
    {
        Node new_node = new Node(data);
        if(this.head == null)
        {
            this.head = this.tail = new_node;
        }
        else
        {
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
        }
    }

    // Add element at the last
    public void addLast(int data)
    {
        Node new_node = new Node(data);
        if(this.tail == null)
        {
            this.head = this.tail = new_node;
        }
        else
        {
            new_node.prev = this.tail;
            this.tail.next = new_node;
            this.tail = new_node;
        }
    }

    public int pollFirst()
    {
        if(this.head == null)
        {
            return -1;
        }
        int data = this.head.data;
        if(this.head == this.tail)
        {
            this.head = this.tail = null;
        }
        else
        {
            this.head = this.head.next;
            this.head.prev = null;
        }
        return data;
    }

    public int pollLast()
    {
        if(this.tail == null)
        {
            return -1;
        }
        int data = this.tail.data;
        if(this.head == this.tail)
        {
            this.head = this.tail = null;
        }
        else
        {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        return data;
    }

    public int peekFirst()
    {
        if(this.head == null)
        {
            return -1;
        }
        return this.head.data;
    }

    public int peekLast()
    {
        if(this.tail == null)
        {
            return -1;
        }
        return this.tail.data;
    }

    public void display()
    {
        if(this.head == null)
        {
            return ;
        }
        Node temp = this.head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(" ");
    } 
}
class Day11
{
    public static void main(String[] args)
    {
        Deque dq = new Deque();
        dq.addFirst(20);
        dq.addLast(10);
        dq.addFirst(30);
        dq.addLast(40);
        dq.display();
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.display();
    }
}*/

// k-th smallest using priority queues
/*class Day11
{
    public static void main(String[] args)
    {
        int[] arr = {10,30,7,18,32,19,13,12,17,100};
        int k = 4;

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int val : arr)
        {
            minHeap.add(val);
        }

        for (int i = 0; i < k - 1; i++)
        {
            if (!minHeap.isEmpty())
            {
                minHeap.poll();
            }
        }

        if (!minHeap.isEmpty())
        {
            System.out.println(minHeap.peek());
        }
    }
}*/
//another approach
/*class Day11
{
    public static int Kth_small(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : arr)
        {
            pq.add(-val);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        return -pq.remove();
    }
    public static void main(String[] args)
    {
        int[] arr = {10,30,7,18,32,19,13,12,17,100};
        int k = 3;
        System.out.println(Kth_small(arr,k));
    }
}*/

//Kth largest element using priority queue
/*class Day11
{
    public static int Kth_largest(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : arr)
        {
            pq.add(val);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        return pq.remove();
    }
    public static void main(String[] args)
    {
        int[] arr = {10,30,7,18,32,19,13,12,17,100};
        int k = 3;
        System.out.println(Kth_largest(arr,k));
    }
}*/

/*class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Push (enqueue) - costly operation (bruteforce)
    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push new element onto s1
        s1.push(x);
        // Move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Pop (dequeue)
    public int pop() {
        if (s1.isEmpty()) return -1; // or throw
        return s1.pop();
    }

    // Peek front
    public int peek() {
        if (s1.isEmpty()) return -1;
        return s1.peek();
    }

    // Empty check
    public boolean empty() {
        return s1.isEmpty();
    }
}

class Day11 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());   // 10
        System.out.println(q.peek());  // 20
        q.push(40);
        while (!q.empty()) {
            System.out.print(q.pop() + " ");
        }
        System.out.println();
    }
}*/

//queues using stacks approach -1 usage of two stacks 1 is used for insertion and second stack is used only when we need to delete
class Queue
{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public Queue()
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public boolean isEmpty()
    {
        return s1.isEmpty();
    }

    public void enqueue(int data)
    {
        s1.push(data);
    }

    public int dqueue()
    {
        if(s1.isEmpty())
        {
            return -1;
        }
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int data = s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return data;
    }

    public int peek() {
       if (s1.isEmpty()) {
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int x = s2.peek();   

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return x;
    }
    public void display()
    {
        if(s1.isEmpty()) return;
        System.out.println(s1.data);
    }
}
class Day11
{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(50);
        q.enqueue(30);
        q.display();
        System.out.println(q.isEmpty());
    }
}