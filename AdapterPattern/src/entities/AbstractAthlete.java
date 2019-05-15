package entities;

public abstract class AbstractAthlete
{
    private Sport sport;

    public AbstractAthlete(Sport sport)
    {
        this.sport = sport;
    }

    public Sport getSport()
    {
        return sport;
    }

    public abstract void addStat(String title, Object value);

    public enum Sport
    {
        BASEBALL,
        TENNIS,
        SOCCER,
        FOOTBALL,
        BASKETBALL,
        GOLF
    }
}
