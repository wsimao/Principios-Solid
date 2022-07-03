package D.Violação;

public class BandeiraService {
    private Mongo mongo;

    public BandeiraService() {
        this.mongo = new Mongo();
    }

    public void inserirBandeira(String bandeira){
        mongo.inserir(bandeira);
    }
    
}
