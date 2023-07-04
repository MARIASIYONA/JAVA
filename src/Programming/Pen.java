package Programming;

class Pen 
{
	String color;
	String type;
	

public void write()
{
System.out.println("writing something");
 }
public void printcolor()
{
	System.out.println(this.color);
	System.out.println(this.type);
	
} 
	

public static void main(String[] args)
   {
Pen p1=new Pen();
p1.color="blue";
p1.type="gel";
p1.write();
p1.printcolor();
Pen p2=new Pen();
p2.color="black";
p2.type="ballpoine";
p2.write();
p2.printcolor();
}
}

		

	


