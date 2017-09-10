class TestProgram
{
	public static void main(String args[]){
		
		Circle c = new Circle(3.14);
		c.setRadius( Double.parseDouble(args[0]) );
		System.out.println("Area = " + c.getArea());
	}
}