//Prime factorization of a number
//import java.util.*;
/*class Day12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%2==0)
        {
            System.out.print(2+" ");
            n=n/2;
        }
        int i=3;
        while(n>1)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            i++;
        }
        System.out.print(n+" ");
    }
}*/

//Given an array of integers and window size k print the sum of each window in array(individually) without using sliding window
/*class Day12
{
    public static void main(String[] args)
    {
        int a[] = {56,29,73,27,11,13,17,12};
        int k = 3;
        for(int i=0; i < a.length - k + 1; i++)
        {
            int sum = 0;
            for(int j = 0; j < k; j++)
            {
                sum += a[i+j];
            }
            System.out.print(sum+" ");
        }
    }   
}*/

//using silding window
/*class Day12
{
    public static void main(String[] args)
    {
        int a[] = {56,29,73,27,11,13,17,12};
        int k = 3,left=0,sum=0;
        for(int right=0; right < a.length; right++)
        {
            sum += a[right];
            if(right >= k - 1)
            {
                System.out.print(sum+" ");
                sum -= a[left];
                left++;
            }
        }
    }   
}*/

//Maximum value 
/*class Day12
{
    public static void main(String[] args)
    {
        int a[] = {56,29,73,27,11,13,17,12};
        int k = 3,left=0,sum=0,max=Integer.MIN_VALUE;
        for(int right=0; right < a.length; right++)
        {
            sum += a[right];
            if(right >= k - 1)
            {
                max = Math.max(max,sum);
                sum -= a[left];
                left++;
            }
        }
        System.out.print(max);
    }   
}*/

//Given an array of n elements and sliding window size k find the sliding window maximum for each sliding window(bruteforce)
/*class Day12
{
    public static void main(String[] args)
    {
        int[] a = {11,29,73,27,56,13,17,12};
        int k = 3;
        for(int i=0; i < a.length - k + 1; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<k;j++)
            {
                max=Math.max(max,a[i+j]);
                //if(a[i+j]>max)
                //{
                  //  max = a[i+j];
                //}
            }
            System.out.print(max+" ");
        }
    }
*/

//Optimal approach
/*import java.util.Deque;
import java.util.LinkedList;
class Day12
{
    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<>();
        int[] a = {11,29,73,27,19,43,17,39};
        int k = 3;
        for(int right=0; right < a.length; right++)
        {
            while(!dq.isEmpty() && dq.peekFirst() <= right - k)
                dq.pollFirst();
            while(!dq.isEmpty() && a[right] >= a[dq.peekLast()])
                dq.pollLast();
            dq.offer(right);
            if(right >= k - 1)
                System.out.print(a[dq.peekFirst()] + " ");
        }
    }
}*/


//Trees
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
class Node
{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
class Tree
{
    Node root;
    public Tree()
    {
        this.root = null;
    }

    public void insert(int data)
    {
        if(this.root == null)
        {
            this.root = new Node(data);
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        while(!Q.isEmpty())
        {
            Node current = Q.poll();
            if(current.left !=null) 
            {
                Q.offer(current.left);
            }
            else{
                current.left = new Node(data);
                return ;
            }
            if(current.right != null)
            {
                Q.offer(current.right);
            }
            else
            {
                current.right = new Node(data);
                return ;
            }
        }
    }
    public void Level_Order()
    {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        while(!Q.isEmpty())
        {
            Node current = Q.poll();
            System.out.print(current.data+" ");
            if(current.left != null)
            {
                Q.offer(current.left);
            }
            if(current.right!=null)
            {
                Q.offer(current.right);
            }
        }
        System.out.println();
    }

    public void in_Order()
    {
        in_Order_helper(this.root);
    }

    private void in_Order_helper(Node node)
    {
        if(node!=null)
        {
            in_Order_helper(node.left);
            System.out.print(node.data+" ");
            in_Order_helper(node.right);
        }
    }

    /*public void preOrder()
    {
        preOrder_helper_stack(this.root);
    }
    private void preOrder_helper_stack(Node node)
    {
        Stack<Node> st = new Stack<>();
        st.push(this.root);
        while(!st.isEmpty())
        {
            Node current = st.pop();
            if(current != null)
            {
                System.out.print(current.data+" ");
                st.push(current.right);
                st.push(current.left);
            }
        }

    }*/
    /*private void preOrder_helper(Node node)
    {
        if(node != null)
        {
            System.out.print(node.data+" ");
            preOrder_helper(node.left);
            preOrder_helper(node.right);
        }
    }*/
    /*public void postOrder()
    {
        postOrder_helper_stack(this.root);
    }

    private void postOrder_helper_stack(Node node)
    {
        if(node == null)
            return;

        Stack<Node> st = new Stack<>();
        Node current = node;
        Node lastVisited = null;

        while(current != null || !st.isEmpty())
        {
            while(current != null)
            {
                st.push(current);
                current = current.left;
            }

            Node peekNode = st.peek();

            if(peekNode.right != null && lastVisited != peekNode.right)
            {
                current = peekNode.right;
            }
            else
            {
                System.out.print(peekNode.data + " ");
                lastVisited = st.pop();
            }
        }
        System.out.println();
    }*/

    /*private void postOrder_helper(Node node)
    {
        if(node!=null)
        {
            postOrder_helper(node.left);
            postOrder_helper(node.right);
            System.out.print(node.data+" ");
        }
    }*/
    public void delete(int value)
    {
        if(root==null) return ;
        if(root.left == null && root.right == null){
            if(root.data == value){
                this.root = null;
                return ;
            }
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        Node current=null, target=null;
        while(!Q.isEmpty()){
            current = Q.poll();
            if(current.data == value) target = current;
            if(current.left != null) Q.offer(current.left);
            if(current.right != null) Q.offer(current.right);
        }
        if(target != null){
            target.data = current.data;
            Q.offer(this.root);
            while(!Q.isEmpty()){
                Node present = Q.poll();
                if(present.left!= null){
                    if(present.left == current){
                        present.left = null;
                        return ;
                    }else{
                        Q.offer(present.left);
                    }
                }if(present.right != null){
                    if(present.right == current){
                        present.right = null;
                        return;
                    }else{
                        Q.offer(present.right);
                    }
                }
            }
        }
    }
}
class Day12
{
    public static void main(String[] args)
    {
        Tree t = new Tree();
        t.insert(10);
        t.insert(20);
        t.insert(30);
        t.insert(40);
        t.insert(50);
        t.insert(60);
        t.Level_Order();
        t.in_Order();
        //t.postOrder();
        t.delete(20);
        t.in_Order();
    }
}