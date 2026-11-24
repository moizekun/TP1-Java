public class GestionFacture {

    public static void main(String[] args) {
        String produit = args[0];
        double prix = Double.parseDouble(args[1]);
        int quantite = Integer.parseInt(args[2]);
        double montantTotal = prix * quantite;

        System.out.println("Produit : " + produit);
        System.out.println("Prix unitaire : " + prix);
        System.out.println("Quantite : " + quantite);
        System.out.println("Montant total : " + montantTotal);
    }

}
