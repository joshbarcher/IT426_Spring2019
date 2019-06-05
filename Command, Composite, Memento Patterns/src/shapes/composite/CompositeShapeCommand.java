package shapes.composite;

import shapes.commands.ICommand;

public class CompositeShapeCommand implements ICommand
{
    private ICommand[] commands;

    public CompositeShapeCommand(ICommand[] commands)
    {
        this.commands = commands;
    }

    @Override
    public void execute()
    {
        for (ICommand command : commands)
        {
            command.execute();
        }
    }

    @Override
    public void undo()
    {
        for (ICommand command : commands)
        {
            command.undo();
        }
    }
}
