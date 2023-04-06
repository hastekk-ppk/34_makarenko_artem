public class SolidObject extends PhysicalObject {
    private double density;

    public SolidObject(double mass, double volume) {
        super(mass, volume);
    }


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return super.toString() + ", Density: " + density + " kg/m^3";
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
