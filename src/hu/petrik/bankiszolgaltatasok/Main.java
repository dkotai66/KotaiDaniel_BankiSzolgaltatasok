package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos tulaj1 = new Tulajdonos("Pepsi Béla");
        Tulajdonos tulaj2=new Tulajdonos("CocaCola Béla");

        Bank bank=new Bank();
        bank.szamlaNyitas(tulaj1, 500).befizet(1800);
        bank.szamlaNyitas(tulaj2,3000).kivesz(1200);
        System.out.println(bank.getOsszHitelkeret());
        System.out.println(bank.getOsszEgyenleg(tulaj2));
    }
}
