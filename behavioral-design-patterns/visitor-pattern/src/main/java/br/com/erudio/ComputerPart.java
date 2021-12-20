package br.com.erudio;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}