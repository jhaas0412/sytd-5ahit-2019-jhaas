package analyzer;

import core.EnvironmentRecord;
import core.GrowthRateRecord;
import core.RecordList;

import java.util.List;

public class AridityAnalyzer implements IAnalyzer {

    private IAnalyzer analyzer;

    @Override
    public GrowthRateRecord calculateGrowthRatio(RecordList<EnvironmentRecord> dayligthRatioList, EnvironmentRecord record) {
        GrowthRateRecord growthRateRecord= analyzer.calculateGrowthRatio(dayligthRatioList, record);
        int growthAmount = growthRateRecord.getGrowthRate();

        List<EnvironmentRecord> subRecordList = dayligthRatioList.precedingRecordSublist(record, 5);

        GrowthRateRecord growthRecord= new GrowthRateRecord();
        growthRecord.setGrowthRate(growthAmount);
        growthRecord.addEffectDescription(getDescription(());
        //jetzt checken ob der regen in der letzten 5 tagen grö0er als 20 is und dann growthRecord returnen
        return null;
    }

    @Override
    public String getDescription() {
        return "E2";
    }
}
