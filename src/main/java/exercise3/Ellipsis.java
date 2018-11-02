package exercise3;

public class Ellipsis {
	private final Point center;
	private final int xAxisLength;
	private final int yAxis2Length;

	Ellipsis(Point center, int xAxisLenght, int yAxis2Length){
		this.center = center;
		this.xAxisLength = xAxisLenght;
		this.yAxis2Length = yAxis2Length;
	}

	public double area(){
		return 2*Math.PI*Math.sqrt((Math.pow(xAxisLength,2)+Math.pow(yAxis2Length,2))/2);
	}
	public double perimeter(){
		return Math.PI*xAxisLength*yAxis2Length;
	}
}
