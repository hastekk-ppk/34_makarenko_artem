public class LiquidObject extends PhysicalObject implements Calculatable {

    private double volume;
    private double density;

    public LiquidObject(double volume, int par, int par1, double volume1) {
        super(name);
        this.volume = volume;
        this.density = density;
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
            @Override
            public String getResultText() {
                return "Name: " + getName() + "\nType: Liquid\nVolume: " + volume + " liters\nDensity: " + density + " kg/l\nMass: " + calculateMass() + " kg\nDensity: " + calculateDensity() + " kg/l";
            }

            private String getName() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calculate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPressure() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
