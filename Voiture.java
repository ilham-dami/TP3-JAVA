package tp3;

public class Voiture {
	
	 private String marque;
	 private int vitesse;
	
	public Voiture(String marque, int vitesse) {
		this.marque = marque;
		this.vitesse = vitesse;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public int getVitesse() {
		return vitesse;
	}
	
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	public void accelerer(int vitesse) {
		if(this.vitesse + vitesse <= 240 ) {
			this.vitesse += vitesse;
		}else {
			this.vitesse = 240;
		}
		
	}
	
	public void freiner() {
		if(this.vitesse >= 10) {
			this.vitesse -= 10;
		}else {
			this.vitesse = 0;
		}	
	}

}
