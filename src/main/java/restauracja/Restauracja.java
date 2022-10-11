package restauracja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restauracja {
    Map<Kelnerka, List<Stolik>> kelnerkiZeStolikami;

    public Restauracja() {
        this.kelnerkiZeStolikami = new HashMap<>();
    }

    public void dodajStolikDoKelnerki(Kelnerka kelnerka, Stolik stolik) {
        if (!this.kelnerkiZeStolikami.containsKey(kelnerka)) {
            this.kelnerkiZeStolikami.put(kelnerka, new ArrayList<>());
        }

        this.kelnerkiZeStolikami.get(kelnerka).add(stolik);
    }

    public double pobierzCalkowityDochod(){
        double calkowityDochod = 0;

        for(List<Stolik> stoliki : kelnerkiZeStolikami.values()) {
            for (Stolik stolik : stoliki) {
                calkowityDochod += stolik.cenaZamowien;
            }
        }

        return calkowityDochod;
    }

    public double pobierzDochodKelnerki(String imie) {
        double dochod = 0;

        List<Stolik> stolikiKelnerki = this.kelnerkiZeStolikami.get(new Kelnerka(imie));

        for (Stolik stolik : stolikiKelnerki) {
            dochod += stolik.cenaZamowien;
        }

        return dochod;
    }
}
