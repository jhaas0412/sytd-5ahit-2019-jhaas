package analyzer;

import core.EnvironmentRecord;
import core.GrowthRateRecord;
import core.RecordList;

public class SnailInfestationAnalyzer implements IAnalyzer {

    private IAnalyzer analyzer;

    @Override
    public GrowthRateRecord calculateGrowthRatio(RecordList<EnvironmentRecord> dayligthRatioList, EnvironmentRecord environmentRecord) {
        return null;
    }

    @Override
    public String getDescription() {
        return "E5";
    }
}
