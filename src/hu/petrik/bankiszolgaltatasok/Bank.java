package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlakListaja;

    public Bank() {
        this.szamlakListaja = new ArrayList<>();
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret){
        if (hitelKeret<0){
            HitelSzamla hitelSZ=new HitelSzamla(tulajdonos, hitelKeret);
            szamlakListaja.add(hitelSZ);
            return hitelSZ;
        } else {
            MegtakaritasSzamla megtakaritasSZ= new MegtakaritasSzamla(tulajdonos);
            szamlakListaja.add(megtakaritasSZ);
            return megtakaritasSZ;
        }
    }

    public int getOsszEgyenleg(Tulajdonos tulajdonos){
        int osszegyenleg=0;
        for (Szamla sz : szamlakListaja) {
            if (sz.getTulajdonos()==tulajdonos){
                osszegyenleg+=sz.aktualisEgyenleg;
            }
        }
        return osszegyenleg;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla legnagyobbegyenlegu=null;
        for (int i=0; i< szamlakListaja.size();i++){
            if (szamlakListaja.get(i).getTulajdonos()==tulajdonos){
                legnagyobbegyenlegu=szamlakListaja.get(i);
            }
        }
        for (Szamla szamla : szamlakListaja) {
            if (szamla.getTulajdonos()==tulajdonos && szamla.getAktualisEgyenleg()>legnagyobbegyenlegu.getAktualisEgyenleg())
                legnagyobbegyenlegu=szamla;
        }
        return legnagyobbegyenlegu;
    }

    public long getOsszHitelkeret(){
        long hitelkeretOsszeg=0;
        for (Szamla szamla : szamlakListaja) {
            if (szamla instanceof HitelSzamla){
                hitelkeretOsszeg+=((HitelSzamla) szamla).getHitelKeret();
            }
        }
        return hitelkeretOsszeg;
    }



}
