package Graph;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class Vertex
{
    private char label;
    private boolean wasVisited;

    public Vertex(char label)
    {
        this.label = label;
        this.wasVisited = false;
    }

    public void setLabel(char label)
    {
        this.label = label;
    }

    public  void setWasVisited(boolean wasVisited)
    {
        this.wasVisited = wasVisited;
    }

    public char getLabel()
    {
        return this.label;
    }

    public boolean getWasVisited()
    {
        return this.wasVisited;
    }
}

