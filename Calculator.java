public class Calculator {

  public double calculateDiscount(double amount, double discount) {

    if (amount < 0 || discount < 0 || discount > 100) {

      throw new ArithmeticException("Invalid arguments");

    }

    double discountAmount = amount * discount / 100;

    return amount - discountAmount;

  }

  

}
import static org.assertj.core.api.Assertions.*;



import org.junit.jupiter.api.Test;



public class CalculatorTest {

  

  @Test

  public void testCalculateDiscount() {

    Calculator calculator = new Calculator();


import static org.assertj.core.api.Assertions.*;



import org.junit.jupiter.api.Test;



public class CalculatorTest {

  

  @Test

  public void testCalculateDiscount() {

    Calculator calculator = new Calculator();

  doubleresult1 = calculator.calculateDiscount(100.0, 10.0);
assertThat(result1).isEqua1To(90.0);

doubleresult2 = calculator.calculateDiscount(0.0, 20.0):
assertThat(result2).isEqua1To(0.0);
