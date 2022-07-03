package D.Violação;

public class BandeiraServiceTxt {
    private ArquivoTxt arquivoTxt;

    public BandeiraServiceTxt() {
        this.arquivoTxt = new ArquivoTxt();
    }

    public void inserirBandeira(String bandeira){
        arquivoTxt.inserir(bandeira);
    }
    
}
