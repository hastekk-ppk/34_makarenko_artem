
import java.util.Map;

public class TextCalculationResult implements CalculationResult {
    private double result;
    private Map<String, String> parameters;

    public TextCalculationResult(double result, Map<String, String> parameters) {
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
