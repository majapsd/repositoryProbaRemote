
public class TestFigure {
	static public void can_we_make_it(Circle one,Triangle two)
	{
		if(one.get_center().distance(two.get_A())>one.get_R() & one.get_center().distance(two.get_B())>one.get_R() & one.get_center().distance(two.get_C())>one.get_R()) System.out.println("Moze se nacrtati");
		else System.out.println("Ne moze da se nacrta");
	}
	public static void main(String[] args) {
		Circle bob = new Circle(new Dot(3,1),5);
		Triangle carrot =new Triangle(new Dot(9,8),new Dot(16,8),new Dot(1,3));
		can_we_make_it(bob, carrot);

	}

}
