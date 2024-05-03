//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PileEntier pileEntier = new PileEntier();
        pileEntier.empiler(-7);
        pileEntier.empiler(4);
        pileEntier.empiler(1);
        pileEntier.empiler(-7);
        pileEntier.empiler(-19);
        pileEntier.empiler(2);
        pileEntier.empiler(5);
        pileEntier.ajoutValeur(90, 2);
        pileEntier.ajoutValeur(100, 0);
        System.out.println("PILE ENTIER");
        while(!pileEntier.estVide()){
            System.out.print(" "+pileEntier.depiler());
        }
        pileEntier.empiler(-7);
        pileEntier.empiler(4);
        pileEntier.empiler(1);
        pileEntier.empiler(-7);
        pileEntier.empiler(-19);
        pileEntier.empiler(2);
        pileEntier.empiler(5);
        System.out.println("\n");
        pileEntier.trier();
    }
}
