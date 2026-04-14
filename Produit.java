package tp3;

import java.util.ArrayList;

public class Produit {
	
    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    // Liste statique pour stocker les produits
    
    private static ArrayList<Produit> listeProduits = new ArrayList<>();

    
    // Constructor
    
    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }
    
    // Getters
    
    public int getId() {
        return id;
    }
    
    public String getNom() {
    	return nom;
    }

    public String getDescription() {
    	return description;
    }
    
    public double getPrix() {
    	return prix;
    }
    
    public int getQuantite() {
    	return quantite;
    }
    
    // Setters
    
    public void setId(int id) {
        this.id = id;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrix(double prix) {
    	this.prix = prix;  
    }


    public void setQuantite(int quantite) {
    	this.quantite = quantite;
    }

    // ajouterProd()
    
    public static void ajouterProd(Produit p) {
        listeProduits.add(p);
    }

    // modifierProd()
    
    public static void modifierProd(int id, String nom, String description, double prix, int quantite) {
        Produit p = getProduitByID(id);
        if (p != null) {
            p.nom = nom;
            p.description = description;
            p.prix = prix;
            p.quantite = quantite;
        }
    }

    // supprimerProd()
    
    public static void supprimerProd(int id) {
        Produit p = getProduitByID(id);
        if (p != null) {
            listeProduits.remove(p);
        }
    }

    // getProduitByID()
    
    public static Produit getProduitByID(int id) {
        for (Produit p : listeProduits) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    // getAllProduit()
    
    public static ArrayList<Produit> getAllProduit() {
        return listeProduits;
    }

    // toString() 
    
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prix: " + prix + ", Quantité: " + quantite;
    }
}
