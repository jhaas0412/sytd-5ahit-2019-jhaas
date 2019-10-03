package core;

public class GrowthRateRecord {

    private final StringBuilder effectDescription = new StringBuilder();

    public void addEffectDescription(String description)
    {
        if (effectDescription.length()>0)
        {
            effectDescription.append("\n");
        }

        effectDescription.append(description);
    }

    public String getEffectDescription()
    {
        return effectDescription.toString();
    }
}
