package guru.springframework;

/**
 * John Morris - 12/6/21
 * tdd-by-example
 **/
public  class Money {  //Remove the abstract
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    protected String currency() {
        return currency;
    }
//    public Money times(int multiplier){
//        return null;
//    }; //Removed the abstract from the method
    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && this.currency == money.currency; // AFTER
//                && this.getClass().equals(object.getClass());  //BEFORE
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    //    public Money times(int multiplier){
    //        return Money.franc(amount * multiplier);
    //    }
        public Money times(int multiplier){
            return new Money(amount * multiplier, this.currency);
        }
}
