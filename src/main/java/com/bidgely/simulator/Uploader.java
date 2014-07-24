package com.bidgely.simulator;

import com.bidgely.simulator.entities.LoadPattern;
import com.bidgely.simulator.entities.generated.MeterType;
import com.bidgely.simulator.entities.generated.MetersType;
import com.bidgely.simulator.entities.generated.UploadType;

import java.util.List;

/**
 * Created by mshahid on 7/24/14.
 */
public class Uploader {

   static MeterSimulator meterSimulator = new MeterSimulator();
    List<LoadPattern> loadPatterns;


    public Uploader(List<LoadPattern> loadPatterns) {
        this.loadPatterns = loadPatterns;
    }

    private UploadType generateUploadEntity() {
        UploadType upload = new UploadType();
        MetersType meters = new MetersType();
        MeterType meter = null;
        for(LoadPattern loadPattern:loadPatterns){
             meter =  meterSimulator.simulateMeter();
            meters.getMeter().add(meter);
        }
        upload.setMeters(meters);
        return upload;
    }
}


