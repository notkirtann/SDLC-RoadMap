package helpingfile;
public class AdvancedProgrammerCalculator extends AdvancedCalculator {
    public String toBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
    public String toHex(int decimalNumber) {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }
}