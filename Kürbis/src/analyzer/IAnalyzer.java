package analyzer;

import core.EnvironmentRecord;
import core.GrowthRateRecord;
import core.RecordList;

public interface IAnalyzer {

    GrowthRateRecord calculateGrowthRatio(RecordList<EnvironmentRecord> dayligthRatioList, EnvironmentRecord environmentRecord);

        String getDescription();
}
