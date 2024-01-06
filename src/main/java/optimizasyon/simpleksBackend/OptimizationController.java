package optimizasyon.simpleksBackend;

import org.apache.commons.math3.optim.PointValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptimizationController {

    private final OptimizationService optimizationService;

    @Autowired
    public OptimizationController(OptimizationService optimizationService) {
        this.optimizationService = optimizationService;
    }


    @PostMapping("/optimize")
    public PointValuePair optimize(@RequestBody OptimizationRequest request) {

        return optimizationService.optimizeLinearFunction(request.getCoefficients(),request.getConstraints(),request.getRelationships(),request.getLimits());
    }
}
