package restauracja;

import java.util.Objects;

public class Kelnerka {
    String imie;

    public Kelnerka(String imie) {
        this.imie = imie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kelnerka kelnerka = (Kelnerka) o;
        return Objects.equals(imie, kelnerka.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
