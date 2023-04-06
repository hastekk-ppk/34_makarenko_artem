import java.util.Scanner;

public class Scann{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть щільність рідини: ");
        double density = scanner.nextDouble();

        System.out.println("Введіть об'єм рідини: ");
        double volume = scanner.nextDouble();

        LiquidObject liquid = new LiquidObject("\u0412\u043e\u0434\u0430", 1000, 10, density);

        System.out.println("Маса рідини: " + liquid.getMass());
        System.out.println("Потужність тиску: " + liquid.getPressure());
    }
}
