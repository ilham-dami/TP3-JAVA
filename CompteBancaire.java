package tp3;

public class CompteBancaire {
	
	private String numero;
	private double solde;
	
	public CompteBancaire(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void afficherSolde() {
		System.out.println("Vos informations:  Compte " + numero + " | Solde = " + solde + " MAD");	
	}
	
	public void deposer(double montant) {
	    solde += montant;
	}

	public void retirer(double montant) {
		if(montant <= solde) {
			solde -= montant;	
		}else {
			System.out.println("Votre solde est insuffisant !");
		}
	}
	
	
	public void transferer(CompteBancaire accDestination, double montant) {
		if(montant <= solde) {
			this.solde -= montant;           //  this.retirer(montant);
			accDestination.solde += montant;	 // accDestination.deposer(montant);
		}else {
			System.out.println("Transfert Impossible ! Solde insuffisant !");
		}	
		
		
	}

}





