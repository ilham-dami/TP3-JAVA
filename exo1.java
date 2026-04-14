package tp3;

public class exo1 {
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		p1.x = 4;
		p1.y = 2;
		
		p1.afficher();
		System.out.println("La distance à l’origine est : " + p1.distance());
		p1.deplacer(8, 4);
		
		Point p2 = new Point(5, 8);
		
		p2.afficher();
		System.out.println("La distance entre les deux points est : " + p2.distance(6, 4));
		
		
		
	}

}



