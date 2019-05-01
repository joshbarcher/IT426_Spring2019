package messages.greetings;

import java.util.Random;

public class RandomizedGreeting extends AbstractGreeting
{
    public RandomizedGreeting(String recipient)
    {
        super(recipient);
    }

    @Override
    public String greeting()
    {
        String[] greetings = {"Heya", "Yo!", "Wasuppppppp", "Hola", "Hello"};
        return greetings[new Random().nextInt(greetings.length)] + " " + getRecipient();
    }
}
