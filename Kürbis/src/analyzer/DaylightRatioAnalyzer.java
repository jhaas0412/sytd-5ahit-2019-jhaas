package analyzer;

import core.EnvironmentRecord;
import core.GrowthRateRecord;
import core.RecordList;

public class DaylightRatioAnalyzer implements IAnalyzer {
 //Basisklasse für die Dekoratoren

    @Override
    public GrowthRateRecord calculateGrowthRatio(RecordList<EnvironmentRecord> dayligthRatioList, EnvironmentRecord environmentRecord) {
        return null;

    }

    public String getDescription() {
        return "Basisklasse E1";
    }
}
