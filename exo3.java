package tp3;

public class exo3 {
	
	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant();
		
		e1.cne = "K136474213";
		e1.note = 20;
		
		System.out.println(e1.toString());
		
		if(e1.estAdmis()) {
			System.out.println("Admis");
		}else {
			System.out.println("Non Admis");
		}
		
		Etudiant e2 = new Etudiant();
		
		e2.cne = "M161304659";
		e2.note = 7;
		
		System.out.println(e2);
		
		if(e2.estAdmis()) {
			System.out.println("Admis");
		}else {
			System.out.println("Non Admis");
		}
				
	}

}
