public class PileEntier {
    private CelluleEntier sommet;
    private int indice;
    private int taille;

    public PileEntier() {
        this.sommet = null;
        this.indice = -1;
        this.taille = 0;

    }

    public void empiler(int valeur) {
        CelluleEntier a = new CelluleEntier(valeur, this.sommet, ++this.indice);
        this.taille++;
        this.sommet = a;
    }

    public int depiler() {
        if (this.sommet != null) {
            int v = this.sommet.getValeur();
            this.sommet = this.sommet.getSuivant();
            return v;
        } else {
            return 0;
        }
    }

    public boolean estVide() {
        if (this.sommet == null) {
            return true;
        } else {
            return false;
        }
    }
    public void trier(){
        int temp;
        boolean b = true;
        while (b) {
            b = false;
            CelluleEntier courant = this.sommet;
            while (courant != null && courant.getSuivant() != null) {
                if(courant.getValeur() > courant.getSuivant().getValeur()){
                    temp = courant.getValeur();
                    courant.setValeur(courant.getSuivant().getValeur());
                    courant.getSuivant().setValeur(temp);
                    b = true;
                }
                courant = courant.getSuivant();
            }
        }
        while (!this.estVide()){
            System.out.print(" "+depiler());
        }
    }

    public CelluleEntier getSommet() {
        return sommet;
    }

    public int getTaille() {
        return taille;
    }
    public int valeurParIndice(int indice) {
        if (indice < 0 || indice >= this.taille) {
            System.out.println("Indice hors limites");
        }
        CelluleEntier courant = this.sommet;
        int compteur = 0;
        // Parcour
        while (compteur < indice && courant != null) {
            courant = courant.getSuivant();
            compteur++;
        }
        return courant.getValeur();
    }
    public void ajoutValeur(int val, int ind){
        int temp;
        int i = 0;
        CelluleEntier courant = this.sommet;
        while(i < ind){
            courant = courant.getSuivant();
            i++;
        }
        temp = courant.getValeur();
        courant.setValeur(val);
        CelluleEntier a = new CelluleEntier(temp, courant.getSuivant(), ++ind);
        courant.setSuivant(a);
        this.taille++;
    }

}
