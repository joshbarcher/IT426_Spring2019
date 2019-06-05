package shapes.data;

import shapes.entities.Shape;

import java.util.HashSet;
import java.util.Set;

public class ShapesHistory
{
    private Set<Shape> shapes;

    public ShapesHistory()
    {
        shapes = new HashSet<>();
    }

    public boolean addShape(Shape shape)
    {
        if (!shapes.contains(shape))
        {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    public boolean removeShape(Shape shape)
    {
        if (shapes.contains(shape))
        {
            shapes.remove(shape);
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (Shape shape : shapes)
        {
            builder.append(shape);
            builder.append("\n");
        }

        return builder.toString();
    }
}
