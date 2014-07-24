package com.bidgely.simulator;

import java.util.Map;

/**
 * Created by mshahid on 7/15/14.
 */
public class CachedApplianceRating {

    private static CachedApplianceRating _instance;

    private CachedApplianceRating(){

        //TODO: populate the map from resource

    }

    Map<String,Integer> applianceRatingMap;

    public static CachedApplianceRating getInstance(){


        if(_instance ==null){
            synchronized (_instance){
                if(_instance ==null){
                    _instance  = new CachedApplianceRating();
                }
            }
        }
        return _instance;

    }


}
