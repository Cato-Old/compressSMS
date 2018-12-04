import java.math.BigDecimal;

public class CostCalculator {
    private final BigDecimal UNIT_PRICE;

    CostCalculator(BigDecimal unitPrice){
        if (unitPrice.scale() <= 2 && unitPrice.doubleValue() >= 0) {
            UNIT_PRICE = unitPrice;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public BigDecimal calculate(int lenght){
        return UNIT_PRICE.multiply(new BigDecimal(lenght));
    }
}