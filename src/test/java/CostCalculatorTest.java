import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class CostCalculatorTest {
    private CostCalculator calc;

    @Before
    public void setUp(){
        calc = new CostCalculator(new BigDecimal(4));
    }

    @Test
    public void simpleCalcTest(){
        assertEquals(new BigDecimal(8), calc.calculate(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcConstructTest(){
        new CostCalculator(new BigDecimal(-2));
    }
}
