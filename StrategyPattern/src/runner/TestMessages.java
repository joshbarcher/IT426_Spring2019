package runner;

import messages.Message;
import messages.closing.BriefClosing;
import messages.closing.VerboseClosing;
import messages.greetings.CasualGreeting;
import messages.greetings.ProfessionalGreeting;
import messages.greetings.RandomizedGreeting;

public class TestMessages
{
    public static void main(String[] args)
    {
        Message message = new Message("Joe", "Jill",
                "Let's go see that movie this weekend!", new RandomizedGreeting("Joe"),
                new VerboseClosing());

        System.out.println(message.buildMessage());
    }
}
