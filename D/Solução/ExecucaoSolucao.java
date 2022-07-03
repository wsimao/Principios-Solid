package D.Solução;

public class ExecucaoSolucao {
    
    public static void execute() {

        //Mongo
        Repositorio repositorio = new Mongo();
        BandeiraService service = new BandeiraService(repositorio);
        service.inserirBandeira("VISA");
        service.inserirBandeira("MASTERCARD");

        //Oracle
        service.setRepositorio(new Oracle());
        service.inserirBandeira("VISA");
        service.inserirBandeira("MASTERCARD");

        //ArquivoTxt
        service.setRepositorio(new ArquivoTxt());
        service.inserirBandeira("VISA");
        service.inserirBandeira("MASTERCARD");

        //Mysql
        service.setRepositorio(new MySql());
        service.inserirBandeira("VISA");
        service.inserirBandeira("MASTERCARD");

    }
    
}
