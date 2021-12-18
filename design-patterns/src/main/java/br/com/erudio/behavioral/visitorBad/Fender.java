package br.com.erudio.behavioral.visitorBad;

public class Fender implements AtvPart{
    @Override
    public double calculateShipping() {
        return 3;
    }
}
