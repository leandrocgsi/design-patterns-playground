package br.com.erudio.structural.bridge.shape1;

public class Shape1BridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        circle.applyColor();
        square.applyColor();
    }
}
