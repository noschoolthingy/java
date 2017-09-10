class Circle
{
	private double radius;
	private double pi = 3.14;

	public Circle(double pi){
		this.pi = pi;
	}

	public void setRadius(double r){
		this.radius = r;
	}

	public double getArea(){
		return pi*radius*radius;
	}
}