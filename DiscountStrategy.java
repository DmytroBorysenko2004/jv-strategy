package core.basesyntax;
import core.basesyntax.strategy.impl.*;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy  {
    public static DiscountService getDiscountServiceBySpecialEvent(String specialEvent){
        switch (specialEvent){
            case "New Year":
                return  new NewYearDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "Default":
            default:
                return new DefaultDiscountService();
        }
    }
}
