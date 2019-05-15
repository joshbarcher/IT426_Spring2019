package sports_news;

import java.util.Map;

public interface IAthlete
{
    String getFirstName();
    String getLastName();
    String getNickName();

    Map<String, Object> getStats();
}
