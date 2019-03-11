import CreditCards.BronzeCreditCard;
import CreditCards.CreditCard;
import CreditCards.GoldCreditCard;
import CreditCards.SilverCreditCard;
import Offers.GasOfferVisitor;
import Offers.HotelOfferVisitor;
import Offers.OfferVisitor;

public class Runner {

    public static void main(String[] args){
        OfferVisitor visitor = new HotelOfferVisitor();
OfferVisitor visitor2 = new GasOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();

        bronze.accept(visitor);
        silver.accept(visitor);
        gold.accept(visitor);

        System.out.println("*******************");

        bronze.accept(visitor2);
        silver.accept(visitor2);
        gold.accept(visitor2);

    }
}
