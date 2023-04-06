package task02;

// клас, що представляє результат обчислень
interface CalculationResult {
    // метод для отримання текстового представлення результату
    String getResultText();
}

// базовий клас для фабрик результатів
abstract class ResultFactory {
    // абстрактний метод для створення результату обчислень
    abstract CalculationResult createResult(double result);
}

// фабрика результатів з таблицею з двома колонками
class TwoColumnTableResultFactory extends ResultFactory {
    private int columnWidth;

    // конструктор з параметром ширини колонок таблиці
    public TwoColumnTableResultFactory(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    // метод для створення результату з таблицею з двома колонками
    public CalculationResult createResult(double result) {
        return new CalculationResult() {
            public String getResultText() {
                String leftColumn = "Result:";
                String rightColumn = String.format("%" + columnWidth + "f", result);
                String separator = String.format("%" + columnWidth + "s", "").replace(' ', '-');
                return leftColumn + separator + rightColumn;
            }
        };
    }
}

// фабрика результатів з таблицею з трьома колонками
class ThreeColumnTableResultFactory extends ResultFactory {
    private int columnWidth;

    // конструктор з параметром ширини колонок таблиці
    public ThreeColumnTableResultFactory(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    // метод для створення результату з таблицею з трьома колонками
    public CalculationResult createResult(double result) {
        return new CalculationResult() {
            public String getResultText() {
                String leftColumn = "Result:";
                String middleColumn = String.format("%" + columnWidth + "s", "").replace(' ', '-');
                String rightColumn = String.format("%" + columnWidth + "f", result);
                String separator = String.format("%" + columnWidth + "s", "").replace(' ', '-');
                return leftColumn + separator + middleColumn + separator + rightColumn;
            }
        };
    }
}

// клас, що виконує обчислення і виводить результат з використанням фабрики результатів
class Calculator {
    private ResultFactory resultFactory;

    // конструктор з параметром фабрики результатів
    public Calculator(ResultFactory resultFactory) {
        this.resultFactory = resultFactory;
    }

    // метод для обчислення і виводу результату
    public void calculate(double a, double b) {
        double result = a + b;
        CalculationResult calculationResult = resultFactory.createResult(result);
        System.out.println(calculationResult.getResultText());
    }
}
