package helpingfile;
class AdvancedCalculator extends BasicCalculator {

  public double power(double base, double exponent) {
    return Math.pow(base, exponent);
  }

  public double squareRoot(double number) {
    if (number < 0) {
      System.out.println("Error: Cannot calculate square root of a negative number!");
      return Double.NaN;
    }
    return Math.sqrt(number);
  }
}