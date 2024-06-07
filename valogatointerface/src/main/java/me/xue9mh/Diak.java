package me.xue9mh;

public class Diak extends Szemely implements Valogato{
    int puskakSzama;

    public Diak(String nev, int eletkor, int puskakSzama) {
        super(nev, eletkor);
        this.puskakSzama = puskakSzama;
    }


    @Override
    public boolean joAlanyE() {
        return puskakSzama == 0;
    }

    @Override
    public String toString() {
        return "Diak{" +
                "puskakSzama= " + puskakSzama +
                " " + super.toString() +
                '}';
    }
}
