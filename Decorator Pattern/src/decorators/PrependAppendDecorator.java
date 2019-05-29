package decorators;

public class PrependAppendDecorator implements IDecorate
{
    private IDecorate subject;
    private String before;
    private String after;

    public PrependAppendDecorator(IDecorate subject, String before, String after)
    {
        this.subject = subject;
        this.before = before;
        this.after = after;
    }

    @Override
    public String generateText()
    {
        return before + subject.generateText() + after;
    }
}
