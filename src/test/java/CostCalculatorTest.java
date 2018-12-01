import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

@RunWith(JUnitParamsRunner.class)
public class CostCalculatorTest {

    @Test
    @Parameters(method="calcValues")
    public void calcConstructTest(BigDecimal unitPrice, int num, BigDecimal exp){
        CostCalculator calc = new CostCalculator(unitPrice);
        assertEquals(exp,calc.calculate(num));

    }

    private Object[] calcValues(){
        return new Object[]{
                new Object[]{new BigDecimal(0), 20, new BigDecimal(0)},
                new Object[]{new BigDecimal(0.3), 20, new BigDecimal(6)},
                new Object[]{new BigDecimal(0.3), 0, new BigDecimal(0)}};
    }
}
