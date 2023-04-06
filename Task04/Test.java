
import java.awt.Container;

public class Test {
    public static void main(String[] args) {
        // Створюємо об'єкт контейнера з параметрами
        Container container = newContainer("Контейнер 1", 10, 5, 2);
        
        // Створюємо об'єкт рідини з параметрами
        LiquidObject liquid = new LiquidObject("Вода", 1000, 10, 0.1);
        String volume = null;
        
        // Розраховуємо об'єм рідини в контейнері

        // Виводимо результат
        System.out.println("Об'єм рідини в контейнері: " + volume + " л");
    }

    private static Container newContainer(String контейнер_1, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
