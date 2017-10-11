package Calculator;

import Main.Main;

public class Trigonometry extends Main {
	
	private double d;
	
	
	public Trigonometry(double d) {
		super();
		this.d = d;
	}
	
	
	public double tangent()
	{
		return Math.tan(d);
	}
	
	public double sine()
	{
		return Math.sin(d);
	}
	
	public double cosine()
	{
		return Math.cos(d);
	}
	
	public double secant()
	{
		return 1/Math.cos(d);
	}
	
	public double cosecant()
	{
		return 1/Math.sin(d);
	}
	
	public double cotangent()
	{
		return 1/Math.tan(d);
	}
}
