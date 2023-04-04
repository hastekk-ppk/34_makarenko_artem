package task02;

public class EnergyCalculatorTest {
    public void testCalculateTotalEnergy() {
        EnergyCalculator ec = new EnergyCalculator(10, 20, 30);
        double expected = 12050;
        double actual = ec.calculateTotalEnergy();
        Assert.assertEquals(expected, actual, 0.01);
    }
}
