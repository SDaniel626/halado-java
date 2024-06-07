package me.xue9mh;

public class Tanar extends Szemely implements Valogato{
    private double vizsgajegyekAtlaga;

    public Tanar(String nev, int eletkor, double vizsgajegyekAtlaga) {
        super(nev, eletkor);
        this.vizsgajegyekAtlaga = vizsgajegyekAtlaga;
    }


    @Override
    public boolean joAlanyE() {
        return ( (this.vizsgajegyekAtlaga > 4) && (this.getEletkor() < 30) );
    }

    @Override
    public String toString() {
        return "Tanar{" +
                "vizsgajegyekAtlaga= " + vizsgajegyekAtlaga +
                " " + super.toString() +
                '}';
    }
}
