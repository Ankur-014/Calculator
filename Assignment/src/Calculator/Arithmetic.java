package Calculator;

import Main.Main;

public class Arithmetic extends Main {
	
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double add(double a_, double b_) {
		setA(a_);
		setB(b_);
		return getA() + getB();
	}
	
	public double sub(double a_, double b_) {
		setA(a_);
		setB(b_);
		return getA() - getB();
	}
	
	public double mul(double a_, double b_) {
		setA(a_);
		setB(b_);
		return getA() * getB();
	}
	
	public double div(double a_, double b_) {
		setA(a_);
		setB(b_);
		return getA() / getB();
	}
	
	public double exp(double a_, double b_) {
		setA(a_);
		setB(b_);
		return (int)getA() ^ (int)getB();
	}

	
}
