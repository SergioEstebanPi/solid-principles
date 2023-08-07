package dip;

public class ShoppingMall {

    //private DebitCard debitCard;
    private BankCard bankCard;

    /*
    public ShoppingMall (DebitCard debitCard) {
        this.debitCard = debitCard;
    }
    */

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    /*
    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }
    */

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        /*
        DebitCard debitCard1 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard1);
        shoppingMall.doPurchaseSomething(5000);
        */

        BankCard bankCard1 = new DebitCard();
        //BankCard bankCard1 = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchaseSomething(5000);
    }
}
