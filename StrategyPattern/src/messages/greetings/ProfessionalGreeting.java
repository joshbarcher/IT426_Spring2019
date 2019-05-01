package messages.greetings;

public class ProfessionalGreeting extends AbstractGreeting
{
    public ProfessionalGreeting(String recipient)
    {
        super(recipient);
    }

    @Override
    public String greeting()
    {
        return "Hello " + getRecipient();
    }
}
