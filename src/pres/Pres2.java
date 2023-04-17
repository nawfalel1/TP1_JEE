package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();
        //System.out.println(dao.getData());

        String metierClassName = sc.nextLine();
        Class cmetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.newInstance();
        Method method = cmetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());

    }
}
