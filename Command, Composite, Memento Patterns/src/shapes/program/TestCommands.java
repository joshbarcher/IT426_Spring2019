package shapes.program;

import shapes.commands.CreateOvalCommand;
import shapes.commands.CreateRectangleCommand;
import shapes.commands.ICommand;
import shapes.composite.CompositeShapeCommand;
import shapes.data.ShapesHistory;
import shapes.data.ShapesHistory.Memento;

public class TestCommands
{
    public static void main(String[] args)
    {
        ShapesHistory history = new ShapesHistory();

        Memento emptyMemento = history.saveState();

        ICommand command1 = new CreateOvalCommand(history);
        ICommand command2 = new CreateRectangleCommand(history);
        ICommand command3 = new CreateRectangleCommand(history);

        //create a composite command
        ICommand composite = new CompositeShapeCommand(
            new ICommand[] {
                new CreateOvalCommand(history),
                new CreateOvalCommand(history),
                new CreateOvalCommand(history),
                new CompositeShapeCommand(
                    new ICommand[] {
                        new CreateOvalCommand(history),
                        new CreateOvalCommand(history),
                        new CreateOvalCommand(history)
                    }
                )
            }
        );

        //group together my commands and execute them
        ICommand[] commands = {command1, command2, command3, composite};
        for (int i = 0; i < commands.length; i++)
        {
            commands[i].execute();
        }

        System.out.println(history);

        //save my state
        Memento memento = history.saveState();

        //remove all six shapes from the composite command
        composite.undo();

        System.out.println(history);

        //rollback to a previous state
        history.rollback(memento);
        System.out.println(history);

        System.out.println("Print history after empty memento");
        history.rollback(emptyMemento);
        System.out.println(history);
    }
}
