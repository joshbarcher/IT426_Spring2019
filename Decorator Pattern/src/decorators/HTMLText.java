package decorators;

public class HTMLText implements IDecorate
{
    private String html;
    
    public HTMLText(String html)
    {
        this.html = html;
    }

    @Override
    public String generateText()
    {
        //return our HTML text
        return html;
    }
}
