public class RectangleQ1
{
    private int width;
    private int length;

    public RectangleQ1()
    {
        setWidth(1);
        setLength(1);
    }

    public void setLength(int t_length)
    {
        if (t_length < 40 && t_length > 0)
        {
            length = t_length;
        }
    }

    public int getLength()
    {
        return length;
    }

    public void setWidth(int t_width)
    {
        if (t_width < 40 && t_width > 0)
        {
            width = t_width;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = " + getLength() + ", Width = " + getWidth();
    }
}