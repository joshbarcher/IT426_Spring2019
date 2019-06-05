package shapes.program;

import shapes.commands.CreateOvalCommand;
import shapes.commands.CreateRectangleCommand;
import shapes.commands.ICommand;
import shapes.data.ShapesHistory;

public class TestCommands
{
    public static void main(String[] args)
    {
        ShapesHistory history = new ShapesHistory();

        ICommand command1 = new CreateOvalCommand(history);
        ICommand command2 = new CreateRectangleCommand(history);
        ICommand command3 = new CreateRectangleCommand(history);


    }
}
