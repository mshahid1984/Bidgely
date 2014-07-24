package com.bidgely.simulator;

import com.bidgely.simulator.entities.LoadPattern;

import java.util.List;

/**
 * Created by mshahid on 7/24/14.
 */
public class Sender {

    List<LoadPattern> loadPatterns;

    Uploader uploader;

    public Sender(Uploader uploader) {
        this.uploader = uploader;
        loadPatterns = getLoadPatternsFromConfig();
    }
    //This will call uploader to get the data and will process it.
    public static void main(){

    }

    /**
     * This method creates load patterns from configuration
     * @return LoadPatterList
     */
    private List<LoadPattern> getLoadPatternsFromConfig() {
        return null;
    }


}
