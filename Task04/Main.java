package task02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу EnergyCalculator
        EnergyCalculator calculator = new EnergyCalculator(10, 20, 30);

        // Обчислення значення повної енергії тіла
        double totalEnergy = calculator.calculateTotalEnergy();

        // Виведення значення повної енергії тіла у двійковому вигляді
        System.out.println("Total energy in binary: " + Long.toBinaryString((long) totalEnergy));

        // Серіалізація об'єкту класу EnergyCalculator
        try {
            FileOutputStream fileOut = new FileOutputStream("calculator.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(calculator);
            out.close();
            fileOut.close();
            System.out.println("Calculator object is serialized.");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Десеріалізація об'єкту класу EnergyCalculator
        EnergyCalculator deserializedCalculator = null;
        try {
            FileInputStream fileIn = new FileInputStream("calculator.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedCalculator = (EnergyCalculator) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Calculator object is deserialized.");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Calculator class not found.");
            c.printStackTrace();
            return;
        }

        // Використання десеріалізованого об'єкту класу EnergyCalculator
        double deserializedTotalEnergy = deserializedCalculator.calculateTotalEnergy();
        System.out.println("Deserialized total energy: " + deserializedTotalEnergy);

        // Демонстрація використання transient полів

        // Тестування коректності результатів обчислень та серіалізації/десеріалізації
        if (totalEnergy == deserializedTotalEnergy) {
            System.out.println("Calculations and serialization/deserialization were successful.");
        } else {
            System.out.println("Error: calculations or serialization/deserialization failed.");
        }
    }

    private static class Stringa {

        public Stringa() {
        }
    }
}
