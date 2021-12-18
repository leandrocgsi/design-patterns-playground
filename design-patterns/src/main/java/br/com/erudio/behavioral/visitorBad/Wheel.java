package br.com.erudio.behavioral.visitorBad;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
