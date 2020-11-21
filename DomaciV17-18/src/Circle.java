
public class Circle {
	private Dot center;
	private double r;
	public Circle(Dot center,double r)
	{
		this.center=center;
		this.r=r;
	}
	public Dot get_center()
	{
		return center;
	}
	public double get_R()
	{
		return r;
	}
	//izracunavanje povrsine kruga
	public double get_area()
	{
		return Math.PI*Math.pow(r, 2);
	}
}
