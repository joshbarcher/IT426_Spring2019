package decorators;

public class BorderDecorator implements IDecorate
{
    //store an instance of our "subject" object
    private IDecorate decoratedHTML;
    
    public BorderDecorator(IDecorate decoratedHTML)
    {
        this.decoratedHTML = decoratedHTML;
    }

    @Override
    public String generateText()
    {
        String subject = decoratedHTML.generateText();
        
        //add color to our HTML
        return "<span style=\"border: solid 2px black\">" 
               + subject + "</span>";
    }
}
