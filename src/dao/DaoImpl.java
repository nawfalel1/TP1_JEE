package dao;

public class DaoImpl implements IDao{
    @java.lang.Override
    public double getData() {
        double temp=Math.random()*40;
        return temp;
    }
}
