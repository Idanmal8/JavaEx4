
public class Circle {/*this is the fields 
 */
	private Point center;
	private double radius;
	final double pai = 3.141592654;

	public Circle() {/*
	 *this is the default method
	 *@param center which has X,Y
	 *@param radius which is the radius
	 */
		center = new Point(0,0);
		radius = 1;
	}/*
	this is a method that
	@return a point(x,y) and a radius 
	@param x , y 
	@param radius
	 */
	public Circle(Point center , double radius) {
		this.center = new Point(center);
		if(this.radius < 0) {
			radius =1;
		}else {
			this.radius = radius;
		}
	}/*
	copy constructor 
	 */
	public Circle(Circle other) {
		this.center = other.center;
		this.radius = other.radius;
	}/*
	setters and getters
	 */
	public Point getCenter() {
		return new Point(center);
	}
	public void setCenter(Point center) {
		this.center = new Point(center);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}else {

		}

	}/*toString method return the txt
	 */
	public String toString() {
		return "Circle at (" + center.getX()+ ", " + center.getY() +"), radius " + this.radius;
	}/*
	this method is calculating the area of the circle
	@param S which has pai(3.14) and radius
	@return the area */
	public double area() {
		double S = pai *(radius*radius);
		return S;
	}/*
	 *this method is calculating the parameter of the circle
	 *@param pai and radius
	 *@return the perimeter
	 */
	public double perimeter() {
		return 2*pai*radius;
	}/*
	this method checks if two circles are equals in all the parameters.
	 */
	public boolean equals(Circle other) {
		if (this.center.equals(other.center) && this.radius==other.radius)
			return true;

		return false;

	}/*
	this method is checking if the two circles touch each other in any point
	 */
	public boolean touches(Circle other) {
		if(this.center.distanceFrom(other.center) == (this.radius+other.radius)){
			return true;
		}else if((this.center.distanceFrom(other.center) + this.radius) == other.radius) {
			return true;
		}else {
			return false;
		}

	}/*
	this method checks if the second circle is contained in the first circle
	@param squre of distance and radius.
	 */
	public boolean contains(Circle other) {
		if(this.center.distanceFrom(other.center) + other.radius < this.radius ) {
			return true;
		}else {
			return false;
		}
	}/*
	this method checks if the two circles are interacting.
	 */
	public boolean intersects(Circle other) {
		if(this.center.distanceFrom(other.center) < this.radius + other.radius) {
			return true;
		}else {
			return false;
		}
	}/*
	this method checks if the point p is contained in the circle 
	@param x , y
	 */
	public boolean contains(Point p) {
		return this.center.distanceFrom(p) <= this.radius;
	}/*
	this method makes a subcircle with the same y point and a different x point and that has half the radius of the original circle
	@param X , Y
	@return a smaller circle with half the radius which is exactly the center of the new circle .
	 */
	public Circle subCircle() {
		Circle s = new Circle((new Point(this.center.getX()+this.radius/2 , this.center.getY())) , this.radius/2);
		return s;
	}





}
