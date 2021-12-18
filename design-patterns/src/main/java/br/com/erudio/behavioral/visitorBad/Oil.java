package br.com.erudio.behavioral.visitorBad;

public class Oil implements AtvPart {
    @Override
    public double calculateShipping() {
        return 9;
    }
}
