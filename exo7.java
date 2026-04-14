package tp3;

public class exo7 {
    public static void main(String[] args) {

        Produit p1 = new Produit(1, "Poupée", "Poupée Barbie", 120, 10);
        Produit p2 = new Produit(2, "Voiture", "Voiture télécommandée", 300, 5);
        Produit p3 = new Produit(3, "Puzzle", "Puzzle 100 pièces", 80, 15);

        // Ajouter
        Produit.ajouterProd(p1);
        Produit.ajouterProd(p2);
        Produit.ajouterProd(p3);

        // Afficher tous
        System.out.println("Liste des jouets:");
        for (Produit p : Produit.getAllProduit()) {
            System.out.println(p);
        }

        // Modifier
        Produit.modifierProd(1, "Poupée Deluxe", "Grande poupée Barbie", 200, 8);

        // Afficher produit par ID
        System.out.println("\nJouet ID 1:");
        System.out.println(Produit.getProduitByID(1));

        // Supprimer
        Produit.supprimerProd(2);

        // Afficher après suppression
        System.out.println("\nAprès suppression:");
        for (Produit p : Produit.getAllProduit()) {
            System.out.println(p);
        }
    }
    
}
