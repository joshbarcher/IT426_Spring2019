package factory_method_pattern.ads.regions;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.IRegionalGenerator;

import java.util.Arrays;
import java.util.List;

public class WashingtonAdGenerator implements IRegionalGenerator
{
    private Advertisement[] adChoices = {
            new Advertisement("Come visit Mt. Rainier"),
            new Advertisement("Order an Eggnog latte from Starbucks"),
            new Advertisement("Seattle skyline view!")};

    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return Arrays.asList(adChoices);
    }
}

