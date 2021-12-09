package guru.springframework;

/**
 * John Morris - 12/7/21
 * tdd-by-example
 **/
public interface Expression {
    Money reduce(Bank bank, String to);

    public Expression plus(Expression addend);
    Expression times(int multiplier);
}
