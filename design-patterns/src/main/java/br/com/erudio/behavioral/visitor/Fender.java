package br.com.erudio.behavioral.visitor;

public class Fender implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
