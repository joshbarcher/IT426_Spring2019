package decorators;


public class ColorDecorator implements IDecorate
{
    //store an instance of our "subject" object
    private IDecorate decoratedHTML;
    private String color;
    
    public ColorDecorator(IDecorate decoratedHTML, String color)
    {
        this.decoratedHTML = decoratedHTML;
        this.color = color;
    }

    @Override
    public String generateText()
    {
        String subject = decoratedHTML.generateText();
        
        //add color to our HTML
        return "<span style=\"color: " + color + "\">" + subject + "</span>";
    }
}
