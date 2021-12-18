package br.com.erudio.structural.bridge.shape2;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void applyColor(){
        color.applyColor();
    }
}
