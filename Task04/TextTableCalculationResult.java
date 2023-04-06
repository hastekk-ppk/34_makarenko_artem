
import java.util.Map;

public class TextTableCalculationResult implements CalculationResult {
    private double result;
    private Map<String, String> parameter;
    private final int parameters;

    public TextTableCalculationResult(double result, int parameters) {
        this.result = result;
        this.parameters = parameters;
    }

    public String getResultText() {
        // реалізація методу для відображення результатів у вигляді текстової таблиці
        // використовуючи передані параметри
        return null;
        // реалізація методу для відображення результатів у вигляді текстової таблиці
        // використовуючи передані параметри
    }
}
