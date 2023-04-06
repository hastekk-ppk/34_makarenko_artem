import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        // Створюємо об'єкти класів-нащадків Calculatable
        try (Scanner scanner = new Scanner(System.in)) {
            // Створюємо об'єкти класів-нащадків Calculatable
            Summation sum = new Summation();
            Product product = new Product();
            
            // Викликаємо методи з різними параметрами
            System.out.print("Enter two numbers to sum: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum.calculate(num1, num2));
            
            System.out.print("Enter three numbers to multiply: ");
            double num3 = scanner.nextDouble();
            double num4 = scanner.nextDouble();
            double num5 = scanner.nextDouble();
            System.out.println("Product of " + num3 + ", " + num4 + " and " + num5 + " is " + product.calculate(num3, num4, num5));
            
            // Створюємо об'єкт класу-нащадка з фабричним методом
            CalculationFactory factory = new CalculationFactory();
            Calculation average = factory.createCalculation("AVERAGE");
            
            // Викликаємо методи з різними параметрами
            System.out.print("Enter two numbers to calculate their average: ");
            double num6 = scanner.nextDouble();
            double num7 = scanner.nextDouble();
            System.out.println("Average of " + num6 + " and " + num7 + " is " + average.calculate(num6, num7));
            
            System.out.print("Enter three numbers to calculate their average: ");
            double num8 = scanner.nextDouble();
            double num9 = scanner.nextDouble();
            double num10 = scanner.nextDouble();
            System.out.println("Average of " + num8 + ", " + num9 + " and " + num10 + " is " + average.calculate(num8, num9, num10));
        }
    }

    private static class CalculationFactory {

        public CalculationFactory() {
        }

        private Calculation createCalculation(String average) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



    }
}
