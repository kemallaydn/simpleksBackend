package optimizasyon.simpleksBackend;

import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.springframework.stereotype.Service;

import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.springframework.stereotype.Service;



import org.apache.commons.math3.optim.linear.*;
import org.springframework.stereotype.Service;
import org.apache.commons.math3.optim.linear.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OptimizationService {
    public  Relationship relationship;



    public PointValuePair optimizeLinearFunction(double[] coefficients, double[][] constraints, Relationship[] relationships, double[] limits) {
        LinearObjectiveFunction objectiveFunction = new LinearObjectiveFunction(coefficients, 0);

        List<LinearConstraint> linearConstraints = new ArrayList<>();
        for (int i = 0; i < constraints.length; i++) {
            linearConstraints.add(new LinearConstraint(constraints[i], relationships[i].oppositeRelationship(), limits[i]));
        }

        SimplexSolver solver = new SimplexSolver();
        return solver.optimize(objectiveFunction, new LinearConstraintSet(linearConstraints), GoalType.MAXIMIZE);
    }
}