package tp3;

public class Point {

	double x, y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void afficher() {
		System.out.println("Les coordonnées du point sont : x = " + x + " et y = " + y);
	}
	
	public void deplacer(double dx, double dy) {
		x += dx;
		y += dy;
		System.out.println("Le point est bien déplacé et ses nouveux coordonnées sont : x = " + x + " et y = " + y);
	}
	
	public double distance() {
		return Math.sqrt(x*x + y*y);			
	}
	
	public double distance(double a, double b) {
		return Math.sqrt(Math.pow(a-x, 2) + Math.pow(b-y, 2));
	}
	
	
}


