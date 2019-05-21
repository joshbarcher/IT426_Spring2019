package factory_method_pattern.ads.regions;

import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.generation.IRegionalGenerator;

public class CaliforniaAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getRegionalGenerator()
    {
        return new CaliforniaAdGenerator();
    }
}


