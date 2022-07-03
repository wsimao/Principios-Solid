package O.Solução;

public class Alelo implements Bandeira{
    public int getJurosInmetrics(){
        return 1;
    }

    @Override
    public double getJuros() {
        return getJurosInmetrics();
    }
    
}
