public class TextTableCalculationResultFactory implements CalculationResultFactory {
    private int columns;

    public TextTableCalculationResultFactory(int columns) {
        this.columns = columns;
    }

    public CalculationResult createCalculationResult(double result) {
        return new TextTableCalculationResult(result, columns);
    }
}
