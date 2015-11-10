import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
public static void main(String[] arg){
	LinkedList<Punkt3D> punkty = new LinkedList<>();
	int wybor;
	Scanner scan = new Scanner(System.in);
	while(true)
	{
		System.out.println("1. Wczytaj punkt 3D\n2. Wyœwietl wszystkie punkty\n3. Oblicz odleg³oœæ\n4. Zakoñcz");
		wybor = scan.nextInt();
		switch(wybor){
		case 1:
				wczytaj(punkty);
				break;
		case 2:
				wyswietl(punkty);
				break;
		case 3:
				System.out.println(oblicz(punkty));
				break;
		case 4:
				System.exit(0);
		default:	
		}
		
	}
}

public static void wczytaj(LinkedList<Punkt3D> list){
	double x,y,z;
	Scanner s = new Scanner(System.in);
	System.out.println("Podaj punkty:");
	x=s.nextDouble();
	y=s.nextDouble();
	z=s.nextDouble();
	Punkt3D p = new Punkt3D(x,y,z);
	list.add(p);
}
public static void wyswietl(LinkedList<Punkt3D> list){
	Iterator<Punkt3D> it = list.iterator();
	while(it.hasNext()){
		Punkt3D p = it.next();
		System.out.print("["+p.getX()+","+p.getY()+","+p.getZ()+"] ");
	}
	System.out.println();
	
}
public static double oblicz(LinkedList<Punkt3D> list){
	System.out.println("Podaj indeksy punktów:");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	
	if((list.size()<a)||(list.size()<b)||(a<=0)||(b<=0))
	{
		System.out.println("Z³e indeksy!");
		return 0;
	}
	
	if(b<a){
		int c=b;
		b=a;
		a=c;
	}
	Punkt3D A, B;
	
	a--;
	b--;
	Iterator<Punkt3D> it = list.iterator();
	for(int i=0; i<a; i++)
		it.next();
	A=it.next();
	
	it = list.iterator();
	for(int i=0; i<b; i++)
		it.next();
	B=it.next();
	
	return A.distance(B);
}

}
