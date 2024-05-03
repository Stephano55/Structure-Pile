public class CelluleEntier {
    private int valeur;
    private CelluleEntier suivant;
    public CelluleEntier(int valeur, CelluleEntier suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
    }
    public int getValeur() {
        return this.valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public CelluleEntier getSuivant() {
        return this.suivant;
    }

    public void setSuivant(CelluleEntier suivant) {
        this.suivant = suivant;
    }
}
