package fr.eni;

public class Main {
    public static void main(String[] args) {
        Voiture tesla = new Voiture("Tesla", 5);

        int LeNombreDePlaces = tesla.getNbPlaces();

        try {
            tesla.setNbPlaces(-3);
        } catch (NbPlaceException e) { //e = le nom de l'exception, on peut l'appeller comme on veux
            System.err.println("Une exception s'est produite.");
            System.err.println(e.getMessage());
            System.out.println(e.maMethode());
        } catch (NullPointerException e){
            System.err.println("Null");
        }
        finally {
            System.out.println(tesla); // <-- tesla = toString()
            System.out.println("Fin du programme.");
        }
    }
}
