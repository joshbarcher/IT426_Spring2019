package factory_method_pattern.ads.regions;

import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;

public class WashingtonAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getRegionalGenerator()
    {
        return new WashingtonAdGenerator();
    }
}

