package messages.greetings;

public abstract class AbstractGreeting
{
    private String recipient;

    public AbstractGreeting(String recipient)
    {
        this.recipient = recipient;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public abstract String greeting();
}
