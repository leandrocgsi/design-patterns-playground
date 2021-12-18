package br.com.erudio.factory;

public class FactoryDemo {
	
	public static void main(String[] args) {
		Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
		Point origin = Point.ORIGIN;

		Point point1 = PointFactory.newCartesianPoint(1, 2);
	}
}