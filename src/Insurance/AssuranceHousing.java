
package Insurance;

public class AssuranceHousing extends Assurance{
    private String location;
    private double valueLand;
    private float percentage;
    
    public AssuranceHousing(int policy, String name, float commision,String location, double valueLand, float percentage) {
        
        super(policy, name, commision);
        this.location = location;
        this.valueLand = valueLand;
        this.percentage = percentage;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getValueLand() {
        return valueLand;
    }

    public void setValueLand(double valueLand) {
        this.valueLand = valueLand;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public void calculatePremium() {
        if( getPercentage() == 100 )
            setPremium( (float)(getValueLand() * 0.05) );
        else
            setPremium( (float)( getValueLand() * ((getPercentage() * 0.05)/100) ));
    }

    public void calculateCoverage() {
        if( getPercentage() == 100 )
            setCoverage( getValueLand() );
        else
            setCoverage( getValueLand() * (getPercentage()/100) );
    }
}
