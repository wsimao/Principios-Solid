package D.Violação;

public class ExecucaoViolacao {
    public static void execute() {

        //Mongo
        BandeiraService service = new BandeiraService();

        service.inserirBandeira("VISA");
        service.inserirBandeira("MASTERCARD");

        //Oracle
        BandeiraServiceOracle service2 = new BandeiraServiceOracle();

        service2.inserirBandeira("VISA");
        service2.inserirBandeira("MASTERCARD");

        //ArquivoTxt
        BandeiraServiceTxt service3 = new BandeiraServiceTxt();

        service3.inserirBandeira("VISA");
        service3.inserirBandeira("MASTERCARD");

        //ArquivoTxt
        BandeiraServiceMySql service4 = new BandeiraServiceMySql();

        service4.inserirBandeira("VISA");
        service4.inserirBandeira("MASTERCARD");

    }
    
}
