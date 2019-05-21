package factory_method_pattern.ads.generation;

import factory_method_pattern.ads.entities.Advertisement;

import java.util.List;

public interface IRegionalGenerator
{
    public List<Advertisement> getAppropriateAds();
}


