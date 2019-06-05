package shapes.commands;

import shapes.data.ShapesHistory;
import shapes.entities.Shape;

public class CreateRectangleCommand implements ICommand
{
    private ShapesHistory history;
    private Shape savedShape;

    public CreateRectangleCommand(ShapesHistory history)
    {
        this.history = history;
    }

    @Override
    public void execute()
    {
        savedShape = new Shape(Shape.Type.RECTANGLE);
        history.addShape(savedShape);
    }

    @Override
    public void undo()
    {
        history.removeShape(savedShape);
    }
}
