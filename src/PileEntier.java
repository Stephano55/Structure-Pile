public class PileEntier {
    private CelluleEntier sommet;

    public PileEntier() {
        this.sommet = null;
    }

    public void empiler(int valeur) {
        CelluleEntier a = new CelluleEntier(valeur, this.sommet);
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
    public void ajouter(int index){

    }
}
