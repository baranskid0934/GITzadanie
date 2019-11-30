package com.company;

public class Trójkąt implements Figura{
    private double wysokosc;
    private double podstawa;
    private double bok;


    public Trójkąt(double wysokosc, double podstawa, double bok) {
        this.wysokosc = wysokosc;
        this.podstawa = podstawa;
        this.bok = bok;
    }

    @Override
    public double obliczObwod() {
        double obwod = 2*this.bok + this.podstawa;
        return obwod;
    }


    @Override
    public double obliczPole() {
        double pole = (this.podstawa*this.wysokosc) /2;
        return pole;
    }
}
