class TestProgram
{
	public static void main(String args[]){
		
		Rectangle r = new Rectangle(10);
		r.setLength( Integer.parseInt(args[0]) );
		System.out.println("Area = " + r.getArea());
	}
}