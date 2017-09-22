package da2.cerr.u1;

import java.io.Serializable;

public class Funcion implements Serializable{
	private double x;
	private double y;

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getResultado() {
		return (x+3)*(2*(Math.pow(x, 2))-(5*x)+7);
	}

	
	
}
