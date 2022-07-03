package D.Violação;

public class BandeiraServiceOracle {
    private Oracle oracle;

    public BandeiraServiceOracle() {
        this.oracle = new Oracle();
    }

    public void inserirBandeira(String bandeira){
        oracle.inserir(bandeira);
    }
    
}
