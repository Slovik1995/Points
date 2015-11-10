public class Punkt2D {
private double x, y;
public Punkt2D(double x, double y){
	this.x=x;
	this.y=y;
}
public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double distance(Punkt2D p){
	return Math.sqrt((Math.abs(x-p.getX()))*(Math.abs(x-p.getX()))+(Math.abs(y-p.getY()))*(Math.abs(y-p.getY())));
}


}
