package entites;

  public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(33, "Rue des chasseurs", "34070", "Montpellier");
        AdressePostale adresse2 = new AdressePostale(60, "Avenue de toulouse", "34070", "Montpellier");

        // Affichage  adresses
        System.out.println(adresse1.numeroRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println(adresse2.numeroRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
  }
