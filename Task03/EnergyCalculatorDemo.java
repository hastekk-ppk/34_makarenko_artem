package task02;
import java.io.*;

public class EnergyCalculatorDemo {
    public static void main(String[] args) {
        EnergyCalculator ec = new EnergyCalculator(10, 20, 30);
        System.out.println("Total energy: " + ec.calculateTotalEnergy());

        // Серіалізація
        try {
            FileOutputStream fileOut = new FileOutputStream("energyCalculator.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ec);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in energyCalculator.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Десеріалізація
        EnergyCalculator ecDeserialized = null;
        try {
            FileInputStream fileIn = new FileInputStream("energyCalculator.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ecDeserialized = (EnergyCalculator) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("EnergyCalculator class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized EnergyCalculator...");
        System.out.println("Mass: " + ecDeserialized.getMass());
        System.out.println("Velocity: " + ecDeserialized.getVelocity());
        System.out.println("Height: " + ecDeserialized.getHeight());
        System.out.println("Total energy: " + ecDeserialized.calculateTotalEnergy());
        System.out.println("Transient example: " + ecDeserialized.transientExample); // Приклад використання transient поля
    }
}
