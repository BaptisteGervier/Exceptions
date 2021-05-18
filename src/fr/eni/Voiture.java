package fr.eni;

public class Voiture {
    private String marque;
    private int nbPlaces;

    public Voiture(String marque, int nbPlaces) {
        this.marque = marque;
        this.nbPlaces = nbPlaces;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) throws NbPlaceException{
        if (nbPlaces <= 0){
        // ici on va lever une exception = si le nombre de places est infèrieur a zero, je leve une exception
            throw new NbPlaceException("le nombre de places est infèrieur à un");
        } else {
            this.nbPlaces = nbPlaces;
        }

    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", nbPlaces=" + nbPlaces +
                '}';
    }
}
