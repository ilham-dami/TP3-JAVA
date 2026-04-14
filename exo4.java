package tp3;

public class exo4 {
	
	public static void main(String[] args) {
		
		NombreComplexe z1 = new NombreComplexe(5, 2);
		NombreComplexe z2 = new NombreComplexe(-7, 1); 
		
		System.out.println("z1 = " + z1.afficher());  //toString
		System.out.println("z2 = " + z2.afficher());
		
		System.out.println("L'addition :" + z1.addition(z2).afficher());
		System.out.println("La multiplication :" + z1.multiplication(z2).afficher());

	}

}