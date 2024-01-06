package optimizasyon.simpleksBackend;

import org.apache.commons.math3.optim.PointValuePair;

public class Optimum {

    private final double[] values;
    private final double maximum;

    public Optimum(PointValuePair result, int numVariables) {
        this.values = result.getPoint();
        this.maximum = -result.getValue(); // Sonucu eksi alarak maksimizasyon sonucunu bulun

        // Log the values of each variable
        System.out.println("Optimal Values:");
        for (int i = 0; i < numVariables; i++) {
            System.out.println("x" + (i + 1) + ": " + values[i]);
        }
        System.out.println("Maximum Z: " + maximum);
    }

    // Getter methods...
}
