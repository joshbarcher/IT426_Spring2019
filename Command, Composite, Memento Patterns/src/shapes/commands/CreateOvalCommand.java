package shapes.commands;

import shapes.data.ShapesHistory;
import shapes.entities.Shape;

public class CreateOvalCommand implements ICommand
{
    private ShapesHistory history;
    private Shape savedShape;

    public CreateOvalCommand(ShapesHistory history)
    {
        this.history = history;
    }

    @Override
    public void execute()
    {
        savedShape = new Shape(Shape.Type.OVAL);
        history.addShape(savedShape);
    }

    @Override
    public void undo()
    {
        history.removeShape(savedShape);
    }
}
