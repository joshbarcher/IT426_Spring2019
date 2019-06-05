package shapes.entities;

import java.util.Objects;
import java.util.UUID;

public class Shape
{
    private UUID id;
    private Type type;

    public Shape(Type type)
    {
        id = UUID.randomUUID();

        this.type = type;
    }

    public UUID getId()
    {
        return id;
    }

    public Type getType()
    {
        return type;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(id, shape.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return type.toString() + ": " + id;
    }

    public enum Type
    {
        RECTANGLE,
        OVAL,
        TRIANGLE,
        RHOMBUS
    }
}
