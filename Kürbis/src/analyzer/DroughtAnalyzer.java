package analyzer;

import core.EnvironmentRecord;
import core.GrowthRateRecord;
import core.RecordList;

public class DroughtAnalyzer implements IAnalyzer {
    @Override
    public GrowthRateRecord calculateGrowthRatio(RecordList<EnvironmentRecord> dayligthRatioList, EnvironmentRecord environmentRecord) {
        return null;
    }

    @Override
    public String getDescription() {
        return "E3"; //Effekt 3
    }
}
