package messages.greetings;

public class CasualGreeting extends AbstractGreeting
{
    public CasualGreeting(String recipient)
    {
        super(recipient);
    }

    @Override
    public String greeting()
    {
        return "What's up " + getRecipient();
    }
}
