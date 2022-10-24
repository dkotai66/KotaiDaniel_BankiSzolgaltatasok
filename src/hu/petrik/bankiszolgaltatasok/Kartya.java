package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas {
    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);
        this.szamla= this.szamla;
        this.kartyaSzam=kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg){
        if (szamla.aktualisEgyenleg-osszeg<0){
            return false;
        }
        else{
            szamla.aktualisEgyenleg-=osszeg;
            return true;
        }
    }

}
