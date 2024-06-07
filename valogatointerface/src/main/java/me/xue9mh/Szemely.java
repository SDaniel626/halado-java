package me.xue9mh;

public class Szemely {
    private String nev;
    private int eletkor;

    public Szemely(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    @Override
    public String toString() {
        return "Szemely{" +
                "nev= '" + nev + '\'' +
                ", age= " + eletkor +
                '}';
    }
}
