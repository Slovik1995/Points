public class Punkt3D extends Punkt2D{
private double z;
public Punkt3D(double x, double y, double z){
	super(x,y);
	this.z=z;
}
public void setZ(double z){
	this.z=z;
}
public double getZ(){
	return z;
}

public double distance(Punkt3D p){
	double odl1;
	odl1=Math.sqrt(Math.abs(p.getX()-super.getX())*Math.abs(p.getX()-super.getX())+Math.abs(p.getY()-super.getY())*Math.abs(p.getY()-super.getY()));
	return Math.sqrt(odl1*odl1+Math.abs(z-p.getZ())*Math.abs(z-p.getZ()));

}

}
