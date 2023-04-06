
import java.io.Serializable;

public abstract class PhysicalObject implements Serializable {
    protected double mass;
    protected double volume;

    public PhysicalObject(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public abstract String getType();

    public double getDensity() {
        return mass / volume;
    }

    @Override
    public String toString() {
        return getType() + ": mass = " + mass + " kg, volume = " + volume + " m^3, density = " + getDensity() + " kg/m^3";
    }
}
