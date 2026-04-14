package tp3;

public class exo6 {

    public static void main(String[] args) {

        Voiture v1 = new Voiture("BMW", 220);

        System.out.println(v1.getVitesse()); 

        v1.accelerer(20);
        System.out.println(v1.getVitesse()); 

        v1.freiner();
        System.out.println(v1.getVitesse()); 

        v1.freiner();
        System.out.println(v1.getVitesse()); 
    }
}
