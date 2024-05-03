public class CelluleEntier {
    private int valeur;
    private int index;
    private CelluleEntier suivant;
    public CelluleEntier(int valeur, CelluleEntier suivant, int index) {
        this.valeur = valeur;
        this.suivant = suivant;
        this.index = index;
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

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
