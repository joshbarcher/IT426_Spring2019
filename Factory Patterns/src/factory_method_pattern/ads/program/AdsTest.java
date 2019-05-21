package factory_method_pattern.ads.program;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.AdGenerator;
import factory_method_pattern.ads.regions.WashingtonAds;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator adgenerator = new WashingtonAds();
        
        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }
    }
}



