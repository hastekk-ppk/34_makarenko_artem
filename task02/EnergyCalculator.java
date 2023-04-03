package task02;
import java.io.Serializable;

public class EnergyCalculator implements Serializable {
    private double mass;
    private double velocity;
    private double height;
    transient String transientExample; // Приклад поля з модифікатором transient

    public EnergyCalculator(double mass, double velocity, double height) {
        this.mass = mass;
        this.velocity = velocity;
        this.height = height;
        transientExample = "Це приклад transient поля";
    }

    public double calculateTotalEnergy() {
        double potentialEnergy = mass * Constants.GRAVITATIONAL_ACCELERATION * height;
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return potentialEnergy + kineticEnergy;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void setTransientExample(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTransientExample() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}