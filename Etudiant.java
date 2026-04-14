package tp3;

public class Etudiant {
	
	String cne;
	float note;
	
	public boolean estAdmis() {
		return note >= 10;
	}
	
	public String toString() {
		return "Etudiant [ CNE = " + cne + " , NOTE = " + note + " ]";
	}

}