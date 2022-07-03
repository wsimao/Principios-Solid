package D.Violação;

public class BandeiraServiceMySql {

    private MySql mySql;

    public BandeiraServiceMySql() {
        this.mySql = new MySql();
    }

    public void inserirBandeira(String bandeira){
        mySql.inserir(bandeira);
    }
}
