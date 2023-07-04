package Programming;

public class FunctionOverLoad {
	String name;
	int price;
	String color;
	public void show1(String name)
	{
		System.out.println(name);
		
	
		
	}
	public void show(int price)
	{	
		System.out.println(price);
	}
	public void show(String color)
	{
		System.out.println(color);
	}
	public void show(String name,int price,String color)
	{
		System.out.println(name + " " + price +" " + color);
		//System.out.println(price);
		//System.out.println(color);
	}
	
	public static void main(String[] args) {
		
		FunctionOverLoad c1=new FunctionOverLoad();
		c1.name="rangeover";
		c1.price=40000000;
		c1.color="solid balck";
		c1.show(c1.name,c1.price,c1.color);
		
	}

}
