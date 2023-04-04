public class SolidObject extends PhysicalObject {
    private double density;

    public SolidObject(String name, double mass, double volume, double density) {
        super(name, mass, volume);
        this.density = density;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
