package optimizasyon.simpleksBackend;
import org.apache.commons.math3.optim.linear.Relationship;
public class OptimizationRequest {
    private double[] coefficients;
    private double[][] constraints;
    private Relationship[] relationships;
    private double[] limits;

    // Getter and setter methods...

    public double[] getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double[][] getConstraints() {
        return constraints;
    }

    public void setConstraints(double[][] constraints) {
        this.constraints = constraints;
    }

    public Relationship[] getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationship[] relationships) {
        this.relationships = relationships;
    }

    public double[] getLimits() {
        return limits;
    }

    public void setLimits(double[] limits) {
        this.limits = limits;
    }
}

