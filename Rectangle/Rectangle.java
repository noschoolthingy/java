class Rectangle
{
	private int length;
	private int width = 10;

	public Rectangle(int width){
		this.width = width;
	}

	public void setLength(int l){
		this.length = l;
	}

	public int getArea(){
		return length*width;
	}
}