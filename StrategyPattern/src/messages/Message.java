package messages;

import messages.closing.IClosing;
import messages.greetings.AbstractGreeting;

public class Message
{
    //greeting, closing, message body, to, from
    private String recipient;
    private String sender;
    private String body;
    private AbstractGreeting greeting;
    private IClosing closing;

    public Message(String recipient, String sender, String body,
                   AbstractGreeting greeting, IClosing closing)
    {
        this.recipient = recipient;
        this.sender = sender;
        this.body = body;
        this.greeting = greeting;
        this.closing = closing;
    }

    //the configurable algorithm
    public String buildMessage()
    {
        StringBuilder builder = new StringBuilder();

        //put together my message using a string builder
        builder.append(greeting.greeting());

        builder.append(",\n\n");
        builder.append(body);
        builder.append("\n\n");

        builder.append(closing.closing());
        builder.append(",\n");
        builder.append(sender);

        return builder.toString();
    }
}
