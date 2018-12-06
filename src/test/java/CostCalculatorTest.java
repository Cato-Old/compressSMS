import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import java.math.BigDecimal;

@RunWith(JUnitParamsRunner.class)
public class CostCalculatorTest {

    @Test
    @Parameters(method = "calcValues")
    public void calcValuesTest(BigDecimal unitPrice, int num, BigDecimal exp){
        CostCalculator calc = new CostCalculator(unitPrice);
        assertEquals(exp,calc.calculate(num));

    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "calcConstruct")
    public void calcConstructTest(BigDecimal unitPrice){
        new CostCalculator(unitPrice);
    }

    private Object[] calcValues(){
        return new Object[]{
                new Object[]{new BigDecimal("0.00"), 20, new BigDecimal("0.00")},
                new Object[]{new BigDecimal("0.30"), 20, new BigDecimal("6.00")},
                new Object[]{new BigDecimal("0.30"),  0, new BigDecimal("0.00")}};
    }

    private Object[] calcConstruct(){
        return new Object[]{
                new BigDecimal(-1),
                new BigDecimal(1.001)
        };
    }
}
