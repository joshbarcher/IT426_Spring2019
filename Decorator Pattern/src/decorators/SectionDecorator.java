package decorators;

public class SectionDecorator implements IDecorate
{
    private IDecorate subject;
    private String title;

    public SectionDecorator(IDecorate subject, String title)
    {
        this.subject = subject;
        this.title = title;
    }

    @Override
    public String generateText()
    {
        return "<h1>" + title + "</h1><p>" + subject.generateText() + "</p>";
    }
}
