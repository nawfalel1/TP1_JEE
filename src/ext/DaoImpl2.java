package ext;

import dao.IDao;

import java.sql.SQLOutput;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=6000;
        return temp;
    }
}
