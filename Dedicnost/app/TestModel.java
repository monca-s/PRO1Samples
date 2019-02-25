package app;

import geom.Ctverec;
import geom.GeometrickyUtvar;

public class TestModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeometrickyUtvar u = new Ctverec(100,100,50);
		u.posunoutPomalu(100,200);
	}

}
