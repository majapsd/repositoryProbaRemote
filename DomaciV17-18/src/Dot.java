
public class Dot {
	private double x,y;
	public Dot(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
    public double distance(Dot b)
	{
		return Math.sqrt(Math.pow((this.y-b.getY()),2)+Math.pow((b.getX()-this.x),2));
	}
}
