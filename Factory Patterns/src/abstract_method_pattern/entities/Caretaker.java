package abstract_method_pattern.entities;

public class Caretaker
{
    private String fullName;
    private String position;
    
    public Caretaker(String fullName, String position)
    {
        this.fullName = fullName;
        this.position = position;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getPosition()
    {
        return position;
    }

    @Override
    public String toString()
    {
        return "Character [fullName=" + fullName +
                ", position=" + position + "]";
    }
}

