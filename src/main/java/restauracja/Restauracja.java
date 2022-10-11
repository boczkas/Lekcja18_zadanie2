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
        return 0;
    }

    public double pobierzDochodKelnerki(String imie) {
        return 0;
    }
}
