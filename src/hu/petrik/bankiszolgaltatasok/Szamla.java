package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas{
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public Szamla(Tulajdonos tulajdonos, int aktualisEgyenleg) {
        super(tulajdonos);
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public Kartya ujKartya(String kartyaszam) {
        Kartya kartya1 = new Kartya(this.getTulajdonos(), this, kartyaszam);
        return kartya1;
    }
}
