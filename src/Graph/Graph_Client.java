import java.util.HashSet;

public class Graph_Client 
{
    public static void main(String[] args) 
    {
        Graph gr = new Graph(7);
        gr.AddEdge(1, 4, 6);
        gr.AddEdge(1, 2, 10);
        gr.AddEdge(2, 3, 7);
        gr.AddEdge(3, 4, 5);
        gr.AddEdge(4, 5, 1);
        gr.AddEdge(5, 6, 4);
        gr.AddEdge(7, 5, 2);
        gr.AddEdge(6, 7, 3);
        gr.display();
        System.out.println("Path from 1 to 6 available? "+gr.hasPath(1,6,new HashSet<>()));
        
    }
    
}
