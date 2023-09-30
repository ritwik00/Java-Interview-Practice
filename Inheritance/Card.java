
public class Card {
	long cardNumber;
	int cvv;
	String name,expDate;
	double balance;
	void swipe() {
		System.out.println("swipe the card");
	}
}


class CreditCard extends Card{
	int creditLimit;
	void payBill() {
		System.out.println("pay credit card bill");
	}
}

class DebitCard extends Card{
	int balance;
}

class Test{
	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
        DebitCard dd = new DebitCard();
        Card a = new Card();
        a.name="ritam";
        dd.balance=123344;
		cc.balance= 15855;
		cc.creditLimit=1000;
		cc.balance = 5000;
		cc.name="ritwik";
		cc.expDate="12/22";
		cc.cvv=1234;
		cc.cardNumber=45896576876165446L;
		cc.swipe();
		cc.payBill();
        System.out.println(cc.name);
        System.out.println(dd.balance);
        System.out.println(dd.name);
        System.out.println(a.name);
	}
}