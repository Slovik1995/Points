public class Main {
public static void main(String[] arg){
	Punkt2D p1 = new Punkt2D(0,0);
	Punkt2D p2 = new Punkt2D(1,1);
	double dist = p1.distance(p2);
    System.out.println(dist);
	
	Punkt3D p3 = new Punkt3D(1,2,3);
	Punkt3D p4 = new Punkt3D(-7,6,54);
	dist = p3.distance(p4);
	System.out.println(dist);
	
	
}

}
