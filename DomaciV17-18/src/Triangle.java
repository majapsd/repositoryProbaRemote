
public class Triangle {
	private Dot[] vertices=new Dot[3];
	public Triangle(Dot A,Dot B,Dot C)
	{
		this.vertices[0]=A;
		this.vertices[1]=B;
		this.vertices[2]=C;
	}
	public Dot get_A()
	{
		return this.vertices[0];
	}
	public Dot get_B()
	{
		return this.vertices[1];
	}
	public Dot get_C()
	{
		return this.vertices[2];
	}
}
