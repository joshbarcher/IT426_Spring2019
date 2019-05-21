package factory_methods.colors;

public class Color
{
    //components will be in the range [0,255]
    private int red;
    private int green;
    private int blue;

    //this will always lie between [0, 1]
    //where 0 means transparent and 1 opaque
    private double alpha;

    public Color(int red, int green, int blue,
                 double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public double getRed()
    {
        return red;
    }

    public double getGreen()
    {
        return green;
    }

    public double getBlue()
    {
        return blue;
    }

    public double getAlpha()
    {
        return alpha;
    }

    @Override
    public String toString()
    {
        return "(" + red + "," + green + "," + blue + "," +
                ((int)((alpha / 1.0) * 100)) + "%)";
    }
}

