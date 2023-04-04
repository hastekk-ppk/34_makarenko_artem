
import java.awt.Container;

public class Test {
    public static void main(String[] args) {
        // Створюємо об'єкт контейнера з параметрами
        Container container = new Container("Контейнер 1", 10, 5, 2);
        
        // Створюємо об'єкт рідини з параметрами
        LiquidObject liquid = new LiquidObject("Вода", 1000, 10, 0.1);
        
        // Розраховуємо об'єм рідини в контейнері
        double volume = container.calculateVolume(liquid);
        
        // Виводимо результат
        System.out.println("Об'єм рідини в контейнері: " + volume + " л");
    }
}
