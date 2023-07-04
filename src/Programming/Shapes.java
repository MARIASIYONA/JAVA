package Programming;
//single inheritance
public class Shapes {
	//int a=4;
	//static int b=5;

	public void area()
	{
	System.out.println("displaying area");
	}

	

 class Triangle extends Shapes{
	public void area(int a,int b)
	{
	System.out.println(1/2*a*b);
	}
	
	
 }
  class EquilatralTriangle extends Shapes{
	 public void area(int l,int h)
		{
		System.out.println(1/2*l*h);
		}		

public void main(String[] args) {
		Triangle t1=new Triangle();
	
		t1.area();
	}

}
}