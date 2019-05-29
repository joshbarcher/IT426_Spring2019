package driver;

import decorators.*;

public class DecoratorDriver
{
    public static void main(String[] args)
    {
        IDecorate html =
            new SectionDecorator(
            new LinkDecorator(
            new PrependAppendDecorator(
                new HTMLText("To be or not to be!"), "\"", "\" - Socrates"
            )), "Favorite Quote");
        System.out.println(html.generateText());
    }
}
