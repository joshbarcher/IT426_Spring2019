package sports_news;

import java.util.Map;

public class SportsNews
{
    private String getStatSheet(IAthlete athlete)
    {
        StringBuilder builder = new StringBuilder();
        Map<String, Object> stats = athlete.getStats();

        //name
        builder.append("Stats for - ");
        builder.append(athlete.getFirstName());
        builder.append(" ");
        builder.append(athlete.getLastName());
        builder.append(" (");
        builder.append(athlete.getNickName());
        builder.append(")\n");

        //stats
        for (String stat : stats.keySet())
        {
            Object value = stats.get(stat);

            builder.append(stat);
            builder.append(": ");
            builder.append(value);
            builder.append("\n");
        }

        return builder.toString();
    }
}
