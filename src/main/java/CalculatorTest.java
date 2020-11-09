import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  Calculator calculator;

  @Before
  public void before(){ calculator = new Calculator();}

  @Test
  public void testAdd(){ assertEquals(5, calculator.add(2, 3));}

  @Test
  public void testSubtract(){ assertEquals(5, calculator.subtract(8, 3));}

  @Test
  public void testMultiply(){ assertEquals(5, calculator.multiply(1, 5));}

  @Test
  public void testDivide(){ assertEquals(5, calculator.divide(10, 2), 0.01);}
}
