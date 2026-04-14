package tp3;

public class Rectangle {
	
	float largeur, hauteur;
	
	public Rectangle(float largeur, float hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	public float surface() {
		return largeur*hauteur;
}

	public float perimetre() {
		return (largeur + hauteur)*2;
	}
	
	
}