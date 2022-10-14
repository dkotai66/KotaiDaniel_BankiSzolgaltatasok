package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasSzamla extends Szamla {

    private double kamat;
    public double alapKamat;

    public MegtakaritasSzamla(Tulajdonos tulajdonos, double kamat, double alapKamat) {
        super(tulajdonos);
        this.kamat = kamat;
        this.alapKamat = alapKamat;
    }




    @Override
    public boolean kivesz(int osszeg) {
        return false;
    }
}
