//Graphs using adjecent list

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashSet;

/*class Graph{
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
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.display();
    }
}*/

//Graph using Adjacent matrix
/*class Graph{
    ArrayList<ArrayList<Integer>> AdjMat;
    LinkedHashMap<Integer, Integer> vertexToIndex;

    public Graph()
    {
        AdjMat = new ArrayList<>();
        vertexToIndex = new LinkedHashMap<>();
    }

    public void addVertex(int vertex)
    {
        if(!vertexToIndex.containsKey(vertex))
        {
            vertexToIndex.put(vertex, AdjMat.size());
            for(ArrayList<Integer> row : AdjMat)
            {
                row.add(0);
            }
            ArrayList<Integer> newRow = new ArrayList<>();
            for(int ind = 0; ind <= AdjMat.size(); ind++)
            {
                newRow.add(0);
            }
            AdjMat.add(newRow);
        }
    }
    public void addEdge(int source, int destination,int weight)
    {
        addVertex(source);
        addVertex(destination);
        int row = vertexToIndex.get(source);
        int col = vertexToIndex.get(destination);
        AdjMat.get(row).set(col,1);
        AdjMat.get(col).set(row,1);

    }
    public void display(){
        for(int ind=0;ind<10;ind++)
            System.out.print(" ");
        
        for(Integer vertex: vertexToIndex.keySet()){
            System.out.printf("%-10s",vertex);
        }
        System.out.println();
        for(Integer vertex: vertexToIndex.keySet()){
            System.out.printf("%-10s",vertex);
            int row = vertexToIndex.get(vertex);
            for(int col = 0; col < AdjMat.size(); col++){
                System.out.printf("%-10d",AdjMat.get(row).get(col));
            }
            System.out.println();
        }
    }
}
class Day14
{
    public static void main(String[] args)
    {
        Graph graph = new Graph();
		graph.addEdge(10,20,10);
		graph.display();
    }
}*/

//Graph using edge list
/*class Edge{
    String source,destination;

    public Edge(String source, String destination)
    {
        this.source = source;
        this.destination = destination;
    }
}
class Graph{
    ArrayList<Edge> edgeList;
    public Graph()
    {
        edgeList = new ArrayList<>();
    }

    public void addEdge(String source,String destination)
    {
        edgeList.add(new Edge(source, destination));
    }
    public void display()
    {
        for(Edge edge: edgeList)
        {
            System.out.print(edge.source +"->"+edge.destination);
        }
    }
}
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge("Harish", "Kumar");
        g.display();
    }
}*/

//BSF
/*class Graph{
    LinkedHashMap<Integer, ArrayList<Integer>> adj_list;
    public Graph()
    {
        adj_list = new LinkedHashMap<>();
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
    public void LevelOrderTraverse(int start)
    {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty())
        {
            int currentVertex = q.poll();
            System.out.print(currentVertex+" ");
            for(int neighbor:adj_list.get(currentVertex))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    q.offer(neighbor);
                }
            }
        }
    }
}
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(10,19);
        g.addEdge(19,11);
        g.addEdge(10,17);
        g.addEdge(17,11);
        g.addEdge(17,23);
        g.LevelOrderTraverse(10);
    }
}*/

//check whether the cycle exist or not using BFS
/*class Pair{
    int child,parent;
    public Pair(int child, int parent)
    {
        this.child = child;
        this.parent = parent;
    }
}
class Graph{
    LinkedHashMap<Integer, ArrayList<Integer>> adj_list;
    public Graph()
    {
        adj_list = new LinkedHashMap<>();
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
    public void LevelOrderTraverse(int start)
    {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty())
        {
            int currentVertex = q.poll();
            System.out.print(currentVertex+" ");
            for(int neighbor:adj_list.get(currentVertex))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    q.offer(neighbor);
                }
            }
        }
    }
    public boolean havingCycleBfs(int start)
    {
        Queue<Pair> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.offer(new Pair(start,-1));
        visited.add(start);
        while(!q.isEmpty())
        {
            Pair current = q.poll();
            int child = current.child;
            int parent = current.parent;
            for(int neighbor:adj_list.get(child))
            {
                if(visited.contains(neighbor))
                {
                    if(neighbor!=(parent))
                        return true;
                }
                else
                {
                    visited.add(neighbor);
                    q.offer(new Pair(neighbor,child));
                }
            }
        }
        return false;
    }
    public void dfs(int start)
    {
        HashSet<Integer> visited=new HashSet<>();
        dfsHelper(start,visited);
    }
    public void dfsHelper(int current,HashSet<Integer> visited)
    {
        visited.add(current);
        System.out.print(current+" ");
        for(int neighbour:adj_list.get(current))
        {
           if(!visited.contains(neighbour))
           {
            dfsHelper(neighbour,visited);
           }
           
        }
    }
}
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(10,19);
        g.addEdge(19,11);
        g.addEdge(10,17);
        g.addEdge(17,11);
        g.addEdge(17,23);
        System.out.println(g.havingCycleBfs(10));
    }
}*/

//DFS
/*class Pair{
    int child,parent;
    public Pair(int child, int parent)
    {
        this.child = child;
        this.parent = parent;
    }
}
class Graph{
    LinkedHashMap<Integer, ArrayList<Integer>> adj_list;
    public Graph()
    {
        adj_list = new LinkedHashMap<>();
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
    public void LevelOrderTraverse(int start)
    {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty())
        {
            int currentVertex = q.poll();
            System.out.print(currentVertex+" ");
            for(int neighbor:adj_list.get(currentVertex))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    q.offer(neighbor);
                }
            }
        }
    }
    public void dfs(int start)
    {
        HashSet<Integer> visited=new HashSet<>();
        dfsHelper(start,visited);
    }
    public void dfsHelper(int current,HashSet<Integer> visited)
    {
        visited.add(current);
        System.out.print(current+" ");
        for(int neighbour:adj_list.get(current))
        {
           if(!visited.contains(neighbour))
           {
            dfsHelper(neighbour,visited);
           }
           
        }
    }
}
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(10,19);
        g.addEdge(19,11);
        g.addEdge(10,17);
        g.addEdge(17,11);
        g.addEdge(17,23);
        g.dfs(10);
    }
}
*/

//check whether the cycle exist or not using DFS
/*class Pair{
    int child,parent;
    public Pair(int child, int parent)
    {
        this.child = child;
        this.parent = parent;
    }
}
class Graph{
    LinkedHashMap<Integer, ArrayList<Integer>> adj_list;
    public Graph()
    {
        adj_list = new LinkedHashMap<>();
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
    public void LevelOrderTraverse(int start)
    {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty())
        {
            int currentVertex = q.poll();
            System.out.print(currentVertex+" ");
            for(int neighbor:adj_list.get(currentVertex))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    q.offer(neighbor);
                }
            }
        }
    }
    public void dfs(int start)
    {
        HashSet<Integer> visited=new HashSet<>();
        dfsHelper(start,visited);
    }
    public void dfsHelper(int current,HashSet<Integer> visited)
    {
        visited.add(current);
        System.out.print(current+" ");
        for(int neighbour:adj_list.get(current))
        {
           if(!visited.contains(neighbour))
           {
            dfsHelper(neighbour,visited);
           }
           
        }
    }
    public boolean havingCycleDfs(int start)
    {
        HashSet<Integer> visited = new HashSet<>();
        return havingCycleDfsHelper(start,-1,visited);
    }
    private boolean havingCycleDfsHelper(int current, int parent,HashSet<Integer> visited)
    {
        visited.add(current);
        for(int neighbour : adj_list.get(current))
        {
            if(!visited.contains(neighbour))
            {
                if(havingCycleDfsHelper(neighbour,current,visited))
                    return true;
            }
            else
            {
                if(neighbour!=parent)
                    return true;
            }
        }
        return false;
    }
}
class Day14{
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.addEdge(10,19);
        g.addEdge(19,11);
        g.addEdge(17,11);
        g.addEdge(17,23);
        System.out.println(g.havingCycleDfs(10));
    }
}*/

//connecting components using DFS
/*import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;

class Pair{
    String child, parent;
    
    public Pair(String child, String parent){
        this.child = child;
        this.parent = parent;
    }
}

class Graph{
    LinkedHashMap<String,ArrayList<String>> AdjList;
    
    public Graph(){
        AdjList = new LinkedHashMap<>();
    }
    
    public void addEdge(String source, String destination){
        if(!AdjList.containsKey(source)) {
            AdjList.put(source, new ArrayList<>());
        }
        
        if(!AdjList.containsKey(destination)) {
            AdjList.put(destination, new ArrayList<>());
        }
        
        AdjList.get(source).add(destination);
        AdjList.get(destination).add(source);
    }
    
    public void display(){
        for(String vertex : AdjList.keySet()){
            System.out.println(vertex +" -> "+ AdjList.get(vertex));
        }
    }
    
    public void levelOrderTraverse(String start){
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        HashSet<String> visited = new HashSet<>();
        visited.add(start);
        while(!queue.isEmpty()){
            String currentVertex = queue.poll();
            System.out.print(currentVertex+ " ");
            for(String neighbour: AdjList.get(currentVertex)){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }
    }
    
    public void dfs(String start){
        HashSet<String> visited = new HashSet<>();
        dfsHelper(start, visited);
    }
    
    public void dfsHelper(String current, HashSet<String> visited ){
        visited.add(current);
        System.out.print(current+ " ");
        for(String neighbour: AdjList.get(current)){
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour,visited);
            }
        }
    }
    
    public int connectingComponents(){
        int count = 0;
        HashSet<String> visited = new HashSet<>();
        
        for(String vertex: AdjList.keySet()){
            if(!visited.contains(vertex)){
                count ++;
                connectingComponentsHelper(vertex, visited);
            }
        }
        return count;
    }
    
    private void connectingComponentsHelper(String vertex, HashSet<String> visited){
        visited.add(vertex);
        for(String neighbour: AdjList.get(vertex)){
            if(!visited.contains(neighbour)){
                connectingComponentsHelper(neighbour,visited);
            }
        }
    }
}
public class Day14{
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge("P1","P2");
		graph.addEdge("P2","P3");
		graph.addEdge("P1","P4");
		graph.addEdge("P1","P5");
		graph.addEdge("P3","P4");
		graph.addEdge("P6","P7");
		graph.addEdge("P7","P8");
		graph.addEdge("P8","P9");
		graph.addEdge("P10","P11");
		System.out.print(graph.connectingComponents());
	}
}
*/

//topological ordering using kahn's algorithm
class Graph{
    LinkedHashMap<Integer,ArrayList<Integer>> AdjList;
    
    public Graph(){
        AdjList = new LinkedHashMap<>();
    }
    
    public void addEdge(int source, int destination){
        if(!AdjList.containsKey(source)) {
            AdjList.put(source, new ArrayList<>());
        }
        
        if(!AdjList.containsKey(destination)) {
            AdjList.put(destination, new ArrayList<>());
        }
        
        AdjList.get(source).add(destination);
    
    }    
    public void display(){
        for(int vertex : AdjList.keySet()){
            System.out.println(vertex +" -> "+ AdjList.get(vertex));
        }
    }
    
    public void topologicalOrdering()
    {
        HashMap<Integer, Integer> in_degree = new HashMap<>();
        for(int vertex : AdjList.keySet())
        {
            in_degree.put(vertex,0);
        }
        for(int vertex :AdjList.keySet())
        {
            for(int neighbour : AdjList.get(vertex))
            {
                in_degree.put(neighbour,in_degree.get(neighbour)+1);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int vertex:in_degree.keySet())
        {
            if(in_degree.get(vertex)==0)
                q.offer(vertex);
        }
        while(!q.isEmpty())
        {
            int current = q.poll();
            System.out.print(current+" ");
            for(int neighbour : AdjList.get(current))
            {
                in_degree.put(neighbour,in_degree.get(neighbour)-1);
                if(in_degree.get(neighbour) == 0) q.offer(neighbour);
            }
        }
    }
}
public class Day14{
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(1,2);
		graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(4,2);
        graph.addEdge(4,3);
        graph.addEdge(3,6);
        graph.addEdge(5,2);
		graph.topologicalOrdering();
	}
}
