package decorators;

public class LinkDecorator implements IDecorate
{
    //store an instance of our "subject" object
    private IDecorate decoratedHTML;
    
    public LinkDecorator(IDecorate decoratedHTML)
    {
        this.decoratedHTML = decoratedHTML;
    }

    @Override
    public String generateText()
    {
        String subject = decoratedHTML.generateText();
        
        //add color to our HTML
        return "<a href=\"http://www.reddit.com\">" 
               + subject + "</a>";
    }
}
