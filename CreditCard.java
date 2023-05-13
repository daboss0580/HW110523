package HW110523;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    int balance = 3000;
    double interestRatePerYear=0.035;
    void interest()
    {
        System.out.println(balance*interestRatePerYear);
    }
    static class Visa extends CreditCard{

    }
    static class AX extends CreditCard{
        @Override
        void interest() {
            super.interest();
            System.out.println(balance*interestRatePerYear*1.02);
        }
    }
}

class CreditCardTester{
    public static void main(String[] args) {

        CreditCard.Visa visa=new CreditCard.Visa();
        CreditCard.AX ax=new CreditCard.AX();
        visa.interest();
        ax.interest();
    }
}
