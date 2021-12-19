package br.com.erudio.pen;

import br.com.erudio.BrushSize;
import br.com.erudio.Pen;

public class ThinPen implements Pen {

	final BrushSize brushSize = BrushSize.THIN;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing THIN content in color : " + color);
	}
}