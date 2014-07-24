package com.bidgely.simulator;

import com.bidgely.simulator.entities.LoadPattern;
import com.bidgely.simulator.entities.generated.*;

/**
 * Created by mshahid on 7/15/14.
 */
public class MeterSimulator {

    CachedApplianceRating applianceRating = CachedApplianceRating.getInstance();
    LoadPattern loadPattern;


    public MeterType simulateMeter(){
        MeterType meter = new MeterType();
        StreamsType streams = getStreams(loadPattern);
        meter.setStreams(streams);
        return meter;
    }

    private StreamsType getStreams(LoadPattern loadPattern) {

        StreamsType streams = new StreamsType();
        //currently only simulating singe CurrentSummationDelivered stream
        //Generating Stream for 120 seconds for the given load pattern
        StreamType streamType = generateDataStream(120,loadPattern);
        streams.getStream().add(streamType);
        return streams;
    }


    private StreamType generateDataStream(int duration, LoadPattern loadPattern ){

        //Pick numberOfAppliance depending on loadPattern from the applianceRating Map

        //For each appliance multiply the powerRating with the interval;

        // Aggregate the appliances
        return null;

    }

    private StreamType generateDataStream(int duration,LoadPattern loadPattern , int dataFeedInterval){

        //Pick numberOfAppliance randomly from the applianceRating Map

        //For each appliance multiply the powerRating with the interval;

        // Aggregate the appliances
        return null;

    }
}
