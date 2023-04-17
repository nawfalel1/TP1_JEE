package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Main {
    public static void main(String[] args) {

        DaoImpl2 dao =new DaoImpl2();
        MetierImpl met = new MetierImpl();
        met.setDao(dao);
        System.out.println("Resultat:"+met.calcul());
    }
}