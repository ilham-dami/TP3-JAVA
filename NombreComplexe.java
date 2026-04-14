package tp3;

public class NombreComplexe {
	
	double reel, imaginaire;
	
	public NombreComplexe(double reel, double imaginaire) {
		this.reel = reel;
		this.imaginaire = imaginaire;
	}
	
	public String afficher() {               // public String toString() { return reel + " + " + imaginaire + "i"; }
		return reel + " + " + imaginaire + "i";
	}
	
	public NombreComplexe addition(NombreComplexe z) {
		double re = this.reel + z.reel;
		double im = this.imaginaire + z.imaginaire;
		return new NombreComplexe(re, im);	
	}
	
	public NombreComplexe multiplication(NombreComplexe w) {
		double ree = this.reel * w.reel - this.imaginaire * w.imaginaire;
		double ima = this.reel * w.imaginaire + this.imaginaire * w.reel;
		return new NombreComplexe(ree, ima);
	}
}
