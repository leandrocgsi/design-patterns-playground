package br.com.erudio.factory;

public class PointFactory {
	
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}
}