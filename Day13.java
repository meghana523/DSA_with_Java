/*class Node
{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
class BST
{
    Node root;
    public BST()
    {
        this.root = null;
    }

    public void insert(int data)
    {
        this.root = insert_helper(this.root,data);
    }

    private Node insert_helper(Node node, int data)
    {
        if(node == null)
        {
            return new Node(data);
        }
        if(data < node.data)
        {
            node.left = insert_helper(node.left,data);
        }
        else if(data > node.data)
        {
            node.right = insert_helper(node.right,data);
        }
        return node;
    }
    public void in_order()
    {
        in_order_helper(this.root);
    }
    
    private void in_order_helper(Node node)
    {
        if(node != null)
        {
            in_order_helper(node.left);
            System.out.print(node.data + " ");
            in_order_helper(node.right);
        }
    }
    // find minimum value in BST
    /*public int find_min()
    {
        return find_min_helper(this.root);
    }

    private int find_min_helper(Node node)
    {
        if(node == null)
        {
            return Integer.MAX_VALUE;
        }
        int min = node.data;
        int left_min = find_min_helper(node.left);
        if(left_min < min)
        {
            min = left_min;
        }
        return min;
    }*/
    /*public int findMin()
    {
        if(this.root == null)
        {
            return Integer.MAX_VALUE;
        }
        Node current = this.root;
        while(current.left != null)
        {
            current = current.left;
        }
        return current.data;
    }
    public int findMax()
    {
        if(this.root == null)
        {
            return Integer.MIN_VALUE;
        }
        Node current = this.root;
        while(current.right != null)
        {
            current = current.right;
        }
        return current.data;
    }
}
class Day13
{
    public static void main(String[] args)
    {
        BST tree = new BST();
        tree.insert(19);
        tree.insert(27);
        tree.insert(11);
        tree.insert(7);
        tree.in_order();
        System.out.println();
        System.out.println(tree.findMin());
        System.out.println(tree.findMax());
        //tree.insert(3);
        //tree.in_order();
    }
}*/

//Graphs using adjecent list

import java.util.HashMap;
import java.util.ArrayList;

class Graph{
    HashMap<Integer, ArrayList<Integer>> adj_list;
    public Graph()
    {
        adj_list = new HashMap<>();
    }

    public void addEdge(int source, int destination)
    {
        if(!adj_list.containsKey(source)) 
            adj_list.put(source, new ArrayList<>());
        if(!adj_list.containsKey(destination))
            adj_list.put(destination, new ArrayList<>());
        adj_list.get(source).add(destination);
        adj_list.get(destination).add(source);
    }

    public void display()
    {
        for(int vertex : adj_list.keySet())
        {
            System.out.println(vertex+"->"+adj_list.get(vertex));
        }
    }
}
class Day13{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.display();
    }
}