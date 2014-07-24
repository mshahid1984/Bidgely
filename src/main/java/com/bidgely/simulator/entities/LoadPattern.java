package com.bidgely.simulator.entities;

import java.util.List;
import java.util.Map;

/**
 * Created by mshahid on 7/24/14.
 */
public class LoadPattern {

    String PropertyType;
    Map<String,Range> applianceUsage;

    class Range{
        int start;
        int end;

    }
}