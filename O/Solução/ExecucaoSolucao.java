package O.Solução;

public class ExecucaoSolucao {
    public static void execute(){
        Calculadora calculadora = new Calculadora();

        Bandeira bandeira = new Visa();
        System.out.println("Juros Visa : " + calculadora.jurosBandeira(bandeira));

        bandeira = new MasterCard();
        System.out.println("Juros MasterCard : " + calculadora.jurosBandeira(bandeira));

        bandeira = new Dinners();
        System.out.println("Juros Dinners : " + calculadora.jurosBandeira(bandeira));

        bandeira = new Alelo();
        System.out.println("Juros Alelo : " + calculadora.jurosBandeira(bandeira));
    }
}
