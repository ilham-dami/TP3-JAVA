package tp3;

public class exo5 {
	
	public static void main(String[] args) {
		
		CompteBancaire acc1 = new CompteBancaire("A5896", 10000000);
		CompteBancaire acc2 = new CompteBancaire("B4862", 15400);
		
		System.out.println("=== Début des opérations ===");
		acc1.deposer(5000);
		acc2.retirer(16000);
		acc1.transferer(acc2, 50000);
		
		System.out.println("Après transfert :");
		acc1.afficherSolde();
		acc2.afficherSolde();
		
		
	}

}
