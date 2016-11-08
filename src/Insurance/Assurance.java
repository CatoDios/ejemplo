
package Insurance;

public abstract class Assurance {
    private int policy;
    private String name;
    private float premium;
    private double commission;
    private double coverage;
    
    public Assurance(int policy, String name, float commision) {

    this.policy = policy;
    this.name = name;
    this.premium = 0;
    this.commission = commision;
    this.coverage = 0;

    }//fin Constructor

    public int getPolicy() {
        return policy;
    }

    public void setPolicy(int policy) {
        this.policy = policy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPremium() {
        return premium;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
    
    public abstract void calculatePremium();
    
    public abstract void calculateCoverage();
}
