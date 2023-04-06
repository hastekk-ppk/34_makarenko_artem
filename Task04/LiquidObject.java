public class LiquidObject extends PhysicalObject implements Calculatable {

    private double volume;
    private double density;

    public LiquidObject(String вода, int volume, int par1, double mass) {
        super(mass, volume);
    }




    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double calculateMass() {
        return volume * density;
    }

    public double calculateDensity() {
        return density;
    }

    public CalculationResult createResult() {
        return new CalculationResult() {
            public String getResultText() {
                return "Name: " + getName() + "\nType: Liquid\nVolume: " + volume + " liters\nDensity: " + density + " kg/l\nMass: " + calculateMass() + " kg\nDensity: " + calculateDensity() + " kg/l";
            }

            private String getName() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void calculate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getPressure() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    double getWeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
