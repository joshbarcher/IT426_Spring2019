package factory_method_pattern.ads.regions;

import factory_method_pattern.ads.entities.Advertisement;
import factory_method_pattern.ads.generation.IRegionalGenerator;

import java.util.*;

public class CaliforniaAdGenerator implements IRegionalGenerator
{
    private static final int NUM_RANDOM_ADS = 3;
    private Random random = new Random();
    private List<Advertisement> ads;
    
    public CaliforniaAdGenerator()
    {
        ads = new ArrayList<Advertisement>();
        
        ads.addAll(Arrays.asList(
            new Advertisement("Disneyland, where magic comes alive!"),
            new Advertisement("The sunny beaches of Southern California"),
            new Advertisement("Visit Yosemite!"),
            new Advertisement("Catalina Island is waiting for you!"),
            new Advertisement("Have you ever been whale watching?")));
    }
    
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        //pick two ads randomly
        Set<Advertisement> randomAds = new HashSet<>();
        
        while (randomAds.size() != NUM_RANDOM_ADS)
        {
            randomAds.add(ads.get(random.nextInt(ads.size())));
        }
        
        return Arrays.asList(randomAds.toArray(
                new Advertisement[NUM_RANDOM_ADS]));
    }
}


