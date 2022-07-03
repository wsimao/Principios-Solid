package O.Violação;
public class ExecucaoViolacao {

    public static void execute(){
        Calculadora calculadora = new Calculadora();

        String nomeBandeira = "VISA";
        System.out.println("Juros Visa : " + calculadora.jurosBandeira(nomeBandeira));

        nomeBandeira = "MASTERCARD";
        System.out.println("Juros MasterCard : " + calculadora.jurosBandeira(nomeBandeira));

        nomeBandeira = "ALE";
        System.out.println("Juros Alelo : " + calculadora.jurosBandeira(nomeBandeira));
    }
    
}
