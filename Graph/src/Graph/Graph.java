package Graph;


/**
 * Created by Дмитрий on 30.10.2016.
 */
public class Graph
{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    private StackX stack;   //for  function dfs()
    private Queue queue;    //for function bfs()

    public Graph()
    {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j =0; j < MAX_VERTS; j++)
        {
            for (int i = j; i < MAX_VERTS; i++)
            {
                adjMat[i][j] = 0;
            }
        }
        stack = new StackX();   //for  function dfs()
        queue = new Queue();    //for  function bfs()
    }

    public void addVertex(char label)
    {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end)
    {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public  void displayVertex(int v)
    {
        System.out.print(vertexList[v].getLabel());
    }

    public int getAdjUnvisitedVertex(int v)
    {
        for(int j = 0; j < nVerts; j++)
        {
            if(adjMat[v][j] == 1 && vertexList[j].getWasVisited() == false)
            {
                return j;
            }
        }
        return -1;
    }

    public void dfs()
    {
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty())
        {
            int v = getAdjUnvisitedVertex(stack.peek());
            if(v == -1)
            {
                stack.pop();
            }
                else
                {
                    vertexList[v].setWasVisited(true);
                    displayVertex(v);       //show vertex's value on the screen
                    stack.push(v);
                }
        }

        for(int j = 0; j < nVerts; j++)         //turn the visited flags to be false
        {
            vertexList[j].setWasVisited(false);
        }
    }

    public void bfs()
    {
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        queue.insert(0);
        int v2;

        while(!queue.isEmpty())
        {
            int v1 = queue.remove();

            while ((v2 = getAdjUnvisitedVertex(v1)) != -1)
            {
                vertexList[v2].setWasVisited(true);
                displayVertex(v2);      //show a value of vertex
                queue.insert(v2);
            }
        }

        for(int i = 0; i < nVerts; i++)
        {
            vertexList[i].setWasVisited(false);
        }
    }

    public void mst()       //display minimum spanning tree
    {
        vertexList[0].setWasVisited(true);
        stack.push(0);

        while(!stack.isEmpty())
        {
            int currentVertex = stack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if(v == -1)
            {
                stack.pop();
            }
                else
                {
                    vertexList[v].setWasVisited(true);
                    stack.push(v);

                    displayVertex(currentVertex);
                    displayVertex(v);
                    System.out.print(" ");
                }
        }

        for(int j = 0; j < nVerts; j++)         //turn the visited flags to be false
        {
            vertexList[j].setWasVisited(false);
        }
    }
}
