package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasSzamla extends Szamla {

    private double kamat;
    public double alapKamat;

    public MegtakaritasSzamla(Tulajdonos tulajdonos, double kamat, double alapKamat) {
        super(tulajdonos);
        this.kamat = kamat;
        this.alapKamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void kamatJovairas(){
        aktualisEgyenleg*=kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if(aktualisEgyenleg-osszeg<0){
            return false;
        }
        else{
            aktualisEgyenleg-=osszeg;
            return true;
        }
    }
}
